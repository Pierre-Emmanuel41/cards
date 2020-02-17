package fr.pederobien.cards;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketProperty;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.IPacket;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PacketTest {
	private IPacket packet;

	@Before
	public void reinit() {
		packet = new Packet(PacketProperty.FULL);
	}

	@Test
	public void Ta_Size() {
		Assert.assertEquals(78, packet.size());

		packet = new Packet(PacketProperty.FIFTY_FOUR);
		Assert.assertEquals(54, packet.size());

		packet = new Packet(PacketProperty.FIFTY_TWO);
		Assert.assertEquals(52, packet.size());

		packet = new Packet(PacketProperty.THIRTY_TWO);
		Assert.assertEquals(32, packet.size());
	}

	@Test
	public void Tb_AddLast_a() {
		packet.addLast(Card.FOURTEEN_TRUMP);
		Assert.assertEquals(Card.FOURTEEN_TRUMP, packet.getCards().get(packet.getCards().size() - 1));
	}

	@Test
	public void Tb_AddLast_b() {
		ICardContainer cards = new CardContainer();
		cards.add(Card.ELEVEN_TRUMP);
		cards.add(Card.JACK_HEARTS);

		packet.addLast(cards);
		Assert.assertEquals(Card.JACK_HEARTS, packet.getCards().get(packet.getCards().size() - 1));
		Assert.assertEquals(Card.ELEVEN_TRUMP, packet.getCards().get(packet.getCards().size() - 2));
	}

	@Test
	public void Tc_removeFirst_a() {
		Assert.assertEquals(Card.ACE_CLUBS, packet.removeFirst());
	}

	@Test
	public void Tc_removeFirst_b1() {
		ICardContainer container = packet.removeFirst(5);
		Assert.assertEquals(Card.ACE_CLUBS, container.getCards().get(0));
		Assert.assertEquals(Card.ACE_DIAMONDS, container.getCards().get(1));
		Assert.assertEquals(Card.ACE_HEARTS, container.getCards().get(2));
		Assert.assertEquals(Card.ACE_SPADES, container.getCards().get(3));
		Assert.assertEquals(Card.TWO_CLUBS, container.getCards().get(4));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void Tc_removeFirst_b2() {
		packet.removeFirst(-1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void Tc_removeFirst_b3() {
		packet.removeFirst(79);
	}

	@Test
	public void Td_removeLast_a() {
		Assert.assertEquals(Card.FOOL_TRUMP, packet.removeLast());
	}

	@Test
	public void Td_removeLast_b1() {
		ICardContainer container = packet.removeLast(5);
		Assert.assertEquals(Card.FOOL_TRUMP, container.getCards().get(0));
		Assert.assertEquals(Card.TWENTY_ONE_TRUMP, container.getCards().get(1));
		Assert.assertEquals(Card.TWENTY_TRUMP, container.getCards().get(2));
		Assert.assertEquals(Card.NEINTEEN_TRUMP, container.getCards().get(3));
		Assert.assertEquals(Card.EIGHTEEN_TRUMP, container.getCards().get(4));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void Td_removeLast_b2() {
		packet.removeLast(-1);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void Td_removeLast_b3() {
		packet.removeLast(79);
	}

	@Test
	public void Te_Reset_a() {
		IPacket unmodifiedPacket = new Packet(PacketProperty.FULL);
		packet.shuffle();
		assertNotDeepEquals(packet.getCards(), unmodifiedPacket.getCards());

		packet.reset();
		assertDeepEquals(packet.getCards(), unmodifiedPacket.getCards());
	}

	@Test
	public void Te_Reset_b() {
		packet.shuffle();

		packet.reset(PacketProperty.THIRTY_TWO);
		assertDeepEquals(packet.getCards(), new Packet(PacketProperty.THIRTY_TWO).getCards());
	}

	@Test
	public void Tf_ToString() {
		packet.removeFirst(78);
		packet.addLast(Card.EIGHT_SPADES);
		packet.addLast(Card.JOKER1);
		packet.addLast(Card.SEVEN_HEARTS);
		String toString = "Packet, size=3\n8 of spades\njoker\n7 of hearts";
		Assert.assertEquals(toString, packet.toString());
	}

	private void assertDeepEquals(List<Card> list1, List<Card> list2) {
		if (list1.size() != list2.size())
			throw new AssertionError("Both list are different (not the same size)");
		for (int i = 0; i < list1.size(); i++)
			if (!list1.get(i).equals(list2.get(i)))
				throw new AssertionError("Elements at range " + i + " are different");
	}

	private void assertNotDeepEquals(List<Card> list1, List<Card> list2) {
		if (list1.size() != list2.size())
			return;

		boolean equals = true;
		for (int i = 0; i < list1.size(); i++)
			if (equals)
				equals &= list1.get(i).equals(list2.get(i));
			else
				break;
		if (equals)
			throw new AssertionError("Both list are deep equals");
	}
}
