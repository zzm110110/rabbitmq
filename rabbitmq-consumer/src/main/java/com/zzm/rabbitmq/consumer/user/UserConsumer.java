package com.zzm.rabbitmq.consumer.user;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: UserConsumer
 * @Description: 用户注册消息消费者
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:36
 * @Version: 1.0
 */
@Component
public class UserConsumer {

    @RabbitListener(queues = "user.register.queue")
    @RabbitHandler
    public void execute(String userId)
    {
        //这里写业务逻辑代码
        System.out.println("用户：" + userId+"，完成了注册");
    }
}
