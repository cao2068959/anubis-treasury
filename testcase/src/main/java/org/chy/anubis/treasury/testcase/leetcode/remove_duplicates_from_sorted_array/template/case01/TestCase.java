package org.chy.anubis.treasury.testcase.leetcode.remove_duplicates_from_sorted_array.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.remove_duplicates_from_sorted_array.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[] data = new int[]{1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4};
        Logger.info("数组为:[" + ArrayUtils.toString(data) + "]");
        int result = algorithm.removeDuplicates(data);
        AssertUtils.assertInt(result, 4);
        AssertUtils.assertArray(data, result, new int[]{1, 2, 3, 4}, true);
        Logger.info("");
    }
}
