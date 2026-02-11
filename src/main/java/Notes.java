
class Notes {
	public static void main(String[] args) {
		//variables

		//rule 1: variables all start with lower case LETTERS
		//Rule 2: Variables should be named after what they are storing
		//Rule 3: If a variable has more than one word, use camelCase - radiusOfCircle
			
		//declare variable - making a container

		int number;
		double fracNumber;

		//initialize/assign variable

		number = 8; //stores the number 8 in the variable number
		// = is the assignment symbol
		fracNumber = 3.5;
		// number = 5.5; //cannot store a double value in an integer variable

		//call variable - getting the value back

		System.out.println(number);
		//System.out.println(8);
		//replace the variable with its value.

		//addition

		System.out.println(number + fracNumber); //

		//subtraction

		//you can declare and assign to a variable on the same line
		double result = number - fracNumber;
		//double result = 8 - 3.5;
		//double result = 4.5;
		System.out.println(result);

		//multiplication - *

		System.out.println(number * 3);

		//division - /

		System.out.println(number / 2); //4
		System.out.println(number / 3); //2.6666666
		System.out.println(number / 3.0); //2.666666
		//when using only integers, you will get an integer solution
		//when combining integers and doubles, you get a double solution

		//mod - %
		//gives the remainder of a division question

		System.out.println(10 % 3);

		//updating a variable - adding/subtracting/multiplying/dividing etc.
		System.out.println(number);
		number = 3; //replaces the value of number with 3
		System.out.println(number);

		number = number * 2; //multiply the value of number by 2.
		//in assignment statements, the right side is solved first
		number = number + 1; //increase the value of number by 1
	}
}
