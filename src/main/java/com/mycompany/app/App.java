package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello Jenkins to Ram Ganesh N and Jenkins for Poll SCM. Nice commit message.";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
