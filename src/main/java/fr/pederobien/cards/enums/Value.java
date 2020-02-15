package fr.pederobien.cards.enums;

public enum Value {

	TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NEIN("9", 9), TEN("10", 10), JACK("jack", 11), QUEEN("queen", 12),
	KING("king", 13), ACE("ace", 14);

	private String name;
	private int value;

	private Value(String name, int value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * The value represents cards from the 2 (2) to the ace(14).
	 * 
	 * @return The value of this card.
	 */
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return name;
	}
}
