package org.chy.anubis.treasury.testcase.leetcode.letter_combinations_of_a_phone_number.template.case01;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.letter_combinations_of_a_phone_number.Algorithm;
import org.chy.anubis.treasury.utils.AssertUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {

        String data = "23";
        Logger.info("测试字符串为: [" + data + "]");
        List<String> result = algorithm.letterCombinations(data);
        AssertUtils.assertCollection(sort(result), "[ad,ae,af,bd,be,bf,cd,ce,cf]", true);
        Logger.info("");

        data = "";
        Logger.info("测试字符串为: [" + data + "]");
        result = algorithm.letterCombinations(data);
        AssertUtils.assertCollection(sort(result), "[]", true);


    }

    private  List<String> sort(List<String> data){
        return data.stream().map(s-> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).collect(Collectors.toList());
    }
}
