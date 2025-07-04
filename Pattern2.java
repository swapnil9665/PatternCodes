class Pattern2{
public static void main(String args[]){

int row = 4;
int r = row;
for(int i = 1;i<=row;i++){
	for(int col =row-i+1;col>=1;col--){
	
	System.out.print("* ");
	}
	
	System.out.println();


}


int arr[][] = {{3,2,1},{6,5,4,},{9,7,6}};
for(int i = 0;i<arr.length;i++){

	for(int j = 0;j<arr[0].length;j++){
	
	System.out.print(arr[i][j]+" ");
	
	}
System.out.println();
}

int sum1 = 0;

for(int i = 0;i<arr.length;i++){

for(int j = 0;j<arr[0].length;j++){
		if(i == j){
        	sum1+=arr[i][j];
		}
        }

}

System.out.println("sum = "+sum1);


var  sum = 0;

for(int i = 0;i<arr.length;i++){

for(int j = 0;j<arr[0].length;j++){
                if(i+j == arr.length-1){
                sum+=arr[i][j];
		System.out.println(arr[i][j]);
                }
        }

}

System.out.println("sum = "+sum);





}


}
