package calculator;

class StringCalculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else {
			int addition = 0;
			String[] arr = input.split(","); //Split the string using Comma and store it in Array

			for (int i = 0; i < arr.length; i++) {
				addition += Integer.parseInt(arr[i]);	//Perform the addition for each number present in Array 
			}
			return addition;
		}
	}
}