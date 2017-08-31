package Lab2;
import java.util.Scanner;

public class Reverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length");
		int n=sc.nextInt();
		int temp;
		int arr[]=new int[n];
		System.out.println("Enter the Numbers");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		if(n%2==1){
			for(int i=0;i<(n/2+1);i++){
				temp=arr[n-i-1];
				arr[n-i-1]=arr[i];
				arr[i]=temp;
			}
		}
		else{
			for(int i=0;i<=(n/2+1);i++){
				temp=arr[n-i-1];
				arr[n-i-1]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
