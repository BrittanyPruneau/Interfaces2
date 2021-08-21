/**
 * Demonstrates how friends play as well as the different types of people and insects can act and be annoying. 
 * 
 * @author Brittany Pruneau 
 *
 */
package nuisance;
import java.util.List;
import java.util.ArrayList;

public class NuisanceApp 
{
	public static void main(String[] args) 
	{
		Friend juan = new Friend("Juan", 27, Hobby.MUSIC);
		Friend kate = new Friend("Kate", 27, Hobby.SPORTS);
		Friend alex = new Friend("Alex", 21, Hobby.MUSIC); 
		Friend newFriend = kate; 
		Friend[] friends = {juan, kate, alex};
		for(int i = 0; i<friends.length; i++)
		{
			System.out.println("Friend"+(i+1)+":"+friends[i]);
		}
		System.out.println();
		System.out.println("friend1 equals friend2: "+ friends[0].equals(friends[1]));  
		System.out.println("friend1 equals friend3: "+ friends[0].equals(friends[2])); 
		System.out.println("friend2 equals new friend: "+ friends[1].equals(newFriend)); 
		
		Telemarketer fritz = new Telemarketer("Fritz", 25);
		System.out.println("telemarketer: " + fritz);
		System.out.println();
		
		Mosquito aedes = new Mosquito("Aedes vexans");
		PeskyMosquito anopheles = new PeskyMosquito("Anopheles walkeri");
		
		List<String> colors = new ArrayList<>();
		colors.add("yellow"); 
		colors.add("black"); 
		colors.add("blue"); 

		Butterfly swallowtail = new Butterfly("Swallowtail", colors); 
		Butterfly newSwallowtail = new Butterfly(swallowtail); 
		
		Insect[] insects = {aedes, anopheles, swallowtail, newSwallowtail};
		System.out.println("4 Insects:");
		for(Insect i:insects)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println("3 Nuisances:");
		Nuisance[] nuisances = {fritz, aedes, anopheles}; 
		
		for(Nuisance n : nuisances)
		{
			if(n instanceof Telemarketer)
			{
				Telemarketer annoyance = (Telemarketer)n;
				System.out.println(annoyance.annoy());
				System.out.println();
			}
			
			if(n instanceof Mosquito && !(n instanceof PeskyMosquito))
			{
				Mosquito mosquito = (Mosquito)n; 
				System.out.println(mosquito.buzz());
				System.out.println(mosquito.annoy());
				System.out.println();
			}
			
			if(n instanceof PeskyMosquito)
			{
				PeskyMosquito pesky = (PeskyMosquito)n;
				System.out.println(pesky.buzz());
				System.out.println(pesky.bite());
				System.out.println(pesky.annoy());
				System.out.println();
			}
			
		}
	}
}
