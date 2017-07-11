package cn.com.banduo.wrobot.service.impl;

import cn.com.banduo.wrobot.service.RobotTextMsgService;
import cn.zhouyafeng.itchat4j.api.MessageTools;
import cn.zhouyafeng.itchat4j.api.WechatTools;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 微信消息处理
 *
 * @author meng
 * @create 2017-07-09 21:03
 */

@Service
public class IRobotTextMsgServiceImpl implements RobotTextMsgService {
    Logger LOG = Logger.getLogger(IRobotTextMsgServiceImpl.class);


    @Override
    public String textMsgHandle(JSONObject msg) {
        if (!msg.getBoolean("groupMsg")) { // 群消息不处理
            String text = msg.getString("Text"); // 发送文本消息，也可调用MessageTools.sendFileMsgByUserId(userId,text);
            return text;
        }

        if (msg.getBoolean("groupMsg")) {
            String fromUserNameId = msg.getString("FromUserName");
            String groupMsg = msg.getString("Text");
            if (groupMsg.contains("周三秒杀")) {
                String sendMsg = "今日7:30秒杀芒果干，点击链接查看：https://h5.youzan.com/v2/goods/35wrdyvm45a19";
                MessageTools.sendMsgById(sendMsg,fromUserNameId);
            }
        }
        return null;
    }

    @Override
    public String picMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public String voiceMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public String viedoMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public String nameCardMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public void sysMsgHandle(JSONObject msg) {

    }

    @Override
    public String verifyAddFriendMsgHandle(JSONObject msg) {
        return null;
    }

    /**
     * 获取群昵称
     */
    @Override
    public String getGroupNickName() {
        List<String> groupNickNameList = WechatTools.getGroupNickNameList();
        for (String groupNickName : groupNickNameList) {
            return groupNickName;
        }

        return null;
    }
}
