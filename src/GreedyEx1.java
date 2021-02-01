import java.util.Scanner;

public class GreedyEx1 {
    /*
    당신은 음식점의 계산을 도와주는 점원이다. 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정한다.
    손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러 줘야 할 동전의 최소 개수를 구하라. 단 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
     */

    public static void main(String[] args) {

        int n = 0;
        int [] change = {500, 100, 50, 10};
        int cnt = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("거슬러 줘야 하는 돈을 입력하세요");
        n = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i< change.length; i++){
            cnt += n/change[i];
            n %= change[i];
        }
        System.out.println(cnt);

    }
}
