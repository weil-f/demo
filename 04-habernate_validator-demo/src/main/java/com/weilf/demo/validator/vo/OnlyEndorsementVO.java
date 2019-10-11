package com.weilf.demo.validator.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 15:13
 * 仅背书实体类
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class OnlyEndorsementVO {
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
     * 交易类型 06-仅背书
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
     * 票据种类 1-电票
     */
    private String billClass;

    /**
     * 票据类型 1-银票 2-商票
     */
    private String billType;

    /**
     * 票据分类
     * 1-国股
     * 2-大商
     * 3-授信城商
     * 4-一般城商
     * 5-三农
     * 6-财务公
     * 7-其他
     */
    private String billAssortment;

    /**
     * 对手方名称
     */
    private String billCounterpartyName;

    /**
     * 被背书人账号
     */
    private String endorseeAccountNo;

    /**
     * 被背书人名称
     */
    private String endorseeName;

    /**
     * 被背书人行号
     */
    private String endorseeBankCode;

    /**
     * 是否需要凭证 1-不需要,2-需要
     */
    private String voucherFlag;

    /**
     * 凭证邮件地址 需要凭证时必填
     */
    private String voucherMailAddress;

    /**
     * 凭证收件人 需要凭证时必填
     */
    private String voucherReceiver;

    /**
     * 收件人电话 需要凭证时必填
     */
    private String receriverPhoneNo;

    /**
     * 成交金额
     */
    private BigDecimal payableReceivableAmount;

    /**
     * 打款利率%
     */
    private BigDecimal paidRate;

    /**
     * 备注
     */
    private String memo;

    /**
     * 票据张数
     */
    private Integer billNumbers;

    /**
     * 验签
     */
    private String signCheck;

    /**
     * 票据列表
     */
    private List<String> billList;

    /**
     * 用户申请的appId
     */
    private String appId;

    /**
     * appId对应的密钥
     */
    private String appSecret;

}
