class Lib {
        String objType;
        String objName;
        static String libLocation = "Midfield St.";

// Assign values using constructor
public Lib(String type, String name) {
        this.objType = type;
        this.objName = name;
        }

// private method
private String getObjName() {
        return this.objName;
        }

// Inner class
 class Book {
    String description;

    void printLibraryLocation(){
        System.out.println("Library location:" + libLocation);
    }

    void setDescription() {
        if(Lib.this.objType.equals("book")) {
            if(Lib.this.getObjName().equals("nonfiction")) {
                this.description = "Factual stories/accounts based on true events";
            } else {
                this.description = "Literature that is imaginary.";
            }
        } else {
            this.description = "Not a book!";
        }
    }
    String getDescription() {
        return this.description;
    }
}
}

public class Main {
    public static void main(String[] args) {

        Lib fiction = new Lib("book", "fiction");
        Lib.Book book1 = fiction.new Book();

        Lib nonFiction = new Lib("book", "non fiction");
        Lib.Book book2 = nonFiction.new Book();

        book1.setDescription();
        book2.setDescription();

        System.out.println(book1.getDescription());
        System.out.println(book2.getDescription());


    }
}
