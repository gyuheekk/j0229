package t4_exam;

import java.util.Scanner;

//수정
// 1개의 주사위를 던졌을때 나오는 숫자 맞추기 게임
public class Test4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su, rand, ans;
		
		while(true) {			
			while(true) {
				System.out.print("출력될 주사위 눈금을 입력하세요? ");
				su = sc.nextInt();
			
				if (su >= 1 && su <= 6) break;
				System.out.println("1~6까지의 수를 입력하세요.");
			}
		
			rand = (int)(Math.random()*6) + 1;
		
			if(su == rand) System.out.println("정답입니다 *^^* ");
			else System.out.println("땡~ 아쉬워요ㅠㅠ 출력된 주사위 눈금은 "+rand+" 입니다.");
		
			while(true) {
				System.out.print("계속 할까요?(1:계속/0:그만)");

				ans = sc.nextInt();
				
				if(ans == 0 || ans == 1) break;
				System.out.println();
			}
			
			if(ans != 1 || ans != 0)
			  System.out.println("1과 0 둘 중 하나만 입력하세요");
		  else if(ans == 0) break;
		}
		System.out.println("작업 끝~!");
		sc.close();
		
		
	}
}
