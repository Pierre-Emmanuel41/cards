package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketProperty;
import fr.pederobien.cards.interfaces.ICardContainerManager;
import fr.pederobien.cards.interfaces.IPacket;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardContainerManagerTest {
	private ICardContainerManager manager;

	@Before
	public void reinit() {
		manager = new CardContainerManager(PacketProperty.THIRTY_TWO);
	}

	@Test
	public void Ta_DefaultValues() {
		Assert.assertNotNull(manager.getPacket());
		Assert.assertNotNull(manager.getStock());
		Assert.assertNotNull(manager.getPill());
	}

	@Test
	public void Tb_Reset_a() {
		IPacket packet = manager.getPacket();
		packet.shuffle();
		List<Card> pillCards = new ArrayList<Card>();
		pillCards.addAll(packet.removeFirst(2));
		manager.getPill().addAll(pillCards);
		List<Card> stockCards = new ArrayList<Card>();
		stockCards.addAll(packet.removeLast(2));
		manager.getStock().addAll(stockCards);

		manager.reset(false);
		Assert.assertEquals(0, manager.getPill().size());
		Assert.assertEquals(0, manager.getStock().size());
		Assert.assertEquals(32, manager.getPacket().size());

		Assert.assertEquals(pillCards.get(1), packet.getCards().get(packet.size() - 1));
		Assert.assertEquals(pillCards.get(0), packet.getCards().get(packet.size() - 2));
		Assert.assertEquals(stockCards.get(1), packet.getCards().get(packet.size() - 3));
		Assert.assertEquals(stockCards.get(0), packet.getCards().get(packet.size() - 4));
	}

	@Test
	public void Tb_Reset_b() {
		IPacket packet = manager.getPacket();
		packet.shuffle();
		List<Card> pillCards = new ArrayList<Card>();
		pillCards.addAll(packet.removeFirst(2));
		manager.getPill().addAll(pillCards);
		List<Card> stockCards = new ArrayList<Card>();
		stockCards.addAll(packet.removeLast(2));
		manager.getStock().addAll(stockCards);

		manager.reset(true);
		Assert.assertEquals(0, manager.getPill().size());
		Assert.assertEquals(0, manager.getStock().size());
		Assert.assertEquals(32, manager.getPacket().size());
		assertDeepEquals(manager.getPacket().getCards(), new Packet(PacketProperty.THIRTY_TWO).getCards());
	}

	private void assertDeepEquals(List<Card> list1, List<Card> list2) {
		if (list1.size() != list2.size())
			throw new AssertionError("Both list are different (not the same size)");
		for (int i = 0; i < list1.size(); i++)
			if (!list1.get(i).equals(list2.get(i)))
				throw new AssertionError("Elements at range " + i + " are different");
	}
}
