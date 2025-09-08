package beverages_decorator;

public class Mocha extends BeverageDecorator {

	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return beverage.cost() + 5;
	}
}


