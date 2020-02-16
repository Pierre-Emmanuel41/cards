package fr.pederobien.cards.interfaces;

import java.util.List;

import fr.pederobien.cards.enums.Card;

public interface ICardContainer {

	/**
	 * Add the specified {@link Card} at the end of this {@link ICardContainer}.
	 * 
	 * @param card The card to add at the end.
	 */
	void add(Card card);

	/**
	 * Add all {@link Card} in the specified collection at the end of this {@link ICardContainer}.
	 * 
	 * @param cards The list of cards to add at the end.
	 */
	void addAll(List<Card> cards);

	/**
	 * Remove the specified {@link Card} from this {@link ICardContainer}.
	 * 
	 * @param card The card to remove.
	 */
	void remove(Card card);

	/**
	 * Remove all {@link Card} in the specified collection from this {@link ICardContainer}.
	 * 
	 * @param cards The list of cards to remove.
	 */
	void removeAll(List<Card> cards);

	/**
	 * Remove all the cards in this {@link ICardContainer}.
	 */
	void clear();

	/**
	 * @return The actual size of the {@link ICardContainer}, it correspond to the number of remaining cards.
	 */
	int size();

	/**
	 * @return The {@link List} of cards remaining in this {@link ICardContainer}. This list is unmodifiable.
	 */
	List<Card> getCards();
}
