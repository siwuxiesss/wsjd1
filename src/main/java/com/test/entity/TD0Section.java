package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TD0Section implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 机构id
     */
    private Integer orgid;

    /**
     * 科室编码
     */
    private String divcode;

    /**
     * 科室名称编码
     */
    private String divnamecode;

    /**
     * CVP01004科室名称代码
     */
    private String divname;

    /**
     * 是否为分所0=否 1=是
     */
    private String ifsub;

    /**
     * 电话号码
     */
    private String dutytel;

    /**
     * 传真号码
     */
    private String fax;

    /**
     * 门号
     */
    private String divroomno;

    private static final long serialVersionUID = 1L;
}