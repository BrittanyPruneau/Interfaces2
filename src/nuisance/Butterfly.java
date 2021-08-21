/**
 * Describes the butterfly insect by defining the species of butterfly, and the many colors it could have. 
 * 
 * @author Brittany Pruneau 
 *
 */
package nuisance;
import java.util.List;
import java.util.ArrayList;

public class Butterfly extends Insect
{
	private final List<String> colors;

	/*
	 * Constructor initializes the fields. 
	 * @param colors	Displays a list of colors the butterfly has on its wings. 	
	 * @param species	Species of butterfly.  
	 */
	public Butterfly(String species, List<String> colors) 
	{
		super(species);
       	List<String> copyOfColors = new ArrayList<>(colors);
		this.colors = copyOfColors;
	}
	
	/*
	 * Creates a copy of the object butterfly. 
	 */
	public Butterfly(Butterfly butterfly)
	{
		super(butterfly.getSpecies());
		this.colors = butterfly.getColors();
	}
	
	/**
	 * Returns the colors of a butterfly. 
	 */
	public final List<String> getColors() 
	{
		return colors;
	}
	
	/*
	 * Returns the species of butterfly and the colors it displays.
	 */
	@Override
	public String toString() 
	{
		return super.getSpecies() +" "+ this.colors; 
	}
	
}
