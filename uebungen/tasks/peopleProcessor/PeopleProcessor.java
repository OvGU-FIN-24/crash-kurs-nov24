package uebungen.tasks.peopleProcessor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void increaseAge() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return firstName + "," + lastName + "," + age;
    }
}

public class PeopleProcessor {

    private final static String DELIMITER = ";";
    private static final String ABS_PATH_PREFIX = "/Users/abc/Documents/repos/crash-kurs-nov24/uebungen/tasks/peopleProcessor/res/"; 

    public static List<Person> readPeopleFromCsv(String filePath) {
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(DELIMITER);
                String firstName = data[0];
                String lastName = data[1];
                int age = Integer.parseInt(data[2]);
                people.add(new Person(firstName, lastName, age));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    public static void writePeopleToCsv(List<Person> people, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("FirstName,LastName,Age\n");
            for (Person person : people) {
                bw.write(person.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        List<Person> people = readPeopleFromCsv(ABS_PATH_PREFIX + "people.csv");
        for (Person person : people) {
            person.increaseAge();
        }
        writePeopleToCsv(people, ABS_PATH_PREFIX + "people_updated.csv");
    }
}
