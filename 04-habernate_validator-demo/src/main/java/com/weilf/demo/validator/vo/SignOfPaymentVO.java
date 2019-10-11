package com.weilf.demo.validator.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 14:47
 * 签收付款的实体类
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class SignOfPaymentVO {

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
     * 交易类型 02-签收付款
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
     * 票据类别 1-银票 2-商票
     */
    private String billType;

    /**
     * 票据分类
     * 1-国股
     * 2-大商
     * 3-授信城商
     * 4-一般城商
     * 5-三农
     * 6-财务公司
     * 7-其他
     */
    private String billAssortment;

    /**
     * 收款账户与背书账户一致？Y-一致，N-不一致
     */
    private String consistentWithEndorAccount;

    /**
     * 对手方名称
     */
    private String billCounterpartyName;

    /**
     * 收款人名称
     */
    private String payeeName;

    /**
     * 收款方账号
     */
    private String payeeAccountNo;

    /**
     * 收款方开户行行号
     */
    private String payeeBankCode;

    /**
     * 是否需要凭证:1-不需要,2-需要
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
     * 成交利率
     */
    private BigDecimal paidRate;

    /**
     * 票据总张数
     */
    private Integer billNumnbers;

    /**
     * 备注
     */
    private String memo;

    /**
     * 验签
     */
    private String signCheck;

    /**
     * 流水备注 - 预留
     */
    private String flowMemo;

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
