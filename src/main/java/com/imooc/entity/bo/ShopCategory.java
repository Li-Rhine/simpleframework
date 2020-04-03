package com.imooc.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/4/3 23:24
 **/
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
