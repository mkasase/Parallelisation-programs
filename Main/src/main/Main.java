/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author up744652
 */
import java.io.*;   	// you need this for the I/O
import java.util.Scanner;  	// you need this for the Scanner class
public class Main {

    public Main() {    /* Creates a new instance of Main */

    }
    static Scanner console = new Scanner(System.in);  //object of Scanner class

    public static void main(String[] args) throws IOException {
        String sName, again;
        Student[] stud = new Student[10];  // array of 10 students, change it with array list later
        int i, num = 0;
        boolean answer;
        int[] sScore = new int[3];       // array of three int marks
        
        do {
            System.out.println("\n Enter student first and last name, separated by space.");
            sName = console.nextLine();  //returns (the rest of) the current input line
            System.out.println("\n Enter three marks separated by spaces. ");
            for (i = 0; i < sScore.length; i++) {
                sScore[i] = console.nextInt();  	// scans the next token as an int
            }
            console.nextLine(); 		 // to clear the rest of the current line
            // create an object of class Student
            stud[num] = new Student(sName, sScore);
            System.out.println("\n Another student (y/n)?");
            again = console.nextLine();         // this will get your answer to the above query
            answer = false;    	// Boolean variable for the interactive input
            if (again.charAt(0) == 'y') {
                answer = true; 	 // if data for another student is going to be entered
                num++;   			// increase the number of students 
            }
        } while (answer);
        Course cm = new Course("Computing", "CMP06");
        // cm - first instance of class Course
        for (i = 0; i < num / 2; i++) {
            cm.addStudent(stud[i]);
        }
        double cmAver = cm.averageSc();    // get the average score for cm
        int cmNumbers = cm.getNumStud();  // get the number of students in cm
        
        cmAver += sScore[i];
 
        System.out.println("\ncourse name: " + cm.getName());  // outputs course name
        System.out.println("\t average = " + cmAver);     // outputs course average score
        System.out.println("\t number of stud  = " + cmNumbers); // number of students in the course
        for (i = 0; i < cmNumbers; i++) {
            System.out.println("\t " + cm.list[i].getName());   // outputs the studentsâ€™ names
        }
        Course cs = new Course("Computer Science", "CS06"); // cs - second instance of class Course
        for (i = num / 2; i < num; i++) // second half of the students will be added to cs
        {
            cs.addStudent(stud[i]);
        }
        System.out.println("\n course name: " + cs.getName());
        System.out.println("\t average = " + cs.averageSc());
        System.out.print("\t number of stud  = " + cs.getNumStud());
    }
}
