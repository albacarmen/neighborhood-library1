package com.library;

import java.util.Scanner;

public class LibraryApp {
    private static Book[] inventory = new Book[20];
    private static int bookCount = 0;

    public static void main(String[] args) {
        initializeBooks();
        showHomeScreen();
    }