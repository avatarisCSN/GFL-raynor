package prototype2;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    public static Map<String, Cloner> accountCacheMap =
            new HashMap<>();
    static{
        Cloner imba = new Imbalance();
        imba.setName("Sven");
        Cloner weak = new Useless();
        accountCacheMap.put("IMBA", imba);
        accountCacheMap.put("NOOB", weak);
    }
}
