package secondhw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fruits {
    public static void main(String[] args) {

    Set<String> set = new HashSet<String>();
      set.add("арбуз");
      set.add("банан");
      set.add("вишня");
      set.add("груша");
      set.add("дыня");
      set.add("ежевика");
      set.add("женьшень");
      set.add("земляника");
      set.add("ирис");
      set.add("картофель");


    for (String fruit: set){
        System.out.println(fruit);
    }
    }
}
