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

	/**
	 * If toBeginning is true, then the packet, the stock and the pill are reset. Otherwise, the cards present in the stock and the
	 * pill are added to the end of the packet. The packet is neither reset neither shuffled.
	 * 
	 * @param toBeginning To know which behaviour to adopt.
	 */
	void reset(boolean toBeginning);
}
