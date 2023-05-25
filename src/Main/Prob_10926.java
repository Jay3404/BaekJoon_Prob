package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_10926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
        try {
        	
        	reader = new BufferedReader(new InputStreamReader(System.in));
        	
            String answer = reader.readLine();
            
            System.out.println(answer + "??!");
            
            
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
