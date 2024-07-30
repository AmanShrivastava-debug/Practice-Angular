package HashMap1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Map<Integer,Employee> hm=new HashMap<Integer,Employee>();
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter Employee ID");
            int id=sc.nextInt();
            System.out.println("Enter Employee name");
            String name=sc.next();
            System.out.println("Enter the grade")
            String grade=sc.next();
            Employee emp=new Employee(id,name,grade);
            hm.put(i,emp);
        }
        EmployeeManagement m=new EmployeeManagement();
        m.addEmployee(hm.get(1));
        m.addEmployee(hm.get(2));
        m.addEmployee(hm.get(3));
        System.out.println(m.getEmployee(2));
        List<Employee>arr=m.getAllEmployeesSortedByName();

        }
    }
    
}
