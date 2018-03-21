package poker;

import java.util.List;

public class PokerTest {
	public static void main(String[] args) {
		// 创建扑克牌对象
		Poker poker = new Poker();
		// 构建扑克牌
		List<Poker> list = poker.createPoker();
		// 打印扑克牌
		System.out.println("初始构建的扑克牌：");
		poker.printPoker(list);
		// 洗牌
		System.out.println("洗牌后：");
		List<Poker> list1 = poker.shufflePoker(list);
		poker.printPoker(list1);
		// 按花色排序
		System.out.println("按花色排序：");
		List<Poker> list2 = poker.sortByStylor(list1);
		poker.printPoker(list2);
		// 组内按大小排序
		System.out.println("组内按大小排序：");
		List<Poker> list4 = poker.sortByGroup(list2);
		poker.printPoker(list4);
		// 整副扑克牌按大小排序
		System.out.println("整副扑克牌按大小排序：");
		List<Poker> list3 = poker.sortBySize(list2);
		poker.printPoker(list3);
		// 获取随机抽取一张牌的名称
		System.out.print("随机抽取一张牌：");
		Poker poker1 = poker.randomDrawCard(list3);
		System.out.println(poker1);
	}

}
