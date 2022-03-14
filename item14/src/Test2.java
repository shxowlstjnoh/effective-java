import java.util.Arrays;
import java.util.Comparator;

import javax.swing.*;

public class Test2 {

	public static void main(String[] args) {

		MyInteger2[] arr = new MyInteger2[10];

		// 객체 배열 초기화 (랜덤 값으로) 
		for(int i = 0; i < 10; i++) {
			arr[i] = new MyInteger2((int)(Math.random() * 100));
		}

		// 정렬 이전
		System.out.print("정렬 전 : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i].value + " ");
		}
		System.out.println();

		Arrays.sort(arr, comp);		// MyInteger2에 대한 Comparator을 구현한 익명객체를 넘겨줌

		// 정렬 이후
		System.out.print("정렬 후 : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i].value + " ");
		}
		System.out.println();
	}


	static Comparator<MyInteger2> comp = new Comparator<MyInteger2>() {

		@Override
		public int compare(MyInteger2 o1, MyInteger2 o2) {
			return o1.value - o2.value;
		}
	};
}


class MyInteger2 {
	int value;

	public MyInteger2(int value) {
		this.value = value;
	}


}