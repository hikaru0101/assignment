import java.util.ArrayList;

import Booklist.Booklist;
//import userInfo.userNameAndPhone;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Library!");

        userNameAndPhone user1 = new userNameAndPhone();
        user1.enterNameAndPhone();
        ArrayList<String> _booklist = new ArrayList<>();
        Booklist libraryVancouvernewBooks = new Booklist(_booklist);

        


       // userNameAndPhone newUser = new userNameAndPhone();

       // newUser.enterNameAndPhone();

      //  libraryVancouvernewBooks.getBookIntoTheList();　見づらいのでコメントアウトした

        userBorrow user2 = new userBorrow();
        user2.askUser();    
        user2.printReceit();
        

        
        
        //     System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    // System.out.println(borrowedBookList);
    // System.out.println("Enjoy our books "+ userName + "!");
    // System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    // System.out.println();
    // System.out.println("Thank you for choosing our library!:)");
    }
}
