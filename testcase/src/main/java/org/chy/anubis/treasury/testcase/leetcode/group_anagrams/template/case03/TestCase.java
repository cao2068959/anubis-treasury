package org.chy.anubis.treasury.testcase.leetcode.group_anagrams.template.case03;

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
        String[] data = {"qwer", "rewq", "eqwr", "we", "ew", "asdfghjkl","lkjhgfdsa"};
        Logger.info("[字母异位词分组]测试的数据为: [" + ArrayUtils.toString(data, s -> s) + "]");
        List<List<String>> result = algorithm.groupAnagrams(data);
        AssertUtils.assertCollection(result, "[[\"asdfghjkl\",\"lkjhgfdsa\"],[\"eqwr\",\"qwer\",\"rewq\"],[\"ew\",\"we\"]]", true,
                datas-> JsonUtils.toJson(datas.stream().sorted().collect(Collectors.toList())));
    }
}
