package fr.pederobien.cards.interfaces;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketProperty;

public interface IPacket {

	/**
	 * Add the specified card at the end of this packet.
	 * 
	 * @param card The card to add at the end.
	 */
	void addLast(Card card);

	/**
	 * Add the specified {@link List} of {@link Card} at the end of this packet.
	 * 
	 * @param from The container that contains the cards to add.
	 */
	void addLast(ICardContainer from);

	/**
	 * Remove the first {@link Card} of the {@link IPacket}.
	 * 
	 * @return The first card in the packet.
	 */
	Card removeFirst();

	/**
	 * Remove the first n {@link Card} from the packet.
	 * 
	 * @param n The number of cards to remove from the beginning of the packet
	 * @return An {@link ICardContainer} with the n cards.
	 * 
	 * @throws OperationNotSupportedException if the specified number is out of range (n < 0 || n > size).
	 */
	ICardContainer removeFirst(int n);

	/**
	 * Remove the last {@link Card} of the {@link IPacket}.
	 * 
	 * @return The last card in the packet.
	 */
	Card removeLast();

	/**
	 * Remove the last n {@link Card} from the packet.
	 * 
	 * @param n The number of cards to remove from the end of the packet
	 * @return An {@link ICardContainer} with the n cards.
	 * 
	 * @throws OperationNotSupportedException if the specified number is out of range (n < 0 || n > size).
	 */
	ICardContainer removeLast(int n);

	/**
	 * @return The actual size of the {@link IPacket}, it correspond to the number of cards remaining in the packet.
	 */
	int size();

	/**
	 * Reset the content of the packet. Like no cards has been removed.
	 */
	void reset();

	/**
	 * Change the size of the packet and call {@link #reset()}.
	 * 
	 * @param packetProperty The new size of the packet.
	 */
	void reset(PacketProperty packetProperty);

	/**
	 * Shuffle the {@link IPacket} randomly.
	 */
	void shuffle();

	/**
	 * @return The {@link List} of cards remaining in the packet. This list is unmodifiable.
	 */
	List<Card> getCards();
}
