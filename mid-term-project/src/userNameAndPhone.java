import java.util.Scanner;

public class userNameAndPhone {
    String scName;
    int scPhone;
  
    private void userNameAndPhone(){
       
    };

        // Getter
    public String getuserNameAndPhone() {
        return this.scName;//何を返したらよいかわからない
        
    }

    // Setter
    public String setuserNameAndPhone() {
       // this. = _booklist;//何をかえしたらよいかわからない

   
    public void enterNameAndPhone(){
//try{}
Scanner scName = new Scanner(System.in);
Scanner scPhone = new Scanner(System.in);
    System.out.println ("Please Enter your name and Phone number");
    System.out.println ("Your name : " );
    String userName = scName.nextLine();//なぜエラーがでているかわからない。
    System.out.println("Your phone number : ");
    String userPhone = scPhone.nextLine();//なぜエラーがでているかわからない。
//hopefully, I'd like to add custom error like, if the person entre more than 10 numbers, it gives an error.
    System.out.println("Thank you for taking your time!\r\nNow you can choose any book you want to borrow!\r\n*******************");

 }
 
 public String getenterNameAndPhone(){
    return this.scName;
 }
}

