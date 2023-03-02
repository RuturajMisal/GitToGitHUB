
public class Basic {
	public static void main(String[] args) {
		

//		 Program :- Pattern 1
		
				for (int i=1;i<=4;i++) {
					for (int j=1;j<=4;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
//		Output:-	
//		****
//		****
//		****
//		****
System.out.println("==============================================================================================================");
		// Program :- Pattern 2	

				for (int i=1;i<=5;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}

//		Output:-
//		*
//		**
//		***
//		****
//		*****
System.out.println("===========================================================================================================");
		// Program:- Pattern 3

				for (int i=1;i<=5;i++) {
					for (int j=5;j>=i;j--) {
						System.out.print("*");
					}
					System.out.println();
				}
}}
