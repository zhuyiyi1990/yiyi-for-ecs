package com.github.zhuyiyi1990.ecsolutions.yiyiforecs.service;

import com.github.zhuyiyi1990.ecsolutions.yiyiforecs.pojo.DBUser;

public interface DBService {

    public abstract DBUser decryptPassword(String encryptedPassword) throws Exception;

}
