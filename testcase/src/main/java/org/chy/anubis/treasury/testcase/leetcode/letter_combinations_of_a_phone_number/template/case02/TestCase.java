package org.chy.anubis.treasury.testcase.leetcode.letter_combinations_of_a_phone_number.template.case02;

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

        String data = "4652";
        Logger.info("测试字符串为: [" + data + "]");
        List<String> result = algorithm.letterCombinations(data);
        AssertUtils.assertCollection(sort(result), "[agjm,agjn,agjo,agkm,agkn,agko,aglm,agln,aglo,ahjm,ahjn,ahjo,ahkm,ahkn,ahko,ahlm,ahln,ahlo,aijm,aijn,aijo,aikm,aikn,aiko,ailm,ailn,ailo,bgjm,bgjn,bgjo,bgkm,bgkn,bgko,bglm,bgln,bglo,bhjm,bhjn,bhjo,bhkm,bhkn,bhko,bhlm,bhln,bhlo,bijm,bijn,bijo,bikm,bikn,biko,bilm,biln,bilo,cgjm,cgjn,cgjo,cgkm,cgkn,cgko,cglm,cgln,cglo,chjm,chjn,chjo,chkm,chkn,chko,chlm,chln,chlo,cijm,cijn,cijo,cikm,cikn,ciko,cilm,ciln,cilo]", true);
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
