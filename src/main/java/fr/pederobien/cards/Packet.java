package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketSize;
import fr.pederobien.cards.interfaces.IPacket;

public class Packet implements IPacket {
	private static IPacket packet;
	private PacketSize packetSize;
	private LinkedList<Card> cards;

	private Packet(PacketSize packetSize) {
		cards = new LinkedList<Card>();
		this.packetSize = packetSize;
		fillPacket();
	}

	public static synchronized IPacket of(PacketSize packetSize) {
		if (packet == null)
			packet = new Packet(packetSize);
		return packet;
	}

	@Override
	public void addFirst(Card card) {
		cards.addFirst(card);
	}

	@Override
	public void addLast(Card card) {
		cards.addLast(card);
	}

	@Override
	public Card removeFirst() {
		return cards.removeFirst();
	}

	@Override
	public List<Card> removeFirst(int n) {
		checkRange(n);
		List<Card> cardsToReturn = new ArrayList<Card>();
		for (int i = 0; i < n; i++)
			cardsToReturn.add(removeFirst());
		return cardsToReturn;
	}

	@Override
	public Card removeLast() {
		return cards.removeLast();
	}

	@Override
	public List<Card> removeLast(int n) {
		checkRange(n);
		List<Card> cardsToReturn = new ArrayList<Card>();
		for (int i = 0; i < n; i++)
			cardsToReturn.add(removeLast());
		return cardsToReturn;
	}

	@Override
	public int size() {
		return cards.size();
	}

	@Override
	public void reset() {
		cards.clear();
		fillPacket();
	}

	@Override
	public void reset(PacketSize packetSize) {
		this.packetSize = packetSize;
		reset();
	}

	private void fillPacket() {
		for (Card card : Card.values())
			if (packetSize.getLowerRange() <= card.getValue().getValue() && card.getValue().getValue() <= packetSize.getUpperRange())
				cards.add(card);
	}

	private void checkRange(int n) {
		if (n < 0 || n > size())
			throw new UnsupportedOperationException("The value is out of range");
	}
}
