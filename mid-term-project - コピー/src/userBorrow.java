import java.util.Scanner;
import java.util.ArrayList;
import Booklist.Booklist;
//import userNameAndPhone;

public class userBorrow {

    // Scanner scName = new Scanner(System.in);
    // Scanner scPhone = new Scanner(System.in);
    // public BookList booklist = new BookList();
    // public List booklist = new ArrayList<>();

    ArrayList<String> booklist = new ArrayList<>();
    ArrayList<String> bookListBorrowedByUser = new ArrayList<>();
    Booklist libraryVancouvernewBooks = new Booklist(booklist);

    boolean firstTime = true;
    boolean repeat = true;
    boolean repeeeet = true;

    public userBorrow() {

    }

    // Getter
    public ArrayList<String> getuserBorrow() {
        return this.booklist;
    }

    // Setter
    public void setUserBorrow(ArrayList<String> _booklist) {
        this.booklist = _booklist;
    }

    public void askUser(){
        System.out.println("Choose what you want to read");

        libraryVancouvernewBooks.getBookIntoTheList();
       // System.out.println("Please enter a book title that you want to borrow : ");
      
      // while(repeat){
        System.out.println("Please enter a book title that you want to borrow : ");
     //  System.out.println(booklist);//正しいかわからない
       while(repeat){
        repeeeet = true;
         Scanner sc1 = new Scanner(System.in);
        String bookChosen = sc1.nextLine();
        if(booklist.contains(bookChosen)== true){
         bookListBorrowedByUser.add(bookChosen);
         booklist.remove(bookChosen);
        System.out.println("You borrowed "+ bookChosen);//ここでいったん切れる
        while(repeeeet){
        System.out.println("Do you want to borrow more?");
        System.out.println("Enter yes or no : ");
        Scanner sc2 = new Scanner(System.in);
       String userChoice = sc2.nextLine();

            if(userChoice.equals("yes")){
                System.out.println(booklist);//正しいかわからない
               System.out.println("Please enter a book title that you want to borrow : ");
            //     bookListBorrowedByUser.add(bookChosen);
            //     booklist.remove(bookChosen);
            //    System.out.println("You borrowed "+ bookChosen);//ここ3行足した
                repeat = true;
                repeeeet = false;
            }
            else if(userChoice.equals("no")){
             repeat = false;
             repeeeet = false;
            break;
}           else{
    System.out.println("please enter either yes or no :( ");
                repeeeet = true;

        }}}

        
        else{
            System.out.println( "We don't have "+bookChosen+" :(");
            System.out.println("Please enter correct title : ");
            repeat = true;
            repeeeet = true;
        }}
    
//     while(repeat2){
//         System.out.println("Do you want to borrow more?");
//         System.out.println("Enter yes or no : ");
//         Scanner sc2 = new Scanner(System.in);
//        String userChoice = sc2.nextLine();
//         if(userChoice.equals("yes")){ 
//     System.out.println(booklist);
//    // System.out.println("Please enter a book title that you want to borrow : ");
//         repeat2 = true;
//     }
//     else if(userChoice.equals("no")){
//         repeat2 = false;
//       //  System.out.println();
//       System.out.println("You borrowed : " + bookListBorrowedByUser);
  System.out.println("Thank you for using our library!");
  System.out.println("");
  System.out.println("This is your receipt! :)");}

    
    // else{
    //     System.out.println("Please enter yes or no ");
    //     Scanner reenter = new Scanner(System.in);
    // }

// }}catch(Exception e)//(libraryVancouvernewBooks.contains(bookChosen) !== true) リストの要素以外を入力したらエラーになるようにしたい
//     {System.out.println("Something Went Wrong Sorry./r/nPlease reenter :(");}}

    public void printReceit() {
        userNameAndPhone user3 = new userNameAndPhone();

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Name : " + user3.getenterNameAndPhone());// userNameクラスから取ってきたいけど失敗してる。
        System.out.println("");
        System.out.println("Books you borrowed : " + bookListBorrowedByUser);
        System.out.println("Due date :  Oct 31st 2022");
        System.out.println("");
        System.out.println("Thank you for using our library!");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

}
// System.out.println("You want more books?");
// System.out.println("Enter yes or no : ");
// String userChoice = sc.nextLine();

// if(userChoice == "Yes"){
// repeat = true;
// }
// else if(userChoice == "No"){
// repeat = false;

// }catch(Exception e){
// System.out.println("Something went wrong:(\r\nPlease reenteragain");
// }

// }}

// System.out.println("You borrowed "+borrowedBooks);System.out.println("You
// want more books?");System.out.println("Enter yes or no : ");

// String userChoice = sc.nextLine();

// if(userChoice=="Yes"||"yes")
// {
// repeat = true;
// }else if(userChoice==No||no)
// {
// repeat = false;
// }}catch( Exception e){
// System.out.println("Something went wrong:(\r\nPlease
// reenteragain");//ここでcatchされたら振り出しにちゃんと戻る？
// }

// while(true){
// System.out.println("Choose what do you want to read");
// System.out.println(Booklist2.bookList);//表示させ方わからない&毎回要素が減った新しいリストを代入したい
// try{
// public void borrowedBooks(){ //借りられた本のリストを作成したい

// System.out.println("Please enter a book title that you want to borrow : ");//
// Scanner sc = new Scanner(System.in);//このスキャナーのインスタンス作成は一回きりでいい？都度都度？
// String bookChosen = sc.nextLine();

// booklist.remove(bookChosen);//借りられた本をリストから削除したい

// List<Strings> borrowedBooks = new ArrayList<>();//removeされた本を新しく格納したい

// borrowedBooks.add(bookChosen);
// }

// System.out.println("You borrowed " + borrowedBooks);
// System.out.println("You want more books?");
// System.out.println("Enter yes or no : ");
// String userChoice = sc.nextLine();

// if(userChoice == "Yes" ||"yes"){
// repeat = true;
// }
// else if(userChoice == No||no){
// repeat = false;
// }

// }catch(Exception e){
// System.out.println("Something went wrong:(\r\nPlease reenter
// again");//ここでcatchされたら振り出しにちゃんと戻る？

// }

// public void enterNameAndPhone(){
// //try{}

// System.out.println ("Please Enter your name and Phone number");
// System.out.println ("Your name : ");
// String userName = scName.nextLine();//userが入力するのを待つ
// System.out.println("Your phone number : ");
// String userPhone = scPhone.nextLine();
// //hopefully, I'd like to add custom error like, if the person entre more than
// 10 numbers, it gives an error.
// System.out.println("Thank you for taking your time!\r\nNow you can choose any
// book you want to borrow!");

// }

// }
