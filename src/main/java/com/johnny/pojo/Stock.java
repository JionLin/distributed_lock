package com.johnny.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author johnny
 * @Classname stock
 * @Description
 * @Date 2022/9/18 09:30
 */
@Data
@TableName("tb_stock")
public class Stock {

    private Integer id;

    private String productCode;

    private String warehouse;

    private Integer count;

    private Integer version;

}
