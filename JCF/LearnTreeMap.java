import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        
        @SuppressWarnings({ "unchecked", "rawtypes" })
        Map<String, Integer> map = new TreeMap();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        map.putIfAbsent("Two", 23);

        System.out.println(map);

        System.out.println(map.containsKey("Two"));
        System.out.println(map.containsValue(4));

        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());   
        }

        System.out.println(map.get("Three"));
        map.remove("Three");

        System.out.println(map);

        for(String key : map.keySet())
        {
            System.out.println(key);
        }

        for(Integer value : map.values())
        {
            System.out.println(value);
        }
    }
}
