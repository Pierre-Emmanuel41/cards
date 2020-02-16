package fr.pederobien.cards.interfaces;

public interface ICardContainerManager {

	/**
	 * @return The {@link IPacket} managed by this {@link ICardContainerManager}.
	 */
	IPacket getPacket();

	/**
	 * @return The stock managed by this {@link ICardContainerManager}.
	 */
	ICardContainer getStock();

	/**
	 * @return The pill managed by this {@link ICardContainerManager}.
	 */
	ICardContainer getPill();
}
