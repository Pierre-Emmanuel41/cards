package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.interfaces.ICardContainer;

public class CardContainer implements ICardContainer {
	private List<Card> cards;

	protected CardContainer() {
		cards = new ArrayList<Card>();
	}

	@Override
	public void add(Card card) {
		cards.add(card);
	}

	@Override
	public void addAll(List<Card> cards) {
		this.cards.addAll(cards);
	}

	@Override
	public void remove(Card card) {
		cards.remove(card);
	}

	@Override
	public void removeAll(List<Card> cards) {
		this.cards.removeAll(cards);
	}

	@Override
	public void clear() {
		cards.clear();
	}

	@Override
	public int size() {
		return cards.size();
	}

	@Override
	public List<Card> getCards() {
		return Collections.unmodifiableList(cards);
	}

	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner("\n");
		joiner.add("CardContainer, size=" + size());
		for (Card card : cards)
			joiner.add(card.toString());
		return joiner.toString();
	}
}
