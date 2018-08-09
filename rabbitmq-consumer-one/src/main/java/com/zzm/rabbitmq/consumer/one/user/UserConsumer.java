package com.zzm.rabbitmq.consumer.one.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserConsumer
 * @Description: TODO
 * @Author: 邹智敏
 * @Date: 2018/8/9   17:23
 * @Version: 1.0
 */
@Component
public class UserConsumer {

    /**
     * logback
     */
    private Logger logger = LoggerFactory.getLogger(UserConsumer.class);


    @RabbitListener(queues = "user.register.queue")
    @RabbitHandler
    public void execute(String userId)
    {
        logger.info("用户注册消费者【节点2】获取消息，用户编号：{}",userId);
    }
}
