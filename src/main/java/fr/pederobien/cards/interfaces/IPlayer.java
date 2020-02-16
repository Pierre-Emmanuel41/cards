package fr.pederobien.cards.interfaces;

public interface IPlayer {

	/**
	 * @return The name of this {@link IPlayer}.
	 */
	String getName();

	/**
	 * @return The hand of this {@link IPlayer}.
	 */
	ICardContainer getHand();
}
