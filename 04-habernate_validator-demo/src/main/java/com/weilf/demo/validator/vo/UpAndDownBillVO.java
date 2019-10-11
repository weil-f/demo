package com.weilf.demo.validator.vo;

import lombok.Data;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 16:16
 * 上下架票据的实体类
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class UpAndDownBillVO {

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
     * 交易类型 07-上下架票据
     */
    private String tranType;

    /**
     * 请求方流水号
     */
    private String bizSeqNo;

    /**
     * 操作类型 M-上架 ,U-下架
     */
    private String monitorCmd;

    /**
     * 票据号码
     */
    private String billNo;

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
