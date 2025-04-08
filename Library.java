import java.util.Scanner;

class Book {
    int AccessionNumber;
    String title;
    String publisher;
    String author;
    int edition;

    void acceptBookInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Accession Number: ");
        AccessionNumber = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Publisher: ");
        publisher = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Edition: ");
        edition = sc.nextInt();
        sc.nextLine();
    }

    void displayBookInfo() {
        System.out.println("Accession Number: " + AccessionNumber);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println();
    }
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            books[i] = new Book();
            System.out.println("Enter details for Book " + (i + 1) + ":");
            books[i].acceptBookInfo();
        }

        // Search for a book by Accession Number
        System.out.print("Enter the Accession Number to search for: ");
        int searchAccessionNumber = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (books[i].AccessionNumber == searchAccessionNumber) {
                found = true;
                System.out.println("\nBook found with Accession Number " + searchAccessionNumber + ":");
                System.out.println("=========================================");
                books[i].displayBookInfo();
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo book found with Accession Number " + searchAccessionNumber);
        }

        sc.close();
    }
}
