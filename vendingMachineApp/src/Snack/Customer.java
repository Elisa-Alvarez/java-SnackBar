package vendingMachineApp.src.Snack;

public class Customer {
    public static int maxId=0;
    public int id;
    public String name;
    public double cash;

    public Customer(String name, double cash)
   {
      maxId++;
      id=maxId;
      this.name=name;
      this.cash=cash;
   }

   public int getId(int id)
   {
       return id;
   }
   public String getName(String name)
   {
       return name;
   }
   public double getCash(double cash)
   {
       return cash;
   }
   public String setName(String name)
   {
       return this.name=name;
   }

   // cash on hand
   public void addCash(double cash)
   {
       this.cash = this.cash + cash;
   }

   public void buySnacks(double cost)
	{
		this.cash = this.cash - cost;
	}

}