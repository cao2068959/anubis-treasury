package org.chy.anubis.treasury.utils;

import java.util.function.Function;

public class ArrayUtils {

    /**
     * 比较两个数组中的值是否完全一致
     *
     * @param current
     * @param target
     * @param <T>
     * @return
     */
    public static <T> boolean compare(T[] current, T[] target) {
        if (current == target) {
            return true;
        }

        if (current == null || target == null) {
            return false;
        }

        if (current.length == 0 && target.length == 0) {
            return true;
        }

        if (current.length != target.length) {
            return false;
        }

        for (T currentItem : current) {
            for (T targetItem : target) {
                if (!targetItem.equals(currentItem)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 比较两个数组中的值是否完全一致
     *
     * @param current
     * @param target
     * @param <T>
     * @return
     */
    public static boolean compare(int[] current, int[] target) {
        if (current == target) {
            return true;
        }

        if (current == null || target == null) {
            return false;
        }

        if (current.length == 0 && target.length == 0) {
            return true;
        }

        if (current.length != target.length) {
            return false;
        }

        for (int i = 0; i < current.length; i++) {
            int currentItem = current[i];
            int targetItem = target[i];
            if (currentItem != targetItem) {
                return false;
            }
        }
        return true;
    }

    public static String toString(int[] arry) {
        if (arry == null || arry.length == 0) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{");
        boolean one = true;
        for (int data : arry) {
            if (!one) {
                result.append(" , ");
            } else {
                one = false;
            }
            result.append(data);
        }
        result.append("}");
        return result.toString();
    }

    public static <T> String toString(T[] arry, Function<T, String> convert) {
        if (arry == null || arry.length == 0) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{");
        boolean one = true;
        for (T data : arry) {
            if (!one) {
                result.append(" , ");
            } else {
                one = false;
            }
            String v = convert.apply(data);
            result.append(v);
        }
        result.append("}");
        return result.toString();
    }
}
