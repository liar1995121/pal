package com.lzx.article.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 文章
 * </p>
 *
 * @author testjava
 * @since 2020-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TbArticle对象", description="文章")
@TableName("tb_article")
public class TbArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @ApiModelProperty(value = "专栏ID")
    private String columnid;

    @ApiModelProperty(value = "用户ID")
    private String userid;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "文章正文")
    private String content;

    @ApiModelProperty(value = "文章封面")
    private String image;

    @ApiModelProperty(value = "发表日期")
    private Date createtime;

    @ApiModelProperty(value = "修改日期")
    private Date updatetime;

    @ApiModelProperty(value = "是否公开")
    private String ispublic;

    @ApiModelProperty(value = "是否置顶")
    private String istop;

    @ApiModelProperty(value = "浏览量")
    private Integer visits;

    @ApiModelProperty(value = "点赞数")
    private Integer thumbup;

    @ApiModelProperty(value = "评论数")
    private Integer comment;

    @ApiModelProperty(value = "审核状态")
    private String state;

    @ApiModelProperty(value = "所属频道")
    private String channelid;

    @ApiModelProperty(value = "URL")
    private String url;

    @ApiModelProperty(value = "类型")
    private String type;


}
