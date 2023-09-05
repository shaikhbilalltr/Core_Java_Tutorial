package Core_Java_Tutorial;

public class Employee {
    //Simple java program with class and object
    
    static String Employee_name;
    static float Employee_salary;
  
    static void set(String n, float p) {
        Employee_name  = n;
        Employee_salary  = p;
    }
  
    static void get() {
        System.out.println("Employee name is: " +Employee_name );
        System.out.println("Employee CTC is: " + Employee_salary);
    }
  
    public static void main(String args[]) {
        Employee.set("Rathod Avinash", 10000.0f);
        Employee.get();
    } 
}
