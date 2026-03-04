package SalaryCalculator;

import java.io.*;
public class FilterRecords {
	
	public static void main(String[] args) {
		
		String record = "record.txt";
		String valid = "valid.txt";
		String error = "error.txt";
		
		try(
				BufferedReader br = new BufferedReader(new FileReader(record));
				BufferedWriter validWriter = new BufferedWriter(new FileWriter(valid));
				BufferedWriter errorWriter = new BufferedWriter(new FileWriter(error));
		){
			String line;
			
			while((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				try {
					int id = Integer.parseInt(data[0]);
					String name = data[1];
					float salary = Float.parseFloat(data[2]);
					
					if(name.length() == 0) throw new Exception("Name Error");
					
					float bonus = (float) (salary * 0.05);
					
					validWriter.write(id+","+name+","+salary+","+bonus);
					validWriter.newLine();
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
					
					errorWriter.write(e.getMessage()+" -> "+ line);
				}
			}
			
			
		}catch(Exception e) {
			
		}
	}
}
