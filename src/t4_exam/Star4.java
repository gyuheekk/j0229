package t4_exam;

/*
   3 2 1
   6 5 4
   9 8 7
 */
public class Star4 {
	public static void main(String[] args) {
		int su = 4;
		
		for(int i=1; i <=3; i++) {    // 행 
			for(int j=1; j <=3; j++) {  // 열
				su -= 1 ;
				System.out.print(su + " ");
			}
			su += 6;
			System.out.println();
		}
	}
}
