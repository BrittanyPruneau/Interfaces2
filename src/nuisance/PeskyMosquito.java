/**
 * Describes how a pesky mosquito not only bites, but also buzzes and annoys. 
 * 
 * @author Brittany Pruneau 
 */
package nuisance;

public class PeskyMosquito extends Mosquito
{
	/*
	 * @param species Defines the specific type of pesky mosquito. 
	 */
	public PeskyMosquito(String species) 
	{
		super(species);
	}

	/*
	 * Describes how a pesky mosquito bites. 
	 */
	public String bite()
	{
		return "sucking blood"; 
	}
}
