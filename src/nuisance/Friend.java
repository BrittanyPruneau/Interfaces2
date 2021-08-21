/**
 * Defines the ways friends can interact; by chilling, playing at their different hobbies. 
 * 
 * @author Brittany Pruneau 
 *
 */
package nuisance;

public class Friend extends Person  
{
	private Hobby hobby;
	
	/**
	 * Constructor initializes the fields. 
	 * @param name	 Defines a persons name. 	
	 * @param age	 Defines the persons age.   
	 * @param hobby  Describes what a person likes to do for fun. 
	 */
	public Friend(String name, int age, Hobby hobby) 
	{
		super(name, age);
		this.hobby = hobby;
	}
	
	/*
	 * Prints a statement for how a specific person is chilling. 
	 */
	public String chill()
	{
		return super.getName() + " is chilling.?";
		
	}
	
	/*
	 * Describes how friends play together. 
	 */
	public String play(Friend[] friend)
	{
		if(friend.length<1)
		{
			return "playing " + hobby; 
		}
		int len = friend.length; 
		String str = "playing " + hobby + " with " + friend[0].getName(); 
		for(int i = 1; i<len; i++)
		{
			if(i == len-1)
			{
				str = str + " and " + friend[i].getName(); 
			}
			else
			{
				str = str + ", "  + friend[i].getName() + ",";
			}
		}
		return str; 	
	}
	
	/*
	 * Prints a statement about a specific person and their hobby.  
	 */
	@Override
	public String toString() 
	{
		return super.toString() + " " + hobby;
	}
}



