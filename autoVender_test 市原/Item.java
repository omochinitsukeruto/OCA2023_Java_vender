package autoVender_test;

public class Item {

	private String itemId;  //商品ID
	private String itemName;  //商品名
	private int itemPrice;  //価格


	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}


	public Item(String itemId, String itemname, int itemprice) {
		this.itemId = itemId;
		this.itemName = itemname;
		this.itemPrice = itemprice;


	}


}
