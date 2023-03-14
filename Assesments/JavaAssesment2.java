import java.util.*;
class JavaAssesment2
{
		char c=' ';
		int i=0,temp=1;
	
		public void getMultidimen(){
					 Scanner sc = new Scanner(System.in);
					 System.out.print("Enter Required values add in matrix:");
					 int limit = sc.nextInt();
					 int arr[] = new int[limit];
		for(int i=0;i<arr.length;i++){
					 System.out.print("\n Enter the value for" + (i+1)+":");
					 arr[i] = sc.nextInt();
					}
		System.out.print("\n The given values are\t" + Arrays.toString(arr));
		System.out.print("\nEnter the column size value");
		
		int colsize = sc.nextInt();
		

		System.out.print("[");
		for(i=0;i<arr.length;i++)
		{
			if(temp == colsize){
					System.out.print("\t"+ arr[i] + "\t");
				
					if(i == arr.length -1){
							System.out.print("]");
						}
						else{
							System.out.print("\t");
							}
						temp=1;
			}else{
				System.out.print("\t" + arr[i] + "\t");
				temp++;
				}
			}
			}
public static void main(String[] args){
		JavaAssesment2 mat = new JavaAssesment2();
		mat.getMultidimen();
}
}