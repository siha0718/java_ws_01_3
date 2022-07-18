package com.ssafy.ws.step3;

public class DigitTest1 {
	public static void main(String[] args) {
		
		int num = 1;
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<j) {
					System.out.printf("%3d", num);
					num++;
					
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
