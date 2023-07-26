package com.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main( String[] args ) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);

        // Convert Person instance to JSON string
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(person);
            System.out.println("Person as JSON: " + jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // Parse JSON string back to a Person object
        String jsonInput = "{\"name\":\"Jane\",\"age\":25}"; // Replace with your JSON input
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Person parsedPerson = objectMapper.readValue(jsonInput, Person.class);
            System.out.println("Parsed Person: " + parsedPerson.getName() + ", " + parsedPerson.getAge());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
