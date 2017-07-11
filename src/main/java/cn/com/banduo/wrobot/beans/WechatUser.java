package cn.com.banduo.wrobot.beans;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 获取微信好友信息
 *
 * @author meng
 * @create 2017-07-09 12:34
 */

@Getter
@Setter
public class WechatUser {

    /**
     * ChatRoomId : 0
     * Sex : 2
     * AttrStatus : 100455
     * Statues : 0
     * PYQuanPin : Andy
     * EncryChatRoomId :
     * DisplayName :
     * VerifyFlag : 0
     * UniFriend : 0
     * ContactFlag : 3
     * UserName : @379cc9cb76b8ec85aced574982fdcec75edbd4affa01987842168f08ef7ddcdf
     * MemberList : []
     * StarFriend : 0
     * HeadImgUrl : /cgi-bin/mmwebwx-bin/webwxgeticon?seq=667682901&username=@379cc9cb76b8ec85aced574982fdcec75edbd4affa01987842168f08ef7ddcdf&skey=
     * AppAccountFlag : 0
     * MemberCount : 0
     * RemarkPYInitial : HH
     * City : 徐州
     * NickName : Andy
     * Province : 江苏
     * SnsFlag : 17
     * Alias :
     * KeyWord :
     * HideInputBarFlag : 0
     * Signature :
     * RemarkName : 胡贺
     * RemarkPYQuanPin : huhe
     * Uin : 0
     * OwnerUin : 0
     * IsOwner : 0
     * PYInitial : ANDY
     */

    private int ChatRoomId;
    private int Sex;
    private String AttrStatus;
    private int Statues;
    private String PYQuanPin;
    private String EncryChatRoomId;
    private String DisplayName;
    private int VerifyFlag;
    private int UniFriend;
    private int ContactFlag;
    private String UserName;
    private int StarFriend;
    private String HeadImgUrl;
    private int AppAccountFlag;
    private int MemberCount;
    private String RemarkPYInitial;
    private String City;
    private String NickName;
    private String Province;
    private int SnsFlag;
    private String Alias;
    private String KeyWord;
    private int HideInputBarFlag;
    private String Signature;
    private String RemarkName;
    private String RemarkPYQuanPin;
    private int Uin;
    private int OwnerUin;
    private int IsOwner;
    private String PYInitial;
    private List<?> MemberList;
}
