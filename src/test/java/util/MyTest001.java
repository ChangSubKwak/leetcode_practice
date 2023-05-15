package util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MyTest001 {
    @Test
    void test() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 2);
        map.put(3, 0);
        map.put(4, 3);
        System.out.println("map = " + map);

        map.remove(2, 2);
        System.out.println("map = " + map);
    }
}
