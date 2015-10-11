package datastructure.crackingcode;

public class uniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abc";
		System.out.println(isUnique(test));
		test = "abc dgh";
		System.out.println(isUnique(test));
		test = "abcabc";
		System.out.println(isUnique(test));
		test = "%%";
		System.out.println(isUnique(test));
	}

	public static boolean isUnique(String text) {
		boolean[] check = new boolean[256];
		for (int i = 0; i < text.length(); i++) {
			int binaryForm = convert(text.charAt(i));
			if (check[binaryForm] == true)
				return false;
			else
				check[binaryForm] = true;
		}
		return true;
	}
	
	public static int convert(char character) {
		int converted = (int) character; 
		System.out.println(String.format("Character %s converted into binary %d (%s)", character, converted, Integer.toBinaryString(converted)));
		return converted;
	}
	
}
