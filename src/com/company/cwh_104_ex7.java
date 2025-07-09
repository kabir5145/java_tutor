package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cwh_104_ex7 {

    static class Book{//
        private String name;
        private String author;
        private boolean issued = false;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isIssued() {
            return issued;
        }

        public void setIssued(boolean issued) {
            this.issued = issued;
        }
    }


    public static void main(String[] args) {

        List<Book> availableBooks = new ArrayList<>();
        Book book1 = new Book();

        book1.setName("Sherlock Holmes");
        book1.setAuthor("Arthur Conan Doyle");
        availableBooks.add(book1);

        Book book2 = new Book();

        book2.setName("Rich Dad Poor Dad");
        book2.setAuthor("Baba Ji");
        availableBooks.add(book2);


        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show all Books");
            System.out.println("6. Exit");
            System.out.print("Select one option: ");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1: // Add Book
                    Scanner bookScanner = new Scanner(System.in);

                    System.out.print("Enter Book Name: "); // use print, not println
                    String bookName = bookScanner.nextLine();

                    System.out.print("Enter Author: "); // use print again
                    String author = bookScanner.nextLine();

                    Book book = new Book();
                    book.setName(bookName);
                    book.setAuthor(author);
                    availableBooks.add(book);
                    break;
                case 2: // Remove Book
                    Scanner removeBookScanner = new Scanner(System.in);

                    System.out.print("Enter Book Name: "); // use print, not println
                    String name = removeBookScanner.nextLine();
                    int bookToRemoveIndex = -1;
                    for (int i = 0; i < availableBooks.size(); i++) {
                        if (availableBooks.get(i).getName().equals(name)) {
                            bookToRemoveIndex = i;
                            break;
                        }
                    }

                    if (bookToRemoveIndex == -1) {
                        System.out.println("Book not found");
                    }else {
                        availableBooks.remove(bookToRemoveIndex);
                        System.out.println("Book removed");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Available Books:");
                    for (Book b : availableBooks) {
                        System.out.println("Name: " + b.getName());
                        System.out.println("Author: " + b.getAuthor());
                        System.out.println("Issued: " + b.isIssued());
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
