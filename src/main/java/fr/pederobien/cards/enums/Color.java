package fr.pederobien.cards.enums;

public enum Color {

	CLUBS("clubs"), DIAMONDS("diamonds"), HEARTS("hearts"), SPADES("spades"), TRUMP("trump"), NONE("none");

	private String name;

	private Color(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
