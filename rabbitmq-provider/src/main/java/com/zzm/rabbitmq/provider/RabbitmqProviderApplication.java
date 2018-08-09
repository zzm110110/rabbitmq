package com.zzm.rabbitmq.provider;
import com.zzm.rabbitmq.common.configuration.UserRegisterQueueConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: RabbitmqProviderApplication
 * @Description: 消息队列消息提供者启动入口
 * @Author: 邹智敏
 * @Date: 2018/8/9   10:51
 * @Version: 1.0
 */
@SpringBootApplication
@ImportAutoConfiguration({UserRegisterQueueConfiguration.class})
public class RabbitmqProviderApplication {

    static Logger logger = LoggerFactory.getLogger(RabbitmqProviderApplication.class);

    /**
     * 消息队列提供者启动入口
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(RabbitmqProviderApplication.class,args);

        logger.info("【【【【【消息队列-消息提供者启动成功.】】】】】");
    }
}
