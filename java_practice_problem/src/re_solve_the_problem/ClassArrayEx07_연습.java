package re_solve_the_problem;

//# 클래스 배열 응용

class Subject{
	
	String name;
	int score;
	
}


class Student{
	
	Subject[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}


public class ClassArrayEx07_연습 {

	public static void main(String[] args) {

		Student[] st = new Student[3];	// 이거는 배열을 생성하는것이기에, 배열 내 인덱스마다의 주소를 만들어주지는 않음.
		
		st[0] = new Student();	// 이거 안해주면, st[i]는 다 null 상태임. (주소가 없음)
		st[0].subjects = new Subject[3];
		
		for (int i = 0; i < 3; i++) {
			st[0].subjects[i] = new Subject();
		}
		
		st[1] = new Student();
		st[1].subjects = new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();
		
		st[2] = new Student();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();

	}

}
