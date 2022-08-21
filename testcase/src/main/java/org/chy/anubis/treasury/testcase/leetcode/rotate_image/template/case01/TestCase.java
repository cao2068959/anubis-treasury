package org.chy.anubis.treasury.testcase.leetcode.rotate_image.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.rotate_image.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;
import org.chy.anubis.treasury.utils.TableUtils;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String table = TableUtils.genTable(data.length, data.length, 1, (x, y) -> data[x][y] + "");

        Logger.info("[图像旋转] 测试的表格为:");
        Logger.info(table);

        algorithm.rotate(data);

        String result = "[[7,4,1],[8,5,2],[9,6,3]]";

        AssertUtils.assertString(JsonUtils.toJson(data), result, () -> {
            Logger.error("旋转错误,当前旋转结果为:");
            String resultString = TableUtils.genTable(data.length, data.length, 1, (x, y) -> data[x][y] + "");
            Logger.error(resultString, true);
        });
        Logger.info("");

    }
}
