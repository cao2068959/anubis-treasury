package org.chy.anubis.treasury.testcase.leetcode.rotate_image.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.rotate_image.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;
import org.chy.anubis.treasury.utils.TableUtils;


public class TestCase implements Exector<Algorithm> {


    @Override
    public void run(Algorithm algorithm) {
        int[][] data = {{5,12,9,11,45,23,65},{2,4,8,10,87,2,8},{13,3,6,7,22,7,35},{151,14,12,16,3,8,34},{567,23,8,2,3,56,8},{345,56,12,89,6,56,23},{77,42,68,11,24,89,38}};
        String table = TableUtils.genTable(data.length, data.length, 1, (x, y) -> data[x][y] + "");

        Logger.info("[图像旋转] 测试的表格为:");
        Logger.info(table);

        algorithm.rotate(data);

        String result = "[[77,345,567,151,13,2,5],[42,56,23,14,3,4,12],[68,12,8,12,6,8,9],[11,89,2,16,7,10,11],[24,6,3,3,22,87,45],[89,56,56,8,7,2,23],[38,23,8,34,35,8,65]]";

        AssertUtils.assertString(JsonUtils.toJson(data), result, () -> {
            Logger.error("旋转错误,当前旋转结果为:");
            String resultString = TableUtils.genTable(data.length, data.length, 1, (x, y) -> data[x][y] + "");
            Logger.error(resultString, true);


        });
        Logger.info("");

    }
}
