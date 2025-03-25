package ExceptionHandling;

// A Class that represents user-defined exception
class MyException extends Exception {
    String str;
    public MyException(String str) {
        this.str = str;
    }
    public String toString(){
       return "MyException: "+str;
    }
}

// A Class that uses the above MyException
class Ex09 {
    public static void main(String args[]) {
        try {
            // Throw an object of user-defined exception
            throw new MyException("This is a custom exception");  
        }
        catch (MyException ex) {
            System.out.println(ex);  
        }
    }
}