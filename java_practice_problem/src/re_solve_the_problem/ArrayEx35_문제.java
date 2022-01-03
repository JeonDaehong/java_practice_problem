package re_solve_the_problem;

import java.util.Scanner;

// 다시 공부 해보았음

/*
 * 
 * # 배열 컨트롤러[2단계] : 벡터(Vector)
 * 
 * 1. 추가
 * . 값을 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 값 삭제
 * 3. 삭제(값)
 * . 값을 입력받아 삭제
 * . 없는 값 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 값을 입력받아 삽입
 * 
 */



public class ArrayEx35_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = null; // 본 데이터 주소 변수 (처음에는 null이어야 편함)
		int elementCnt = 0; // 데이터 주소 안에 있는 인덱스의 갯수를 나타내주는 변수
		
		while (true) {
			
			// 현재 주소변수 내의 인덱스 데이터를 나타냄.
			for (int i=0; i<elementCnt; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(값)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 여기서 햇갈리지 않으려면, score = new int[elementCnt] 에서 elementCnt는 안에있는 인덱스의 갯수 그 자체를 의미함. (1개, 2개 ~ )
			// 나중에 data를 추가할 때 score[elementCnt] = data에서의 elementCnt는 0부터 시작하고, 그 인덱스 번호를 의미하기에 (score[0], score[1] ~ )
			// elementCnt + 1을 해주었다고 해서, elementCnt + 1에 data를 추가하는 것이 절대아님.
			// (쉽게 생각해서, score = new int[5]면, score[4]가 맨 끝에 새로 추가된 인덱스임.
			
			// [1]추가 버튼을 눌렀을 때.
			// 주소변수 추가 및 백업
			if (sel == 1) {
				if (elementCnt == 0) {                       // 인덱스 개수가 0개이면
					score = new int[elementCnt + 1];         // 본 주소변수(score)의 인덱스 개수를 +1 해줌.
				}
				else if (elementCnt > 0){                    // 인덱스 개수가 0개 보다 크면 (1개 이상이면)
					int[] temp = score;                      // temp[]라는 백업 주소변수에 현재 데이터를 저장해주고,
					score = new int[elementCnt + 1];         // 본 주소변수(score)의 인덱스 개수를 +1 해줌.
					
					// 백업 데이터를 다시 받아옴
					for (int i=0; i<elementCnt; i++) {       // for문을 활용해서
						score[i] = temp[i];                  // temp에 백업해둔 인덱스 데이터를 본 주소인 score에 넘겨줌. (elementCnt보다 하나 작은거까지가 백업데이터임.)
					}
					
					temp = null;                             // 그리고 백업 데이터는 모두 제거해줌.
				}
				// 새로운 추가 데이터를 입력받음
				System.out.print("[추가]성적 입력 : ");      // 기존 백업 데이터는 다 받았으니
				int data = scan.nextInt();                   // 이제 새로운 추가된 데이터를 입력 받음.
				
				score[elementCnt] = data;                    // 새로 입력받은 데이터를 새로 추가한 인덱스에 넣어줌.
				elementCnt++;                                // 그리고 elementCnt를 ++ 해줌으로서, 현재 인덱스의 갯수가 몇개인지를 저장함.
			}
			
			// [2]삭제:인덱스 버튼을 눌렀을 때
			else if (sel == 2) {
				System.out.print("[삭제]인덱스 입력 : ");                             // 여기서는 삭제할 인덱스를 먼저 입력해준다.
				int delIdx = scan.nextInt();
				
				if (elementCnt-1 < delIdx || delIdx < 0) {                            // 삭제할 인덱스가 현재 인덱스갯수와 맞지 않는 번호일 경우 예외처리
					System.out.println("[메세지]해당 위치는 삭제할 수 없습니다.");
					continue;                                                         // 컨틴뉴를 사용함으로 강제적으로 반복문의 시작지점으로 보내준다.
				}
				
				if (elementCnt == 1) {                                                // 인덱스가 1개 밖에 없는 경우
					score = null;                                                     // 그냥 score의 내용자체를 삭제해 주면 된다.
				}
				else if (elementCnt > 1) {                                            // 하지만 인덱스가 1개보다 많을 경우
					int[] temp = score;                                               // temp에 현재 인덱스를 모두 저장해둔다.
					score = new int[elementCnt - 1];                                  // 그리고 본 주소변수의 인덱스 갯수를 1개 줄인다.
					
					for (int i=0; i<delIdx; i++) {                                    // 내가 삭제할 인덱스 이전까지의 인덱스 데이터를 먼저 백업해주고,
						score[i] = temp[i];
					}
					for (int i=delIdx; i<elementCnt-1; i++) {                         // 다음은 내가 삭제할 인덱스 이후의 인덱스 데이터들을 백업해 준다.
						score[i] = temp[i + 1];
					}
					temp = null;                                                      // 그 후 백업본은 없애주고,
				}
				
				elementCnt--;                                                         // 현재 인덱스 갯수가 몇개인지 나타내기 위해 elementCnt --; 를 해준다.
			}
			
			// [3] 삭제:값을 입력했을 때
			else if (sel == 3) {
				System.out.print("[삭제]값 입력 : ");                                 // 역시나 삭제를 할 경우에는 값을 먼저 입력해준다.
				int delData = scan.nextInt();
				
				int delIdx = -1;                                                      // 내가 삭제할 데이터값이 속한 인덱스를 찾아내기 위한 스위치 효과를 줌.
				for (int i=0; i<elementCnt; i++) {                                    // 현재 있는 모든 인덱스를 검사함
					if (score[i] == delData) {                                        // 내가 삭제 입력한 값이 인덱스 내에 있을 경우
						delIdx = i;                                                   // 삭제할 데이터값이 몇번째 인덱스인지 대입해줌.
					}
				}
				
				if (delIdx == -1) {                                                   // 만약 내가 선택한 데이터값이 없는 데이터일 경우의 예외처리
					System.out.println("[메세지]입력하신 값은 존재하지 않습니다.");
					continue;
				}
				
				if (elementCnt == 1) {                                                // 인덱스가 하나밖에 없을 경우
					score = null;                                                     // 그냥 삭제하면 됨.
				}
				else if (elementCnt > 1) {                                            // 인덱스가 하나보다 크면,
					int[] temp = score;                                               // 역시 백업을 먼저 해주고
					score = new int[elementCnt - 1];                                  // 본 데이터의 인덱스 갯수를 줄여줌.
					
					int j = 0;                                                        // for문 ㄱㄱ
					for (int i=0; i<elementCnt; i++) {                                // 새로운 인덱스에 값을 넘겨주는데
						if (i != delIdx) {                                            // 아까 내가 지우고자 하는 값이 저장된 인덱스를 제외하고만 넘겨줌.
							score[j++] = temp[i];
						}
					}
					
					temp = null;                                                      // 백업 본 삭제
				}
				
				elementCnt--;				                                          // 인덱스 갯수를 나타내는 변수를 --; 해줌.
			}
			
			// [4] 삽입을 입력했을 때
			else if (sel == 4) {
				System.out.print("[삽입]인덱스 입력 : ");                             // 몇 번째 인덱스에 삽입을 할 것인가.
				int insertIdx = scan.nextInt();
				
				if (elementCnt < insertIdx || insertIdx < 0) {                        // 현재 인덱스의 갯수보다 크거나, 0보다 작을 시 예외처리
					System.out.println("[메세지]해당 위치는 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("[삽입]값 입력 : ");                                 // 삽입 값 입력
				int insertData = scan.nextInt();
				
				if (elementCnt == 0) {                                                // 인덱스 갯수가 0개이면, 인덱스 갯수 추가
					score = new int[elementCnt + 1];
				}
				else if (elementCnt > 0) {                                            // 인덱스 갯수가 0보다 많으면,
					int[] temp = score;                                               // 백업 후
					score = new int[elementCnt + 1];                                  // 인덱스 추가
					
					int j = 0;
					for (int i=0; i<elementCnt + 1; i++) {                            // 백업 해둔걸 다시 받을거임.
						if (i != insertIdx) {                                         // 내가 삽입하려고 한 인덱스 위치를 제외하고
							score[i] = temp[j++];                                     // 순서대로 백업본을 다시 받음
						}
					}
					temp = null;                                                      // 그리고 백업본 삭제
				}
				
				score[insertIdx] = insertData;                                        // 내가 원하는 인덱스 위치에 인덱스 값을 넣어줬음.
				elementCnt++;                                                         // 인덱스 갯수 추가
			}
			// [0]을 누를시 종료
			else if (sel == 0) {
				break; // 반복문 종료용 break;
			}
		}

		scan.close();

	}

}