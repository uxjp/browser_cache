package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println( "Hello World!" );
        System.out.println(person);
    }
}
