package re_solve_the_problem;

import java.util.Random;
import java.util.Scanner;

/*
 * # 카카오 택시
 * 
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		2) 속도설정 : 1~3까지만 가능
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 * 
 * 
 * 
 */

public class LoopEx16_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// 목적지(destination)
		int desX = 0;
		int desY = 0;
		
		// 현재 위치
		int x = 0;
		int y = 0;
		
		// 방향(direction)
		int dir = 0;
		String dirString = "고정";
		
		// 속도
		int speed = 0;
		
		// 요금
		int fee = 0;
		
		// 이동한 칸 수 (요금 결제할 때 사용할 변수)
		int way = 0;
		
		// 랜덤으로 목적지 설정
		desX = ran.nextInt(21) - 10;
		desY = ran.nextInt(21) - 10;
		
		boolean isRun = true;
		
		while (isRun) {
			
			// 방향에 따른 String
			if (dir == 0) {
				dirString = "고정";
			} else if (dir == 1) {
				dirString = "동";
			} else if (dir == 2) {
				dirString = "서";
			} else if (dir == 3) {
				dirString = "남";
			} else if (dir == 4) {
				dirString = "북";
			}
			
			System.out.println();
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지 : " + desX + "," + desY);
			System.out.println("현위치 : " + x + "," + y);
			System.out.println("방   향 : " + dir);
			System.out.println("속   도 : " + speed);
			System.out.println("============");
			
			System.out.println("1.방향설정");
			System.out.println("2.속도설정");
			System.out.println("3.이동하기");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.println();
				System.out.println("현재 방향은 : " + dirString + " 입니다.");
				System.out.println("전환하실 방향을 선택하여 주십시오.");
				System.out.println("동:1, 서:2, 남:3, 북:4, 메뉴 뒤로가기:다른 아무숫자");
				int dirSel = scan.nextInt();
				
				if (dirSel == 1) {
					System.out.println();
					System.out.println("방향을 전환하셨습니다.");
					System.out.println("현재 방향 : '동'");
					dir = 1;
				} else if (dirSel == 2) {
					System.out.println();
					System.out.println("방향을 전환하셨습니다.");
					System.out.println("현재 방향 : '서'");
					dir = 2;
				} else if (dirSel == 3) {
					System.out.println();
					System.out.println("방향을 전환하셨습니다.");
					System.out.println("현재 방향 : '남'");
					dir = 3;
				} else if (dirSel == 4) {
					System.out.println();
					System.out.println("방향을 전환하셨습니다.");
					System.out.println("현재 방향 : '북'");
					dir = 4;
				} else {
					System.out.println();
					System.out.println("뒤로갑니다.");
				}
			}
			else if (selectMenu == 2) {
				System.out.println();
				System.out.println("현재 속도는 : " + speed + " 입니다.");
				System.out.println("속도를 얼만큼 올리시겠습니까");
				System.out.println("ex) 속도를 2만큼 올리고 싶으면 2, 속도를 3만큼 내리고 싶으면 -3");
				int mySpeed = scan.nextInt();
				speed = speed + mySpeed;
				if (speed < 0) {
					System.out.println();
					System.out.println("속도는 0보다 낮을 수 없습니다. 속도를 다시 0으로 리셋 시킵니다.");
					speed = 0;
				} else {
					System.out.println();
					System.out.println("속도를 " + mySpeed + "만큼 올(내)리셨습니다.");
					System.out.println("현재 속도는 : " + speed + " 입니다.");
				}
			}
			else if (selectMenu == 3) {
				if (dir == 0) {
					System.out.println();
					System.out.println("현재 '고정' 상태입니다. 방향을 먼저 선택한 후에 이동 가능합니다.");
				}
				if (speed <= 0) {
					System.out.println();
					System.out.println("현재 속도는 : " + speed + " 입니다. 속도를 먼저 올려주십시오.");
				}
				if (dir > 0 && speed > 0) {
					System.out.println();
					System.out.println("현재 위치는 " + x + "," + y + " 입니다.");
					System.out.println("이동하겠습니다.");
					if (dir == 1) {
						x = x + speed;
						way = way + speed;
						System.out.println();
						System.out.println("이동 완료 : 현재 위치는 " + x + "," + y + " 입니다.");
					} else if (dir == 2) {
						x = x - speed;
						way = way + speed;
						System.out.println();
						System.out.println("이동 완료 : 현재 위치는 " + x + "," + y + " 입니다.");
					} else if (dir == 3) {
						y = y - speed;
						way = way + speed;
						System.out.println();
						System.out.println("이동 완료 : 현재 위치는 " + x + "," + y + " 입니다.");
					} else {
						y = y + speed;
						way = way + speed;
						System.out.println();
						System.out.println("이동 완료 : 현재 위치는 " + x + "," + y + " 입니다.");
					}
					
					fee = way / 2 * 50;
						if (way % 2 == 1) {
							fee += 50;
						}
						
					System.out.println("현재까지 나온 금액은 " + fee + "원 입니다.");
					
				}
				
			}
			
			if (desX == x && desY == y) {
				System.out.println("목적지에 도착하셨습니다.");
				System.out.println("결제하셔야 할 요금은 : " + fee + "원 입니다.");
				System.out.println("운행을 종료합니다.");
				isRun = false;
			}
			
		}

	}

}
