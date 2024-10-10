package com.library;

import java.util.Scanner;

public class NeighborhoodLibrary {
    private static final Book[] inventory = new Book[20];

    public static void main(String[] args) {
        initializeBooks();
        showHomeScreen();
    }

    private static void initializeBooks() {
        inventory[0] = new Book(1, "978-1-84724-374-2", "Kafka on the Shore");
        inventory[1] = new Book(2, "978-0-099-52799-7", "Norwegian Wood");
        inventory[2] = new Book(3, "978-1-84724-683-4", "1Q84");
        inventory[3] = new Book(4, "978-1-78022-370-2", "The Wind-Up Bird Chronicle");
        inventory[4] = new Book(5, "978-1-84724-374-2", "After Dark");
        inventory[5] = new Book(6, "978-1-84724-601-8", "The Elephant Vanishes");
        inventory[6] = new Book(7, "978-0-099-51559-4", "Colorless Tsukuru Tazaki and His Years of Pilgrimage");
        inventory[7] = new Book(8, "978-1-84724-604-9", "The Strange Library");
        inventory[8] = new Book(9, "978-1-84724-682-7", "Men Without Women");
        inventory[9] = new Book(10, "978-1-84724-683-4", "Wind/Pinball: Two Novels");
        inventory[10] = new Book(11, "978-0-099-52700-2", "Hear the Wind Sing");
        inventory[11] = new Book(12, "978-1-84724-675-5", "Dance Dance Dance");
        inventory[12] = new Book(13, "978-0-099-51559-4", "A Wild Sheep Chase");
        inventory[13] = new Book(14, "978-1-84724-674-8", "The Boring World of Tasks");
        inventory[14] = new Book(15, "978-1-84724-682-7", "Killing Commendatore");
        inventory[15] = new Book(16, "978-0-099-52701-9", "The Wind-Up Bird and Tuesday's Women");
        inventory[16] = new Book(17, "978-0-099-52989-1", "The Second Bakery Attack");
        inventory[17] = new Book(18, "978-0-099-52702-6", "On Seeing the 100% Perfect Girl One Beautiful April Morning");
        inventory[18] = new Book(19, "978-1-84724-377-3", "The Somnambulist and the Detective");
        inventory[19] = new Book(20, "978-0-099-52703-3", "Sputnick Sweetheart");
        int bookCount = 20;
    }
    private static void showHomeScreen() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    showAvailableBooks(scanner);
                    break;
                case 2:
                    showCheckedOutBooks(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
    private static void showAvailableBooks(Scanner scanner) {
        System.out.println("Available Books:");
        for (Book book : inventory) {
            if (book != null && !book.isCheckedOut()) {
                System.out.printf("ID: %d, ISBN: %s, Title: %s%n", book.getId(), book.getIsbn(), book.getTitle());
            }
        }
        System.out.print("Select a book ID to check out or 0 to go back: ");
        int bookId = scanner.nextInt();
        if (bookId > 0) {
            System.out.print("Enter your name: ");
            String name = scanner.next();
            for (Book book : inventory) {
                if (book != null && book.getId() == bookId) {
                    book.checkOut(name);
                    System.out.println("Book checked out successfully!");
                    return;
                }
            }
        }
    }

    private static void showCheckedOutBooks(Scanner scanner) {
        System.out.println("Checked Out Books:");
        for (Book book : inventory) {
            if (book != null && book.isCheckedOut()) {
                System.out.printf("ID: %d, ISBN: %s, Title: %s, Checked Out To: %s%n",
                        book.getId(), book.getIsbn(), book.getTitle(), book.getCheckedOutTo());
            }
        }
        System.out.print("Enter 'C' to check in a book or 'X' to go back: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("C")) {
            System.out.print("Enter the book ID to check in: ");
            int bookId = scanner.nextInt();
            for (Book book : inventory) {
                if (book != null && book.getId() == bookId) {
                    book.checkIn();
                    System.out.println("Book checked in successfully!");
                    return;
                }
            }
        }
    }
}