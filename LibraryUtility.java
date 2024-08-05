package test;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryUtility {
    private static String[] bookTitles = new String[100];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Utility Menu:");
            System.out.println("1. Add a Book Title");
            System.out.println("2. Remove a Book Title");
            System.out.println("3. Search for a Book Title");
            System.out.println("4. List All Book Titles");
            System.out.println("5. Sort Book Titles");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title to add: ");
                    String titleToAdd = scanner.nextLine();
                    addBookTitle(titleToAdd);
                    break;
                case 2:
                    System.out.print("Enter book title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    removeBookTitle(titleToRemove);
                    break;
                case 3:
                    System.out.print("Enter book title to search: ");
                    String titleToSearch = scanner.nextLine();
                    searchBookTitle(titleToSearch);
                    break;
                case 4:
                    listAllBookTitles();
                    break;
                case 5:
                    sortBookTitles();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }

    public static void addBookTitle(String title) {
        if (count < bookTitles.length) {
            bookTitles[count] = title;
            count++;
            System.out.println("Book title added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more titles.");
        }
    }

    public static void removeBookTitle(String title) {
        int index = findIndex(title);
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                bookTitles[i] = bookTitles[i + 1];
            }
            bookTitles[count - 1] = null;
            count--;
            System.out.println("Book title removed successfully.");
        } else {
            System.out.println("Book title not found.");
        }
    }

    public static void searchBookTitle(String title) {
        int index = findIndex(title);
        if (index != -1) {
            System.out.println("Book title found at index: " + index);
        } else {
            System.out.println("Book title not found.");
        }
    }

    public static void listAllBookTitles() {
        System.out.println("Listing all book titles:");
        for (int i = 0; i < count; i++) {
            System.out.println(bookTitles[i]);
        }
    }

    public static void sortBookTitles() {
        Arrays.sort(bookTitles, 0, count);
        System.out.println("Book titles sorted alphabetically.");
    }

    private static int findIndex(String title) {
        for (int i = 0; i < count; i++) {
            if (bookTitles[i].equals(title)) {
                return i;
            }
        }
        return -1;
    }
}
