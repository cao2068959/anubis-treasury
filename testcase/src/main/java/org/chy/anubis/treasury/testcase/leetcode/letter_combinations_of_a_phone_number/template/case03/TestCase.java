package org.chy.anubis.treasury.testcase.leetcode.letter_combinations_of_a_phone_number.template.case03;

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

        String data = "789";
        Logger.info("测试字符串为: [" + data + "]");
        List<String> result = algorithm.letterCombinations(data);
        AssertUtils.assertCollection(sort(result), "[ptw,ptx,pty,ptz,puw,pux,puy,puz,pvw,pvx,pvy,pvz,qtw,qtx,qty,qtz,quw,qux,quy,quz,qvw,qvx,qvy,qvz,rtw,rtx,rty,rtz,ruw,rux,ruy,ruz,rvw,rvx,rvy,rvz,stw,stx,sty,stz,suw,sux,suy,suz,svw,svx,svy,svz]", true);
        Logger.info("");

    }


    private  List<String> sort(List<String> data){
        return data.stream().map(s-> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).collect(Collectors.toList());
    }

}
