package fr.pederobien.cards.enums;

public enum PacketSize {
	FIFTY_TWO(2, 14), THIRTY_TWO(7, 14);

	private int lowerRange, upperRange;

	private PacketSize(int lowerRange, int upperRange) {
		this.lowerRange = lowerRange;
		this.upperRange = upperRange;
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
