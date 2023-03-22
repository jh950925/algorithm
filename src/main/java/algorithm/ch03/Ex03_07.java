package algorithm.ch03;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Ex03_07 {
    public static final Comparator COMPARATOR = new Comp();

    private static class Comp implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
