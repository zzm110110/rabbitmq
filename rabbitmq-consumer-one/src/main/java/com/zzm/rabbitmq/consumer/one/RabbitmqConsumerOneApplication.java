package com.zzm.rabbitmq.consumer.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: RabbitmqConsumerOneApplication
 * @Description: TODO
 * @Author: 邹智敏
 * @Date: 2018/8/9   17:13
 * @Version: 1.0
 */
@SpringBootApplication
public class RabbitmqConsumerOneApplication
{
    static Logger logger = LoggerFactory.getLogger(RabbitmqConsumerOneApplication.class);

    /**
     * rabbitmq消费者启动入口
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RabbitmqConsumerOneApplication.class,args);

        logger.info("【【【【【消息队列-消息消费者节点2启动成功.】】】】】");
    }
}