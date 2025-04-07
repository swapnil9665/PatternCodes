import java.util.*;
class Pattern7{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter no. of row::- ");
	int row = sc.nextInt();

       int col = 1;	
	for(int i=1;i<=row*2-1;i++){
	
		// for space
		if(i<=row){
		for(int j = 1;j<=row-i;j++){
		
		 System.out.print("\t");
		
		}

		
		}
		else{
		
		for(int k = 1;k<=i-row;k++){
		
		System.out.print("\t");
		
		}
		}
		//for *
		
		if(i<=row){
		
		col = i*2-1;
		for(int l= 1;l<=col;l++){
		
			System.out.print("*\t");
		}



		}else{
		col-=2;

		for(int m = 1; m<=col;m++){
		
		System.out.print("*\t");
		
		}
		



		}

	System.out.println();	
		}
	
	
	
	
	
	}








}
