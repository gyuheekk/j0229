package t3_for;

public class Test8 {
	public static void main(String[] args) {
		int cnt = 0;
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=4; j++) {
				cnt++;
				System.out.println(cnt + " , i = " + i + " , j = " + j);
				
				// 앞의 문장을 6번 수행 후 탈출 시키고자 한다.
				if(cnt == 6) return; //리턴은 나머지 내용이 남아있더라도 바로 탈출 
			}
			System.out.println();
		}
		System.out.println("작업끝...");
	}
}
