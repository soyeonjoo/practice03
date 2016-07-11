package prob6;

public class Depart extends Employee {
	
	private String department;
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Depart(String name,int salary, String department){
	setSalary(salary);
	setName(name);
	setDepartment(department);
	}
	
		public void getInformation(){
			System.out.printf( "이름: %s   연봉: %d 부서: %s " , getName(), getSalary(),getDepartment() );
		}
	}

