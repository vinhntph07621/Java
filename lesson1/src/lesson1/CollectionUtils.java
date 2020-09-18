package lesson1;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {
    public static <T> boolean isEmpty(Collection<T> list) {
        return list == null || list.size() == 0;
    }

    public static <K, V> boolean isMapEmpty(Map<K, V> map) {
        return map.size() == 0;
    }
}
