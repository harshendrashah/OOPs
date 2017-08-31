package Lab2;
import java.util.Scanner;
import java.lang.*;

public class StringSorterBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=new String[10];
		for(int i=0;i<10;i++){
			str[i]=sc.nextLine();
			
		}
		String swap=null;
		for (int i = 0; i < 9; i++) {
	    	for (int j = 0; j < 10- i - 1; j++) {
		        if (str[j].compareToIgnoreCase(str[j+1]) > 0){
		        	swap  = str[j];
		        	str[j]   = str[j+1];
		        	str[j+1] = swap;
		        }
		    }
	    }
		for(int i=0;i<10;i++){
			System.out.println(str[i]);
		}
		
	}

}
