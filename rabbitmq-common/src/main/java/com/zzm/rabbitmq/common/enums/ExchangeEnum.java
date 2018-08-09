package com.zzm.rabbitmq.common.enums;

import lombok.Getter;

/**
 * @ClassName: ExchangeEnum
 * @Description: 存放了队列交换配置信息
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:23
 * @Version: 1.0
 */
@Getter
public enum ExchangeEnum {
    /**
     * 用户注册交换配置枚举
     */
    USER_REGISTER("user.register.topic.exchange");
    private String value;

    ExchangeEnum(String value) {
        this.value = value;
    }
}
