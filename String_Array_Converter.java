package Lab2;
import java.util.*;
public class String_Array_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers :");
		String str1=sc.nextLine();
		String[] str2=str1.split(",");
		Double parseNums[]=new Double[str2.length];
		for(int i=0;i<str2.length;i++){
			parseNums[i]=Double.parseDouble(str2[i]);
		}
		for(int i=0;i<str2.length;i++){
			System.out.println(parseNums[i]);
		}
	}

}
