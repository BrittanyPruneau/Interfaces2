/**
 * Holds information about a person, such as their name and age. 
 * 
 * @author Brittany Pruneau 
 */
package nuisance;

public class Person 
{
	private String name; 
	private int age;
	
	/**
	 * Constructor initializes the fields. 
	 * @param name	Defines the name of a person.
	 * @param age	Defines the age of a person.
	 */
	public Person(String name, int age) 
	{
		this.name = name;
		if(age<1 || age>150)
		{
			throw new IllegalArgumentException("Age needs to be from the range [1, 150]."); 
		}
		else
		{
			this.age = age;
		}
	}
	
	/**
	 * Returns the name of a person.
	 * @returns name  
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Returns the age of a person.
	 * @returns age 
	 */
	public int getAge() 
	{
		return age;
	}
	
	/*
	 * Prints the name age of person. 
	 */
	@Override
	public String toString() 
	{
		return name+ "(" + age + ")"; 
	}
	/*
	 * Only returns true when the object and its fields are the same values. 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/*
	 * Only returns true when the object and its fields are the same values. 
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
