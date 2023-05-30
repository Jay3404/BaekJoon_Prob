package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_10818 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int index = Integer.parseInt(reader.readLine());
        int[] intArr = new int[index];
        String str;
        String[] strArr = new String[index];
        int min = 1000000;
        int max = -1000000;
        
        while((str=reader.readLine()) != null){
        	strArr = str.split(" ");
        }
        
        for(int i = 0; i < index; i++) {
    		intArr[i] = Integer.parseInt(strArr[i]);
    		if(intArr[i] < min) {
    			min = intArr[i];
    		}
    		if(intArr[i] > max)
    			max = intArr[i];
    	}
        
        writer.write(min + " " + max );
        
        writer.flush();
        writer.close();
        
        reader.close();
        
    }
}
