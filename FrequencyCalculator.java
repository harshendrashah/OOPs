
import java.util.*;
public class FrequencyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int arr[]=new int[100];
		for(int i=0;i<100;i++){
			arr[i]=1+r.nextInt(11);
		}
		int count;
		for(int i=0;i<100;i++){
           	 	count=1;
            		for(int j=i+1;j<100;j++) {
                		if(arr[i]==arr[j] && arr[i]!='\0')
                		{
                    			count++;
                    			arr[j] = '\0';
                }
            }
            if(arr[i]!='\0')
            {
                System.out.println(arr[i] + " is " + count + " times.\n");
            }
        }        
	}

}
