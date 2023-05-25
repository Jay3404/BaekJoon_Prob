package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
        try {
        	
        	reader = new BufferedReader(new InputStreamReader(System.in));
        	
            int num1 = Integer.parseInt(reader.readLine());
            String[] num2 = reader.readLine().split("");
            
            String num3 = "";
            
            
            int[] intArr = new int[num2.length];
            
            for(int i = 0; i < num2.length; i++) {
            	intArr[i] = Integer.parseInt(num2[i]);
            	
            	num3 += num2[i];
            }
            
            for(int i = num2.length - 1; i >= 0; i--) {
            	System.out.println(num1 * intArr[i]);
            }
            
            System.out.println(Integer.parseInt(num3) * num1);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}

}
