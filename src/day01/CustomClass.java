package day01;


class Person {

    public String name; // if static, all only have one copy, all outputs are same

    public Person (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


}


public class CustomClass {

    public static void main(String[] args) {

        Person person1 = new Person("Cydeo");
        //  person1.name = "Cydeo";

        Person person2 = new Person("Java");
        // person2.name = "Java";

        Person person3 = new Person("Selenium");
        //  person3.name = "Selenium";

//        System.out.println(person1.name);   // if Constructor is static: output: Selenium
//        System.out.println(person2.name);  // output: Selenium
//        System.out.println(person3.name);  // output: Selenium, if declare the constructor as static, only have on copy.

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

}
