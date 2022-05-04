package org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.template.case03;

import org.chy.anubis.treasury.Exector;
import org.chy.anubis.treasury.log.Logger;
import org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.Algorithm;
import org.chy.anubis.treasury.testcase.leetcode.zigzag_conversion.ZUtils;
import org.chy.anubis.treasury.utils.AssertUtils;

public class TestCase implements Exector<Algorithm> {

    @Override
    public void run(Algorithm algorithm) {
        String data = "gfdslhsgkdfsgrehkdsghkerghdsalfghfhgdsterosfcnbhytrherhwoootritiremmmsalfdkmcsjdjehjdfshfgrmcmjyuuoewoeofxmfudnihdeusjfdjcxmdeiamferjxwandejdj";
        int num = 6;
        Logger.info("测试的Z行字符为:");
        ZUtils.zPrint(data, num);
        String convert = algorithm.convert(data, num);
        AssertUtils.assertString(convert, "gfhfrrrajrwnjedfdsgklgeothtisldegmeodidcfrjjdkgseahtsyeotmfjhfcoeuhfxmjesgrdrsfsfhroimdsjhmuofdjmaxdlsekgdhdcbhormkcdsjufmesdiwnhhhgnwemfyxuea");

        Logger.info("");

        data = "gfdslhsgkdfsgrehkdsghkerghdsalfghfhgdsterosfcnbhytrherhwoootritiremmmsalfdkmcsjdjehjdfshfgrmcmjyuuoewoeofxmfudnihdeusjfdjcxmdeiamferjxwandejdj";
        num = 10;
        Logger.info("测试的Z行字符为:");
        ZUtils.zPrint(data, num);
        convert = algorithm.convert(data, num);
        AssertUtils.assertString(convert, "gsdhfruifdggsrwldgmfdeadkhhteoakfcmndmshkfehosmhmximfjleehrromcsjfhxedhrrgottmsfyodcrjsggfsyrmjdueejjegshlfhiedjuoudxdkfdacbtrjhowsfwndsnieeja");
    }
}
