package fr.pederobien.cards.enums;

public enum Card {
	ACE_CLUBS(Value.ACE, Color.CLUBS), ACE_DIAMONDS(Value.ACE, Color.DIAMONDS), ACE_HEARTS(Value.ACE, Color.HEARTS), ACE_SPADES(Value.ACE, Color.SPADES),
	TWO_CLUBS(Value.TWO, Color.CLUBS), TWO_DIAMONDS(Value.TWO, Color.DIAMONDS), TWO_HEARTS(Value.TWO, Color.HEARTS), TWO_SPADES(Value.TWO, Color.SPADES),
	THREE_CLUBS(Value.THREE, Color.CLUBS), THREE_DIAMONDS(Value.THREE, Color.DIAMONDS), THREE_HEARTS(Value.THREE, Color.HEARTS), THREE_SPADES(Value.THREE, Color.SPADES),
	FOUR_CLUBS(Value.FOUR, Color.CLUBS), FOUR_DIAMONDS(Value.FOUR, Color.DIAMONDS), FOUR_HEARTS(Value.FOUR, Color.HEARTS), FOUR_SPADES(Value.FOUR, Color.SPADES),
	FIVE_CLUBS(Value.FIVE, Color.CLUBS), FIVE_DIAMONDS(Value.FIVE, Color.DIAMONDS), FIVE_HEARTS(Value.FIVE, Color.HEARTS), FIVE_SPADES(Value.FIVE, Color.SPADES),
	SIX_CLUBS(Value.SIX, Color.CLUBS), SIX_DIAMONDS(Value.SIX, Color.DIAMONDS), SIX_HEARTS(Value.SIX, Color.HEARTS), SIX_SPADES(Value.SIX, Color.SPADES),
	SEVEN_CLUBS(Value.SEVEN, Color.CLUBS), SEVEN_DIAMONDS(Value.SEVEN, Color.DIAMONDS), SEVEN_HEARTS(Value.SEVEN, Color.HEARTS), SEVEN_SPADES(Value.SEVEN, Color.SPADES),
	EIGHT_CLUBS(Value.EIGHT, Color.CLUBS), EIGHT_DIAMONDS(Value.EIGHT, Color.DIAMONDS), EIGHT_HEARTS(Value.EIGHT, Color.HEARTS), EIGHT_SPADES(Value.EIGHT, Color.SPADES),
	NEIN_CLUBS(Value.NEIN, Color.CLUBS), NEIN_DIAMONDS(Value.NEIN, Color.DIAMONDS), NEIN_HEARTS(Value.NEIN, Color.HEARTS), NEIN_SPADES(Value.NEIN, Color.SPADES),
	TEN_CLUBS(Value.TEN, Color.CLUBS), TEN_DIAMONDS(Value.TEN, Color.DIAMONDS), TEN_HEARTS(Value.TEN, Color.HEARTS), TEN_SPADES(Value.TEN, Color.SPADES),
	JACK_CLUBS(Value.JACK, Color.CLUBS), JACK_DIAMONDS(Value.JACK, Color.DIAMONDS), JACK_HEARTS(Value.JACK, Color.HEARTS), JACK_SPADES(Value.JACK, Color.SPADES),
	QUEEN_CLUBS(Value.QUEEN, Color.CLUBS), QUEEN_DIAMONDS(Value.QUEEN, Color.DIAMONDS), QUEEN_HEARTS(Value.QUEEN, Color.HEARTS), QUEEN_SPADES(Value.QUEEN, Color.SPADES),
	KING_CLUBS(Value.KING, Color.CLUBS), KING_DIAMONDS(Value.KING, Color.DIAMONDS), KING_HEARTS(Value.KING, Color.HEARTS), KING_SPADES(Value.KING, Color.SPADES);

	private Value value;
	private Color color;
	private int point;

	private Card(Value value, Color color) {
		this.value = value;
		this.color = color;
	}

	public Value getValue() {
		return value;
	}

	public Color getColor() {
		return color;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return value + " of " + color;
	}
}
