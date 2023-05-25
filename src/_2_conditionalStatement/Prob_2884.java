package _2_conditionalStatement;

import java.util.Scanner;

public class Prob_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		num2 -= 45;
		if(num2 < 0) {
			num2 += 60;
			num1 -= 1;
		}
		if(num1 < 0) {
			num1 += 24;
		}
		
		System.out.println(num1 + " " + num2);
		
	}

}
