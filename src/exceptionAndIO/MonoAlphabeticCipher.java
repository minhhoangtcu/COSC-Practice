package exceptionAndIO;

import java.io.*;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class MonoAlphabeticCipher {
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	private static final String DEFAULT_KEYWORD = "FEATHR";
	
	public static void main(String[] args) {
		MonoAlphabeticCipher cipher = new MonoAlphabeticCipher();
		cipher.encodeFile();
	}
	
	public void encodeFile() {
		PrintWriter out = null;
		out = initializeWriter(out);
		Scanner in = null;
		in = initializeScanner(in);
		
		if (in != null && out != null) {
			while (in.hasNext()) {
				String originalLine = in.nextLine();
				String encryptedLine = encode(originalLine, DEFAULT_KEYWORD);
				System.out.println("original: \t" + originalLine);
				System.out.println("encrypted: \t" + encryptedLine);
				out.println(encryptedLine);
			}
			in.close();
			out.close();
		}
	}
	
	private PrintWriter initializeWriter(PrintWriter out) {
		try {
			out = new PrintWriter("MonoAlphabeticCipherOutput.txt");
		} catch (IOException e) {
			System.err.println("Out put file not found/initialized");
		}
		return out;
	}
	
	private Scanner initializeScanner(Scanner in) {
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				in = new Scanner(chooser.getSelectedFile());
			} catch (FileNotFoundException e) {
				System.err.println("File not found");
			}
		}
		return in;
	}
	
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
