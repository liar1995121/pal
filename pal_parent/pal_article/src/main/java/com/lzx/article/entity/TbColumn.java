package com.lzx.article.entity;

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
 * 专栏
 * </p>
 *
 * @author testjava
 * @since 2020-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TbColumn对象", description="专栏")
public class TbColumn implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @ApiModelProperty(value = "专栏名称")
    private String name;

    @ApiModelProperty(value = "专栏简介")
    private String summary;

    @ApiModelProperty(value = "用户ID")
    private String userid;

    @ApiModelProperty(value = "申请日期")
    private Date createtime;

    @ApiModelProperty(value = "审核日期")
    private Date checktime;

    @ApiModelProperty(value = "状态")
    private String state;


}
