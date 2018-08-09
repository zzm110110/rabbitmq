package com.zzm.rabbitmq.provider.service;

import com.zzm.rabbitmq.provider.bean.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}
