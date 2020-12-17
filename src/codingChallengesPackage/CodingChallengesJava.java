package codingChallengesPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class CodingChallengesJava {

	public static void main(String[] args) {
		String test =  HighestOccurringChar(null);
		System.out.print(test);
	}

	// This method returns the most occurring char. 
	// if more than one then returns 1st in chronological order
	public static String HighestOccurringChar(String str) {
		String rtnVal = null;
		HashMap.Entry<String,Integer> maxEntry = null;
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		try {
			if(str == null || str.isEmpty() ) {
				rtnVal = null;
			}
			else {
				for(int i=0;i<str.length();i++) {
					if( map.containsKey(Character.toString(str.charAt(i)))) {
						map.put(Character.toString(str.charAt(i)).toLowerCase(), map.get(Character.toString(str.charAt(i))).intValue()+1);
					}
					else {
						map.put(Character.toString(str.charAt(i)).toLowerCase(),1);
					}
				}
				rtnVal = map.toString();
				for (Entry<String, Integer> entry : map.entrySet())
				{
				    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
				    {
				        maxEntry = entry;
				    }
				}
				rtnVal =  maxEntry.getKey();
			}
		}
		catch(Exception ex) {
			rtnVal = ex.getMessage();
		}
		
		return rtnVal;
	}

}
