package com.github.zhuyiyi1990.ecsolutions.yiyiforecs.controller;

import com.github.zhuyiyi1990.ecsolutions.yiyiforecs.pojo.DBUser;
import com.github.zhuyiyi1990.ecsolutions.yiyiforecs.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/db")
public class DBController {

    @Autowired
    private DBService dbService;

    @RequestMapping(value = "/decryptPassword", method = RequestMethod.POST)
    @ResponseBody
    public DBUser decryptPassword(String password) throws Exception {
        return dbService.decryptPassword(password);
    }

}
