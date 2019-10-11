package com.weilf.demo.validator.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Package: com.pfa.send.vo
 * Date: Created in 2019/9/6 14:43
 * 签约信息的实体类
 * @author : weil-f
 * @version : 1.0.0
 */
@Data
public class SigningVO {
    /**
     * 渠道编号
     */
    @NotNull(message = "渠道编号不能为空")
    private String channelNo;

    /**
     * 企业的证件编号
     */
    @NotNull(message = "企业证件号不能为空")
    private String memberNo;

    /**
     * 签约账号
     */
    @NotBlank(message = "签约账号不能为空")
    private String accountNo;

    /**
     * 交易时间
     */
    @NotNull(message = "交易时间不能为空")
    private String tranDt;

    /**
     * 交易日期
     */
    @NotNull(message = "交易日期不能为空")
    private String tranTm;

    /**
     * 交易类型 01-账户签约
     */
    @NotNull(message = "交易类型不能为空 ")
    private String tranType;

    /**
     * 请求方流水号
     */
    @NotNull(message = "请求方流水号不能为空")
    private String bizSeqNo;

    /**
     * 账户名称
     */
    @NotNull(message = "账户名称不能为空")
    private String accountName;

    /**
     * 开户行行号
     */
    @NotNull(message = "开户行行号不能为空")
    private String endorseeBankCode;

    /**
     * 开户行名称
     */
    @NotNull(message = "开户行名称不能为空")
    private String endorseeBankName;

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
