package fr.pederobien.cards.interfaces;

import fr.pederobien.cards.enums.Color;
import fr.pederobien.cards.enums.Value;

public interface ICard {

	/**
	 * @return The value of this card. The value represents the cards of a colour (1 - Ace).
	 */
	Value getValue();

	/**
	 * @return The colour of this card.
	 */
	Color getColor();

	/**
	 * @return The amount of point represented by this {@link ICard}.
	 */
	int getPoint();

	/**
	 * Set the amount of point represented by this {@link ICard}.
	 * 
	 * @param point
	 */
	void setPoint(int point);
}
