package section1.type;

import section1.variable.Person;

public class Type {

    public static void main(String[] args) {
    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
