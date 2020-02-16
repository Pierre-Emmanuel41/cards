package fr.pederobien.cards.enums;

import java.util.ArrayList;
import java.util.List;

public enum PacketSize {
	FIFTY_FOUR(2, 16, 12), FIFTY_TWO(2, 15, 12), THIRTY_TWO(7, 15, 12);

	private int lowerRange, upperRange;
	private List<Integer> forbiddenCards;

	private PacketSize(int lowerRange, int upperRange, int... ignoredCards) {
		this.lowerRange = lowerRange;
		this.upperRange = upperRange;

		forbiddenCards = new ArrayList<Integer>();
		for (int i = 0; i < ignoredCards.length; i++)
			forbiddenCards.add(ignoredCards[i]);
	}

	/**
	 * @return An array containing the forbidden values for cards. This method is useful when cards in the range should not be added.
	 */
	public List<Integer> getForbiddenValues() {
		return forbiddenCards;
	}

	/**
	 * @return The lower extremity of the range used to sort cards from {@link Card}.
	 */
	public int getLowerRange() {
		return lowerRange;
	}

	/**
	 * @return The upper extremity of the range used to sort cards from {@link Card}.
	 */
	public int getUpperRange() {
		return upperRange;
	}
}
