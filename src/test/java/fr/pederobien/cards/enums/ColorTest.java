package fr.pederobien.cards.enums;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ColorTest {

	@Test
	public void Ta_ToString() {
		Assert.assertEquals("clubs", Color.CLUBS.toString());
		Assert.assertEquals("diamonds", Color.DIAMONDS.toString());
		Assert.assertEquals("hearts", Color.HEARTS.toString());
		Assert.assertEquals("spades", Color.SPADES.toString());
		Assert.assertEquals("trump", Color.TRUMP.toString());
		Assert.assertEquals("none", Color.NONE.toString());
	}
}
