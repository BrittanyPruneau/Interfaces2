/**
 * Describes what a mosquito does; from buzzing around to the act of annoyance. 
 * 
 * @author Brittany Pruneau 
 *
 */
package nuisance;

public class Mosquito extends Insect implements Nuisance
{
	/*
	 * Defines the species of mosquito. 
	 */
	public Mosquito(String species) 
	{
		super(species);
	}

	/*
	 * Describes how a mosquito buzzes. 
	 */
	public String buzz()
	{
		return super.getSpecies() + " buzzing around"; 
	}
	
	/*
	 * Describes how a mosquito annoys. 
	 */
	@Override
	public String annoy() 
	{
		return "buzz buzz buzz";
	}
}
