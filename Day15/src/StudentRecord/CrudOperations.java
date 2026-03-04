package StudentRecord;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CrudOperations {

	File recordFile = new File("src/StudentRecord/recordFile.txt");

	public int add(Student obj) {
		
		if(searchStud(obj.getRollNo(), false) >= 0) {
			return 1;
		}
		try (BufferedWriter os = new BufferedWriter(new FileWriter(recordFile, true));) {
			
			os.write(obj.toFile());
			os.newLine();
			System.out.println("Student Data Added Successfully");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return 0;
	}

	public int searchStud(int target, boolean print) {
		int lineNo = 0;
		boolean found = false;
		try (BufferedReader br = new BufferedReader(new FileReader(recordFile));) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				if (Integer.parseInt(data[0]) == target) {
					found = true;
					if(print) {
						
						Student obj = new Student(Integer.parseInt(data[0]), 
								data[1], 
								Double.parseDouble(data[2]), 
								data[3]);

						System.out.println(obj);
					}
					break;
				}
				lineNo++;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return -2;
		}

		if (found)
			return lineNo;
		else
			return -1;

	}

	public int update(Student obj, int target) {
		int lineNo = searchStud(target, false);
		if (lineNo == -1) {
			return 1;
		}

		File updatedFile = new File("src/StudentRecord/updatedFile.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(updatedFile));
				BufferedReader br = new BufferedReader(new FileReader(recordFile));) {
			int currentLine = 0;
			String line;
			while ((line = br.readLine()) != null) {
				if (currentLine == lineNo) {
					bw.write(obj.toFile());
				} else {
					bw.write(line);
				}
				bw.newLine();
				currentLine++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		recordFile.delete();
		updatedFile.renameTo(recordFile);

		System.out.println("Student Record Upadted Successfully...");
		return 0;
	}

	public int delete(int target) {
		int lineNo = searchStud(target, false);
		if (lineNo == -1) {
			return 1;
		}

		File updatedFile = new File("src/StudentRecord/updatedFile.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(updatedFile));
				BufferedReader br = new BufferedReader(new FileReader(recordFile));) {
			int currentLine = 0;
			String line;
			while ((line = br.readLine()) != null) {
				if (currentLine != lineNo) {
					bw.write(line);
					bw.newLine();
				}
				currentLine++;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		recordFile.delete();
		updatedFile.renameTo(recordFile);

		System.out.println("Student Record Deleted Successfully...");
		return 0;
	}

	public void viewAll() {
		try (BufferedReader br = new BufferedReader(new FileReader(recordFile));) {
			String line;
			String[] data;
			while ((line = br.readLine()) != null) {

				data = line.split(",");
				Student obj = new Student(Integer.parseInt(data[0]), 
						data[1], 
						Double.parseDouble(data[2]), 
						data[3]);

				System.out.println(obj);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
