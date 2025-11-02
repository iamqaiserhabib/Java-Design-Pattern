package DecoratorPattern;

public class SugerDecorator extends CoffeeDecorator {

	public SugerDecorator(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " , Suger";
	}

	@Override
	public double getCost() {
		return coffee.getCost() + 1.5;
	}

}
