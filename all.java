// 1. Package Declaration (Optional)
// package com.myapp; 

// 2. Import Statements (To use pre-made tools)
import java.util.ArrayList; // For dynamic lists
import java.util.Scanner;   // For user input

// 3. Class Definition (Everything in Java must be inside a class)
public class LearningJava {

    // 4. Constants (Variables that never change)
    public static final double PI = 3.14159;

    // 5. The Main Method (The entry point where the program starts)
    public static void main(String[] args) {
        
        // --- DATA TYPES & VARIABLES ---
        int age = 25;                // Integer (whole number)
        double price = 19.99;        // Double (decimal number)
        char grade = 'A';            // Character (single letter)
        boolean isJavaFun = true;    // Boolean (true/false)
        String name = "DockerUser";  // String (text - this is an Object)

        // --- PRINTING TO CONSOLE ---
        System.out.println("Hello, " + name); // Printing with concatenation

        // --- CONDITIONALS (Logic) ---
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age > 12) {
            System.out.println("You are a teen.");
        } else {
            System.out.println("You are a child.");
        }

        // --- LOOPS (Repeating tasks) ---
        // For loop: repeats a specific number of times
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop: repeats as long as condition is true
        int count = 0;
        while (count < 2) {
            System.out.println("Count is: " + count);
            count++;
        }

        // --- ARRAYS & COLLECTIONS ---
        // Fixed-size array
        int[] numbers = {10, 20, 30};
        
        // Dynamic List (ArrayList) - size can change
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");

        // --- EXCEPTION HANDLING (Error Catching) ---
        try {
            int result = 10 / 0; // This will cause an error
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("This always runs.");
        }

        // --- USING OBJECTS (OOP) ---
        Car myCar = new Car("Toyota", 2022); // Creating an object
        myCar.startEngine(); // Calling a method
        
        // Static method call (No object needed)
        int sum = addNumbers(5, 10);
        System.out.println("Sum is: " + sum);
    }

    // --- METHODS (Functions) ---
    // AccessModifier Static/Non ReturnType Name(Parameters)
    public static int addNumbers(int a, int b) {
        return a + b; // Returns a value
    }
}

// 6. ANOTHER CLASS (OOP Concept)
class Car {
    // Fields (Attributes)
    String brand;
    int year;

    // Constructor (Runs when object is created)
    public Car(String b, int y) {
        this.brand = b;
        this.year = y;
    }

    // Method (Behavior)
    public void startEngine() {
        System.out.println(brand + " engine started!");
    }
}
