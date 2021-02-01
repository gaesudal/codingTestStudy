import java.util.Arrays;
import java.util.Scanner;

public class GreedyQuiz1 {
    /*
    '큰 수의 법칙' 은 일반적으로 통계 분야에서 다루어지는 내용이지만 동빈이는 본인만의 방식으로 다르게 사용하고 있다.
    동빈이는 큰 수의 법칙은 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 법칙이다.
    단, 배열의 특정한 인덱스(번호)에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없는 것이 이 법칙의 특징이다.
    예를 들어 순서대로 2,4,5,4,6으로 이루어진 배열이 있을 때 M이 8이고, K가 3이라고 가정하자.
    이 경우 특정한 인덱스의 수가 연속해서 세 번까지만 더해질 수 있으므로 큰 수의 법칙에 따른 결과는 6+6+6+5+6+6+6+5인 46이 된다.
    단, 서로 다른 인덱스에 해당하는 수가 같은 경우에도 서로 다른 것으로 간주한다.
    예를 들어 순사대로 3,4,3,4,3으로 이루어진 배열이 있을 때 M이 7이고, K가 2라고 가정하자.
    이 경우 두 번째 원소에 해당하는 4와 네 번째 원소에 해당하는 4를 번갈아 두 번씩 더하는 것이 가능하다.
    결과적으로 4+4+4+4+4+4+4인 28이 도출된다.
    배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의 큰 수의 법칙에 따른 결과를 출력하시오.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt(); //더하는 횟수
        int k = scanner.nextInt(); //최대값을 더하는 횟수

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[n-1];
        int second = arr[n-2];
        int sum = 0;

        int firstCount = (m/(k+1)) * k + m%(k+1);
        int secondCount = m - firstCount;

        sum += first * firstCount;
        sum += second * secondCount;

        System.out.println(sum);


    }
}
