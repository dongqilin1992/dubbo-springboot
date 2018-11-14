package com.dongqilin.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dongqilin.api.IUserProvider;
import com.dongqilin.entity.User;
import org.redisson.api.RLock;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


/**
 * @description:
 * @author: dongql
 * @date: 2017/10/9 14:17
 */
@Service
public class UserService {


    public IUserProvider userProvider;
    @Reference(version = "1.0.0")
    public void setUserProvider(IUserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public User findUserById(int id){
        User user = userProvider.findUserById(id);
        return user;
    }
    public void getRedisLock(){
        RLock lock = RedissonLock.getRedisson().getLock("TEST_KEY");
        try {
            boolean res = lock.tryLock(10, 10, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void getRedisLockDubbo(){
        userProvider.findRedisLock();
    }




}
