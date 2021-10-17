package calculator;

class StringCalculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else {
			int addition = 0;
			String[] arr = input.split(",|\n"); //Split the string using comma(,) or new line(\n) and store it in Array

			for (int i = 0; i < arr.length; i++) {
				addition += Integer.parseInt(arr[i]);	//Perform the addition for each number present in Array 
			}
			return addition;
		}
	}
}