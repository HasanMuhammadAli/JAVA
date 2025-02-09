class Student{
    int rollno;
    Student(int rollno){
        this.rollno = rollno;
    }
    private void getRollno(){
        System.out.println("Rollno = "+rollno);
    }
    public void display(){
        this.getRollno();
        System.out.println();
    }
}

class ThisDemo{
    public static void main(String[] args) {
        Student s1 = new Student(7042);
        Student s2 = new Student(18);
        //s1.getRollno(); this causes error as the getRollno is private method
        s1.display(); // but this works as a method of that class can access private method of that class

        s2.display();
    }
}