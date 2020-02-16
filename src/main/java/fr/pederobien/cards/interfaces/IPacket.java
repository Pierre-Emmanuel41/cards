package fr.pederobien.cards.interfaces;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import fr.pederobien.cards.enums.Card;
import fr.pederobien.cards.enums.PacketSize;

public interface IPacket {

	/**
	 * Add the specified card at the beginning of this packet.
	 * 
	 * @param card The card to add at the beginning.
	 */
	void addFirst(Card card);

	/**
	 * Add the specified card at the end of this packet.
	 * 
	 * @param card The card to add at the end.
	 */
	void addLast(Card card);

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
	 * @return The corresponding cards.
	 * 
	 * @throws OperationNotSupportedException if the specified number is out of range (n < 0 || n > size).
	 */
	List<Card> removeFirst(int n);

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
	 * @return The corresponding cards.
	 * 
	 * @throws OperationNotSupportedException if the specified number is out of range (n < 0 || n > size).
	 */
	List<Card> removeLast(int n);

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
	 * @param packetSize The new size of the packet.
	 */
	void reset(PacketSize packetSize);
}
