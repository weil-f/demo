package com.weilf.demo.validator.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 15:10
 * 资金流水查询的实体类
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class AccountFlowVO {
    /**
     * 渠道编号
     */
    private String channelNo;

    /**
     * 平台用户编号 这里传企业的证件编号
     */
    private String memberNo;

    /**
     * 签约账号
     */
    private String accountNo;

    /**
     * 交易日期YYYYMMDD
     */
    private String tranDt;

    /**
     * 交易时间 HHMMSS
     */
    private String tranTm;

    /**
     * 交易类型 08-银行资金流水查询
     */
    private String tranType;

    /**
     * 请求方系统流水号
     */
    private String bizSeqNo;

    /**
     * 查询类型
     */
    private String findType;

    /**
     * 币种 CNY -人民币
     */
    private String currency;

    /**
     * 收款方账号
     */
    private String payeeAccountNo;

    /**
     * 付款方账号
     */
    private String payerAccountNo;

    /**
     * 交易金额查询条件开始
     */
    private BigDecimal paidAmtBegin;

    /**
     * 交易金额查询条件结束
     */
    private BigDecimal paidAmtEnd;

    /**
     * 交易日期查询条件开始
     */
    private String tranDtBegin;

    /**
     * 交易日期查询条件结束
     */
    private String tranDtEnd;

    /**
     * 银行流水编号
     */
    private String capitalFlowNo;

    /**
     * 当前页
     */
    private Integer curPage;

    /**
     * 每页记录数
     */
    private Integer pageSize;

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

