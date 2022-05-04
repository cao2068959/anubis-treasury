package org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.template.case04;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        int[] array1 = new int[]{1};
        int[] array2 = new int[]{};
        double result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 1);

        Logger.info("");

        array1 = new int[]{1};
        array2 = new int[]{3};
        result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 2);

    }
}
