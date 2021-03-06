import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GreedyQuiz2 {
    /*
     * 1. 숫자가 쓰인 카드들이 N * M 형태로 놓여 있다. 이때 N은 행의 개수를 의미하며, M은 열의 개수를 의미한다.
     * 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
     * 3. 그다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야한다.
     * 4. 따라서 처음 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야한다.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int N = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);

        Integer[] leastNum = new Integer[N];

        for(int i = 0 ; i < N ; i++){
            int[] strNum = new int[M];
            String str2 = scanner.nextLine();
            strNum = Arrays.stream(str2.split(" ",M)).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(strNum);
            leastNum[i] = strNum[0];
        }
        Arrays.sort(leastNum, Collections.reverseOrder());

        System.out.println(leastNum[0]);

    }
}
