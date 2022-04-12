package chapterTwo;

import java.util.Scanner;

public class Grade{


	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your score");

	int score = input.nextInt();
	
	if(score >= 90){
	System.out.println("You got an A");
	}
	if(score >= 80){
	if(score <90){
	System.out.println("You got a B");
	}
	}	
	if(score >= 70){
	if(score <80){
	System.out.println("You got a C");
	}
	}
	if(score >= 60){
	if(score <70){
	System.out.println("You got a D");
	}
	}
	if(score < 60){
	System.out.println("You got an F");
	}
	



	}

}