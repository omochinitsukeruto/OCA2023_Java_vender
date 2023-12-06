package autoVender_test;

public class Main {

	public static void main(String[] args) {




		System.out.println("=== 自動販売機  ===");

		Item[] items = new Item[5];
		items[0] = new Item("ID01", "コーヒー", 120);
		items[1] = new Item("ID02", "ジュース", 110);
		items[2] = new Item("ID03", "コーラ", 110);
		items[3] = new Item("ID04", "紅茶", 120);
		items[4] = new Item("ID05", "ウォーター", 100);

		// 販売処理
		Vender vender = new Vender();
		vender.setItems(items);
		vender.sale();

	}

}
