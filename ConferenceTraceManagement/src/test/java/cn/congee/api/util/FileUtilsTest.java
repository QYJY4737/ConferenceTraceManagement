package cn.congee.api.util;

import cn.congee.api.constant.Constant;
import org.junit.Test;

import java.util.List;

/**
 * @Author: yang
 * @Date: 2020-12-07 6:53
 */
public class FileUtilsTest {

    @Test
    public void readFileTest() {
        List<String> inputs = FileUtils.readFile(Constant.INPUT_FILE_NAME);
        inputs.forEach(line -> System.out.println(line));
    }

}
