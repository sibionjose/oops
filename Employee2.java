import java.util.Scanner;

class Employee2 {
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee2(int no, String na, double sal, String add) {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}

class Teacher extends Employee2 {
    String dept;
    String subject;

    Teacher(int no, String na, double sal, String add, String dep, String sub) {
        super(no, na, sal, add);
        this.dept = dep;
        this.subject = sub;
    }

    void display() {
        System.out.println("Employee id : " + Empid);
        System.out.println("Name : " + Name);
        System.out.println("Salary : " + Salary);
        System.out.println("Address : " + Address);
        System.out.println("Department : " + dept);
        System.out.println("Subject : " + subject);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the No. of Employees:");
        int num = sc.nextInt();
        Teacher[] arr = new Teacher[num];

        for (int i = 0; i < num; i++) {
            System.out.println("\nEnter Employee details:");

            System.out.print("\nEnter Employee id: ");
            int Empid = sc.nextInt();

            System.out.print("\nEnter Employee Name: ");
            String Name = sc.next();

            System.out.print("\nEnter Salary: ");
            double Salary = sc.nextDouble();

            System.out.print("\nEnter Address: ");
            String Address = sc.next();

            System.out.print("\nEnter Department: ");
            String dept = sc.next();

            System.out.print("\nEnter Subject: ");
            String subject = sc.next();

            arr[i] = new Teacher(Empid, Name, Salary, Address, dept, subject);
        }

        System.out.println("\n************ INFORMATION OF ALL THE EMPLOYEES **********");
        for (int i = 0; i < num; i++) {
            arr[i].display();
        }

        sc.close();
    }
}
