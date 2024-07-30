import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
public class jdbc{
    private String name;
    private String dept;
    private double salary;
    private String email;
    private Long phone;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getPhone() {
        return phone;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
 
   
}
 class CRUD
{
    jdbc reg=new jdbc();
    Scanner sc=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter the name: ");
        reg.setName(sc.next());
        System.out.println("Enter the dep: ");
        reg.setDept(sc.next());
        System.out.println("Enter the salary: ");
        reg.setSalary(sc.nextDouble());
        System.out.println("Enter the email: ");
        reg.setEmail(sc.next());
        System.out.println("Enter the phone: ");
        reg.setPhone(sc.nextLong());
 
    }
    void insertData()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql//localhost:3306/student","root","root");
            PreparedStatement ps=connection.prepareStatement("insert into registeration(name,dept,salary,email,phone) values (?,?,?,?,?)");
            ps.setString(1, reg.getName());
            ps.setString(2, reg.getDept());
            ps.setDouble(1, reg.getSalary());
            ps.setString(1, reg.getEmail());
            ps.setLong(1, reg.getPhone());
            int res=ps.executeUpdate();
            if(res>0)
            {
                System.out.println("insert successful");
            }
            else
            {
                System.out.println("insert failed");
            }
 
 
 
 
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println(ce);
        }
        catch(SQLException se)
        {
            System.out.println(se);
        }
 
    }
 
}
class Main
{
    public static void main(String[] args) {
CRUD cd=new CRUD();
cd.getData();
cd.insertData();
 
    }
 
}
