package com.my.firstSpringBootService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class FirstSpringBootServiceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(FirstSpringBootServiceApplication.class, args);

		System.out.println("Hello World");

		System.out.println("-----IF STATMENTS------");
		String name1 = "Bucky";
		String name2 = "Rocky";
		if (name1 == name2) {
			System.out.println("names are the same");
		} else {
			System.out.println("names are NOT the same");
		}

		System.out.println("-----PRINT NUMBERS------");
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("numbers are: " + numbers);


		System.out.println("-----ADDNUMBERS------");
		Integer result1 = addNumbers(5, 10);
		System.out.println("Numbers total: " + result1);

		System.out.println("---------------CAR OBJECT---------------");

		Car myCar = new Car("Civic", "Honda", 2013, "Silver", 4); //using @AllArgsConstructor
		System.out.println(myCar);

		Car myCar2 = new Car(); //using @NoArgsConstructor
		System.out.println("myCar2: " + myCar2);

		String myCarMake = myCar.getMake();
		System.out.println("myCar Make: " + myCarMake);
		myCar.setColor("Hot Red");
		System.out.println("myCar color: " + myCar.getColor());



		getStringReverse();

	}

	public static Integer addNumbers(Integer firstNumber, Integer secondNumber) {
		Integer result = firstNumber + secondNumber;
		return result;
	}

	private static void getStringReverse(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a word: ");
		String userInputReverseWord = scanner.nextLine();

		for(Integer length = userInputReverseWord.length(); length>0; --length) {
			//iterating through the string and for each iteration and for each iteration, as long as the length
			//is larger than 0, then the value is decremented by 1 aka ges back one in the length
			String reverseResult = String.valueOf((userInputReverseWord.charAt(length-1)));
			System.out.println("Your word in reverse is: " + reverseResult.toString());
			//TODO: make this a string
		}
	}


}
