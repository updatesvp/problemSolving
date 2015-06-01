package arrays;
import java.util.*;
public class StringUnique {

	public static void main(String[] args) 
	{
		// Input String
		String s= "Pranesh Vyas";
		
		//Calling the function
	  boolean flag= checkUniqueness(s);
		System.out.println(flag);

	}
	static boolean checkUniqueness(String s)
	{
		//Creating hashset- Using hashset because they do not allow duplicates
		HashSet<Character> hset=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			//Parsing the string for every character
			char ch=s.charAt(i);
			//Adding every element into the hashset
			hset.add(ch);
		}
		
			//Checks the size of the hset and given string
		//If they are equal returns true
		if(hset.size()==s.length())
			return true;
		else
			return false;
	}

}
