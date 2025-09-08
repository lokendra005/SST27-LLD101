package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		Beverage cappuccino = new Cappuccino();
		System.out.println("Plain Cappuccino cost: " + cappuccino.cost());
		
		Beverage cappuccinoWithMilk = new Milk(cappuccino);
		System.out.println("Cappuccino + Milk cost: " + cappuccinoWithMilk.cost());
		
		Beverage cappuccinoWithMilkSugar = new Sugar(cappuccinoWithMilk);
		System.out.println("Cappuccino + Milk + Sugar cost: " + cappuccinoWithMilkSugar.cost());
		
		Beverage latte = new Latte();
		System.out.println("Plain Latte cost: " + latte.cost());
		
		Beverage latteMocha = new Mocha(latte);
		System.out.println("Latte + Mocha cost: " + latteMocha.cost());
	}

}