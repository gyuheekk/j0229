package t1_while;

import java.util.Scanner;

// 반복문 탈출
public class Test2_2 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int i = 0, su, breakSu;
	 
	 while(true) {
		 System.out.print("1부터 출력할 수를 입력하세요? ");
		 su = sc.nextInt();
		 System.out.print("탈출할 수를 입력하세요? ");
		 breakSu = sc.nextInt();
		 
		 if(su >= breakSu) {
			 break; //입력받는 수가 탈출수보다 크거나 같아야 함
		 }
		 else
			 System.out.println("첫번째수가 두번째수보다 더 큰수를 입력하셔야 합나다.\n");
	 }
	 
	 while(i < su) {
		i++;
		System.out.println(i);
		
		if(i == breakSu) break;
		
	 }
	
		sc.close();
 	}
} 
