package com.ssafy.ws.step3;

public class DigitTest2 {
	public static void main(String[] args) {
		
		int num = 1; 
		int cnt = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("   ");
			}
			for(int j=i*2;j<5;j++) {
				System.out.printf("%3d", num);
				num++;
			}
			System.out.println();
		}
		
		
		for(int i=0;i<2;i++) {
			for(int j=i+1;j<2;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<4+cnt;j++) {
				System.out.printf("%3d", num);
				num++;
			}
			System.out.println();
			cnt += 2;
		}
		
		
	}
}
