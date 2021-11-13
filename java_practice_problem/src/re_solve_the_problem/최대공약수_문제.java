package re_solve_the_problem;

// 이건 그냥 알고리즘 책 보다가 "유클리드 호제법"이라는게 나와서, 정리해 본 클래스이다.

public class 최대공약수_문제 {

	public static void main(String[] args) {
		
		 int x = 126;	// 숫자 1
		 int y = 90;	// 숫자 2
		 
		 int h = -1;	// 나머지 수
		 
		 // 유클리드 호제법 (나머지가 0이 될 때까지)
		 while(true) {
			 
			 h = (x % y);
			 
			 if (h == 0) {
				 break;
			 } else {
				 x = y;
				 y = h;
			 }
		 }
		 
		 // 최대공약수 결과
		 System.out.println(y);

	}

}
