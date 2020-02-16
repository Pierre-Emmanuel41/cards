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
	KNIGHT_CLUBS(Value.KNIGHT, Color.CLUBS), KNIGHT_DIAMONDS(Value.KNIGHT, Color.DIAMONDS), KNIGHT_HEARTS(Value.KNIGHT, Color.HEARTS),
	KNIGHT_SPADES(Value.KNIGHT, Color.SPADES), QUEEN_CLUBS(Value.QUEEN, Color.CLUBS), QUEEN_DIAMONDS(Value.QUEEN, Color.DIAMONDS),
	QUEEN_HEARTS(Value.QUEEN, Color.HEARTS), QUEEN_SPADES(Value.QUEEN, Color.SPADES), KING_CLUBS(Value.KING, Color.CLUBS), KING_DIAMONDS(Value.KING, Color.DIAMONDS),
	KING_HEARTS(Value.KING, Color.HEARTS), KING_SPADES(Value.KING, Color.SPADES), JOKER1(Value.JOKER, Color.NONE), JOKER2(Value.JOKER, Color.NONE),
	ONE_TRUMP(Value.ONE, Color.TRUMP, 4.5, false), TWO_TRUMP(Value.TWO, Color.TRUMP, 0.5, false), THREE_TRUMP(Value.THREE, Color.TRUMP, 0.5, false),
	FOUR_TRUMP(Value.FOUR, Color.TRUMP, 0.5, false), FIVE_TRUMP(Value.FIVE, Color.TRUMP, 0.5, false), SIX_TRUMP(Value.SIX, Color.TRUMP, 0.5, false),
	SEVEN_TRUMP(Value.SEVEN, Color.TRUMP, 0.5, false), EIGHT_TRUMP(Value.EIGHT, Color.TRUMP, 0.5, false), NEIN_TRUMP(Value.NEIN, Color.TRUMP, 0.5, false),
	TEN_TRUMP(Value.TEN, Color.TRUMP, 0.5, false), ELEVEN_TRUMP(Value.ELEVEN, Color.TRUMP, 0.5, false), TWELVE_TRUMP(Value.TWELVE, Color.TRUMP, 0.5, false),
	THIRTEEN_TRUMP(Value.THIRTEEN, Color.TRUMP, 0.5, false), FOURTEEN_TRUMP(Value.FOURTEEN, Color.TRUMP, 0.5, false),
	FIFTEEN_TRUMP(Value.FIFTEEN, Color.TRUMP, 0.5, false), SIXTEEN_TRUMP(Value.SIXTEEN, Color.TRUMP, 0.5, false),
	SEVENTEEN_TRUMP(Value.SEVENTEEN, Color.TRUMP, 0.5, false), EIGHTEEN_TRUMP(Value.EIGHTEEN, Color.TRUMP, 0.5, false),
	NEINTEEN_TRUMP(Value.NEINTEEN, Color.TRUMP, 0.5, false), TWENTY_TRUMP(Value.TWENTY, Color.TRUMP, 0.5, false),
	TWENTY_ONE_TRUMP(Value.TWENTY_ONE, Color.TRUMP, 4.5, false), FOOL_TRUMP(Value.FOOL, Color.TRUMP, 4.5, false);

	private Value value;
	private Color color;
	private double point;
	private boolean canChangePoint;

	private Card(Value value, Color color) {
		this(value, color, 0, true);
	}

	private Card(Value value, Color color, double point, boolean canChangePoint) {
		this.value = value;
		this.color = color;
		this.point = point;
		this.canChangePoint = canChangePoint;
	}

	public int getValue() {
		return value.getValue();
	}

	public Color getColor() {
		return color;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		if (!canChangePoint)
			throw new UnsupportedOperationException();
		this.point = point;
	}

	@Override
	public String toString() {
		return value + (getColor() != Color.NONE ? " of " + getColor() : "");
	}
}
