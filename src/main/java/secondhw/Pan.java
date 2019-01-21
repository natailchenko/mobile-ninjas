package secondhw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pan {
    public static void main(String[] args) {
        System.out.println("Время работы методов arrayList:");
       long time1 =  System.currentTimeMillis();
        System.out.println("Старт: "+time1);
        List<String> list = new ArrayList<String>();

        for (int i=0;i<10000; i++){
            list.add(i,"pan");
       }
        for (int i=0;i<10000; i++){
            list.get(0);
        }

        for (int i=0;i<10000; i++){
            list.remove(0);
        }

        long time2 =  System.currentTimeMillis();
        System.out.println("Окончание: "+time2);

        long time3 = time2 - time1;
        System.out.println("Продолжительность: "+time3);

        System.out.println("");
        System.out.println("Время работы методов linkedList:");
        long time4 =  System.currentTimeMillis();
        System.out.println("Старт: "+time4);
        LinkedList<String> states = new LinkedList<String>();

        for (int i=0;i<10000; i++){
            states.add(i,"pan");
        }
        for (int i=0;i<10000; i++){
            states.get(0);
        }

        for (int i=0;i<10000; i++){
            states.remove(0);
        }

        long time5 =  System.currentTimeMillis();
        System.out.println("Окончание: "+time5);

        long time6 = time5 - time4;
        System.out.println("Продолжительность: "+time6);

        if (time3>time6){
            System.out.println("arrayList is faster than linkedList");
        }else  System.out.println("linkedList  is faster than arrayList");
    }

}
