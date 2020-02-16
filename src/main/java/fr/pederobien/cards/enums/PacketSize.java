package fr.pederobien.cards.enums;

public enum PacketSize {
	FIFTY_FOUR(2, 16, 12, Color.TRUMP), FIFTY_TWO(2, 15, 12, Color.TRUMP), THIRTY_TWO(7, 15, 12, Color.TRUMP), FULL(1, 28, 16, Color.NONE);

	private int lowerRange, upperRange, forbiddenValue;
	private Color forbiddenColor;

	private PacketSize(int lowerRange, int upperRange, int forbiddenValue, Color forbiddenColor) {
		this.lowerRange = lowerRange;
		this.upperRange = upperRange;
		this.forbiddenValue = forbiddenValue;
		this.forbiddenColor = forbiddenColor;
	}

	/**
	 * @return An array containing the forbidden values for cards. This method is useful when cards in the range should not be added.
	 */
	public int getForbiddenValue() {
		return forbiddenValue;
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

	public Color getForbiddenColor() {
		return forbiddenColor;
	}
}
