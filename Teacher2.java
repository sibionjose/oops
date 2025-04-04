import java.util.Scanner;

class Person {
    String Name;
    String Gender;
    String Address;
    int Age;

    Person(String name, String gender, String address, int age) {
        this.Name = name;
        this.Gender = gender;
        this.Address = address;
        this.Age = age;
    }
}

class Employee extends Person {
    int Empid;
    String Company_name;
    String Qualification;
    long Salary;

    Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification, long salary) {
        super(name, gender, address, age);
        this.Empid = empid;
        this.Company_name = company_name;
        this.Qualification = qualification;
        this.Salary = salary;
    }
}

public class Teacher2 extends Employee {
    String Subject;
    String Department;
    String Teacherid;

    Teacher2(String name, String gender, String address, int age, int empid, String company_name, String qualification, long salary, String subject, String department, String teacherid) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.Subject = subject;
        this.Department = department;
        this.Teacherid = teacherid;
    }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Address: " + Address);
        System.out.println("Age: " + Age);
        System.out.println("Employee id: " + Empid);
        System.out.println("Company Name: " + Company_name);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Salary: " + Salary);
        System.out.println("Subject: " + Subject);
        System.out.println("Department: " + Department);
        System.out.println("Teacher id: " + Teacherid);
    }

    public static void main(String[] args) {
        System.out.println("Enter the No. of Teacher's");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();

        // Make sure to consume the newline character after entering num
        sc1.nextLine(); 
        Teacher2[] arr = new Teacher2[num];
        System.out.println("Enter the Teacher Details");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ").");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee id: ");
            int empid = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Company name: ");
            String company_name = sc.nextLine();
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Salary: ");
            long salary = sc.nextLong();
            sc.nextLine(); 
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();
            System.out.print("Teacher Id: ");
            String teacherid = sc.nextLine();

            arr[i] = new Teacher2(name, gender, address, age, empid, company_name, qualification, salary, subject, department, teacherid);
        }

        System.out.println("\n******** Informations of all the Teacher's ************");
        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ").");
            arr[i].display();
        }

        sc.close();
        sc1.close();
    }
}
