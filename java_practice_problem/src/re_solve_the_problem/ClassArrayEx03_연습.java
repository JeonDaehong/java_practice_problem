package re_solve_the_problem;


class Client{
	
	// 배열속에서 바뀔 수 있는 변수들
	String name;
	int score;
	
	// 데이터를 저장하는 메서드
	void setData (String name, int score) {  
		this.name = name ; 		// 멤버변수에 파라메타로 넘어온 데이터를 대입
		this.score = score;		// 멤버변수에 파라메타로 넘어온 데이터를 대입
	}
	
	// 출력해주는 메서드
	void printData() {
		System.out.println(this.name  + " : " + this.score);
	}
	
}

public class ClassArrayEx03_연습 {

	public static void main(String[] args) {
		
		Client[] clients = new Client[3];
		
		// 각 인덱스에 메서드 추가
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new Client();
		}
		
		// 각 인덱스에 각각 이름과 점수를 추가해줌
		clients[0].setData("김철수",100); 
		clients[1].setData("이만수",20);
		clients[2].setData("박영희",70);
		
		// 그걸 출력해주는 데이터
		for (int i = 0 ; i < clients.length; i++) {
			clients[i].printData();
		}

	}

}
