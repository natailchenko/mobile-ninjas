import javax.jws.soap.SOAPBinding;

/**
 * Created by user on 14.01.2019.
 */
public class FirstClass {
    public static void main(String [] args){
       User user = new User("Vasya");
       User secondUser = new User();
       String string = "Changed text";
       String secondString = "Mobile-ninjas rule!";
       user.setName(string);
       secondUser.setName(secondString);
       System.out.println(user.getName());
       System.out.println(secondUser.getName());
        System.out.println(User.role);
        User.changeRole();

    }


}
