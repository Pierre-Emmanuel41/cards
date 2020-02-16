package fr.pederobien.cards;

import fr.pederobien.cards.enums.PacketSize;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.IPacket;

public class CardContainerFactory {

	public static IPacket createPacket(PacketSize packetSize) {
		return new Packet(packetSize);
	}

	public static ICardContainer createStock() {
		return new CardContainer();
	}

	public static ICardContainer createPill() {
		return new CardContainer();
	}
}