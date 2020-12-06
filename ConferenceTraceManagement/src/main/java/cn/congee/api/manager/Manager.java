package cn.congee.api.manager;

import cn.congee.api.entity.Conference;

/**
 * @Author: yang
 * @Date: 2020-12-07 6:42
 */
public interface Manager {

    /**
     * 读取数据
     * @param source 数据来源
     * @param isDispaly 是否输出显示读取的数据
     */
    Conference readData(String source, boolean isDispaly);

    /**
     *
     * @param trackNo
     * @param conference
     * @param talkIndex
     * @return
     */
    int schedule(int trackNo, Conference conference, int talkIndex);

    /**
     *
     */
    void displaySchedule();

}
