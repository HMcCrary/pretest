package prob2;

public class Prob2 {

	public static void main(String[] args) {
		String str = "Steam engine in heavy rain";
		
		countVowelSequence(str);

	}
	public static void countVowelSequence(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
	
		}
	}

}
