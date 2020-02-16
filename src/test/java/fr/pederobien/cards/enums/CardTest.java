package fr.pederobien.cards.enums;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardTest {

	@Test
	public void Ta_ToString() {
		Assert.assertEquals("2 of clubs", Card.TWO_CLUBS.toString());
		Assert.assertEquals("2 of diamonds", Card.TWO_DIAMONDS.toString());
		Assert.assertEquals("2 of hearts", Card.TWO_HEARTS.toString());
		Assert.assertEquals("2 of spades", Card.TWO_SPADES.toString());

		Assert.assertEquals("3 of clubs", Card.THREE_CLUBS.toString());
		Assert.assertEquals("3 of diamonds", Card.THREE_DIAMONDS.toString());
		Assert.assertEquals("3 of hearts", Card.THREE_HEARTS.toString());
		Assert.assertEquals("3 of spades", Card.THREE_SPADES.toString());

		Assert.assertEquals("4 of clubs", Card.FOUR_CLUBS.toString());
		Assert.assertEquals("4 of diamonds", Card.FOUR_DIAMONDS.toString());
		Assert.assertEquals("4 of hearts", Card.FOUR_HEARTS.toString());
		Assert.assertEquals("4 of spades", Card.FOUR_SPADES.toString());

		Assert.assertEquals("5 of clubs", Card.FIVE_CLUBS.toString());
		Assert.assertEquals("5 of diamonds", Card.FIVE_DIAMONDS.toString());
		Assert.assertEquals("5 of hearts", Card.FIVE_HEARTS.toString());
		Assert.assertEquals("5 of spades", Card.FIVE_SPADES.toString());

		Assert.assertEquals("6 of clubs", Card.SIX_CLUBS.toString());
		Assert.assertEquals("6 of diamonds", Card.SIX_DIAMONDS.toString());
		Assert.assertEquals("6 of hearts", Card.SIX_HEARTS.toString());
		Assert.assertEquals("6 of spades", Card.SIX_SPADES.toString());

		Assert.assertEquals("7 of clubs", Card.SEVEN_CLUBS.toString());
		Assert.assertEquals("7 of diamonds", Card.SEVEN_DIAMONDS.toString());
		Assert.assertEquals("7 of hearts", Card.SEVEN_HEARTS.toString());
		Assert.assertEquals("7 of spades", Card.SEVEN_SPADES.toString());

		Assert.assertEquals("8 of clubs", Card.EIGHT_CLUBS.toString());
		Assert.assertEquals("8 of diamonds", Card.EIGHT_DIAMONDS.toString());
		Assert.assertEquals("8 of hearts", Card.EIGHT_HEARTS.toString());
		Assert.assertEquals("8 of spades", Card.EIGHT_SPADES.toString());

		Assert.assertEquals("9 of clubs", Card.NEIN_CLUBS.toString());
		Assert.assertEquals("9 of diamonds", Card.NEIN_DIAMONDS.toString());
		Assert.assertEquals("9 of hearts", Card.NEIN_HEARTS.toString());
		Assert.assertEquals("9 of spades", Card.NEIN_SPADES.toString());

		Assert.assertEquals("10 of clubs", Card.TEN_CLUBS.toString());
		Assert.assertEquals("10 of diamonds", Card.TEN_DIAMONDS.toString());
		Assert.assertEquals("10 of hearts", Card.TEN_HEARTS.toString());
		Assert.assertEquals("10 of spades", Card.TEN_SPADES.toString());

		Assert.assertEquals("jack of clubs", Card.JACK_CLUBS.toString());
		Assert.assertEquals("jack of diamonds", Card.JACK_DIAMONDS.toString());
		Assert.assertEquals("jack of hearts", Card.JACK_HEARTS.toString());
		Assert.assertEquals("jack of spades", Card.JACK_SPADES.toString());

		Assert.assertEquals("knight of clubs", Card.KNIGHT_CLUBS.toString());
		Assert.assertEquals("knight of diamonds", Card.KNIGHT_DIAMONDS.toString());
		Assert.assertEquals("knight of hearts", Card.KNIGHT_HEARTS.toString());
		Assert.assertEquals("knight of spades", Card.KNIGHT_SPADES.toString());

		Assert.assertEquals("queen of clubs", Card.QUEEN_CLUBS.toString());
		Assert.assertEquals("queen of diamonds", Card.QUEEN_DIAMONDS.toString());
		Assert.assertEquals("queen of hearts", Card.QUEEN_HEARTS.toString());
		Assert.assertEquals("queen of spades", Card.QUEEN_SPADES.toString());

		Assert.assertEquals("king of clubs", Card.KING_CLUBS.toString());
		Assert.assertEquals("king of diamonds", Card.KING_DIAMONDS.toString());
		Assert.assertEquals("king of hearts", Card.KING_HEARTS.toString());
		Assert.assertEquals("king of spades", Card.KING_SPADES.toString());

		Assert.assertEquals("ace of clubs", Card.ACE_CLUBS.toString());
		Assert.assertEquals("ace of diamonds", Card.ACE_DIAMONDS.toString());
		Assert.assertEquals("ace of hearts", Card.ACE_HEARTS.toString());
		Assert.assertEquals("ace of spades", Card.ACE_SPADES.toString());

		Assert.assertEquals("joker", Card.JOKER1.toString());
		Assert.assertEquals("joker", Card.JOKER2.toString());

		Assert.assertEquals("1 of trump", Card.ONE_TRUMP.toString());
		Assert.assertEquals("2 of trump", Card.TWO_TRUMP.toString());
		Assert.assertEquals("3 of trump", Card.THREE_TRUMP.toString());
		Assert.assertEquals("4 of trump", Card.FOUR_TRUMP.toString());
		Assert.assertEquals("5 of trump", Card.FIVE_TRUMP.toString());
		Assert.assertEquals("6 of trump", Card.SIX_TRUMP.toString());
		Assert.assertEquals("7 of trump", Card.SEVEN_TRUMP.toString());
		Assert.assertEquals("8 of trump", Card.EIGHT_TRUMP.toString());
		Assert.assertEquals("9 of trump", Card.NEIN_TRUMP.toString());
		Assert.assertEquals("10 of trump", Card.TEN_TRUMP.toString());
		Assert.assertEquals("11 of trump", Card.ELEVEN_TRUMP.toString());
		Assert.assertEquals("12 of trump", Card.TWELVE_TRUMP.toString());
		Assert.assertEquals("13 of trump", Card.THIRTEEN_TRUMP.toString());
		Assert.assertEquals("14 of trump", Card.FOURTEEN_TRUMP.toString());
		Assert.assertEquals("15 of trump", Card.FIFTEEN_TRUMP.toString());
		Assert.assertEquals("16 of trump", Card.SIXTEEN_TRUMP.toString());
		Assert.assertEquals("17 of trump", Card.SEVENTEEN_TRUMP.toString());
		Assert.assertEquals("18 of trump", Card.EIGHTEEN_TRUMP.toString());
		Assert.assertEquals("19 of trump", Card.NEINTEEN_TRUMP.toString());
		Assert.assertEquals("20 of trump", Card.TWENTY_TRUMP.toString());
		Assert.assertEquals("21 of trump", Card.TWENTY_ONE_TRUMP.toString());
		Assert.assertEquals("fool of trump", Card.FOOL_TRUMP.toString());
	}

	@Test
	public void Tb_GetValue() {
		Assert.assertEquals(2, Card.TWO_CLUBS.getValue());
		Assert.assertEquals(2, Card.TWO_DIAMONDS.getValue());
		Assert.assertEquals(2, Card.TWO_HEARTS.getValue());
		Assert.assertEquals(2, Card.TWO_SPADES.getValue());

		Assert.assertEquals(3, Card.THREE_CLUBS.getValue());
		Assert.assertEquals(3, Card.THREE_DIAMONDS.getValue());
		Assert.assertEquals(3, Card.THREE_HEARTS.getValue());
		Assert.assertEquals(3, Card.THREE_SPADES.getValue());

		Assert.assertEquals(4, Card.FOUR_CLUBS.getValue());
		Assert.assertEquals(4, Card.FOUR_DIAMONDS.getValue());
		Assert.assertEquals(4, Card.FOUR_HEARTS.getValue());
		Assert.assertEquals(4, Card.FOUR_SPADES.getValue());

		Assert.assertEquals(5, Card.FIVE_CLUBS.getValue());
		Assert.assertEquals(5, Card.FIVE_DIAMONDS.getValue());
		Assert.assertEquals(5, Card.FIVE_HEARTS.getValue());
		Assert.assertEquals(5, Card.FIVE_SPADES.getValue());

		Assert.assertEquals(6, Card.SIX_CLUBS.getValue());
		Assert.assertEquals(6, Card.SIX_DIAMONDS.getValue());
		Assert.assertEquals(6, Card.SIX_HEARTS.getValue());
		Assert.assertEquals(6, Card.SIX_SPADES.getValue());

		Assert.assertEquals(7, Card.SEVEN_CLUBS.getValue());
		Assert.assertEquals(7, Card.SEVEN_DIAMONDS.getValue());
		Assert.assertEquals(7, Card.SEVEN_HEARTS.getValue());
		Assert.assertEquals(7, Card.SEVEN_SPADES.getValue());

		Assert.assertEquals(8, Card.EIGHT_CLUBS.getValue());
		Assert.assertEquals(8, Card.EIGHT_DIAMONDS.getValue());
		Assert.assertEquals(8, Card.EIGHT_HEARTS.getValue());
		Assert.assertEquals(8, Card.EIGHT_SPADES.getValue());

		Assert.assertEquals(9, Card.NEIN_CLUBS.getValue());
		Assert.assertEquals(9, Card.NEIN_DIAMONDS.getValue());
		Assert.assertEquals(9, Card.NEIN_HEARTS.getValue());
		Assert.assertEquals(9, Card.NEIN_SPADES.getValue());

		Assert.assertEquals(10, Card.TEN_CLUBS.getValue());
		Assert.assertEquals(10, Card.TEN_DIAMONDS.getValue());
		Assert.assertEquals(10, Card.TEN_HEARTS.getValue());
		Assert.assertEquals(10, Card.TEN_SPADES.getValue());

		Assert.assertEquals(11, Card.JACK_CLUBS.getValue());
		Assert.assertEquals(11, Card.JACK_DIAMONDS.getValue());
		Assert.assertEquals(11, Card.JACK_HEARTS.getValue());
		Assert.assertEquals(11, Card.JACK_SPADES.getValue());

		Assert.assertEquals(12, Card.KNIGHT_CLUBS.getValue());
		Assert.assertEquals(12, Card.KNIGHT_DIAMONDS.getValue());
		Assert.assertEquals(12, Card.KNIGHT_HEARTS.getValue());
		Assert.assertEquals(12, Card.KNIGHT_SPADES.getValue());

		Assert.assertEquals(13, Card.QUEEN_CLUBS.getValue());
		Assert.assertEquals(13, Card.QUEEN_DIAMONDS.getValue());
		Assert.assertEquals(13, Card.QUEEN_HEARTS.getValue());
		Assert.assertEquals(13, Card.QUEEN_SPADES.getValue());

		Assert.assertEquals(14, Card.KING_CLUBS.getValue());
		Assert.assertEquals(14, Card.KING_DIAMONDS.getValue());
		Assert.assertEquals(14, Card.KING_HEARTS.getValue());
		Assert.assertEquals(14, Card.KING_SPADES.getValue());

		Assert.assertEquals(15, Card.ACE_CLUBS.getValue());
		Assert.assertEquals(15, Card.ACE_DIAMONDS.getValue());
		Assert.assertEquals(15, Card.ACE_HEARTS.getValue());
		Assert.assertEquals(15, Card.ACE_SPADES.getValue());

		Assert.assertEquals(16, Card.JOKER1.getValue());
		Assert.assertEquals(16, Card.JOKER2.getValue());

		Assert.assertEquals(1, Card.ONE_TRUMP.getValue());
		Assert.assertEquals(2, Card.TWO_TRUMP.getValue());
		Assert.assertEquals(3, Card.THREE_TRUMP.getValue());
		Assert.assertEquals(4, Card.FOUR_TRUMP.getValue());
		Assert.assertEquals(5, Card.FIVE_TRUMP.getValue());
		Assert.assertEquals(6, Card.SIX_TRUMP.getValue());
		Assert.assertEquals(7, Card.SEVEN_TRUMP.getValue());
		Assert.assertEquals(8, Card.EIGHT_TRUMP.getValue());
		Assert.assertEquals(9, Card.NEIN_TRUMP.getValue());
		Assert.assertEquals(10, Card.TEN_TRUMP.getValue());
		Assert.assertEquals(17, Card.ELEVEN_TRUMP.getValue());
		Assert.assertEquals(18, Card.TWELVE_TRUMP.getValue());
		Assert.assertEquals(19, Card.THIRTEEN_TRUMP.getValue());
		Assert.assertEquals(20, Card.FOURTEEN_TRUMP.getValue());
		Assert.assertEquals(21, Card.FIFTEEN_TRUMP.getValue());
		Assert.assertEquals(22, Card.SIXTEEN_TRUMP.getValue());
		Assert.assertEquals(23, Card.SEVENTEEN_TRUMP.getValue());
		Assert.assertEquals(24, Card.EIGHTEEN_TRUMP.getValue());
		Assert.assertEquals(25, Card.NEINTEEN_TRUMP.getValue());
		Assert.assertEquals(26, Card.TWENTY_TRUMP.getValue());
		Assert.assertEquals(27, Card.TWENTY_ONE_TRUMP.getValue());
		Assert.assertEquals(28, Card.FOOL_TRUMP.getValue());
	}

	@Test
	public void Tc_GetSetPoint_a() {
		Card.ACE_CLUBS.setPoint(10);
		Assert.assertEquals(10, Card.ACE_CLUBS.getPoint(), Math.pow(10, -5));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void Tc_GetSetPoint_b() {
		Card.ONE_TRUMP.setPoint(10);
	}
}
