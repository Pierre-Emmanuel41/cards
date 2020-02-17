package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.interfaces.ICardContainer;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CardContainerTest {
	private ICardContainer container;

	@Before
	public void Ta_reinit() {
		container = new CardContainer();
	}

	@Test
	public void Ta_DefaultValues() {
		Assert.assertEquals(0, container.size());
		Assert.assertTrue(container.getCards().isEmpty());
	}

	@Test
	public void Tb_AddRemove() {
		container.add(Card.ACE_CLUBS);
		Assert.assertEquals(1, container.size());
		Assert.assertEquals(Card.ACE_CLUBS, container.getCards().get(0));

		container.remove(Card.ACE_CLUBS);
		Assert.assertEquals(0, container.size());
		Assert.assertTrue(container.getCards().isEmpty());
	}

	@Test
	public void Tc_AddRemoveAll() {
		List<Card> cards = new ArrayList<Card>();
		cards.add(Card.ACE_CLUBS);
		cards.add(Card.FIVE_CLUBS);
		cards.add(Card.KING_DIAMONDS);

		container.addAll(cards);
		Assert.assertEquals(3, container.size());
		Assert.assertEquals(Card.ACE_CLUBS, container.getCards().get(0));
		Assert.assertEquals(Card.FIVE_CLUBS, container.getCards().get(1));
		Assert.assertEquals(Card.KING_DIAMONDS, container.getCards().get(2));

		container.removeAll(cards);
		Assert.assertEquals(0, container.size());
		Assert.assertTrue(container.getCards().isEmpty());
	}

	@Test
	public void Td_Clear() {
		List<Card> cards = new ArrayList<Card>();
		cards.add(Card.ACE_CLUBS);
		cards.add(Card.FIVE_CLUBS);
		cards.add(Card.KING_DIAMONDS);
		container.addAll(cards);

		container.clear();
		Assert.assertEquals(0, container.size());
		Assert.assertTrue(container.getCards().isEmpty());
	}

	@Test
	public void Te_ToString() {
		List<Card> cards = new ArrayList<Card>();
		cards.add(Card.ACE_CLUBS);
		cards.add(Card.FIVE_CLUBS);
		cards.add(Card.KING_DIAMONDS);
		container.addAll(cards);
		String toString = "CardContainer, size=3\nace of clubs\n5 of clubs\nking of diamonds";
		Assert.assertEquals(toString, container.toString());
	}

	@Test
	public void Tf_Concat() {
		ICardContainer container1 = new CardContainer();
		container1.add(Card.EIGHT_HEARTS);
		container1.add(Card.JACK_HEARTS);
		ICardContainer container2 = new CardContainer();
		container2.add(Card.FIFTEEN_TRUMP);
		container2.add(Card.KING_DIAMONDS);

		Assert.assertEquals(4, container.concat(container1, container2).size());
		Assert.assertEquals(Card.EIGHT_HEARTS, container.getCards().get(0));
		Assert.assertEquals(Card.JACK_HEARTS, container.getCards().get(1));
		Assert.assertEquals(Card.FIFTEEN_TRUMP, container.getCards().get(2));
		Assert.assertEquals(Card.KING_DIAMONDS, container.getCards().get(3));
	}
}
