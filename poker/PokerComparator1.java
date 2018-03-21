package poker;

import java.util.Comparator;

public class PokerComparator1 implements Comparator<Poker> {

	@Override
	public int compare(Poker p1, Poker p2) {

		int value = p1.getValueFigure() - p2.getValueFigure();
	
		return value;
	}

}
