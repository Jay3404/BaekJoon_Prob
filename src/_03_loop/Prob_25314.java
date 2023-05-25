package _03_loop;

import java.util.Scanner;

public class Prob_25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = "";
		int index = num / 4;
		
		for(int i = 0; i < index; i++) {
			str += "long ";
		}
		
		System.out.println(str + "int");
		
	}

}
