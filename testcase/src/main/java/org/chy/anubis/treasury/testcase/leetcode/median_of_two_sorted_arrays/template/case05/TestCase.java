package org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.template.case05;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        int[] array1 = new int[]{30, 55, 66, 77, 88};
        int[] array2 = new int[]{51, 52, 70, 71};
        double result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 66);

        Logger.info("");

        array1 = new int[]{10, 30, 55, 56, 57, 58, 66, 67, 68, 77, 88, 99, 100, 101, 102};
        array2 = new int[]{8, 9, 11, 31};
        result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 58);

    }
}
