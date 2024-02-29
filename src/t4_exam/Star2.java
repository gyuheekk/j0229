package t4_exam;

/*
   9 8 7
   6 5 4
   3 2 1
 */
public class Star2 {
	public static void main(String[] args) {
		int su = 10;
		
		for(int i=1; i <=3; i++) {    // 행 
			for(int j=1; j <=3; j++) {  // 열
				su--;
				System.out.print(su + " ");
			}
			System.out.println();
		}
	}

}
