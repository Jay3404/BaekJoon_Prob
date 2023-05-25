package _2_conditionalStatement;

import java.util.Scanner;

public class Prob_14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0)
			System.out.println("1");
		else if(num1 < 0 && num2 > 0)
			System.out.println("2");
		else if(num1 < 0 && num2 < 0)
			System.out.println("3");
		else
			System.out.println("4");
		
	}

}
