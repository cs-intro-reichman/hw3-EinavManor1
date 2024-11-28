



/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("silent") + " are anagrams.");
		
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		boolean isAnagram = false;	
		String s1 = (str1);
		String s2 = (str2);
		int i = 0;
		int j = 0;
		while(i < s1.length()){
			char letter1 =s1.charAt(i);
			int ascii1 = (int)letter1;
				while(i < s1.length()){
					char letter2 =s2.charAt(i);
					int ascii2 = (int)letter2;
					if(ascii2 == ascii1){
						j++;
					}else{
						return isAnagram;
					}
				}
			i++;
		isAnagram = true;
	}
	return isAnagram;
}
	   
	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		int lengthString = str.length();
		int i = 0;
		String bitArray = "";
		
		while (i < lengthString){
			char letter = str.charAt(i);
			int ascii = (int)letter;
			if(ascii <= 122 && ascii >= 65){
				bitArray = bitArray + letter;
				i++;
			}else{
				i++;
			}		
		}
		
		return bitArray;
	} 
	   
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str) {
		String cleanString = preProcess(str);
		int lengthCS = cleanString.length();
		String newAnagram = "";
		int i = 0;
		int j = 0;
		while(i < lengthCS){
		char letter =cleanString.charAt(i);
		int ascii = (int)letter;
			while(j < newAnagram.length()){
				char letterInString = cleanString.charAt(i);
				int ascii1 = (int)letterInString;
				if(ascii == ascii1){
					newAnagram = newAnagram + " " +letter;
					j = j+2;
				}else{
					newAnagram = newAnagram +letter;
					j++;
				}
			}
		i++;
		}
		return newAnagram;
	}
}
