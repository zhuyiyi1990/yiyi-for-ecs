package com.github.zhuyiyi1990.ecsolutions.yiyiforecs.service.impl;

import com.github.zhuyiyi1990.ecsolutions.utils.TripleDES;
import com.github.zhuyiyi1990.ecsolutions.yiyiforecs.pojo.DBUser;
import com.github.zhuyiyi1990.ecsolutions.yiyiforecs.service.DBService;
import org.springframework.stereotype.Service;

@Service("dbService")
public class DBServiceImpl implements DBService {

    @Override
    public DBUser decryptPassword(String encryptedPassword) throws Exception {
        DBUser dbUser = new DBUser();
        if (encryptedPassword == null || "".equals(encryptedPassword.trim())) {
            dbUser.setInformation("请输入密文");
            return dbUser;
        }
        TripleDES tripleDES = null;
        try {
            tripleDES = new TripleDES();
            String decryptedString = tripleDES.decrypt(encryptedPassword);
            String[] strings = decryptedString.split("\\|\\|");
            if (strings != null && strings.length == 2) {
                dbUser.setUsername(strings[0]);
                dbUser.setPassword(strings[1]);
                return dbUser;
            } else {
                dbUser.setInformation("无效密文");
                return dbUser;
            }
        } catch (TripleDES.EncryptionException e) {
//            e.printStackTrace();
            dbUser.setInformation("无效密文");
            return dbUser;
        } catch (Exception e) {
//            e.printStackTrace();
            dbUser.setInformation("解密失败");
            return dbUser;
        }
    }

}
