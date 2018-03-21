package poker;

import java.util.Comparator;

public class PokerComparator implements Comparator<Poker> {
	@Override
	public int compare(Poker p1, Poker p2) {

		int value = p1.getStylorFigure() - p2.getStylorFigure();

		return value;
	}
}
