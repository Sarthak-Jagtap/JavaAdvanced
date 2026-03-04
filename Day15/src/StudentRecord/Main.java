package StudentRecord;

import java.io.Console;


public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		Console	console = System.console();
		
		CrudOperations op = new CrudOperations();
		boolean option = true;
		while(option) {
			System.out.println("***************************************");
			System.out.println("1. Add Student Record");
			System.out.println("2. Update Student Record");
			System.out.println("3. Delete Student Record");
			System.out.println("4. View Student Records");
			System.out.println("5. Search Student Records");
			System.out.println("6. Exit");
			System.out.println("***************************************\n");
			
			int choise = Integer.parseInt(console.readLine("Enter your choise : "));
					
			switch(choise) {
				case 1 : {
					Student stud = new Student(
							Integer.parseInt(console.readLine("Enter Roll Number : ")), 
							console.readLine("Enter Name : "), 
							Double.parseDouble(console.readLine("Enter Marks : ")), 
							console.readLine("Enter Email : ")
						);
					if(op.add(stud) != 0) {
						String ch = console.readLine("Record Already Present do you want to update? (Y/N)");
						if(ch.equals("Y") || ch.equals("y")) {
							op.update(stud, stud.getRollNo());
						}
					}
					break;
				}
				case 2: {
					int rollNo = Integer.parseInt(console.readLine("Enter Roll Number : "));
					Student stud = new Student(
							rollNo, 
							console.readLine("Enter Name : "), 
							Double.parseDouble(console.readLine("Enter Marks : ")), 
							console.readLine("Enter Email : ")
						);
					if(op.update(stud, rollNo) != 0) {
						System.out.println("Student with rollNo = <" + rollNo + ">is not availabe to Update...");
						String ch = console.readLine("Do you want to add new Record? (Y/N)");
						if(ch.equals("Y") || ch.equals("y")) {
							op.add(stud);
						}
					}
					break;
				}
				case 3: {
					int rollNo = Integer.parseInt(console.readLine("Enter Roll Number : "));
					
					if(op.delete(rollNo) != 0) {
						System.out.println("Student with rollNo = <" + rollNo + ">is not availabe to Delete...");
					}
					break;
				}
				case 4: {
					op.viewAll();
					break;
				}
				case 5: {
					int rollNo = Integer.parseInt(console.readLine("Enter Roll Number : "));
					if(op.searchStud(rollNo, true) == -1) {
						System.out.println("Student with rollNo = <" + rollNo + ">is not availabe...");
					}
					break;
				}
				case 6:{
					option = false;
					System.out.println("Thank You...");
					break;
				}
				default :{
					System.out.println("Invalid Choise");
				}
			}
		}
	}

}
