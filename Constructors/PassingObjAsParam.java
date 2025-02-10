package Constructors;
//In this example Student is examined
class Student{
    int rollno;
    Student(int rollno){
        this.rollno = rollno;
    }
    boolean equals(Student s){
        if(this.rollno == s.rollno){
            return true;
        }
        else{
            return false;
        }
    }
}
class PassingObjAsParam {
    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(10);
        Student s3 = new Student(20);
        System.out.println("s1 == s2 : "+s1.equals(s2));
        System.out.println("s1 == s2 : "+s1.equals(s3));
    }
}
