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
     * @return
     */
    public static boolean compare(int[] current, int len, int[] target) {
        if (current == target) {
            return true;
        }

        if (current == null || target == null) {
            return false;
        }

        if (current.length == 0 && target.length == 0) {
            return true;
        }

        if (len != target.length) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            int currentItem = current[i];
            int targetItem = target[i];
            if (currentItem != targetItem) {
                return false;
            }
        }
        return true;
    }

    public static String toString(int[] arry) {
        return toString(arry, arry == null ? -1 : arry.length);
    }

    public static String toString(int[] arry, int len) {
        if (arry == null || arry.length == 0) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{");
        boolean one = true;
        for (int data : arry) {
            if (len <= 0) {
                break;
            }
            if (!one) {
                result.append(" , ");
            } else {
                one = false;
            }
            result.append(data);
            len--;
        }
        result.append("}");
        return result.toString();
    }


    public static <T> String toString(T[] arry, Function<T, String> convert) {
        return toString(arry, arry == null ? -1 : arry.length, convert);
    }

    public static <T> String toString(T[] arry, int len, Function<T, String> convert) {
        if (arry == null || arry.length == 0) {
            return "{}";
        }

        StringBuilder result = new StringBuilder("{");
        boolean one = true;
        for (T data : arry) {
            if (len == 0) {
                break;
            }
            if (!one) {
                result.append(" , ");
            } else {
                one = false;
            }
            String v = convert.apply(data);
            result.append(v);
            len--;
        }
        result.append("}");
        return result.toString();
    }


}
