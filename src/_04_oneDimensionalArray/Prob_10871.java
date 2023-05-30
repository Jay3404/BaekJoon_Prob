package _04_oneDimensionalArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_10871 {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
        String str = reader.readLine();
        String[] strArr = str.split(" ");
        int index = Integer.parseInt(strArr[0]);
        int num = Integer.parseInt(strArr[1]);
        int[] intArr = new int[index];
        
        
        while((str=reader.readLine()) != null){
        	strArr = str.split(" ");
        }
        
        for(int i = 0; i < index; i++) {
    		intArr[i] = Integer.parseInt(strArr[i]);
    		if(intArr[i] < num) {
    			sb.append(intArr[i]).append(" ");
    		}
    	}
        
        writer.write(sb.toString());
        
        writer.flush();
        writer.close();
        
        reader.close();
        
    }
}
