package Programs;

public class RepeatedChar {

	public static void main(String[] args) {
		
		String name = "Suman Unicity";
		char[] CharArray = name.toCharArray();
		
		for (int i = 0; i < name.length(); i++) {
			
			for (int j = i+1; j < name.length(); j++) {
					
				if(CharArray[i] == CharArray[j]) {
					System.out.println(CharArray[j]);
					break;
				}
			}	
		}
	}
}
