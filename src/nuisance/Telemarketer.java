/**
 * Describes a telemarketer and what a telemarketer does.  
 * 
 * @author Brittany Pruneau 
 *
 */
package nuisance;

public class Telemarketer extends Person implements Nuisance
{
	/*
	 * @param name	Defines the telemarketers name. 
	 * @param age	Defines the age of the telemarketer.
	 */
	public Telemarketer(String name, int age) 
	{
		super(name, age);
	}
	
	/*
	 * Describes how a telemarketer gives a sales pitch. 
	 */
	public String giveSalesPitch()
	{
		return super.getName() + " pressures others to buy stuff"; 
	}

	/*
	 * Describes how a telemarketer can be annoying. 
	 */
	@Override
	public String annoy() 
	{
		return super.getName() + " annoys by giving a sales pitch"; 
	}
}
