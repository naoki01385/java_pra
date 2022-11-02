import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Hero h1=new Hero("斉藤");
        Hero h2=new Hero("鈴木");
        Map<Hero,Integer>heros=new HashMap<Hero,Integer>();
        heros.put(h1,4);
        heros.put(h2,10);
        for (Hero key:heros.keySet()){
            int value =heros.get(key);
            System.out.println(key.getName()+"が倒した数="+value);
        }
    }
}
