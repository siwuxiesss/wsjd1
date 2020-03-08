package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TSysRolesResources implements Serializable {
    private Integer roleid;

    private Integer resourceid;

    private List<Integer> resourceids;

    private static final long serialVersionUID = 1L;
}