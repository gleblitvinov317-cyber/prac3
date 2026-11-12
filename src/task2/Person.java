package task1;

import java.util.Objects;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private Scanner sc;

    public Person(Scanner sc) {
        this.sc = sc;
    }

    public Person(Scanner sc, String name, int age) {
        this.name = name;
        this.age = age;
        this.sc = sc;
    }
    public void setAttributes(){
        System.out.println("Введите имя");
        name = sc.nextLine();
        System.out.println("Введите возраст");
        age = sc.nextInt();
        sc.nextLine();
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Имя: " + name + " возраст: " + age;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Person)) return false;
        Person p = (Person) o;
        return Integer.compare(p.getAge(), getAge()) == 0 && p.getName().equals(getName());
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
}
