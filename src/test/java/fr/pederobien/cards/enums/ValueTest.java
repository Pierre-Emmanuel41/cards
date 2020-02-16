package fr.pederobien.cards.enums;

import org.junit.Assert;
import org.junit.Test;

public class ValueTest {

	@Test
	public void Ta_Value() {
		Assert.assertEquals(1, Value.ONE.getValue());
		Assert.assertEquals(2, Value.TWO.getValue());
		Assert.assertEquals(3, Value.THREE.getValue());
		Assert.assertEquals(4, Value.FOUR.getValue());
		Assert.assertEquals(5, Value.FIVE.getValue());
		Assert.assertEquals(6, Value.SIX.getValue());
		Assert.assertEquals(7, Value.SEVEN.getValue());
		Assert.assertEquals(8, Value.EIGHT.getValue());
		Assert.assertEquals(9, Value.NEIN.getValue());
		Assert.assertEquals(10, Value.TEN.getValue());
		Assert.assertEquals(11, Value.JACK.getValue());
		Assert.assertEquals(12, Value.KNIGHT.getValue());
		Assert.assertEquals(13, Value.QUEEN.getValue());
		Assert.assertEquals(14, Value.KING.getValue());
		Assert.assertEquals(15, Value.ACE.getValue());
		Assert.assertEquals(16, Value.JOKER.getValue());
		Assert.assertEquals(17, Value.ELEVEN.getValue());
		Assert.assertEquals(18, Value.TWELVE.getValue());
		Assert.assertEquals(19, Value.THIRTEEN.getValue());
		Assert.assertEquals(20, Value.FOURTEEN.getValue());
		Assert.assertEquals(21, Value.FIFTEEN.getValue());
		Assert.assertEquals(22, Value.SIXTEEN.getValue());
		Assert.assertEquals(23, Value.SEVENTEEN.getValue());
		Assert.assertEquals(24, Value.EIGHTEEN.getValue());
		Assert.assertEquals(25, Value.NEINTEEN.getValue());
		Assert.assertEquals(26, Value.TWENTY.getValue());
		Assert.assertEquals(27, Value.TWENTY_ONE.getValue());
		Assert.assertEquals(28, Value.FOOL.getValue());
	}

	@Test
	public void Tb_ToString() {
		Assert.assertEquals("1", Value.ONE.toString());
		Assert.assertEquals("2", Value.TWO.toString());
		Assert.assertEquals("3", Value.THREE.toString());
		Assert.assertEquals("4", Value.FOUR.toString());
		Assert.assertEquals("5", Value.FIVE.toString());
		Assert.assertEquals("6", Value.SIX.toString());
		Assert.assertEquals("7", Value.SEVEN.toString());
		Assert.assertEquals("8", Value.EIGHT.toString());
		Assert.assertEquals("9", Value.NEIN.toString());
		Assert.assertEquals("10", Value.TEN.toString());
		Assert.assertEquals("jack", Value.JACK.toString());
		Assert.assertEquals("knight", Value.KNIGHT.toString());
		Assert.assertEquals("queen", Value.QUEEN.toString());
		Assert.assertEquals("king", Value.KING.toString());
		Assert.assertEquals("ace", Value.ACE.toString());
		Assert.assertEquals("joker", Value.JOKER.toString());
		Assert.assertEquals("11", Value.ELEVEN.toString());
		Assert.assertEquals("12", Value.TWELVE.toString());
		Assert.assertEquals("13", Value.THIRTEEN.toString());
		Assert.assertEquals("14", Value.FOURTEEN.toString());
		Assert.assertEquals("15", Value.FIFTEEN.toString());
		Assert.assertEquals("16", Value.SIXTEEN.toString());
		Assert.assertEquals("17", Value.SEVENTEEN.toString());
		Assert.assertEquals("18", Value.EIGHTEEN.toString());
		Assert.assertEquals("19", Value.NEINTEEN.toString());
		Assert.assertEquals("20", Value.TWENTY.toString());
		Assert.assertEquals("21", Value.TWENTY_ONE.toString());
		Assert.assertEquals("fool", Value.FOOL.toString());
	}
}
