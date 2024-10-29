public class StaticKeyword {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.SchoolName = "HM";
        System.out.println(s1.SchoolName);
        Student s2 = new Student();
        s2.SchoolName = "HY";
        System.out.println(s2.SchoolName);
    }
}
class Student{
    String name;
    int Roll;
    static String SchoolName;

    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }
}
