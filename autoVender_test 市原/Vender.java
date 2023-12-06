package autoVender_test;

import java.util.Scanner;

public class Vender implements Base {

	Scanner scanner = new Scanner(System.in);

	Item[] items;
	int money;
	int itemPrice;
	String itemId;
	String itemName;




	public void setItems(Item[] items) {
		this.items = items;

	}

	@Override
	public void sale() {


		viewItems();


		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("-----------------------------");
			System.out.print("商品の「番号」を入力してください：");
			int a = scan.nextInt();

			if (items.length < a || a < 1) {
				break;
			}

			System.out.println("  " + items[a-1].getItemName() + "が選択されました：" + items[a-1].getItemPrice() + "円");

			// お金のやり取り
			int price =  items[a-1].getItemPrice();
			int b = 0;

			while (price > b) {
				System.out.print("お金を入れてください：");
				b += scan.nextInt();
				System.out.println("  " + b + "円が入金されました");

				if (price > b) {
					System.out.println("  " + (price - b) + "円不足です。追加入金してください");
				}
			}
			System.out.print("  お買い上げありがとうございます。");

			if (price < b) {
				b = b - price;
				System.out.println("おつりの" + b + "円をお取りください");
			} else {
				System.out.println("");
			}
		}
		System.out.println("-----------------------------");
		System.out.println("ありがとうございました。");
		scan.close();
	}

	@Override
	public void viewItems() {
		int c = 1;
		System.out.println("番号 商品名 商品価格");
		for (Item i : items) {
			System.out.println(c + "：   " + i.getItemName() + " " + i.getItemPrice() + "円");
			c += 1;
		}
	}
}//class


