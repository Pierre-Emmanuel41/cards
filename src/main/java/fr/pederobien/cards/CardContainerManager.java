package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.List;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketSize;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.ICardContainerManager;
import fr.pederobien.cards.interfaces.IPacket;

public class CardContainerManager implements ICardContainerManager {
	private IPacket packet;
	private ICardContainer stock, pill;

	public CardContainerManager(PacketSize packetSize) {
		packet = CardContainerFactory.createPacket(packetSize);
		stock = CardContainerFactory.createStock();
		pill = CardContainerFactory.createPill();
	}

	@Override
	public IPacket getPacket() {
		return packet;
	}

	@Override
	public ICardContainer getStock() {
		return stock;
	}

	@Override
	public ICardContainer getPill() {
		return pill;
	}

	@Override
	public void reset(boolean toBeginning) {
		if (toBeginning) {
			packet.reset();
			stock.clear();
			pill.clear();
		} else {
			List<Card> cards = new ArrayList<Card>(stock.getCards());
			cards.addAll(pill.getCards());
			packet.addLast(cards);
		}
	}
}
