package constructorReference;

interface getEmployee{
	
	Employee getEmp(String name, long account, double salary);
}

public class Task1 {

	public static void main(String[] args) {
		
		getEmployee emp = Employee::new;
		emp.getEmp("Arjun", 376288882, 70000);
	}
}
