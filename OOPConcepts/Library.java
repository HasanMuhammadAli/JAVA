package OOPConcepts;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    void displayInfo(){
        System.out.println("Title: "+ title +", Author: "+ author);
    }
}
class EBook extends Book{
    double fileSize;

    EBook(String title, String author, double fileSize){
        super(title, author);//Calling parent class constructor
        this.fileSize = fileSize; 
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("File Size: " + fileSize + " MB");
    }
}
class Library{
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Basics", "James Gosling", 2.5);
        ebook.displayInfo();
    }
}
