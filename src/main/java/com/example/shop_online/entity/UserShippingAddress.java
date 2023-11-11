package com.example.shop_online.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 */
@Getter
@Setter
@TableName("t_user_shipping_address")
@ApiModel(value = "UserShippingAddress对象", description = "")
public class UserShippingAddress {

    @ApiModelProperty("主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty("收件人姓名")
    @TableField("receiver")
    private String receiver;

    @ApiModelProperty("联系方式")
    @TableField("contact")
    private String contact;

    @ApiModelProperty("省")
    @TableField("province_code")
    private String provinceCode;

    @ApiModelProperty("市")
    @TableField("city_code")
    private String cityCode;

    @ApiModelProperty("区")
    @TableField("county_code")
    private String countyCode;

    @ApiModelProperty("详细地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("是否为默认地址(0-否，1-是)")
    @TableField("is_default")
    private Byte isDefault;

    @ApiModelProperty("逻辑删除(0-未删除，1-已删除)")
    @TableField("delete_flag")
    @TableLogic
    private Byte deleteFlag;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
