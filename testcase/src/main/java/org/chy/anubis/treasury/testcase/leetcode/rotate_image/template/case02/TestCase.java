package org.chy.anubis.treasury.testcase.leetcode.rotate_image.template.case02;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.rotate_image.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;
import org.chy.anubis.treasury.utils.TableUtils;


public class TestCase implements Exector<Algorithm> {


    @Override
    public void run(Algorithm algorithm) {
        int[][] data = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        String table = TableUtils.genTable(data.length, data.length, 1, (x, y) -> data[x][y] + "");

        Logger.info("[图像旋转] 测试的表格为:");
        Logger.info(table);

        algorithm.rotate(data);

        String result = "[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]";

        AssertUtils.assertString(JsonUtils.toJson(data), result, () -> {
            Logger.error("旋转错误,当前旋转结果为:");
            String resultString = TableUtils.genTable(data.length, data.length, 1, (x, y) -> data[x][y] + "");
            Logger.error(resultString, true);
        });
        Logger.info("");

    }
}
