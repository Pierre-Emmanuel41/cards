package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketSize;
import fr.pederobien.cards.interfaces.IPacket;

public class Packet implements IPacket {
	private PacketSize packetSize;
	private LinkedList<Card> cards;

	public Packet(PacketSize packetSize) {
		cards = new LinkedList<Card>();
		this.packetSize = packetSize;
		fillPacket();
	}

	@Override
	public void addLast(Card card) {
		cards.addLast(card);
	}

	@Override
	public void addLast(List<Card> cards) {
		cards.addAll(cards);
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

	@Override
	public void shuffle() {
		Random random = new Random();
		for (int i = size() - 1; 1 <= i; i--) {
			int randInt = random.nextInt(i);
			Card temp = cards.get(i);
			cards.set(i, cards.get(randInt));
			cards.set(randInt, temp);
		}
	}

	@Override
	public List<Card> getCards() {
		return Collections.unmodifiableList(cards);
	}

	private void fillPacket() {
		for (Card card : Card.values()) {
			if (card.getValue() < packetSize.getLowerRange() || packetSize.getUpperRange() < card.getValue() || packetSize.getForbiddenValue() == card.getValue()
					|| packetSize.getForbiddenColor().equals(card.getColor()))
				continue;
			cards.add(card);
		}
	}

	private void checkRange(int n) {
		if (n < 0 || n > size())
			throw new UnsupportedOperationException("The value is out of range");
	}
}
