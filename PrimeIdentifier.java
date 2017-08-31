package Lab2;

import java.util.Scanner;

public class PrimeIdentifier {
	public static void main(String[] args) {
		// ODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		boolean isPrime=true;
		for(int i=21;i<n;i++){
			if(n==1){
				isPrime=false;
				break;
			}
			if(n%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime){
			System.out.println(n+" is a Prime Number.");
		}
		else
			System.out.println(n+" is not a Prime Number.");
	}
}
