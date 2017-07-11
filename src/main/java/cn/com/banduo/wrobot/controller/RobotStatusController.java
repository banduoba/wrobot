package cn.com.banduo.wrobot.controller;

import cn.com.banduo.wrobot.service.RobotStatusService;
import cn.com.banduo.wrobot.service.RobotTextMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

/**
 * 微信登录
 *
 * @author meng
 * @create 2017-07-09 19:56
 */

@RestController
public class RobotStatusController {

    @Autowired
    private RobotStatusService robotStatusService;

    @Autowired
    private RobotTextMsgService robotTextMsgService;

    @RequestMapping(value = "/robotLogin")
    public String login() throws FileNotFoundException {
        if (!robotStatusService.status()) {
            robotStatusService.login();
            return "微信机器人登录成功！";
        } else if (robotStatusService.status()){
            return "机器人已经登录，无需重复操作登录!";
        }
        return "微信机器人登录失败！";
    }

    @RequestMapping(value = "/robotLogout")
    public String logout() {
        if (robotStatusService.status()) {
            robotStatusService.logout();
            return "微信机器人已下线!";
        }
        return "微信机器人退出登录失败!";
    }

    @RequestMapping(value = "/robotStatus")
    public String status() {
        boolean status = robotStatusService.status();
        if (status) {
            return "机器人状态：在线";
        } else {
            return "机器人状态：离线";
        }
    }
}
