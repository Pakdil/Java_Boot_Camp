package day01;

class Employee {

    private String name;  // if private use getters and setters, if public no need
    private double salary;

    private char gender;

    public String getName() {
        if (name==null) {
           // return "Unknown";
            throw new RuntimeException("Name has not been set");
        } // name can be ready through the getter, as long as
        return name;
    }

    public void setName (String name) {
        if (name==null) {
            throw new RuntimeException("Name can not be set to null");
        }
        if (name.isEmpty()) {
            throw new RuntimeException("Name can not be empty");
        }
        this.name=name;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0) {
            throw new RuntimeException("Salary can not be set to zero or negative");
        }
        this.salary=salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

public class EncapsulationReview {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("John");

        System.out.println(employee1.getName());

//        System.out.println(employee1.name);
//        employee1.salary = -100000;
//        System.out.println(employee1.salary);

       employee1.setSalary(100000);
        System.out.println(employee1.getSalary());

      employee1.setGender('M');
        System.out.println(employee1.getGender());
    }


}
