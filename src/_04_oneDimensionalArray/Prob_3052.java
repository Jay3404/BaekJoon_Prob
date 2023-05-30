package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeSet;

public class Prob_3052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new TreeSet<>();

		int num;
		int index = 0;
		
		for(int i = 0; i < 10; i++) {
			num = Integer.parseInt(reader.readLine());
			set.add(num % 42);
			
		}

		for(int i : set) {
			index++;
		}
		
		writer.write(Integer.toString(index));
		
		writer.flush();
		writer.close();

		reader.close();
		
	}

}
