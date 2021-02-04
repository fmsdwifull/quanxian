package com.study.houtai.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SysRole implements Serializable {
    private String id;
    private String name;
    private String description;
    private Integer status;
    private Date createTime;
    private Date updateTime;
    private Integer deleted;

    // 后新增，为了对角色编辑时的回显
    //private List<PermissionRespNodeVO> permissionRespNodeVOS;
    private static final long serialVersionUID = 1L;
}
