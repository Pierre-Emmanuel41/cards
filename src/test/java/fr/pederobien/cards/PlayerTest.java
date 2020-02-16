package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.interfaces.IPlayer;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PlayerTest {
	private IPlayer player;

	@Before
	public void reinit() {
		player = new Player("Player");
	}

	@Test
	public void Ta_DefaultValues() {
		Assert.assertEquals("Player", player.getName());
		Assert.assertNotNull(player.getHand());
		Assert.assertTrue(player.getHand().getCards().isEmpty());
		Assert.assertNotNull(player.getPill());
		Assert.assertTrue(player.getPill().getCards().isEmpty());
	}

	@Test
	public void Tb_Reset() {
		List<Card> handCards = new ArrayList<Card>();
		handCards.add(Card.FOUR_CLUBS);
		handCards.add(Card.KING_CLUBS);
		handCards.add(Card.EIGHT_TRUMP);
		player.getHand().addAll(handCards);

		List<Card> pillCards = new ArrayList<Card>();
		pillCards.add(Card.FIVE_CLUBS);
		pillCards.add(Card.JACK_HEARTS);
		pillCards.add(Card.THREE_SPADES);
		player.getPill().addAll(pillCards);

		player.reset();
		Assert.assertTrue(player.getHand().getCards().isEmpty());
		Assert.assertTrue(player.getPill().getCards().isEmpty());
	}

	@Test
	public void Tc_ToString() {
		Assert.assertEquals("Player={name=Player}", player.toString());
	}
}
