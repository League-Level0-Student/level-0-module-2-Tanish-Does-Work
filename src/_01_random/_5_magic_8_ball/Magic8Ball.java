//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
	Random ran = new Random();
		
		int num = ran.nextInt(7);
		
//System.out.println(num);
JOptionPane.showInputDialog(null,"Ask a question for the 8 ball");
if (num == 0){
	System.out.println("yes");
}
if (num == 1){
	System.out.println("no");
}
if (num == 2){
	System.out.println("maybe you should ask google?");
}
if (num == 3){
	System.out.println("only if today is wednesday, or tuesday");
}
if (num == 4){
	System.out.println("Ask later, or right now");
}
if (num == 5){
	System.out.println("Thank you for calling Pizzahut, how may I help you");
}
if (num == 6){
	System.out.println("Sir, this is a macdonalds.");
}
	// 1. Make a main method that includes all the steps below
//done
	// 2. Make a variable that will hold a random number and put a random number
	//    into this variable using "new Random().nextInt(4)"
//done
	// 3. Print out this variable
//done
	// 4. Get the user to enter a question for the 8 ball
//done
	// 5. If the random number is 0
//done
	// -- tell the user "Yes"
//done
	// 6. If the random number is 1
//done
	// -- tell the user "No"
//done
	// 7. If the random number is 2
//done
	// -- tell the user "Maybe you should ask Google?"
//done
	// 8. If the random number is 3
//done
	// -- write your own answer
	}
}
