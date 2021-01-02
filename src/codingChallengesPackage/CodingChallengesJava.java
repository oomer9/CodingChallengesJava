package codingChallengesPackage;
import java.util.HashMap;
import java.util.Map.Entry;

public class CodingChallengesJava {

	public static void main(String[] args) {
		//String test =  HighestOccurringChar(null);
		//String test =  RemoveSameLetterInDifferentCaps("adDbBeBe");
		//int gcd = GreatestCommonDivisor(54,24);
		int[] list = {4,21,5,6,1,9};
		int[] sortedList = bubbleSort(list);
		int[] expected = {1,4,5,6,9,21};
		//System.out.print();
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
	
	public static String RemoveSameLetterInDifferentCaps(String str) {
		String newString = str;
		try {
			Boolean isValid = true;
			while(isValid) {
				String tempString = ""; 	
				for(int i =0; i<newString.length();i++) {
					if(tempString.length()==0) {
						tempString = tempString.concat(Character.toString(newString.charAt(i)));
					}
					else if(Character.toLowerCase(newString.charAt(i)) == Character.toLowerCase(tempString.charAt(i-1)) && newString.charAt(i)!=tempString.charAt(i-1)) {
						//Helper method to delete matching letter and return new List 
						newString = RemoveMatch(newString,i);
						isValid = true;
						break;
					}
					else {
						tempString = tempString.concat(Character.toString(newString.charAt(i)));
						isValid = false;
					}
				}
			}
			
		}
		catch(Exception ex) {
			newString = ex.getMessage();
		}
		return newString;
	}
	private static String RemoveMatch(String str, int i) {
		StringBuilder sb = new StringBuilder(str);
		sb.delete(i-1, i+1);	
		return sb.toString();
	}
	public static int GreatestCommonDivisor(int num1, int num2) {
		int gcd = -1;
		try {
			int smallerNum = num1>num2?num2:num1;
			for(int i =1;i<=smallerNum;i++) {
				if(num1%i==0 && num2%i==0) {
					gcd = i;
				}
			}
			
		}
		catch(Exception ex) {
			throw ex;
		}
		return gcd;
	}
	
	public static int[] bubbleSort(int[] list){
		boolean isInvalid  = true;
		try {
			while(isInvalid) {
				isInvalid = false;
				for(int i = 0; i < list.length-1 ;i++) {
					if(list[i] > list[i+1]) {
						int temp = list[i];
						list[i] = list[i+1];
						list[i+1] = temp;
						isInvalid = true;
					}
				}
			}
		}
		catch(Exception ex) {
			throw ex;
		}
		return list;
		
	}
	
	

}
