package welcome2;

public class calculator {

		public static void main(String[] args) {
			// Various data types 
			int studentID = 301431538;
			String name = "Jijo George";
			float grades = 84.50f;
			double salary = 2500.00;
			String address = "Centennial college";
			boolean active = true;
			char attendance = 	'P';
			
			//Displaying the data types:
			System.out.println("Displaying the data types:");
			System.out.println(studentID);
			System.out.println(name);
			System.out.println(grades);
			System.out.println(salary);
			System.out.println(active);
			System.out.println(attendance);
			
			//Displaying the data types:
					System.out.println("Displaying the data types in user friendly way:");
					System.out.println("Student ID: " + studentID);
					System.out.println("Name: " + name);
					System.out.println(grades);
					System.out.println(salary);
					System.out.println(active);
					System.out.println(attendance);
					
					//Displaying the data types:
					System.out.println("Displaying the data types in one line:");
					System.out.println(studentID + " " + name + " " + grades + salary + active + attendance);
					
					//Displaying the data types:
					System.out.println("Displaying the data types in Formatted Way:");
					System.out.printf("Student ID: %d\n",studentID);
					System.out.printf("Name: %s\n", name);
					System.out.printf("Grades: %f\n",grades);
					System.out.printf("Salary: %f\n",salary);
					System.out.printf("Status: %b\n",active);
					System.out.printf("Present/Absent: %c\n",attendance);
					
					//Displaying the data types:
					System.out.println("Displaying the data types in Formatted Way:");
					System.out.printf("Student ID: %d\n Name: %s\n Grades: %f\n"
							+ "Salary: %f\n Status: %b\n Present/Absent: %c\n",
							studentID, name, grades, salary, active, attendance);



	}

}
