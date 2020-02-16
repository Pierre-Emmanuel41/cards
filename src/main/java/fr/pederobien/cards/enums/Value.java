package fr.pederobien.cards.enums;

public enum Value {

	ONE("1", 1), TWO("2", 2), THREE("3", 3), FOUR("4", 4), FIVE("5", 5), SIX("6", 6), SEVEN("7", 7), EIGHT("8", 8), NEIN("9", 9), TEN("10", 10), JACK("jack", 11),
	KNIGHT("knight", 12), QUEEN("queen", 13), KING("king", 14), ACE("ace", 15), JOKER("joker", 16), ELEVEN("11", 17), TWELVE("12", 18), THIRTEEN("13", 19),
	FOURTEEN("14", 20), FIFTEEN("15", 21), SIXTEEN("16", 22), SEVENTEEN("17", 23), EIGHTEEN("18", 24), NEINTEEN("19", 25), TWENTY("20", 26), TWENTY_ONE("21", 27),
	FOOL("fool", 28);

	private String name;
	private int value;

	private Value(String name, int value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * The value represents cards from the 1 (1 - of trump) to the fool (28).
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
