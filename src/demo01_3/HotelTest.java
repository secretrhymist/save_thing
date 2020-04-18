package demo01_3;
/**
 * 
 * .代码冗余，希望老师提出修改意见
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class HotelTest{

	public static void main(String[] args) {
		System.out.println("输入想去的酒店： 1、2、3");
		System.out.println("1.格林豪泰（拙政园附近）\n2.格雅（工业园区店）\n3.格林豪泰（漕湖附近）");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();
		switch (choose) {
			case 1:
				Hotel1();
				break;
			case 2:
				Hotel2();
				break;
			case 3:
				Hotel3();
				break;
			default :
				break;
		}
		
		
	}

	
	private static void Hotel1() {
		Hotel hotel = new Hotel("格林豪泰苏州火车站南广场拙政园商务酒店");
		hotel.address = "江苏省苏州市姑苏区人民路2156号";
		Scanner sd =new Scanner(System.in);
		System.out.println("输入你想要的房间：");
		String ml = sd.nextLine();

		
		if(hotel.model_1.equals(ml)) {
			System.out.println("门市价为189元，会员价为161元");
			System.out.println("请问是否为会员： (N/Y)");
			String as = sd.nextLine();
			isVip(as);
			System.out.println("您的房卡号为：");
			hotel.CreateCardNum();
			
			
		}else if(hotel.model_2.equals(ml)) {
			System.out.println("门市价为169元，会员价为149元");
			System.out.println("请问是否为会员： (N/Y)");
			String as = sd.nextLine();
			isVip2(as);
			System.out.println("您的房卡号为：");
			hotel.CreateCardNum();
			
			
			
		}else if(hotel.model_3.equals(ml)){
			System.out.println("门市价为209元，会员价为190元");
			System.out.println("请问是否为会员： (N/Y)");
			String as = sd.nextLine();
			isVip3(as);
			System.out.println("您的房卡号为：");
			hotel.CreateCardNum();
			
			
		}
	}
	
	//这一步光标默认在门市前面 如何让光标默认移动到该在的位置
	public static void isVip(String as) {
		if(as.toUpperCase().equals("Y")) {
			System.out.println("会员价：161元");
			
		}else if(as.toUpperCase().equals("N")) {
			System.out.println("门市价：189元");
		}else {
			System.out.println("输入错误");
		}
	}
	
	public static void isVip2(String as) {
		if(as.toUpperCase().equals("Y")) {
			System.out.println("会员价：149元");
		}else if(as.toUpperCase().equals("N")) {
			System.out.println("门市价：169元");
		}else {
			System.out.println("输入错误");
		}		
	}
	
	public static void isVip3(String as) {
		if(as.toUpperCase().equals("Y")) {
			System.out.println("会员价：190元");
		}else if(as.toUpperCase().equals("N")) {
			System.out.println("门市价：209元");
		}else {
			System.out.println("输入错误");
		}
	}

	private static void Hotel2() {
		
	}
	
	
	private static void Hotel3() {
		
	}
	
}
