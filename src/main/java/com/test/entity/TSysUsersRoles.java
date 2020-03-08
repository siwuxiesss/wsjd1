package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TSysUsersRoles implements Serializable {
    private Integer userid;

    private Integer roleid;

    private static final long serialVersionUID = 1L;
}
