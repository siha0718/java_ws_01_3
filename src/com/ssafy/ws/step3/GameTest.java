package com.ssafy.ws.step3;

import java.util.Scanner;

public class GameTest {
	
	public static void main(String[] args) {
		while(true) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
			System.out.println("1. 5판 3승");
			System.out.println("2. 3판 2승");
			System.out.println("3. 1판 1승");
			System.out.print("번호를 입력하세요.");
			
			int user = scan.nextInt();
			int user_count = 0;
			int com_count = 0;
			int computer = 0;
			
			//5판3승일때
			if(user==1) {
				for(int i=0;i<5;i++) {
					System.out.print("가위바위보 중 하나 입력:");
					String user_turn = scan.next();
					computer = (int)(Math.random() * 3) + 1;
					
					if (user_turn.equals("가위") && computer==3) {
						user_count++;
						System.out.println("이겼습니다!!");
					}
					else if(user_turn.equals("주먹") && computer == 1) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else if(user_turn.equals("보") && computer == 2) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else {
						System.out.println("졌습니다!!!");
						com_count++;
					}
					
					if (com_count==3) {
						System.out.println("###컴퓨터 승!!!");
						break;
					}
					else if(user_count==3) {
						System.out.println("###사용자 승!!!");
						break;
					}
					
				}
				
			}
			else if(user==2) {
				for(int i=0;i<3;i++) {
					System.out.print("가위바위보 중 하나 입력:");
					String user_turn = scan.next();
					computer = (int)(Math.random() * 3) + 1;
					
					if (user_turn.equals("가위") && computer == 3) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else if(user_turn.equals("주먹") && computer == 1) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else if(user_turn.equals("보") && computer == 2) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else {
						System.out.println("졌습니다!!!");
						com_count++;
					}
					
					if (com_count==2) {
						System.out.println("###컴퓨터 승!!!");
						break;
					}
					else if(user_count==2) {
						System.out.println("###사용자 승!!!");
						break;
					}
					
				}
			}
			else {
				for(int i=0;i<1;i++) {
					System.out.print("가위바위보 중 하나 입력:");
					String user_turn = scan.next();
					computer = (int)(Math.random() * 3) + 1;
					
					if (user_turn.equals("가위") && computer == 3) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else if(user_turn.equals("주먹") && computer == 1) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else if(user_turn.equals("보") && computer == 2) {
						user_count++;
						System.out.println("이겼습니다!!");

					}
					else {
						System.out.println("졌습니다!!!");
						com_count++;
					}
					
					
					if (com_count==1) {
						System.out.println("###컴퓨터 승!!!");
						break;
					}
					else if(user_count==1) {
						System.out.println("###사용자 승!!!");
						break;
					}
					
				}
			}
			
			break;
			
		}
	}
	
	
	
}
	

