package vendingMachineApp.src.Snack;
public class Main 
{
	private static void workwithData()

	{
		//Customer
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		//Vending
		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		

		//Snack
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());


		//processing 
		
		//Jane
		jane.buySnacks(soda.getTotalCost(3));
		soda.buySnack(3);
		System.out.println("Jane cash on hand $" + jane.getCash());
		System.out.println("Quantity of soda is " + soda.getQuantity());

		jane.buySnacks(pretzel.getTotalCost(1));
		pretzel.buySnack(1);
		System.out.println("Jane cash on hand $" + jane.getCash());
		System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
      // Bob
		bob.buySnacks(soda.getTotalCost(2));
		soda.buySnack(2);
		System.out.println("Bob cash on hand $" + bob.getCash());
		System.out.println("Quantity of soda is " + soda.getQuantity());
       //Jane
		jane.addCash(10.00);
		System.out.println("Jane cash on hand $" + jane.getCash());

		jane.buySnacks(chocolate.getTotalCost(1));
		chocolate.buySnack(1);
		System.out.println("Jane cash on hand $" + jane.getCash());
		System.out.println("Quantity of chocolate is " + chocolate.getQuantity());

		pretzel.addQuantity(12);
		System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
//Bob
		bob.buySnacks(pretzel.getTotalCost(3));
		pretzel.buySnack(3);
		System.out.println("Bob cash on hand $" + bob.getCash());
		System.out.println("Quantity of pretzel is " + pretzel.getQuantity());
//Print to console
		System.out.println(chips);
		System.out.println(chocolate);
		System.out.println(pretzel);
		System.out.println(soda);
		System.out.println(water);


	}

	public static void main(String args[])
	{
		workwithData();
	}
}