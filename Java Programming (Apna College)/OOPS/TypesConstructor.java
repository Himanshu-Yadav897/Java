// This concept is Called Constructor Overloading in which object can suitable Constructor by themselves
public class TypesConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Himanshu");
    }
}
class Student{
    String name;
    Student(){ // Non-Parameterized Constructor
        System.out.println("Hello World");
    }
    Student(String name){ // Parameterized Constructor
        this.name = name;
    }
}