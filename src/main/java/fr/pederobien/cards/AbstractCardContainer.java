package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.interfaces.ICardContainer;

public abstract class AbstractCardContainer implements ICardContainer {
	private List<Card> cards;

	protected AbstractCardContainer() {
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
	public int size() {
		return cards.size();
	}

	@Override
	public List<Card> getCards() {
		return Collections.unmodifiableList(cards);
	}
}
