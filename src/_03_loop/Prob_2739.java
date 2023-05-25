package _03_loop;

import java.util.Scanner;

public class Prob_2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}
