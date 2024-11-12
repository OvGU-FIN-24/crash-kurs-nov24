# Java Cheatsheet

## Inhaltsverzeichnis
- [Grundlegende Syntax](#grundlegende-syntax)
- [Variablen & Datentypen](#variablen--datentypen)
- [Operatoren](#operatoren)
- [Kontrollstrukturen](#kontrollstrukturen)
- [Methoden](#methoden)
- [Klassen & Objekte](#klassen--objekte)
- [Strings](#strings)
- [Wichtige Klassen](#wichtige-klassen)
- [Fehlerbehandlung](#fehlerbehandlung)
- [Sammelklassen (Collections)](#sammelklassen-collections)
- [Streams & Lambda](#streams--lambda)

---

### Grundlegende Syntax

```java
// Kommentar
/* Mehrzeiliger Kommentar */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Variablen & Datentypen
```java
// Primitive Typen
int age = 30;
double price = 19.99;
boolean isActive = true;
char initial = 'A';

// Wrapper Klassen
Integer num = 5; // int -> Integer
Double priceObj = 19.99; // double -> Double

// Typumwandlung
int rounded = (int) 19.99; // explizit
double numDouble = 5;      // implizit
```

---

### Operatoren
```java
// Mathematische Operatoren
+ - * / % // Addition, Subtraktion, Multiplikation, Division, Modulo

// Vergleichsoperatoren
== != < > <= >=

// Logische Operatoren
&& || !  // Und, Oder, Nicht
```

---

### Kontrollstrukturen

#### If-Else
```java
if (x > 0) {
    System.out.println("Positive");
} else if (x == 0) {
    System.out.println("Zero");
} else {
    System.out.println("Negative");
}
```

#### Switch (ab Java 14 mit yield)
```java
switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    default -> "Invalid day";
}
```

#### Schleifen
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

while (condition) {
    // do something
}

do {
    // do something
} while (condition);

for (int val : values ) {

}
```

--- 

### Methoden
```java
// Definition einer Methode
public static int add(int a, int b) {
    return a + b;
}

// Aufruf
int result = add(5, 10);
```

#### Überladen (Method Overloading)
```java
public int add(int a, int b) {...}
public double add(double a, double b) {...}
```

---

### Klassen & Objekte
```java
public class Person {
    // Attribute
    private String name;
    private int age;

    // Konstruktor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methode
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

// Objekt erstellen
Person p = new Person("Alice", 25);
p.sayHello();
```

#### Vererbung
```java
public class Employee extends Person {
    private double salary;
    
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
}
```

---

### Strings

#### Grundlagen
```java
String text = "Hello";
int len = text.length();
String upper = text.toUpperCase();
```
#### Formatierung
```java
String name = "Alice";
int age = 30;
String formatted = String.format("Name: %s, Age: %d", name, age);
```

#### Wichtige Methoden
```java
text.contains("el");
text.startsWith("He");
text.endsWith("lo");
text.replace("e", "a");
text.split(",");
```

---

### Wichtige Klassen

### Math
```java
Math.max(5, 10);
Math.sqrt(16);
Math.abs(-10);
Math.random(); // [0.0 , 1.0)
```

#### LocalDate und LocalDateTime
```java
import java.time.LocalDate;
import java.time.LocalDateTime;

LocalDate date = LocalDate.now();
LocalDateTime dateTime = LocalDateTime.now();
```

---


_Feel free to enhance this collection by submitting a PR_