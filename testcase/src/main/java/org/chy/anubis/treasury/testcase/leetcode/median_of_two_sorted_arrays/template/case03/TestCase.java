package org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        int[] array1 = new int[]{30, 55, 66, 77, 88};
        int[] array2 = new int[]{67, 68, 70, 71};
        double result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 68);

        Logger.info("");

        array2= new int[]{30, 55, 66, 77, 88};
        array1 = new int[]{37, 38, 40, 41,42};
        result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 41.5);

    }
}
