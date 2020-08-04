package vendingMachineApp.src.Snack;

public class Snack
{
 private static int maxId = 0;
 private int id;
 public String name;
 public int quantity;
 public double cost;
 public int vendingMachineId;

 //the snack obj
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
public int getVendingMachineId()
{
  return vendingMachineId;
}
public int setId(int Id)
{
  return maxId=this.id;
}
public String setId(String name)
{
  return this.name=name;
}
public int setQuantitiy(int quantity)
{
  return this.quantity=quantity;
}

public int setVendingMachineId(int vendingMachineId)
{
  return this.vendingMachineId=vendingMachineId;
}
//add quantity

public void addQuantity(int quantity)
	{
		this.quantity = this.quantity + quantity;
  } 
//buy snack

public void buySnack(int quantity)
	{
		this.quantity = this.quantity - quantity;
	}

//total cost
public double getTotalCost()
{
  double totalCost = this.cost * quantity;
  return totalCost;
}



}
