package fr.pederobien.cards.enums;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PacketPropertyTest {

	@Test
	public void Ta_LowerRange() {
		Assert.assertEquals(2, PacketProperty.FIFTY_FOUR.getLowerRange());
		Assert.assertEquals(2, PacketProperty.FIFTY_TWO.getLowerRange());
		Assert.assertEquals(7, PacketProperty.THIRTY_TWO.getLowerRange());
		Assert.assertEquals(1, PacketProperty.FULL.getLowerRange());
	}

	@Test
	public void Tb_UpperRange() {
		Assert.assertEquals(16, PacketProperty.FIFTY_FOUR.getUpperRange());
		Assert.assertEquals(15, PacketProperty.FIFTY_TWO.getUpperRange());
		Assert.assertEquals(15, PacketProperty.THIRTY_TWO.getUpperRange());
		Assert.assertEquals(28, PacketProperty.FULL.getUpperRange());
	}

	@Test
	public void Tc_ForbiddenValue() {
		Assert.assertEquals(12, PacketProperty.FIFTY_FOUR.getForbiddenValue());
		Assert.assertEquals(12, PacketProperty.FIFTY_TWO.getForbiddenValue());
		Assert.assertEquals(12, PacketProperty.THIRTY_TWO.getForbiddenValue());
		Assert.assertEquals(16, PacketProperty.FULL.getForbiddenValue());
	}

	@Test
	public void Td_ForbiddenColor() {
		Assert.assertEquals(Color.TRUMP, PacketProperty.FIFTY_FOUR.getForbiddenColor());
		Assert.assertEquals(Color.TRUMP, PacketProperty.FIFTY_TWO.getForbiddenColor());
		Assert.assertEquals(Color.TRUMP, PacketProperty.THIRTY_TWO.getForbiddenColor());
		Assert.assertEquals(Color.NONE, PacketProperty.FULL.getForbiddenColor());
	}
}
