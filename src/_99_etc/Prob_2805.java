package _99_etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Prob_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = reader.readLine();
        String[] strArr = str.split(" ");

        //나무 배열 수를 초기화
        int index = Integer.parseInt(strArr[0]);
        //필요한 나무 높이 초기화
        int num = Integer.parseInt(strArr[1]);

        //나무 배열을 담아줄 배열 선언
        int[] intArr = new int[index];
        int max = Integer.MIN_VALUE;

        //EOF를 이용한 입력받기
        while ((str = reader.readLine()) != null) {
            strArr = str.split(" ");
        }

        //나무의 배열을 int배열에 담아줌
        for (int i = 0; i < index; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
            
            //나무의 최대 높이를 계산
            if (intArr[i] > max)
                max = intArr[i];
        }

        int left = 0;
        int right = max;
        int answer = 0;

        //이분탐색
        while (left <= right) {
            int mid = (left + right) / 2;
            long total = 0;

            for (int i = 0; i < index; i++) {
            	//나무의 중간높이를 이용해서 얻게되는 나무 높이를 확인
                if (intArr[i] > mid)
                	//나무의 중간높이보다 커야지 나무를 얻을 수 있기에 그 때마다 얻게되는 나무를 구해줌
                    total += intArr[i] - mid;
            }

            //만약 num보다 total이 크면 나무를 많이 자른것이기에 left값을 올려주며 탐색
            if (total >= num) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        writer.write(Integer.toString(answer));

        writer.flush();
        writer.close();

        reader.close();
    }
}
