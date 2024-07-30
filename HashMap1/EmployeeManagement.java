
import java.util.*;

public class EmployeeManagement {
    private Map<Integer, Employee> employeeMap;

    public EmployeeManagement() {
       employeeMap=new HashMap<Integer,Employee>(); //Write a missing code here
    }

    public void addEmployee(Employee employee) {
       employeeMap.put(employee.getEmployeeID(),employee);  //Write a missing code here
    }

    public Employee getEmployee(int employeeID) {
       return employeeMap.get(employeeID); //Write a missing code here
    }

    public List<Employee> getAllEmployeesSortedByName() {
         //Write a missing code here
         List<Employee> arr=new ArrayList<Employee>(employeeMap.values());
         Collections.sort(arr);
         return arr;
    }

    public boolean removeEmployee(int employeeID) throws EmployeeNotFoundException
    {
       return employeeMap.remove(employeeID)!=null; //Write a missing code here
    }
}