package re_solve_the_problem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//StudentEx 클래스
class StudentEx{
	
	String id = "";	// ID
	String pw = "";	// PW
	
	void printData() {	// 출력 메서드
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);	
		
	}
	
}


// Controller 클래스
class Controller {
	
	// StudentEX에 있는 것에 대한 배열 만들기
	StudentEx[] list = null;
	
	// 학생 수
	int stdCnt = 0;
	
	// 학생 수 늘리는 메서드
	void addStudentEx(StudentEx st) {
		
		if (stdCnt == 0) {
			list = new StudentEx[1];
		}
		else if (stdCnt > 0) {
			StudentEx[] temp = list;
			list = new StudentEx[stdCnt + 1];
			for (int i = 0; i < stdCnt; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[stdCnt] = st;
		stdCnt++;
		
	}
	
	
	// 학생 수를 줄이는 메서드,
	StudentEx removeStudentEx (int index) {
		
		StudentEx del_st = list[index];		// check는 이미 i로써 인덱스 값을 반환 받았음.
		if (stdCnt == 1) {
			list = null;
		}
		else if (stdCnt > 1) {
			StudentEx [] temp = list;
			list = new StudentEx[stdCnt -1];
			for (int i = 0; i < index; i++) {
				list[i] = temp[i];
			}
			for (int i = index; i < stdCnt -1; i++) {
				list[i] = temp[i + 1];
			}
			temp = null;
		}
		stdCnt--;
		
		return del_st;  // 굳이 return을 안해주고 데이터만 삭제해주어도 되는데
						// 타 언어의 pop()메서드와 같이 삭제하는 데이터를 return하는 방식처럼 구현해본 예시
		
	}
	
	
	// 중복되는 아이디가 있는지 검사 (return으로 반환)
	int checkId(StudentEx st) {
		
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if (list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
		
	}
	
	
	// 현재 학생 데이터를 쭉 프린트하듯 나열해줌.
	void printStudentEx() {
		
		for (int i = 0; i < stdCnt ;i++) {
			list[i].printData();	// 위에 있는 printData로 sout을 받아옴.
		}
		
	}	
	
	
	
	// 파일을 내보낼 때(저장할 때)
	String outData() {
		
		String data = "";
		if (stdCnt == 0){
			return data;
		}
		data += stdCnt;
		data += "\n";
		for (int i = 0; i < stdCnt; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if (stdCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	
	// 학생 이름 정렬
	void sortData() {
		
		for (int i = 0; i < stdCnt; i++) {
			for (int n = 0; n < stdCnt ; n++) {
				if (list[i].id.compareTo(list[n].id) > 0) {
					StudentEx temp = list[i];
					list[i] = list[n];
					list[n] = temp;
				}
			}
		}
		
	}
	
	
	// 데이터 로드 (temp는 반드시 배열로 만들기)
	void loadStudentEx (StudentEx[] temp , int count) {
		
		this.stdCnt = count;	// 학생 수
		this.list = temp;		// 학생 리스트
		
	}
	
}


public class ClassArrayEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();
		
		
		// 프로그램 시작
		while (true) {
			
			// 메뉴
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			// 1번 [가입]
			if (sel == 1) {
				
				// StudentEx 클래스에있는 id와 pw를 활용
				StudentEx temp = new StudentEx();							// temp에 StudentEx 클래스 함수를 대입
				System.out.println("[가입] id 를 입력하세요 >>> ");
				temp.id = scan.next();										// ID 입력
				int check = controller.checkId(temp);						// 해당 ID가 (이미)있는지 없는지 (중복)검사
				
				if (check == -1) {											// return 된 값이 -1이면, 가입 가능 절차
					System.out.println("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next();									// PW 입력
					controller.addStudentEx(temp);							// 학생 데이터를 contriller.addStudentEx 메서드에 저장
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}
				else {														// return 된 값이 다른 값이면, 중복ID가 있으니 안됨.
					System.out.println("중복아이디 입니다.");
				}	
				
			}
			// 2번 [탈퇴]
			else if (sel == 2) {
				
				controller.printStudentEx();								// 학생 데이터를 쭉 뽑아줌.
				StudentEx temp = new StudentEx();							// temp에 StudentEx 클래스 함수를 대입
				System.out.println("[탈퇴] id 를 입력하세요 >>> ");
				temp.id = scan.next();	
				int check = controller.checkId(temp);						// 해당 ID가 있는지 없는지 검사
				
				if (check == -1) {											// -1이 나오면, 없는것임
					System.out.println("없는 아이디입니다.");
				}
				else {														// 다른 숫자가 나오면, return값으로 check를 받음.
					StudentEx del_st = controller.removeStudentEx(check);	// 삭제 완료
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
				
			}
			// 3번 [정렬]
			else if (sel == 3) {
				
				// 정렬, 출력 메서드 실행
				controller.sortData();
				controller.printStudentEx();
				
			}
			// 4번 [출력]
			else if (sel == 4) {
				
				// 출력 메서드 실행
				controller.printStudentEx();
				
			}
			// 5번 [저장]
			else if (sel == 5) {
				
                if (controller.stdCnt == 0) continue;	// 학생수가 0명이면, 저장 x
				
                FileWriter fw = null;					// 파일 만들기
                
                try {
                	
					fw = new FileWriter("StudentEx_manager.txt");		// 파일명 만들기
					String data = controller.outData();					// 아웃데이터를 데이터에 불러오기
					if (!data.equals("")) {								// 만약 파일이 ""로 비어있지 않다면
						fw.write(data);									// 데이터를 저장한다
						System.out.println(data);
					}
					
				} catch (Exception e) {
					e.printStackTrace();								// 오류 검사
				}
                finally {
                	try {fw.close();} catch (IOException e) {e.printStackTrace();}		// 꼭 close(); 해줄 것
                }
                
			}
			// 6번 [불러오기]
			else if (sel == 6) {
				
				FileReader fr = null;			// 파일리더
				BufferedReader br = null;		// 버퍼드리더
				
				try {
					
					File file = new File("StudentEx_manager.txt");		// 파일명 불러오기
					
					if (file.exists()) {								// file.exists 해주기
						
						fr = new FileReader(file);						// file을 fr로 읽어온다
						br = new BufferedReader(fr);					// fr을 br로 읽어온다
						
						String line = br.readLine();					// 읽어온다.
						int count = Integer.parseInt(line);				// 총 학생 수를 컨버터해서 읽어온다.(저장된 순간 문자열이라)
						StudentEx [] temp = new StudentEx[count];		// 학생 수만큼 배열을 만든다
						
						for (int i = 0; i < count; i++) {
							temp[i] = new StudentEx();					// 
							line = br.readLine();						// 첫 줄씩 불러오기 때문에 이렇게 for문으로 불러온다.
							String[] value = line.split(",");			// value라는 배열에 ,로 나눈 ID와 PW를 0, 1 인덱스로 분류
							temp[i].id = value[0];						// id 저장
							temp[i].pw = value[1];						// pw 저장
						}
						
						controller.loadStudentEx(temp , count);			// 데이터 완전히 불러오기 (loadStudentEx 라는 메서드 활용)
						
					}
					
					controller.printStudentEx();						// 학생 데이터 출력
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					try {br.close();} catch (IOException e) {e.printStackTrace();}		// br부터 close 해 줄 것
					try {fr.close();} catch (IOException e) {e.printStackTrace();}		// fr도 close 해 줄 것
				}
									
			}
			// 7번 [종료]
			else if (sel == 7) {
				System.out.println("종료");
				break;
			}
			
		}

		scan.close();		// scan.close();
		
	}

}
