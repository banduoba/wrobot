package cn.com.banduo.wrobot.service;

import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;

/**
 * 微信信息处理
 *
 * @author meng
 * @create 2017-07-09 21:01
 */

public interface RobotTextMsgService extends IMsgHandlerFace {

    String getGroupNickName();
}
