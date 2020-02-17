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

	/**
	 * Remove all cards from the hand and the pill of this {@link IPlayer}.
	 */
	void reset();

	/**
	 * @return The pill of this player.
	 */
	ICardContainer getPill();
}
