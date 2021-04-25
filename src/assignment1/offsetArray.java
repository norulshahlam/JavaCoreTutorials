package assignment1;

import java.util.Scanner;

public class offsetArray {

	String[] refTable = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
			"T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "(", ")", "*", "+",
			",", "-", ".", "/" };

	String plainText;
	String offsetChar;

	public String encoder(String plainText) {

		this.plainText = plainText;
		String encodedMsg;
		int shift = -1;
		String offsetChar = "";

		// convert string to string array (split)
		String[] encodedMsg1 = plainText.split("");
		// for(String s:encodedMsg1)
		// System.out.println(s);

		// create array using length of 1st array size
		String[] message2 = new String[plainText.length()];

		// INPUT for offset char
		offsetChar = inputOffsetChar(offsetChar);

		// find the shift val for offset char & check if it exists in ref table

		for (int i = 0; i < refTable.length; i++) {
			if (refTable[i].equals(offsetChar))
				shift = i;
		}
		if (shift == -1) {
			System.out.println("offset character doesn't exist in the reference table. pls re-enter:");
			System.exit(1);
		}

		// main logic starts here
		for (int k = 0; k < encodedMsg1.length; k++) {
			for (int j = 0; j < refTable.length; j++) {

				// if message letter exists in ref table
				if (encodedMsg1[k].equals(refTable[j])) {

					if (j < shift) {

						// shift+1 as table length is 44, but shift is 43
						message2[k] = refTable[(refTable.length) - shift];
						break;
					}

					else {
						message2[k] = refTable[j - shift];
						break;
					}
				}

				// if message letter doesn't exists in ref table
				else {

					// check if plaintext doesn't contain any spaces
					if (encodedMsg1[k].equals(" ")) {

						// if message contains any spaces, replaces with space
						message2[k] = " ";
					}

					// if message letter doesn't contain any spacing
					else {
						message2[k] = encodedMsg1[k];
					}
				}
			}
		}

		// convert the array back to string, printing as one word
		encodedMsg = String.join("", message2);

		// shows original message
		System.out.println("ori msg: " + plainText);

		// concat the offset letter tgt with the encoded message
		offsetChar = offsetChar.concat(encodedMsg);

		return offsetChar;
	}

	String inputOffsetChar(String offsetChar) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the offset char: ");
		offsetChar = input.nextLine();
		input.close();
		return offsetChar;

	}
}
