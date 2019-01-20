package firsthw;

public class Role<String> {
    private String isSuperUser;
    private String value;

   public void setIsSuperUser(String superUser){
       isSuperUser = superUser;

   }
    public String getIsSuperUser() {
        return isSuperUser;
    }
    public void setValue(String valueNew){
     value = valueNew;

    }
    public String getValue() {
        return value;
    }
}


