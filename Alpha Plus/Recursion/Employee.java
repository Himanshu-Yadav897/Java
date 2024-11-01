abstract class Employee {
    abstract void setSalary(int salary);

    abstract int getSalary();

    abstract void setGrade(String grade);

    abstract String getGrade();
 
    void label() {
        System.out.println(" Engineer's data: \n ");
    }
}

class Engineer extends Employee {

    private int salary;
    private String grade;

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getSalary() {
        return this.salary;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }

    String getGrade() {
        return this.grade;
    }
}

class Manager extends Employee {

    private int salary;
    private String grade;

    void setSalary(int salary) {
        salary = this.salary;
    }

    int getSalary() {
        return this.salary;
    }

    void setGrade(String grade) {
        grade = this.grade;
    }

    String getGrade() {
        return this.grade;
    }
}
