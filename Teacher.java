import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee(int no, String na, double sal, String add) {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}

public class Teacher extends Employee {
    String dept;
    String subject;

    Teacher(int no, String na, double sal, String add, String dep, String sub) {
        super(no, na, sal, add);
        this.dept = dep;
        this.subject = sub;
    }

    void display() {
        System.out.println("Employee id: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        System.out.println("\nEnter the No. of Employee's");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        sc1.nextLine(); // Consume the newline character left by nextInt()

        Teacher arr[] = new Teacher[num];
        for (int i = 0; i < num; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter Employee id: ");
            int Empid = sc.nextInt();
            sc.nextLine();

            System.out.println("\nEnter Employee Name: ");
            String Name = sc.nextLine();

            System.out.println("\nEnter Salary: ");
            double Salary = sc.nextDouble();
            sc.nextLine(); 

            System.out.println("\nEnter Address: ");
            String Address = sc.nextLine(); 

            System.out.println("\nEnter department: ");
            String dept = sc.nextLine();

            System.out.println("\nEnter Subject: ");
            String subject = sc.nextLine(); 

            arr[i] = new Teacher(Empid, Name, Salary, Address, dept, subject);
        }

        System.out.println("\n******** Informations of all the employee's ************");
        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ").");
            arr[i].display();
        }

        sc1.close();
    }
}
