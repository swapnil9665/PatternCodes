import java.util.*;

class Program3{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no. of row::- ");
	int row = sc.nextInt();

	for(int i = 1;i<=row;i++){
	
	int a=97,A=65;
	for(int j = 1;j<=row-i;j++){
	
	System.out.print("\t");
	}

	for(int k = 1;k<=i*2-1;k++){
		if(i%2==0){
		System.out.print(""+(char)a+"\t");
		a++;
		}else{

		System.out.print(""+(char)A+"\t");
		A++;
		}


	
	
	}
	System.out.println("");







	}
}
}
