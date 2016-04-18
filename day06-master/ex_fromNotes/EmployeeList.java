// Pair programming with Hijiri

public class EmployeeList {
	private String[] nameArray = new String[10];
	private int[] idArray = new int[10];

	public static void main (String[] args){
		EmployeeList smallCompany = new EmployeeList();
		smallCompany.launch();
	}

	private void launch() {
		System.out.println("Enter names & IDs of all employees");
		
		for (int i=0;i<10;i++) {
			System.out.print("Enter employee name: ");
			nameArray[i] = System.console().readLine();
			System.out.print("and ID: ");
			idArray[i] = Integer.parseInt(System.console().readLine());
		}

		System.out.println("");
		System.out.println("Employees with ID < 1,000:");
		for (int i=0;i<10;i++) {
			if (idArray[i]<1000) {
				System.out.println(nameArray[i] + " ID:" + idArray[i]);
			}
		}

		System.out.println("");
		System.out.println("Employees whose names start with J or S:");
		for (int i=0;i<10;i++) {
			if (nameArray[i].charAt(0) == 'J' || nameArray[i].charAt(0) == 'S') {
				System.out.println(nameArray[i] + " " + idArray[i]);
			}
		}
		System.out.println("");
	}
}