public class Constructor {
    public static void main(String args[]){
        Student s1 = new Student("Himanshu");
        System.out.println(s1.name);

    }
}
class Student{
    String name;
    int Roll;
    Student(String name){
        System.out.println("My name is Himanshu Yadav");
        this.name = name;
    }
}
