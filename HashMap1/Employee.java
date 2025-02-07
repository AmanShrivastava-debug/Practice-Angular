package HashMap1;
public class Employee implements Comparable<Employee> {
    private int employeeID;
    private String name;
    private String grade;

    public Employee(int employeeID, String name, String grade) {
        this.employeeID = employeeID;
        this.name = name;
        this.grade = grade;
    }

    public Employee() {
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int compareTo(Employee obj)
    {
        return this.name.compareTo(obj.name);
    }
	//create getter and setter
	}
	