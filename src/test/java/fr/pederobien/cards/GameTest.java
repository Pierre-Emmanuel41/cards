package fr.pederobien.cards;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import fr.pederobien.cards.enums.PacketProperty;
import fr.pederobien.cards.interfaces.IGame;
import fr.pederobien.cards.interfaces.IPlayer;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GameTest extends TestAssertion {
	private IGame game;
	private IPlayer player1, player2;

	@Before
	public void reinit() {
		game = new Game(PacketProperty.FULL);
		player1 = game.registerPlayer("Player 1");
		player2 = game.registerPlayer("Player 2");
	}

	@Test
	public void Ta_Register_a() {
		Assert.assertEquals("Player 1", player1.getName());
		Assert.assertEquals("Player 2", player2.getName());
		Assert.assertEquals(2, game.getPlayers().size());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void Ta_Register_b() {
		game.registerPlayer("Player 1");
	}

	@Test
	public void Tb_unregistered_a() {
		Assert.assertEquals(player1, game.unRegisterPlayer("Player 1").get());
	}

	@Test
	public void Tb_unregistered_b() {
		Assert.assertFalse(game.unRegisterPlayer("Player 3").isPresent());
	}

	@Test
	public void Tc_GetPlayers() {
		Assert.assertEquals(2, game.getPlayers().size());
		Assert.assertTrue(game.getPlayers().contains(player1));
		Assert.assertTrue(game.getPlayers().contains(player2));
	}

	@Test
	public void Tc_GetPlayer_a() {
		Assert.assertEquals(player1, game.getPlayer("Player 1").get());
	}

	@Test
	public void Tc_GetPlayer_b() {
		Assert.assertFalse(game.getPlayer("Player 3").isPresent());
	}

	@Test
	public void Td_Reset_a() {
		game.getManager().getPacket().shuffle();
		game.giveToPlayerHand("Player 1", game.getManager().getPacket().removeFirst(3));
		game.giveToPlayerPill("Player 1", game.getManager().getPacket().removeFirst(3));
		game.giveToPlayerHand("Player 2", game.getManager().getPacket().removeFirst(3));
		game.giveToPlayerPill("Player 2", game.getManager().getPacket().removeFirst(3));
		game.giveToStock(game.getManager().getPacket().removeFirst(3));
		game.giveToPill(game.getManager().getPacket().removeFirst(3));

		game.reset(false);
		Assert.assertEquals(78, game.getManager().getPacket().size());
		assertNotDeepEquals(game.getManager().getPacket().getCards(), new Packet(PacketProperty.FULL).getCards());
		Assert.assertEquals(0, game.getPlayer("Player 1").get().getHand().size());
		Assert.assertEquals(0, game.getPlayer("Player 1").get().getPill().size());
		Assert.assertEquals(0, game.getPlayer("Player 2").get().getHand().size());
		Assert.assertEquals(0, game.getPlayer("Player 2").get().getPill().size());
		Assert.assertEquals(0, game.getManager().getStock().size());
		Assert.assertEquals(0, game.getManager().getPill().size());
	}

	@Test
	public void Td_Reset_b() {
		game.getManager().getPacket().shuffle();
		game.giveToPlayerHand("Player 1", game.getManager().getPacket().removeFirst(3));
		game.giveToPlayerPill("Player 1", game.getManager().getPacket().removeFirst(3));
		game.giveToPlayerHand("Player 2", game.getManager().getPacket().removeFirst(3));
		game.giveToPlayerPill("Player 2", game.getManager().getPacket().removeFirst(3));
		game.giveToStock(game.getManager().getPacket().removeFirst(3));
		game.giveToPill(game.getManager().getPacket().removeFirst(3));

		game.reset(true);
		Assert.assertEquals(78, game.getManager().getPacket().size());
		assertDeepEquals(game.getManager().getPacket().getCards(), new Packet(PacketProperty.FULL).getCards());
		Assert.assertEquals(0, game.getPlayer("Player 1").get().getHand().size());
		Assert.assertEquals(0, game.getPlayer("Player 1").get().getPill().size());
		Assert.assertEquals(0, game.getPlayer("Player 2").get().getHand().size());
		Assert.assertEquals(0, game.getPlayer("Player 2").get().getPill().size());
		Assert.assertEquals(0, game.getManager().getStock().size());
		Assert.assertEquals(0, game.getManager().getPill().size());
	}
}
