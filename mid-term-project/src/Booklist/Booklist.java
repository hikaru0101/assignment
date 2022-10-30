package Booklist;
import java.util.ArrayList;

public class Booklist {
    
    private ArrayList<String> bookList = new ArrayList<>();// made this as an object
    private String bookRemoved;
// constructor, getter and setters 
public Booklist(ArrayList<String>  _booklist){
  this.bookList = _booklist;
}

  // Getter
  public ArrayList<String>  getBookList() {
    return this.bookList;
  }
  
  // Setter
  public void setColor(ArrayList<String>  _booklist) {
    this.bookList = _booklist;
  }


    public void getBookIntoTheList(){

        bookList.add("Harry Potter");
        bookList.add("Norwegian woods");
        bookList.add("The history of coffee");
        bookList.add("Japanese culture");
        bookList.add("The twelve rules of life");
        bookList.add("Manual of Java script ");
        bookList.add("Canadian life");
        bookList.add("Psychrogy of science");
        bookList.add("Japanese language");
        bookList.add("Dictionary");
        
        System.out.println(bookList);
    }

    public void removeBook( ){
        bookList.remove( bookRemoved );
        System.out.println(bookRemoved);
    }

    


    
}
