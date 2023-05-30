package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_2562 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
        
    	String str;
    	int max = 0;
    	int answer = 0;
    	
        while((str=reader.readLine()) != null){
        	sb.append(str).append(" ");
        }
        
        String[] strArr = sb.toString().split(" ");
        int[] intArr = new int[9];
        
        for(int i = 0; i < 9; i++) {
    		intArr[i] = Integer.parseInt(strArr[i]);
    		if(intArr[i] > max) {
    			max = intArr[i];
    			answer = i + 1;
    		}
    	}
        
        writer.write(Integer.toString(max));
        writer.write("\n");
        writer.write(Integer.toString(answer));
        
        writer.flush();
        writer.close();
        
        reader.close();
        
    }
}
