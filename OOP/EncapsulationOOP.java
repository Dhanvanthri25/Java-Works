class Office
{
private int Salary;
private String Employeename;

public int getSalary()
{
return Salary;
}

public String getEmployeename()
{
return Employeename;
}

public void setSalary(int sal)
{
this.Salary=sal;
}

public void setEmployeename(String emp)
{
this.Employeename=emp;
}
}

class EncapsulationOOP
{
public static void main(String[]args)
{
Office obj= new Office();
obj.setSalary(950000);
obj.setEmployeename("dharnesh");
System.out.println("The Salary is \t \t"+obj.getSalary());
System.out.println("The Employeename is\t"+obj.getEmployeename());
}
}








