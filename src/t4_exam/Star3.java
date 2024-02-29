package t4_exam;

/*
   1 4 7
   2 5 8
   3 6 9
 */
public class Star3 {
	public static void main(String[] args) {
		int su = -2;
		
		for(int i=1; i <=3; i++) {    // 행 
			for(int j=1; j <=3; j++) {  // 열
				su += 3 ;
				System.out.print(su + " ");
			}
			su -= 8;
			System.out.println();
		}
	}
}
