package _2_conditionalStatement;

import java.util.Scanner;

public class Prob_1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println(">");
		else if(num2 > num1)
			System.out.println("<");
		else
			System.out.println("==");
	}

}
