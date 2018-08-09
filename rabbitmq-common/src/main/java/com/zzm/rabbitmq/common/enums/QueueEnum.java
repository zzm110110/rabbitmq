package com.zzm.rabbitmq.common.enums;

import lombok.Getter;
/**
 * 存放了队列信息以及队列的路由配置信息
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:23
 * @Version: 1.0
 */
@Getter
public enum QueueEnum {

    /**
     * 用户注册枚举
     */
    USER_REGISTER("user.register.queue","user.register")
    ;
    /**
     * 队列名称
     */
    private String name;
    /**
     * 队列路由键
     */
    private String routingKey;

    QueueEnum(String name, String routingKey) {
        this.name = name;
        this.routingKey = routingKey;
    }
}
