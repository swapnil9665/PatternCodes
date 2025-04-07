import java.util.*;
class Pattern6{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter no. of row::- ");
	int row = sc.nextInt();


	for(int i = 1;i<=row;i++){
	
		//space
		for(int j = 1;j<=row-i;j++){
		
		 System.out.print("\t");
		
		}

		for(int k = 1;k<=i*2-1;k++){
		
			 System.out.print("*\t");
		
		}
		 System.out.println("");
	
	
	
	
	
	}


}






}
