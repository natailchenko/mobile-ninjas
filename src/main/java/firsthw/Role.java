package firsthw;

public class Role<String> {
   private String isSuperUser;
   private String value;

   public void setIsSuperUser(String SuperUser){
       isSuperUser = SuperUser;

   }
    public String getIsSuperUser() {
        return isSuperUser;
    }
    public void setValue(String Value){
        value = Value;

    }
    public String getValue() {
        return value;
    }
}


