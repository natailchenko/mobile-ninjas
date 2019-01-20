package firsthw;

public class Runner {
    public static void main(String[] args) {
        Role role1= new Role();
        User user1= new User();
        role1.setIsSuperUser ("yes");
        role1.setValue ("admin");
        user1.setName ("Nataliia");
        user1.setAge(28);
        role1.getIsSuperUser ();
        role1.getValue ();
        user1.getName ();
        user1.getAge();


        System.out.println( "User "+ user1.getName () + " is "+ role1.getValue () +". She/he is " +user1.getAge()
        +" years old. " +"Is she/he Superuser? - "+role1.getIsSuperUser ()+ "!");

        Role role2= new Role();
        User user2= new User();
        role2.setIsSuperUser ("no");
        role2.setValue ("merchant");
        user2.setName ("Oleksandr");
        user2.setAge(28);
        role2.getIsSuperUser ();
        role2.getValue ();
        user2.getName ();
        user2.getAge();

        System.out.println( "User "+ user2.getName () + " is "+ role2.getValue () +". She/he is " +user2.getAge()
                +" years old. " +"Is she/he Superuser? - "+role2.getIsSuperUser ()+ "!");
    }
}
