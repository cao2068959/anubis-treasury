package org.chy.anubis.treasury.utils;

import org.chy.anubis.treasury.exception.ResultErrorException;

public class AssertUtils {

    public static void assertArray(int[] current, int[] target) {
        if (!ArrayUtils.compare(current, target)) {
            throw new ResultErrorException(ArrayUtils.toString(current), ArrayUtils.toString(target));
        }
    }
}
