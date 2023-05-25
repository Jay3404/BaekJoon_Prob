package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
        try {
        	
        	reader = new BufferedReader(new InputStreamReader(System.in));

        	int[] array = new int[2];
            String[] elements = reader.readLine().split(" ");
            
            for (int i = 0; i < 2; i++) {
                array[i] = Integer.parseInt(elements[i]);
            }
            
            System.out.println(array[0] + array[1]);
            System.out.println(array[0] - array[1]);
            System.out.println(array[0] * array[1]);
            System.out.println(array[0] / array[1]);
            System.out.println(array[0] % array[1]);
            
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
