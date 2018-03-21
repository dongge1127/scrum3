package poker;

import java.util.List;

public class PokerTest {
	public static void main(String[] args) {
		// �����˿��ƶ���
		Poker poker = new Poker();
		// �����˿���
		List<Poker> list = poker.createPoker();
		// ��ӡ�˿���
		System.out.println("��ʼ�������˿��ƣ�");
		poker.printPoker(list);
		// ϴ��
		System.out.println("ϴ�ƺ�");
		List<Poker> list1 = poker.shufflePoker(list);
		poker.printPoker(list1);
		// ����ɫ����
		System.out.println("����ɫ����");
		List<Poker> list2 = poker.sortByStylor(list1);
		poker.printPoker(list2);
		// ���ڰ���С����
		System.out.println("���ڰ���С����");
		List<Poker> list4 = poker.sortByGroup(list2);
		poker.printPoker(list4);
		// �����˿��ư���С����
		System.out.println("�����˿��ư���С����");
		List<Poker> list3 = poker.sortBySize(list2);
		poker.printPoker(list3);
		// ��ȡ�����ȡһ���Ƶ�����
		System.out.print("�����ȡһ���ƣ�");
		Poker poker1 = poker.randomDrawCard(list3);
		System.out.println(poker1);
	}

}
