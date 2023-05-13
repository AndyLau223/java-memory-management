package memory.management.example;

/**
 * This sample showcase where escaping reference happens, and the way to handle it is called "defensive copying" or deep copy.
 * Because Java uses call-by-value, which means a copy is made of the argument passed or returned. Depending
 * on whether the argument is a primitive or reference, it can have major implications. If it's a copy of a
 * reference to a mutable type, then the calling code can change your supposedly "private" data. This is not proper encapsulation.
 */
class Person {
    private StringBuilder name ;

    Person(StringBuilder name) {
//        defensive copying, also can be called deep copy
        this.name = new StringBuilder(name.toString());
    }

    public StringBuilder getName(){
//        defensive copying
        return new StringBuilder(name.toString());
    }
}
public class EscapingReferences {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Dan");
        Person person = new Person(sb);
        sb.append("Dan");
        System.out.println(person.getName()); // Dan

        StringBuilder sb2 = person.getName();
        sb2.append("Dan");
        System.out.println(person.getName());// Dan

    }
}
