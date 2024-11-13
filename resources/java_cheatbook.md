# Java Cheatbook

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

### Arrays

#### Array-Erstellung
```java
int[] numbers = {1, 2, 3, 4, 5};          // Initialisierung mit Werten
String[] names = new String[3];           // Array mit Länge 3 (Standardwerte null)
```
#### Zugriff auf Elemente
```java
int first = numbers[0];                   // Erstes Element
numbers[2] = 10;                          // Wert ändern
int length = numbers.length;              // Array-Länge
```

#### Nützliche Methoden und Operationen
```java
//Schleifen über Arrays
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Erweiterte For-Schleife
for (int number : numbers) {
    System.out.println(number);
}

// Arrays sortieren
import java.util.Arrays;
int[] arr = {5, 2, 8, 3};
Arrays.sort(arr);                         // Sortiert Array aufsteigend

// Arrays in Zeichenketten umwandeln
String arrayStr = Arrays.toString(arr);   // "[5, 2, 8, 3]"

//Arrays füllen
int[] filledArray = new int[5];
Arrays.fill(filledArray, 1);              // Setzt alle Elemente auf 1

//Kopieren von Arrays
int[] copiedArray = Arrays.copyOf(arr, arr.length);   // Vollständige Kopie
int[] partialCopy = Arrays.copyOfRange(arr, 1, 3);    // Teilkopie
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

### Fehlerbehandlung
```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("This block always executes");
}
```

---

### Sammelklassen (Collections)

#### Listen
```java
import java.util.ArrayList;
List<String> list = new ArrayList<>();
list.add("Alice");
list.get(0); // Zugriff
list.size(); // Größe
```

#### Maps
```java
import java.util.HashMap;
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 25);
map.get("Alice"); // Zugriff
```

#### Set
```java
import java.util.HashSet;
Set<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
```

---

_Feel free to enhance this collection by submitting a PR at anytime!_