package fr.pederobien.cards.enums;

public enum Color {

	CLUBS("clubs"), DIAMONDS("diamonds"), HEARTS("hearts"), SPADES("spades"), NONE("none");

	private String name;
	private boolean trump;

	private Color(String name) {
		this.name = name;
		trump = false;
	}

	/**
	 * @return True if this {@link Color} is a trump color, false otherwise.
	 */
	public boolean isTrump() {
		return trump;
	}

	/**
	 * Set the trump property.
	 * 
	 * @param trump True if this {@link Color} is a trump color, false otherwise.
	 */
	public void setTrump(boolean trump) {
		this.trump = trump;
	}

	@Override
	public String toString() {
		return name;
	}
}
