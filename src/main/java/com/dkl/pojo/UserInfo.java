package com.dkl.pojo;

import com.dkl.enums.user.UserSexEnum;
import com.dkl.enums.user.UserStartEnum;
import com.dkl.enums.user.UserTypeEnum;
import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    private Integer id;
    // 昵称
    private String userName;
    // 登录用户名
    private String loginName;
    // 密码
    private String password;
    // qqId
    private String openid;
    // 移动手机号码可用于登录
    private String mobilePhone;
    // 邮箱可用于登录
    private String email;
    // 0代表男 1代表女
    private Integer sex = UserSexEnum.MAN.getCode();
    // 年龄
    private Integer age;
    // 固定电话
    private String fixationPhone;
    // 用户图片
    private String icon;
    // 0管理1普通2会员
    private Integer userType = UserTypeEnum.COMMON.getCode();
    // 身份证图片
    private String cardPath;
    // 0启用1禁用
    private Integer isStart = UserStartEnum.START.getCode();
    // 创建时间
    private Date createTime;
    // 修改时间
    private Date updateTime;

    public UserInfo() {
    }
    // TODO 可以删除的构造方法  前提是有了登录session
    public UserInfo(Integer id, String userName, String mobilePhone) {
        this.id = id;
        this.userName = userName;
        this.mobilePhone = mobilePhone;
    }
}