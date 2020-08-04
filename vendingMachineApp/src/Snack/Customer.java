package vendingMachineApp.src.Snack;

public class Customer {
    
    private static int maxId = 0;
    public int id;
    public String name;
    public double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

    public double getCash()
	{
		return cash;
    }
    

    public void setName(String name)
	{
		this.name = name;
    }

    // add money
	public void addCash(double cash)
	{
		this.cash = this.cash + cash;
	}
	// spend money
	public void buySnacks(double cost)
	{
		this.cash = this.cash - cost;
	}


}