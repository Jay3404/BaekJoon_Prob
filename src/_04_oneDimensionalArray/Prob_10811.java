package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class Prob_10811 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		sb1.append(reader.readLine());
		String[] strArr = sb1.toString().split(" ");
		sb1 = new StringBuilder();
		
		int index = Integer.parseInt(strArr[1]);
		sb1.append("12345");
		
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 0; i < index ; i++) {
			sb.append(reader.readLine());
			num1 = Integer.parseInt(sb.toString().split(" ")[0]);
			num2 = Integer.parseInt(sb.toString().split(" ")[1]);
			sb2.append(sb1.substring(num1 - 1, num2)).reverse();
			sb1.replace(num1 - 1, num2, sb2.toString());
			
			sb.setLength(0);
			sb2.setLength(0);
		}

		
		for(int i = sb1.length() - 1; i > 0; i--) {
			sb1.insert(i, " ");
		}
		

		writer.write(sb1.toString());
		
		writer.flush();
		writer.close();

		reader.close();
		
	}

}
