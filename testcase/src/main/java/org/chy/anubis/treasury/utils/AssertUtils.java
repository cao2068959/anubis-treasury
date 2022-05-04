package org.chy.anubis.treasury.utils;

import org.chy.anubis.treasury.log.Logger;

import java.util.Arrays;

public class AssertUtils {

    /**
     * 对比两个数组
     *
     * @param current
     * @param target
     * @param judgeOrder 是否需要 判断位置都一致
     */
    public static void assertArray(int[] current, int[] target, boolean judgeOrder) {
        if (!judgeOrder && current != null && target != null) {
            Arrays.sort(current);
            Arrays.sort(target);
        }
        if (!ArrayUtils.compare(current, target)) {
            Logger.error(resultToString(ArrayUtils.toString(current), ArrayUtils.toString(target)),
                    true);
        }
    }

    public static void assertInt(int current, int expect) {
        if (current != expect){
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }


    public static void assertString(String current, String expect) {
        if (!current.equals(expect)){
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }

    public static void assertDouble(double current, double expect) {
        if (current != expect){
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }

    private static String resultToString(String currentResult, String expectResult) {
        return "预期结果为: " + expectResult + " 而当前结果为: " + currentResult;
    }
}
