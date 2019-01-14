import javax.jws.soap.SOAPBinding;

/**
 * Created by user on 14.01.2019.
 */
public class User {
    private String name = "Nataliia";
    public static String role = "QA";
    public User (){

    }
    public  User  (String name) {
        this.name = name;
    }

    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public static String changeRole (){
       role = "SDET";
       return role;

    }

}
