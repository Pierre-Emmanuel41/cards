package fr.pederobien.cards.interfaces;

import java.util.Collection;
import java.util.Optional;

import fr.pederobien.cards.enums.Card;

public interface IGame {

	/**
	 * Register a new {@link IPlayer} defined by its name for this {@link IGame}.
	 * 
	 * @param name The name of the player.
	 * @return The created player.
	 * 
	 * @throws UnsupportedOperationException If a player is registered with the same name.
	 */
	IPlayer registerPlayer(String name);

	/**
	 * Unregister a {@link IPlayer} from this {@link IGame}.
	 * 
	 * @param name The name of the player.
	 * @return An {@link Optional} containing the unregistered player if it exist, an empty optional if no player is registered with
	 *         the specified name.
	 */
	Optional<IPlayer> unRegisterPlayer(String name);

	/**
	 * @return A {@link Collection} containing all registered players.
	 */
	Collection<IPlayer> getPlayers();

	/**
	 * Get the player associated to the specified name.
	 * 
	 * @param name The name of the player.
	 * @returnAn {@link Optional} containing the player if it exist, an empty optional if no player is registered with the specified
	 *           name.
	 */
	Optional<IPlayer> getPlayer(String name);

	/**
	 * Reset this game. This method reset all registered {@link IPlayer}. This method is called during a game when a round is done.
	 */
	void reset(boolean toBegining);

	/**
	 * @return The packet of {@link Card} of the game.
	 */
	IPacket getPacket();

	/**
	 * @return The stock of {@link Card} of the game.
	 */
	ICardContainer getStock();

	/**
	 * @return The pill of {@link Card} of the game.
	 */
	ICardContainer getPill();

	/**
	 * Give all cards present in the container to the hand of the player.
	 * 
	 * @param name      The name of the player.
	 * @param container The container that contains cards to give to the hand of the player.
	 * 
	 * @throws UnsupportedOperationException If a no player is registered with the name.
	 */
	void giveToPlayerHand(String name, ICardContainer container);

	/**
	 * Give all cards present in the container to the pill of the player.
	 * 
	 * @param name      The name of the player.
	 * @param container The container that contains cards to give to the pill of the player.
	 * 
	 * @throws UnsupportedOperationException If a no player is registered with the name.
	 */
	void giveToPlayerPill(String name, ICardContainer container);

	/**
	 * Put all cards in the specified {@link ICardContainer} in the stock of this {@link IGame}.
	 * 
	 * @param from The container that contains the cards to give to the stock.
	 */
	void giveToStock(ICardContainer from);

	/**
	 * Put all cards in the specified {@link ICardContainer} in the pill of this {@link IGame}.
	 * 
	 * @param from The container that contains the cards to give to the pill.
	 */
	void giveToPill(ICardContainer from);
}
