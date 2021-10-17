package calculator;

import java.util.ArrayList;
import java.util.List;

class StringCalculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else {

			// Check if String starts with // 
			//then take the string which is present after \n character
			if (input.startsWith("//")) {
				input = input.substring(input.indexOf("\n") + 1);
			}

			int addition = 0;
			String[] arr = input.split(",|\n|;"); 			// Split the string using comma(,) or new line(\n) or semicolon(;) and store it in Array

			List<String> negativeNumbers = new ArrayList<>();

			boolean containNegativeNumber = false; 			//Flag to check negative number

			for (int i = 0; i < arr.length; i++) {
				if (Integer.parseInt(arr[i]) < 0) {
					containNegativeNumber = true;
					negativeNumbers.add(arr[i]);
				}

				if (!containNegativeNumber) 				// Perform the addition when all numbers are Positive
					addition += Integer.parseInt(arr[i]); 	// Perform the addition for each number present in Array
			}
			
			//Check if number is negative then throw the exception
			if (containNegativeNumber) {
				throw new RuntimeException("negatives not allowed- " + negativeNumbers.toString());
			}
			return addition;
		}
	}
}