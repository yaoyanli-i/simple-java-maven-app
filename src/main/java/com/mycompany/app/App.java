package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World and testing webhook!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
