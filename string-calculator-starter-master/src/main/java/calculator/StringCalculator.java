package calculator;

class StringCalculator {

	public int add(String input) {
		if (input.isEmpty()) {
			return 0;
		} else {
			
			//Check if String starts with // then take the string which is present after \n character
			if(input.startsWith("//")) {
				input = input.substring(input.indexOf("\n") + 1);		
			}
			
			int addition = 0;
			String[] arr = input.split(",|\n|;");  //Split the string using comma(,) or new line(\n) or semicolon(;) and store it in Array

			for (int i = 0; i < arr.length; i++) {
				addition += Integer.parseInt(arr[i]);	//Perform the addition for each number present in Array 
			}
			return addition;
		}
	}
}