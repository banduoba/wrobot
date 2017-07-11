package cn.com.banduo.wrobot.service;

/**
 * 开启微信登录
 *
 * @author meng
 * @create 2017-07-09 19:55
 */

public interface RobotStatusService {

    boolean status();

    void login();

    void logout();
}