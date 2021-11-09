package re_solve_the_problem;

import java.util.Scanner;

//2021-09-30 09:15 ~ 09:25

/*
 * (while문)
 * 
 * 1. key값(기준값)을 입력받아서 저장한다.
 * 2. 반복문을 사용하여 -1을 입력받을때까지 일련의 수를 계속 받는다. -1을 입력받을 경우 종료한다.
 * 3. 위 수 중 key 값이 몇 번째에 포함되어 있는가를 출력하는 프로그램을 작성하시오.
 * 4. 단, key가 여러개 포함되어 있을 경우 앞에 나타난 것의 위치를 출력하시오.
 * 5. key가 일련의 수 안에 없는 경우 "not found"를 출력하시오.
 * 
 * 예) 
 * key 값 입력 : 7
 * 
 * 입력 : 10
 * 입력 : 7
 * 입력 : 20
 * 입력 : 7
 * 입력 : 30
 * 입력 : 7
 * 입력 : 10
 * 입력 : -1
 * 
 * 결과 : key값 7가 첫번재 나타난 것은 2번째 이다.
 * 
 */



public class LoopEx27_테스트문제 {

	public static void main(String[] args) {
		
		int point = 0;
		int keySave = 0;
		int keySwitch = 0;
		
		Scanner scan = new Scanner(System.in);
        
		System.out.print("key값 입력 : ");
		int key = scan.nextInt();
		
		while (true) {
			System.out.println("아무숫자 입력 (but. -1은 프로그램 종료)");
			int num = scan.nextInt();
			System.out.println("입력 : " + num);
			point ++;
			
			if (num == key && keySwitch == 0) {
				keySave = point;
				keySwitch = 1;
			}
			
			if (num == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		System.out.println("key값인 " + key + "가 첫번째로 나타난 것은 " + keySave + "번째 입니다.");

		scan.close();
	}

}
