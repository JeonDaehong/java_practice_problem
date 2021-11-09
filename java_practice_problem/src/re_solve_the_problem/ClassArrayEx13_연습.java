package re_solve_the_problem;

// 요구 : ArrayList를 활용한 것과, 직접 ArrayList(백터)를 구현하여 서로 비교해가며 코드를 분석하고, 익혀라.
//        그리고 직접 구현하라.

import java.util.ArrayList;

// Tv 클래스
class Tv {
	
	// 필드
	String name;
	String brand;
	int price;

	// 데이터 모음
	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}

// TvList 클래스
class TvList {
	
	// 필드
	Tv[] arr;			// 배열
	int elementCount;	// 숫자

	// 추가 메서드
	void add(Tv tv) {
		if (elementCount == 0) {
			arr = new Tv[elementCount + 1];
		} 
		else if (elementCount > 0) {
			Tv[] temp = arr;

			arr = new Tv[elementCount + 1];
			for (int i = 0; i < elementCount; i++) {
				arr[i] = temp[i];
			}
		}
		arr[elementCount] = tv;
		elementCount++;
	}

	// 배열 크기(길이) 메서드
	int size() {
		return elementCount;
	}

	// 삭제 메서드
	void remove(int index) {
		if (elementCount == 1) {
			arr = null;
			elementCount = 0;
		} 
		else if (elementCount > 1) {
			Tv[] temp = arr;

			arr = new Tv[elementCount - 1];
			int j = 0;
			for (int i = 0; i < elementCount; i++) {
				if (i != index) {
					arr[j++] = temp[i];
				}
			}
			elementCount--;
		}
	}

	// 해당 Tv 출력 메서드
	Tv get(int index) {
		return arr[index];
	}

}


public class ClassArrayEx13_연습 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv> list = new ArrayList<>();

		Tv temp = new Tv();
		temp.setData("TV", "삼성", 1000);
		list.add(temp);
		
		temp = new Tv();
		temp.setData("시그니처TV", "엘지", 2000);
		list.add(temp);

		temp = new Tv();
		temp.setData("스마트TV", "애플", 3000);
		list.add(temp);
	
		for (Tv tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		

		System.out.println("\n========================================\n");

		// 직접 구현한 ArrayList 사용
		TvList myList = new TvList();
		temp = new Tv();
		temp.setData("TV", "삼성", 1000);
		myList.add(temp);

		temp = new Tv();
		temp.setData("시그니처TV", "엘지", 2000);
		myList.add(temp);

		temp = new Tv();
		temp.setData("스마트TV", "애플", 3000);
		myList.add(temp);

		for (Tv tv : myList.arr) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}

	}

}
