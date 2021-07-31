package GB;

public class Employee {
    private String name;
    private String vacation;
    private String email;
    private long phoneNumber;
    private int salary;
    private int age;

    public Employee (String name, String vacation, String email, long phoneNumber, int salary, int age){
        this.name = name;
        this.vacation = vacation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public String getVacation(){
        return vacation;
    }

    public String getEmail(){
        return email;
        }

    public long getPhoneNumber(){
        return phoneNumber;
        }
    public int getSalary(){
        return salary;
        }
    public int getAge(){
        return age;
        }

//    public void printInfo(Employee){
//        System.out.println("name: " + Employee.nameEmployee() + " " + "vacation: " + Employee.vacationEmployee() + " " + "email: " + Employee.emailEmployee() + " " + "phoneNumber: " + Employee.phoneNumberEmployee() + " " + "salary: " + Employee.salaryEmployee() + " " + "age: " + Employee.ageEmployee());
//    }

}
