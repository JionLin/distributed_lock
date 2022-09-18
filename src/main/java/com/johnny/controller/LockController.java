package com.johnny.controller;

import com.johnny.pojo.Stock;
import com.johnny.service.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author johnny
 * @Classname LockController
 * @Description
 * @Date 2022/9/18 09:28
 */
@RestController
public class LockController {

    @Autowired
    private LockService lockService;

    @GetMapping("/one/{id}")
    public Stock getStockInfoById(@PathVariable("id") Integer id){
        return lockService.getStockInfoById(id);


    }

}
