package exceptionAndIO;

public class MonoAlphabeticCipher {
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	/*
	 * Encode the provided input and the keyWord.
	 */
	public String encode(String input, String keyWord) {
		String output = "";
		keyWord = getKeyWord(keyWord);
		String cipherString = getEncryptString(keyWord);
		
		/*
		 * Go through the input by each character.
		 * At each character, check the index of that character in the alphabet.
		 * If the character is a space, then put the space in the output. Else, find the char at the above index in the cipher String.
		 */
		for (int i = 0; i < input.length(); i++) {
			String charAtIOfInput = String.valueOf(input.charAt(i));
			boolean isInputSpace = charAtIOfInput.equals(" ");
			if (isInputSpace)
				output += " ";
			else {
				int indexOfChatAtIOfInput = ALPHABET.indexOf(charAtIOfInput);
				String charAtIndex = String.valueOf(cipherString.charAt(indexOfChatAtIOfInput));
				output += charAtIndex;
			}
		}
		
		return output;
	}

	/*
	 * Take the key word input, generate a String to do the cipher
	 */
	public String getEncryptString(String keyWord) {
		keyWord = keyWord.toLowerCase();
		String output = keyWord;
		String reverseOfAlphabet = new StringBuilder(ALPHABET).reverse().toString();
		for (int i = 0; i < reverseOfAlphabet.length(); i++) {
			String charAtIndex = String.valueOf(reverseOfAlphabet.charAt(i));
			boolean isDuplicate = output.contains(charAtIndex);
			if (!isDuplicate)
				output += charAtIndex;
		}
		return output;
	}
	
	/*
	 * Take the key word input, and remove all duplicates characters in the input.
	 */
	public String getKeyWord(String text) {
		text = text.toLowerCase();
		String output;
		if (text.length() == 1)
			return text;
		else {
			String firstChar = String.valueOf(text.charAt(0));
			output = firstChar;
		}
		
		for (int i = 1; i < text.length(); i++) {
			String charAtIndex = String.valueOf(text.charAt(i));
			boolean isDuplicate = output.contains(charAtIndex);
			if (!isDuplicate)
				output += charAtIndex;
		}
		return output;
	}
}
