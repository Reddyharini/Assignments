package Assignments;

public class EmpGroups {
public static void main(String[] args)
{
Employees emp = new Employees();
String[] employeeNames = { emp.employeeName1,emp.employeeName2, emp.employeeName3 };
int[] employeeIDs = { emp.employeeID1, emp.employeeID2, emp.employeeID3};
System.out.println("Employer Name : " +emp.employeeName1 + "Employer ID : " +emp.employeeID1);

}
}