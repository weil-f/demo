package com.weilf.demo.validator.vo;

import lombok.Data;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 15:08
 * 卖票撤单实体类 （终止商城订单）
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class StopOrderVO {
    /**
     * 渠道编号
     */
    private String channelNo;

    /**
     * 企业的证件编号
     */
    private String memberNo;

    /**
     * 签约账号
     */
    private String accountNo;

    /**
     * 交易时间
     */
    private String tranDt;

    /**
     * 交易日期
     */
    private String tranTm;

    /**
     * 交易类型 04-卖票撤单
     */
    private String tranType;

    /**
     * 请求方流水号
     */
    private String bizSeqNo;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 备注
     */
    private String memo;

    /**
     * 验签
     */
    private String signCheck;

    /**
     * 用户申请的appId
     */
    private String appId;

    /**
     * appId对应的密钥
     */
    private String appSecret;
}
