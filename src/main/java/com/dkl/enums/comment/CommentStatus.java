package com.dkl.enums.comment;

import lombok.Getter;

/**
 * 评论回复表
 * Created by MBENBEN on 2018/9/10.
 */
@Getter
public enum CommentStatus {

    NOT_REPLY(0, "未回复"),
    REPLY(1, "已回复"),;

    private Integer code;
    private String msg;

    CommentStatus(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
