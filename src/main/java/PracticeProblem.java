public class PracticeProblem{
	static boolean isPalindrome(String word){
		word = word.toLowerCase().replaceAll(" ", "");
		for(int i = 0; i < word.length(); ++i){
			if(word.charAt(i) != word.charAt(word.length() - i - 1)){
				return false;
			}
		}
		return true;
	}

	static int getAge(String[] names, int[] ages, String name){
		for(int i = 0; i < names.length; ++i){
			if(names[i].equals(name)){
				return ages[i];
			}
		}
		return -1;
	}

	static int countWords(String str, char letter){
		String[] arr = str.split(" ");
		String strletter = "" + letter;
		int total = 0;
		for(int i = 0; i < arr.length; ++i){
			if(arr[i].contains(strletter)){
				total++;
			}
		}
		return total;
	}

	public static void main(String args[]){}
}
