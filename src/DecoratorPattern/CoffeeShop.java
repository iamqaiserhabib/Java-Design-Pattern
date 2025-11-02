package DecoratorPattern;

public class CoffeeShop {

	public static void main(String[] args) {
		
		Coffee myCoffee = new SimpleCoffee();
		System.out.println(myCoffee.getDescription()+" $"+myCoffee.getCost());
		
		myCoffee = new MilkDecorator(myCoffee);
		System.out.println(myCoffee.getDescription()+" $"+myCoffee.getCost());
		
		myCoffee = new SugerDecorator(myCoffee);
		System.out.println(myCoffee.getDescription()+" $"+myCoffee.getCost());
		
		myCoffee = new CreamDecorator(myCoffee);
		System.out.println(myCoffee.getDescription()+" $"+myCoffee.getCost());
		
		System.out.println("Final Cost: "+ myCoffee.getCost());

	}

}
