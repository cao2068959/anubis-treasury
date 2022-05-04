package org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.median_of_two_sorted_arrays.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] array2 = new int[]{8, 9, 10, 11};
        double result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 6);

        array1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        array2 = new int[]{8, 9, 10, 11, 12};
        result = algorithm.findMedianSortedArrays(array1, array2);
        AssertUtils.assertDouble(result, 6.5);

    }
}
