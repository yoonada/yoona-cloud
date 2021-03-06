package com.yoona.cloud.auth.server.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.yoona.cloud.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <p>
 * 系统用户角色关联表
 * </p>
 *
 * @author yoonada
 * @since 2022-04-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user_role")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="UserRole对象", description="系统用户角色关联表")
public class UserRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "角色id")
    private String roleId;


}
