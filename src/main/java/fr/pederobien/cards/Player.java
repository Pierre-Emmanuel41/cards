package fr.pederobien.cards;

import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.IPlayer;

public class Player implements IPlayer {
	private String name;
	private ICardContainer hand;

	protected Player(String name) {
		this.name = name;
		hand = CardContainerFactory.createPlayerHand();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public ICardContainer getHand() {
		return hand;
	}
}
