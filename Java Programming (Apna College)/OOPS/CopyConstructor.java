public class CopyConstructor {
    public static void main(String args[]){
    Student s1 = new Student();
    s1.name = "Himanshu yadav";
    s1.Roll = 8;
    s1.password = "ABCD";
    s1.marks[0] = 100;
    s1.marks[1] = 80;
    s1.marks[2] = 90;
    Student s2 = new Student(s1);// we already copied of s1
   s1.marks[2] = 100;
    
    for(int i = 0; i<3;i++){
        System.out.println(s2.marks[i]);
}
    }
}
class Student{
    String name ;
    int Roll;
    String password;
    int marks[];

    
    // Student(Student s1){    // this is Shallow Copy Constructor
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.Roll = s1.Roll;
    //     this.marks = s1.marks;
    // }



    // Deep Copy constructor
    Student(Student s1){    
            marks = new int[3];
            this.name = s1.name;
            this.Roll = s1.Roll;
            for(int i = 0; i<marks.length;i++){
            this.marks[i] = s1.marks[i];
            }
        }
    Student(){
       marks = new int[3];
        System.out.println("Hello Wolrd");
    }

}
