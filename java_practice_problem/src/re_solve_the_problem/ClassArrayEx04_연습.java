package re_solve_the_problem;

class User1{
	
	String id; 
	int money;
	
}


public class ClassArrayEx04_연습 {

	public static void main(String[] args) {
		
		User1[] user1 = new User1[2];
		
		// 인덱스에 메서드 넣고
		for (int i=0; i<user1.length; i++) {
			user1[i] = new User1();
		}
		
		// 각 인덱스마다 ID랑 Money 추가
		user1[0].id = "qwer1234";
		user1[0].money = 1000;
		
		user1[1].id = "asdf1234";
		user1[1].money = 2000;
		
		// 반복문으로 출력
		for (int i = 0; i < user1.length; i ++) {
			System.out.println(user1[i].id + " " + user1[i].money);
		}
		
		User1 temp = user1[1];	// temp에 1번 인덱스의 "주소" 저장
		temp.id = "zxcv1234";	// temp에는 user1[1]에 대한 주소가 저장되어있기에
								// 거기에 새로운 ID를 입력하더라도 적용이 됨.
		System.out.println("=====================================");
		
		// 다시 반복문으로 출력
		for (int i = 0; i < user1.length; i ++) {
			System.out.println(user1[i].id + " " + user1[i].money);
		}

	}

}
