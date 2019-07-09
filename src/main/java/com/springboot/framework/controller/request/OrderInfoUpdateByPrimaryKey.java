package com.springboot.framework.controller.request;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author huangpengfei
 * @version 1.0
 * @date 2019/7/9 12:33
 */
@Data
public class OrderInfoUpdateByPrimaryKey {
    /**
     * 订单详情编号
     */
    private Integer infoId;
    /**
     * 订单编号
     */
    private Integer orderId;
    /**
     * 商品款式编号
     */
    private Integer styleId;
    /**
     * 订单详情价格
     */
    private BigDecimal infoPrice;
    /**
     * 订单详情数量
     */
    private Integer infoNumber;
}
