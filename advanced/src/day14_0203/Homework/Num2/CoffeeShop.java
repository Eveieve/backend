package day14_0203.Homework.Num2; // package 명시하기
// 임포트 다해도 윗줄 안적으면 에러남.
import day14_0203.Homework.Num2.Beverage;
import day14_0203.Homework.Num2.Coffee;
import day14_0203.Homework.Num2.Tea;

public class CoffeeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop 영업개시****");
		Beverage[] beverages = new Beverage[5];
		beverages[0] = new Coffee("Cappuccino"); // 대입
		beverages[1] = new Coffee("CafeLatte");
		beverages[2] = new Tea("ginsengTea");
		beverages[3] = new Coffee("CafeLatte");
		beverages[4] = new Tea("red ginsengTea");
		getSalesInfo(beverages); //1	번째 음료는 ~

		System.out.println("총 판매 금액==>" + getTotalPrice(beverages));
		System.out.println("Coffee의 판매 개수=>"+Coffee.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+Tea.amount+"잔"); // ' amount ' is not public...
	}

	// static!!!
	public static void getSalesInfo(Beverage[] beverages) {
		for(int i =0; i<beverages.length; i++){
			if(beverages[i] instanceof Coffee || beverages[i] instanceof Tea)
			System.out.println(i + "번째 판매 음료는" + beverages[i].getName()+ "이며, 가격은 " + beverages[i].getPrice(beverages[i].getName()));
		}
		//System.out.println(beverages.getName());
	}
	
	public static int getTotalPrice(Beverage[] beverages) {
		int sum =0;

		int price =0;
		// coffee price * amount -> for all coffee
		// tea price * amount -> for all tea
		//if (beverages instanceof Coffee)
		for(int i =0; i< beverages.length; i++){ // coffee array 가 던져졌을때
			if(beverages[i] instanceof Coffee) {
				price = beverages[i].getPrice(beverages[i].getName());
				sum += price;
			}
			if(beverages[i] instanceof Tea) {
				price = beverages[i].getPrice(beverages[i].getName());
				sum += price;
			}
		}
		System.out.println(sum);
		return sum;
	}








	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
}
