package cn.com.banduo.wrobot.service.impl;

import cn.com.banduo.wrobot.service.RobotStatusService;
import cn.com.banduo.wrobot.service.RobotTextMsgService;
import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.api.WechatTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * 微信机器人登录
 *
 * @author meng
 * @create 2017-07-09 20:59
 */

@Service
public class IRobotStatusServiceImpl implements RobotStatusService {

    @Autowired
    private RobotTextMsgService robotTextMsgService;


    @Override
    public boolean status() {
        boolean wechatStatus = WechatTools.getWechatStatus();
        return wechatStatus;
    }

    @Override
    public void login() {
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("./src/main/resources/").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String qrPath = path.getPath() + "/static/images"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
        Wechat wechat = new Wechat(robotTextMsgService,qrPath);
        wechat.start(); // 启动服务，会在qrPath下生成一张二维码图片，扫描即可登陆，注意，二维码图片如果超过一定时间未扫描会过期，过期时会自动更新，所以你可能需要重新打开图片
    }

    @Override
    public void logout() {
        WechatTools.logout();
    }
}
