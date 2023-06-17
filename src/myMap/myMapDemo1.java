package myMap;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Map的常用功能：
 * 		映射功能：
 * 			 	V put(K key, V value)
 * 		获取功能：
 * 				V get(Object key)
 * 				int size()
 * 		判断功能：
 * 				boolean containsKey(Object key)
 				boolean containsValue(Object value)
 				boolean isEmpty()
 * 		删除功能：
 * 				void clear()
 * 				V remove(Object key)
 * 		遍历功能：
 * 				Set<Map.Entry<K,V>> entrySet()
 * 			Set<K> keySet()
 * 			Collection<V> values()
 */
public class myMapDemo1 {
    public static void main(String[] args) {
//创建Map对象
        Map<String,String> map = new HashMap<String,String>();
//        put(K key,V value) 将key映射到value，如果key存在，则覆盖value，并将原来的value返回
        System.out.println(map);
        System.out.println(map.put("s001","张三"));
        System.out.println(map);
        map.clear();
    }
}
