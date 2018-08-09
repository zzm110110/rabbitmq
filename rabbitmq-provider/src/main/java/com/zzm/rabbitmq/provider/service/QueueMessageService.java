package com.zzm.rabbitmq.provider.service;

import com.zzm.rabbitmq.common.enums.ExchangeEnum;
import com.zzm.rabbitmq.common.enums.QueueEnum;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * @ClassName: QueueMessageService
 * @Description: 消息队列方法定义接口
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:04
 * @Version: 1.0
 */
public interface  QueueMessageService extends RabbitTemplate.ConfirmCallback{
    /**
     * 发送消息到rabbitmq消息队列
     * @param message 消息内容
     * @param exchangeEnum 交换配置枚举
     * @param queueEnum 队列配置枚举
     * @throws Exception
     */
    public void send(Object message, ExchangeEnum exchangeEnum, QueueEnum queueEnum) throws Exception;
}
