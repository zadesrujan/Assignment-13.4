package al;
//here we cretaed package as al which that organizes a set of related classes and interfaces.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrmlist {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		//creating an object
		//here we are adding the list of string values
		//add() method inserts the specified element E 
		//at the specified position in this list.
		list.add("listen");
		list.add("pot");
		list.add("part");
		list.add("opt");
		list.add("trap");
		list.add("silent");
		list.add("top");
		list.add("hello");
		list.add("hits");
		list.add("what");
		list.add("shit");
		System.out.println(findAnagrams(list));
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is message.
		//it finds the anagrams and prints that list
	}
//here we have taken a method of map which shows a value list of anagrams and a key of string 
//and input is list of words
	private static Map<String, List<String>>findAnagrams(List<String> words) {
// TODO Auto-generated method stub
		Map<String, List<String>> anagrams=null;
		//created a HashMap string as a key and list as string
		 
		if(words == null || words.size() ==0)
	//here it is check the list of words of its empty and return as null
		{
		return null;
	}
		anagrams=new HashMap<String, List<String>>();
	//HashMap is a implementation we are implementing the anagrams
	//If we take word and get into charArray and sorted them after that 
	//they comes to string and forms a string
			for(String word:words){//checks the words which are given
				char[] charArray=word.trim().toCharArray();
				//trims method eliminates leads and trailing spaces
				Arrays.sort(charArray);
				//arrays sorting which is char array
				String sortedWord=String.valueOf(charArray);
				//created an object.valueOf() is an argument char return a new string object
				if(anagrams.containsKey(sortedWord))
				{//containskey(Object key) method is used to check if this map contains a mapping for 
				//the specified key. Key means whose presence in this map is to be tested
					//here it checks the key and sort the word
					List<String> newList=anagrams.get(sortedWord);
					newList.add(word);
					anagrams.put(sortedWord,newList);//here we put new word of sorted list
					
				}
				else
				{//if the map doesn't contain the sorted word the we are creating a new one
					List<String> list1=new ArrayList<String>();
					list1.add(word);
					anagrams.put(sortedWord,list1);
				}
			}
			return anagrams;
			//return the anagrams
				}

	}


