package com.ssafy.ws.step3;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest1 {

	public static void main(String[] args) {
		//코드를 작성하세요.
		//test
		int count = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; ++j) {
				if (j < i) {
					System.out.printf("%3s", " ");
				} else {
					System.out.prinf("%3d", ++count)
				}
			}
			System.out.println();
		}
	}

} 
