package fr.pederobien.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketSize;
import fr.pederobien.cards.interfaces.ICardContainer;
import fr.pederobien.cards.interfaces.ICardContainerManager;
import fr.pederobien.cards.interfaces.IGame;
import fr.pederobien.cards.interfaces.IPlayer;

public class Game implements IGame {
	private Map<String, IPlayer> players;
	private ICardContainerManager manager;

	public Game(PacketSize packetSize) {
		players = new HashMap<String, IPlayer>();
		manager = new CardContainerManager(packetSize);
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
			List<Card> cards = new ArrayList<Card>();
			for (IPlayer player : players.values()) {
				cards.addAll(player.getHand().getCards());
				player.reset();
			}
			manager.getPacket().addLast(cards);
		}
		manager.reset(toBeginning);
	}

	@Override
	public ICardContainerManager getManager() {
		return manager;
	}

	@Override
	public void giveFirst(String name, int n) {
		throwIfNotPresent(name).getHand().addAll(manager.getPacket().removeFirst(n));
	}

	@Override
	public void giveLast(String name, int n) {
		throwIfNotPresent(name).getHand().addAll(manager.getPacket().removeLast(n));
	}

	@Override
	public void giveToHand(String name, ICardContainer container) {
		throwIfNotPresent(name).getHand().addAll(container.getCards());
	}

	@Override
	public void giveToPill(String name, ICardContainer container) {
		throwIfNotPresent(name).getPill().addAll(container.getCards());
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
