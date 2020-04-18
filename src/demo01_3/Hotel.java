package demo01_3;

public class Hotel {
	String name;
	String address;
	String model;
	
	String model_1 = "大床房";
	String model_2 = "标间";
	String model_3 = "豪华双床房";
	String model_4 = "高级大床房";
	
	int cardNum;
	
	int commonPrice;
	int vipPrice;
	int coupon;
	
	public Hotel(String name) {
		this.name = name;
	
	}
	
	public static void CreateCardNum() {
		int cardNum = (int)(Math.random() * 1000000000);
		System.out.println(cardNum);
	}

	
}
