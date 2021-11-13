package re_solve_the_problem;

import java.util.Random;
import java.util.Scanner;

public class 강화 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		double percentage = 0;
		
		int all = 0;
		int win = 0;
		int lose = 0;
		
		String answer = "";
		
		String[] arr = new String[1000];
		
		while (true) {
			System.out.println("강화 확률을 적어주세요. (소숫점 1번째자리 까지만)");
			percentage = sc.nextDouble();
			if (percentage < 0 || percentage > 100) continue;
			else break;
		}
		
		for (int i=0; i<1000; i++) {
			arr[i] = "강화 실패...";
		}
		
		int temp = (int)(percentage*10);
		
		for (int i=0; i<temp; i++) {
			int idx = ran.nextInt(1000);
			if (!arr[idx].equals("강화 성공!")) {
				arr[idx] = "강화 성공!";
			} else {
				i--;
			}
		}
		
		while (true) {
			System.out.println("강화 확률은 " + percentage + "% 입니다.");
			System.out.println("강화 하시겠습니까?");
			System.out.println("강화:1 / 종료:2");
			int num = sc.nextInt();
			
			if (num < 1 || num > 2) continue;
			else if (num == 1) {
				int myNum = ran.nextInt(1000);
				answer = arr[myNum];
				all++;
				if (answer.equals("강화 성공!")) win++;
				if (answer.equals("강화 실패...")) lose++;
				System.out.println("\n" + answer + "\n");
			}
			else if (num == 2) {
				System.out.println("강화 : " + all + "번 중, " + win + "번 성공하셨고, " + lose + "번 실패하였습니다.");
				if (all > 15 && win == 0) {
					System.out.println("이 정도면 장기백 확정인데?ㅋㅋㅋㅋㅋㅋㅋㅋ");
				}
				break;
			}
		}
		
		sc.close();
		
	}
}
