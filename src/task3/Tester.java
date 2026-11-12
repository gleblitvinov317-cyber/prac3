package task1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cartoteca ca = new Cartoteca();
        Menu.mainMenu();
        int state = sc.nextInt();
        sc.nextLine();
        while (state != 0){
            switch (state){
                case 1:
                    Person p = new Person(sc);
                    p.setAttributes();
                    ca.add(p);
                    break;
                case 2:
                    Person person = new Person(sc);
                    person.setAttributes();
                    ca.del(person);
                    break;
                case 3:
                    System.out.println("Введите id");
                    int i = sc.nextInt();
                    System.out.println(ca.find(i));
                    break;
                case 4:
                    ca.clear();
                    break;
                case 5:
                    System.out.println(ca.isEmpty());
                    break;
                case 6:
                    System.out.println(ca);
                    break;
                default:
                    System.out.println("Введён некорректное число");
                    break;
            }
            Menu.mainMenu();
            state = sc.nextInt();
            sc.nextLine();
        }
    }
}
