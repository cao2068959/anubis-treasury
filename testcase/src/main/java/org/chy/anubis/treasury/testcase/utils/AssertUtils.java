package org.chy.anubis.treasury.testcase.utils;

import org.chy.anubis.treasury.testcase.exception.ResultErrorException;

public class AssertUtils {

    public void assertArray(int[] current, int[] target) {
        if (!ArrayUtils.compare(current, target)) {
            throw new ResultErrorException(ArrayUtils.toString(current), ArrayUtils.toString(target));
        }
    }
}
