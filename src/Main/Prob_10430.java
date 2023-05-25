package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
        try {
        	
        	reader = new BufferedReader(new InputStreamReader(System.in));
        	
            String[] answer = reader.readLine().split(" ");

            int[] intArr = new int[3];
            
            for(int i = 0; i < 3; i++) {
            	intArr[i] = Integer.parseInt(answer[i]);
            }
            
            System.out.println((intArr[0]+intArr[1])%intArr[2] );
            System.out.println(((intArr[0]%intArr[2]) + (intArr[1]%intArr[2]))%intArr[2]);
            System.out.println((intArr[0] * intArr[1])%intArr[2]);
            System.out.println(((intArr[0] % intArr[2]) * (intArr[1] % intArr[2]))%intArr[2]);
            
            
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
