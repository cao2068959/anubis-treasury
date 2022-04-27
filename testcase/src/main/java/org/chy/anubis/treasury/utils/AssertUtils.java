package org.chy.anubis.treasury.utils;
import org.chy.anubis.treasury.log.Logger;

public class AssertUtils {

    public static void assertArray(int[] current, int[] target) {
        if (!ArrayUtils.compare(current, target)) {
            Logger.error(resultToString(ArrayUtils.toString(current), ArrayUtils.toString(target)),
                    true);
        }
    }

    private static String resultToString(String currentResult, String expectResult) {
        return "预期结果为: " + expectResult + " 而当前结果为: " + currentResult;
    }
}
