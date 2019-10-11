package com.weilf.demo.validator.vo;

import lombok.Data;

import java.util.List;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 15:10
 * 背书收款实体类
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class AnEndorsementOfVO {
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
     * 交易类型 05-背书收款
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
     * 资金流水记录数
     */
    private Integer capitalFlowBigDecimals;

    /**
     * 资金流水列表
     */
    private List<String> flowList;

    /**
     * 用户申请的appId
     */
    private String appId;

    /**
     * appId对应的密钥
     */
    private String appSecret;
}
