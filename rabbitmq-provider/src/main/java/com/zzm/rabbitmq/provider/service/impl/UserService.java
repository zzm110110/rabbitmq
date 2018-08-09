package com.zzm.rabbitmq.provider.service.impl;

import com.zzm.rabbitmq.common.enums.ExchangeEnum;
import com.zzm.rabbitmq.common.enums.QueueEnum;
import com.zzm.rabbitmq.provider.bean.UserEntity;
import com.zzm.rabbitmq.provider.service.QueueMessageService;
import com.zzm.rabbitmq.provider.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Author: 邹智敏
 * @Date: 2018/8/9   11:01
 * @Version: 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService{
    @Autowired
    private UserRepository userRepository;
    /**
     * 消息队列业务逻辑实现
     */
    @Autowired
    private QueueMessageService queueMessageService;

    /**
     * 保存用户
     * 并写入消息队列
     * @param userEntity
     * @return
     */
    public String save(UserEntity userEntity) throws Exception {
        /**
         * 保存用户
         */
        userRepository.save(userEntity);
        /**
         * 将消息写入消息队列
         */
        queueMessageService.send(userEntity.getId(), ExchangeEnum.USER_REGISTER, QueueEnum.USER_REGISTER);

        return userEntity.getId();
    }
}
