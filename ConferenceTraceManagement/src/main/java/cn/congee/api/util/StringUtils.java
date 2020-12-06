package cn.congee.api.util;

/**
 * 字符串工具类
 *
 * @Author: yang
 * @Date: 2020-12-07 6:47
 */
public class StringUtils {

    public static boolean isEmpty(Object str) {
        return str == null || "".equals(str);
    }

}
