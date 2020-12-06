package cn.congee.api;

import cn.congee.api.constant.Constant;
import cn.congee.api.entity.Conference;
import cn.congee.api.manager.ConferenceManager;
import cn.congee.api.manager.Manager;

/**
 * CTM程序入口
 *
 * @Author: yang
 * @Date: 2020-12-07 6:50
 */
public class CTMStart {

    public static void main (String[] agrs) {
        Manager manager = new ConferenceManager();
        Conference conference = manager.readData(Constant.INPUT_FILE_NAME, true);

        int talkIndex = 0;
        for (int trackNo = 0;trackNo< conference.getTrackCount(); trackNo++) {
            talkIndex = manager.schedule(trackNo, conference, talkIndex);
        }

        manager.displaySchedule();
    }

}
