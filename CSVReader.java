package Lab2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {

	public static void main(String[] args) {
	
		BufferedReader br = null;
		String line = "";
		String path = "C:\\Users\\lenovo\\Documents\\cpi14.csv";
		
		try {
			
			br = new BufferedReader(new FileReader(path));
			ArrayList<Double> cpi = new ArrayList<Double>();
			ArrayList<String> ID = new ArrayList<String>();
			ArrayList<String> names = new ArrayList<String>();
			
			while ((line = br.readLine()) != null) {
				String[] info = line.split(",");
				ID.add(info[0]);
				names.add(info[1]);
				cpi.add(Double.parseDouble(info[2]));
			}	
			
			double highestCPI = cpi.get(0);
			String highestCPIName = names.get(0);
			String highestCPIID = ID.get(0);
			
			for (int i = 1; i < 10; i++) {
				if (cpi.get(i) > highestCPI) {
					highestCPI = cpi.get(i);
					highestCPIName = names.get(i);
					highestCPIID = ID.get(i);	
				}
			}
				
				
			double average = 0;
			
			for (int i = 0; i < 10; i++) 
				average += cpi.get(i);
			average /= 10;
			
			System.out.println("Student with highest CPI:");
			System.out.println("ID: " + highestCPIID + "\n" + "Name: " + highestCPIName + "\n" + "CPI: " + highestCPI + "\n");
			
			System.out.println("Average CPI: " + average);
			System.out.println();
			
			System.out.println("Students having CPI more than Average CPI\n");
			
			for (int i = 0; i < 10; i++) {
				if (cpi.get(i) > average) 
					System.out.println(ID.get(i) + "  " + names.get(i) + "  " + cpi.get(i));
			}
			
			System.out.println();
				
		}
		catch (Exception e) {
			System.out.println("Error while analysing");
		}
        	finally {
        		if (br != null) {
        			try {
        				br.close();
        			}
        			catch (Exception e) {
        				System.out.println("Unable to close file");
        			}
        		}
        	}
	
	}

}

