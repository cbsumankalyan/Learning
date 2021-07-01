package Programs;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "Automation";
		String reverseName = "";
		
		for(int i = name.length()-1; i>=0; i--) {
			reverseName = reverseName + name.charAt(i);
		}
		
		System.out.println(reverseName);

	}

}
