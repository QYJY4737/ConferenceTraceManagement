package cn.congee.api.parser;

import java.util.List;

/**
 * 解析器
 *
 * @Author: yang
 * @Date: 2020-12-07 6:44
 */
public interface Parser<T1,T2> {

    /**
     * 解析执行
     * @param data 解析数据
     * @return
     */
    List<T1> execute(T2 data);

}
