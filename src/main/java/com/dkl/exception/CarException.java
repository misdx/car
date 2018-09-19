package com.dkl.exception;

import com.dkl.enums.ResultEnum;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 自定义异常类
 */
@Getter
@Setter
public class CarException extends RuntimeException {

    private Integer code;

    public CarException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public CarException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
