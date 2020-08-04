package Snack;

public class Snack
{
 private static int maxId = 0;
 private int id;
 public String name;
 public int quantity;
 public double cost;
 public int vendingMachineId;

 
  public int getId()
  {
      return id;
  }
  public String getName()
	{
		return name;
  }
  public int quantity()
  {
    return quantity;
  }
public double getCost()
{
  return cost;
}
}