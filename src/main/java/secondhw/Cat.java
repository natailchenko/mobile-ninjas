package secondhw;
import java.util.*;

public class Cat {
    public static void main(String[] args) {


        HashMap<String, String> myhashMap = new HashMap<String, String>();
        myhashMap.put("Cat1","мурка");
        myhashMap.put("Cat2","васька");
        myhashMap.put("Cat3","кузя");
        myhashMap.put("Cat4","жужа");
        myhashMap.put("Cat5","лелик");
        myhashMap.put("Cat6","кокс");
        myhashMap.put("Cat7","степа");
        myhashMap.put("Cat8","машка");
        myhashMap.put("Cat9","дашка");
        myhashMap.put("Cat10","люська");

        Set entrySet = myhashMap.entrySet();
        Iterator it = entrySet.iterator();

        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey() + ": " +me.getValue());
        }
    }
}