/**
 * Defines a certain type of insect and prints a statement of the type of insect. 
 * 
 * @author Brittany Pruneau 
 *
 */

package nuisance;

public class Insect 
{
	private final String species;

	/*
	 * @param species Defines the type of insect. 
	 */
	public Insect(String species) 
	{
		this.species = species;
	}

	/*
	 * @return Gets the species of insect. 
	 */
	public final String getSpecies() 
	{
		return species;
	}
	
	/*
	 * Prints the specific type of species and its  name. 
	 */
	@Override
	public String toString() 
	{
		return super.getClass().getSimpleName() + ": " + species; 
	} 
	
}
