package re_solve_the_problem;

class Card{
	
	int num;
	String shape;
	
}

public class ClassArrayEx02_연습 {

	public static void main(String[] args) {
		
		 Card[] arr = new Card[10];			// Card 클래스에 10개의 인덱스가 들어있는 배열 추가
		 
		 // for문 활용
		 for (int i = 0; i < 10;  i++) {	// 반복문
			 arr[i] = new Card();			// 배열 인덱스에 new Card(); 클래스 적용 (꼭!0
			 arr[i].num = (i + 1);			// 클래스 내의 변수에 원하는 거 추가
			 arr[i].shape = "클로버";		// 클래스 내의 변수에 원하는 거 추가
		 }

		 // 출력
		 for (int i = 0; i < arr.length; i++) {
			System.out.println("num : " + arr[i].num);
			System.out.println("shape : " + arr[i].shape);
			System.out.println();
		}
		 
	}

}
