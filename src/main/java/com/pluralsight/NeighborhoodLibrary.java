package com.library;

import java.util.Scanner;

public class LibraryApp {
    private static Book[] inventory = new Book[20];
    private static int bookCount = 0;

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
        bookCount = 20;
    }

