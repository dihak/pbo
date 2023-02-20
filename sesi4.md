# Sesi 4

Buatlah masing-masing 3 kode program menggunakan sintaks pemrograman JAVA yang menerapkan polimorfisme yaitu overloading dan overriding dengan permasalahan bebas, jangan sampai ada yang sama satu dengan yang lain.

Jawaban:

### Kode Program 1: Overloading

``` java
public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1, 2, 3));
        System.out.println(calculator.add(1.5, 2.5));
    }
}
```

### Kode Program 2: Overriding

```java
public class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.makeSound();
        animal2.makeSound();
    }
}
```

### Kode Program 3: Overloading dan Overriding

```java
public class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    public void draw(int diameter) {
        System.out.println("Drawing a circle with diameter " + diameter);
    }
}

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void draw(int width, int height) {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        shape1.draw();
        shape2.draw();
        circle.draw();
        circle.draw(10);
        rectangle.draw();
        rectangle.draw(5, 7);
    }
}

```

