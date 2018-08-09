package com.zzm.rabbitmq.consumer;

import com.zzm.rabbitmq.common.configuration.UserRegisterQueueConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: RabbitmqConsumerApplication
 * @Description: TODO
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:32
 * @Version: 1.0
 */
@SpringBootApplication
@ImportAutoConfiguration({UserRegisterQueueConfiguration.class})
public class RabbitmqConsumerApplication {
    static Logger logger = LoggerFactory.getLogger(RabbitmqConsumerApplication.class);

    /**
     * rabbitmq消费者启动入口
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RabbitmqConsumerApplication.class,args);

        logger.info("【【【【【消息队列-消息消费者启动成功.】】】】】");
    }
}
