package fr.pederobien.cards.interfaces;

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
	 * @return The manager used to managed cards.
	 */
	ICardContainerManager getManager();

	/**
	 * Give cards to the hand of the {@link IPlayer} registered with the specified name. This method give the first n cards from the
	 * packet to the player.
	 * 
	 * @param name The name of the player.
	 * @param n    the number of {@link Card} to give him.
	 * 
	 * @throws UnsupportedOperationException If a no player is registered with the name.
	 */
	void giveFirst(String name, int n);

	/**
	 * Give cards to the hand of the {@link IPlayer} registered with the specified name. This method give the last n cards from the
	 * packet to the player.
	 * 
	 * @param name The name of the player.
	 * @param n    the number of {@link Card} to give him.
	 * 
	 * @throws UnsupportedOperationException If a no player is registered with the name.
	 */
	void giveLast(String name, int n);

	/**
	 * Give all cards present in the container to the hand of the player.
	 * 
	 * @param name      The name of the player.
	 * @param container The container that contains cards to give to the hand of the player.
	 * 
	 * @throws UnsupportedOperationException If a no player is registered with the name.
	 */
	void giveToHand(String name, ICardContainer container);

	/**
	 * Give all cards present in the container to the pill of the player.
	 * 
	 * @param name      The name of the player.
	 * @param container The container that contains cards to give to the pill of the player.
	 * 
	 * @throws UnsupportedOperationException If a no player is registered with the name.
	 */
	void giveToPill(String name, ICardContainer container);
}
