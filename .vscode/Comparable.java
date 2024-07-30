import javax.lang.model.util.ElementScanner6;

public class Comp implements Comparable<Comp>
{
int id;
double salary;
String name;
}
Comp(int id,double salary,String name)
{
    this.id=id;
    this.name=name;
    this.salary=salary;

}
public int compareTo(Comp c)
{
    if(id==c.id)
    return 0;
    else if(id>c. id)
    return 1;
    else
    return -1
}
class compara implements Comparator<Comp>
{
    public int compare(Comp c1,Comp c2)
    
}
