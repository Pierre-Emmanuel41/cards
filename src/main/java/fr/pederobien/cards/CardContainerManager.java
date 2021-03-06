package fr.pederobien.cards;

import fr.pederobien.cards.enums.PacketProperty;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.ICardContainerManager;
import fr.pederobien.cards.interfaces.IPacket;

public class CardContainerManager implements ICardContainerManager {
	private IPacket packet;
	private ICardContainer stock, pill;

	public CardContainerManager(PacketProperty packetProperty) {
		packet = CardContainerFactory.createPacket(packetProperty);
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
		if (toBeginning)
			packet.reset();
		else
			packet.addLast(stock.concat(pill));
		stock.clear();
		pill.clear();
	}
}
