package t4_exam;

/*
 				*
 			 ***
 			*****
 		 *******
 	  *********
 	   *******
 	  	*****
 	  	 ***
 	  		*
 */
public class Star9 {
	public static void main(String[] args) {
		
		for(int i=1; i <=5; i++) {     
			for(int j=1; j <=i-1; j++) {   //공백
				System.out.print(" ");	
			}
				for(int j=1 ; j<=6-i ; j++) {  //별
					System.out.print("*");
				}
			System.out.println();
		}
	}
}
