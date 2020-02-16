package fr.pederobien.cards;

import fr.pederobien.cards.enums.PacketProperty;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.IPacket;

public class CardContainerFactory {

	public static IPacket createPacket(PacketProperty packetProperty) {
		return new Packet(packetProperty);
	}

	public static ICardContainer createStock() {
		return new CardContainer();
	}

	public static ICardContainer createPill() {
		return new CardContainer();
	}

	public static ICardContainer createPlayerHand() {
		return new CardContainer();
	}
}
