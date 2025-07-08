package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class cwh_104_ex7 {
    interface library{
       void book(String k);
       void author(String n);
       void issuedTo(String q);
       void issuedOn(int d);

    }
    static class name implements library{//
        @Override
        public void book(String k) {
            System.out.println(k);;
        }

        @Override
        public void author(String n) {
            System.out.println(n);
        }

        @Override
        public void issuedTo(String q) {
            System.out.println(q);
        }

        @Override
        public void issuedOn(int d) {
            System.out.println(d);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Create a library management system which is capable of  issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book author
        3. Issued to
        4. Issued on
        user should be able to add books , return issued books ,issue books
        assume that all the users are registered with their names in the central database
         */
        LocalDateTime lc = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy");
        String o = lc.format(df);
        name e = new name();
        System.out.println("Name of the book is :");
        e.book("rich dad poor dad");
        System.out.println("name of the author is:");
        String n = sc.next();
        System.out.println("Issued to :");
        String  q = sc.next();
        System.out.println("book issued on:");
        System.out.println(o);
        System.out.println("Thank you for issuing the book from us!");
    }
}
