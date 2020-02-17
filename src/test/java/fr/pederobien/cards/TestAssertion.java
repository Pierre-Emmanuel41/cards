package fr.pederobien.cards;

import java.util.List;

public class TestAssertion {

	protected <T> void assertDeepEquals(List<T> list1, List<T> list2) {
		if (list1.size() != list2.size())
			throw new AssertionError("Both list are different (not the same size)");
		for (int i = 0; i < list1.size(); i++)
			if (!list1.get(i).equals(list2.get(i)))
				throw new AssertionError("Elements at range " + i + " are different");
	}

	protected <T> void assertNotDeepEquals(List<T> list1, List<T> list2) {
		if (list1.size() != list2.size())
			return;

		boolean equals = true;
		for (int i = 0; i < list1.size(); i++)
			if (equals)
				equals &= list1.get(i).equals(list2.get(i));
			else
				break;
		if (equals)
			throw new AssertionError("Both list are deep equals");
	}
}
