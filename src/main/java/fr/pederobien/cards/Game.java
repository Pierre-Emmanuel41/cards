package fr.pederobien.cards;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import fr.pederobien.cards.enums.PacketProperty;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.ICardContainerManager;
import fr.pederobien.cards.interfaces.IGame;
import fr.pederobien.cards.interfaces.IPacket;
import fr.pederobien.cards.interfaces.IPlayer;

public class Game implements IGame {
	private Map<String, IPlayer> players;
	private ICardContainerManager manager;

	public Game(PacketProperty packetProperty) {
		players = new HashMap<String, IPlayer>();
		manager = new CardContainerManager(packetProperty);
	}

	@Override
	public IPlayer registerPlayer(String name) {
		throwIfPresent(name);

		IPlayer player = new Player(name);
		players.put(name, player);
		return player;
	}

	@Override
	public Optional<IPlayer> unRegisterPlayer(String name) {
		IPlayer player = players.get(name);
		if (player == null)
			return Optional.empty();

		players.remove(name);
		return Optional.of(player);
	}

	@Override
	public Collection<IPlayer> getPlayers() {
		return players.values();
	}

	@Override
	public Optional<IPlayer> getPlayer(String name) {
		IPlayer player = players.get(name);
		return player == null ? Optional.empty() : Optional.of(player);
	}

	@Override
	public void reset(boolean toBeginning) {
		if (toBeginning) {
			for (IPlayer player : players.values())
				player.reset();
		} else {
			for (IPlayer player : players.values()) {
				manager.getPacket().addLast(player.getHand().concat(player.getPill()));
				player.reset();
			}
		}
		manager.reset(toBeginning);
	}

	@Override
	public IPacket getPacket() {
		return manager.getPacket();
	}

	@Override
	public ICardContainer getStock() {
		return manager.getStock();
	}

	@Override
	public ICardContainer getPill() {
		return manager.getPill();
	}

	@Override
	public void giveToPlayerHand(String name, ICardContainer container) {
		throwIfNotPresent(name).getHand().concat(container);
	}

	@Override
	public void giveToPlayerPill(String name, ICardContainer container) {
		throwIfNotPresent(name).getPill().concat(container);
	}

	@Override
	public void giveToStock(ICardContainer from) {
		manager.getStock().concat(from);
	}

	@Override
	public void giveToPill(ICardContainer from) {
		manager.getPill().concat(from);
	}

	private Optional<IPlayer> checkName(String name, boolean throwIfPresent, String message) {
		Optional<IPlayer> optPlayer = getPlayer(name);
		if (optPlayer.isPresent() == throwIfPresent)
			throw new UnsupportedOperationException(message);
		return optPlayer;
	}

	private void throwIfPresent(String name) {
		checkName(name, true, "A player is already registered with this name");
	}

	private IPlayer throwIfNotPresent(String name) {
		return checkName(name, false, "No player registered").get();
	}
}
