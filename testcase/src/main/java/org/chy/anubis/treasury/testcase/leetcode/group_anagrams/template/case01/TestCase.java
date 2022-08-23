package org.chy.anubis.treasury.testcase.leetcode.group_anagrams.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.group_anagrams.Algorithm;
import org.chy.anubis.treasury.utils.ArrayUtils;
import org.chy.anubis.treasury.utils.AssertUtils;
import org.chy.anubis.treasury.utils.JsonUtils;

import java.util.List;
import java.util.stream.Collectors;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String[] data = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Logger.info("[字母异位词分组]测试的数据为: [" + ArrayUtils.toString(data, s -> s) + "]");
        List<List<String>> result = algorithm.groupAnagrams(data);
        AssertUtils.assertCollection(result, "[[\"ate\",\"eat\",\"tea\"],[\"bat\"],[\"nat\",\"tan\"]]", true,
                datas-> JsonUtils.toJson(datas.stream().sorted().collect(Collectors.toList())));
    }
}
