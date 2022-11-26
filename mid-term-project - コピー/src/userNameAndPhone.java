//package userInfo;
import java.util.Scanner;


public class userNameAndPhone {

  
    String scName;
    int scPhone;
  
    public userNameAndPhone(){
       
    };
    public userNameAndPhone(String nameAndPhone){
       this.scName = nameAndPhone;
    };

    

    public String getScName(){
        return scName;
    }
        public void setScName(String scName){
             this.scName = scName;
        }
    // PhoneNumberのゲッターセッターはひとまず省略    

    
   
    public void enterNameAndPhone(){

Scanner scName = new Scanner(System.in);
Scanner scPhone = new Scanner(System.in);
boolean repeat = true;




    System.out.println ("Please Enter your name and Phone number");
    System.out.println ("Your name : " );
    String userName = scName.nextLine();
    while(repeat){
    try{ 
        System.out.println("Your phone number : ");
        int userPhone = scPhone.nextInt();
        System.out.println("Thank you for taking your time!");
        System.out.println("");
        repeat = false;

}catch(Exception e){
    System.out.println("Please Enter ONLY numbers! ");
    scPhone.next();
    repeat = true;
}
}


   

 }


 public String getenterNameAndPhone(){
    return this.scName;
 }
}

