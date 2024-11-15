package Encapsulation.Inheritance;

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name  = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Rishabh");
        student.setAge(23);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}