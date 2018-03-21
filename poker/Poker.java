package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Poker {
	// ���廨ɫ
	private String stylor;
	// ������ֵ
	private String value;
	//������������ɫ����
	private int stylorFigure;
//	������������ֵ����
	private int valueFigure;

	public Poker() {

	}

	public Poker(String stylor, String value) {
		super();
		this.stylor = stylor;
		this.value = value;
	}
	
	public Poker(String stylor, String value, int stylorFigure, int valueFigure) {
		super();
		this.stylor = stylor;
		this.value = value;
		this.stylorFigure = stylorFigure;
		this.valueFigure = valueFigure;
	}

	public int getStylorFigure() {
		return stylorFigure;
	}

	public void setStylorFigure(int stylorFigure) {
		this.stylorFigure = stylorFigure;
	}

	public int getValueFigure() {
		return valueFigure;
	}

	public void setValueFigure(int valueFigure) {
		this.valueFigure = valueFigure;
	}

	public String getStylor() {
		return stylor;
	}

	public void setStylor(String stylor) {
		this.stylor = stylor;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	// �����˿���
	public List<Poker> createPoker() {
		String[] stylor = { "����", "����", "÷��", "����", "��" };
		String[] value = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "С", "��" };
		List<Poker> list = new ArrayList<Poker>();
		for (int i = 0; i < stylor.length - 1; i++) {
			for (int j = 0; j < value.length - 2; j++) {
				list.add(new Poker(stylor[i], value[j],i+1,j+1));
			}
		}
		for (int k = value.length - 2; k < value.length; k++) {
			list.add(new Poker(stylor[stylor.length - 1],value[k], stylor.length,k+1));
		}
		return list;
	}

	// ��дtoString����
	@Override
	public String toString() {
		String str = stylor + value;
		if("����".equals(str)){
			str = "����";
		}
		if("��С".equals(str)){
			str = "С��";
		}
		return str;
	}

	// ��ӡ�˿���
	public void printPoker(List<Poker> list) {
		System.out.println(list);
	}

	// ϴ��
	public List<Poker> shufflePoker(List<Poker> list) {
		Collections.shuffle(list);
		return list;
	}

	// ����ɫ���򣨺��ң����ң�÷�������飬����
	public List<Poker> sortByStylor(List<Poker> list) {
		Collections.sort(list, new PokerComparator());
		return list;
	}
	// ���鰴��С���򣨺��ң����ң�÷�������飬����
		public List<Poker> sortByGroup(List<Poker> list) {
			List<Poker> list1 = new ArrayList<Poker>();
			List<Poker> list2 = new ArrayList<Poker>();
			List<Poker> list3 = new ArrayList<Poker>();
			List<Poker> list4 = new ArrayList<Poker>();
			List<Poker> list5 = new ArrayList<Poker>();
			for(int i =0;i < list.size();i++){
				if("����".equals(list.get(i).stylor)){
					list1.add(list.get(i));
				}
				if("����".equals(list.get(i).stylor)){
					list2.add(list.get(i));
				}
				if("÷��".equals(list.get(i).stylor)){
					list3.add(list.get(i));
				}
				if("����".equals(list.get(i).stylor)){
					list4.add(list.get(i));
				}
				if("��".equals(list.get(i).stylor)){
					list5.add(list.get(i));
				}
			}
			Collections.sort(list1, new PokerComparator1());
			Collections.sort(list2, new PokerComparator1());
			Collections.sort(list3, new PokerComparator1());
			Collections.sort(list4, new PokerComparator1());
			Collections.sort(list5, new PokerComparator1());
			list.clear();
			list.addAll(list1);
			list.addAll(list2);
			list.addAll(list3);
			list.addAll(list4);
			list.addAll(list5);
			
			return list;
		}
	// ���մ�С����A 1 2 3 4 5 6 7 8 9 10 J Q K��
	public List<Poker> sortBySize(List<Poker> list) {
		Collections.sort(list, new PokerComparator1());
		/*
		 * List<Poker> list1 = new ArrayList<Poker>(); List<Poker> list2 = new
		 * ArrayList<Poker>(); for (int i = 0; i < list.size(); i++) {
		 * 
		 * list.get(i).value.replace("10", "A");
		 * 
		 * } list1.addAll(list.indexOf(new Poker("����", "2")), list);
		 * list.removeAll(list1);
		 * 
		 * for (int i = 0; i < list1.size(); i++) {
		 * 
		 * list1.get(i).value.replace("A", "10");
		 * list1.get(i).value.replace("K", "Q"); }
		 * list2.addAll(list1.indexOf(new Poker("����", "K")), list1);
		 * 
		 * list1.removeAll(list2); for (int i = 0; i < list2.size(); i++) {
		 * 
		 * list2.get(i).value.replace("Q", "K");
		 * 
		 * } list.addAll(list1); list.addAll(list2);
		 */
		return list;
	}

	// �����ȡһ����
	public Poker randomDrawCard(List<Poker> list) {
		Random r = new Random();
		// Poker []poker = (Poker[]) list.toArray();
		// Poker poker1 = poker[r.nextInt(poker.length)];
		Poker poker = list.get(r.nextInt(list.size()));
		return poker;

	}

}
