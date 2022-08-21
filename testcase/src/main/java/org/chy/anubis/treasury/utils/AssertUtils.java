package org.chy.anubis.treasury.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.dto.ListNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        int len = current == null ? -1 : current.length;
        if (!ArrayUtils.compare(current, len, target)) {
            Logger.error(resultToString(ArrayUtils.toString(current), ArrayUtils.toString(target)),
                    true);
        }
    }


    /**
     * 对比指定长度的两个数组
     *
     * @param current    要对比的数据
     * @param len        对比的长度
     * @param target     参照对象
     * @param judgeOrder 是否需要 判断位置都一致
     */
    public static void assertArray(int[] current, int len, int[] target, boolean judgeOrder) {
        if (!judgeOrder && current != null && target != null) {
            Arrays.sort(current);
            Arrays.sort(target);
        }
        if (!ArrayUtils.compare(current, len, target)) {
            Logger.error(resultToString(ArrayUtils.toString(current, len), ArrayUtils.toString(target, len)),
                    true);
        }
    }

    public static void assertInt(int current, int expect) {
        if (current != expect) {
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }


    public static void assertString(String current, String expect) {
        if (!current.equals(expect)) {
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }

    public static void assertString(String current, String expect, Runnable errorCall) {
        if (!current.equals(expect)) {
            errorCall.run();

        }
    }


    public static void assertBoolean(Boolean current, Boolean expect) {
        if (!current.equals(expect)) {
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }

    public static void assertDouble(double current, double expect) {
        if (current != expect) {
            Logger.error(resultToString(String.valueOf(current), String.valueOf(expect)),
                    true);
        }
    }

    private static String resultToString(String currentResult, String expectResult) {
        return "预期结果为: " + expectResult + " 而当前结果为: " + currentResult;
    }

    /**
     * 集合中的数据和字段串对比是否符合
     *
     * @param collection
     * @param expectResult
     * @param autoSort
     */
    public static <T> void assertCollection(List<T> collection, String expectResult, boolean autoSort) {
        assertCollection(collection, expectResult, autoSort, JsonUtils::toJson);
    }


    public static <T> void assertCollection(List<T> collection, String expectResult, boolean autoSort, Function<T, String> convert) {
        Stream<String> stringStream = collection.stream().map(convert);
        if (autoSort) {
            stringStream = stringStream.sorted();
        }
        List<String> collect = stringStream.collect(Collectors.toList());
        String result = StringUtils.join("[", "]", collect, s -> s);
        assertString(result, expectResult);
    }

    public static void assertListNode(ListNode currentResult, ListNode expectResult) {
        if (currentResult == null && expectResult == null) {
            return;
        }
        if (currentResult == null || !currentResult.equals(expectResult)) {
            String cs = currentResult == null ? "[]" : String.valueOf(currentResult);
            String es = expectResult == null ? "[]" : String.valueOf(expectResult);
            Logger.error(resultToString(cs, es), true);
        }
    }
}
