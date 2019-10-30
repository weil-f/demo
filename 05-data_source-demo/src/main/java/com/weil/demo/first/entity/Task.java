package com.weil.demo.first.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author weil-f
 * @since 2019-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("task")
@ApiModel(value="Task对象", description="")
public class Task implements Serializable {


    private static final long serialVersionUID = 882816628598318804L;
    @ApiModelProperty(value = "自动增长")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "发布人姓名")
    private String publisherName;

    @ApiModelProperty(value = "发布人手机号")
    private String publisherPhone;

    @ApiModelProperty(value = "发布日期")
    private Date publisherDate;

    @ApiModelProperty(value = "发布时间")
    private Date publisherTime;

    @ApiModelProperty(value = "发布类型(0-人找车,1-车找人)")
    private Boolean publishType;


}
