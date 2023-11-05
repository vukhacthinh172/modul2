import java.util.Scanner;

public class Employee {
    private int employeeId ;
    private String employeeName ;
    private int age ;
    private boolean gen ;
    private double rate ;
    private double salary;
    public Employee(){
    }

    public Employee(int employeeId, String employeeName, int age, boolean gen, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public boolean isGen() {
        return gen;
    }

    public double getRate() {
        return rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGen(boolean gen) {
        this.gen = gen;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //    public  void calSalary(){
//        this.salary= this.rate*13000 ;
//    }
    public  void  inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        this.employeeId  = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
        this.employeeName = sc.nextLine();
        System.out.println("Nhập tuổi");
        this.age  = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính (true/false)");
        this.gen = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập hệ số lương");
        this.rate  = Double.parseDouble(sc.nextLine());
        //this.calSalary();
    }

    @Override
    public String toString() {
        double salary = rate* 130000 ;
        return "bai5.Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gen=" + gen +(gen?" ":" ") +
                ", rate=" + rate +
                ", salary=" +salary +
                '}';
    }
    public  void  displayData(){
        System.out.println(this);
    }


}
