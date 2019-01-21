package secondhw.task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Cat {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>;
        hashMap.put("Cat1","мурка");
        hashMap.put("Cat2","васька");
        hashMap.put("Cat3","кузя");
        hashMap.put("Cat4","жужа");
        hashMap.put("Cat5","лелик");
        hashMap.put("Cat6","кокс");
        hashMap.put("Cat7","степа");
        hashMap.put("Cat8","машка");
        hashMap.put("Cat9","дашка");
        hashMap.put("Cat10","люська");

      Iterator it = mp.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        System.out.println(pair.getKey() + " = " + pair.getValue());
        it.remove();
    }
}
