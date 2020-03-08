package com.test.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TD0Leader implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 机构id
     */
    private Integer orgid;

    /**
     * 领导姓名
     */
    private String leadername;

    /**
     * 性别
     */
    private String gender;

    /**
     * 民族
     */
    private String folk;

    /**
     * 出生年月
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;

    /**
     * 政治面貌
     */
    private String pol;

    /**
     * 学历
     */
    private String edu;

    /**
     * 学位
     */
    private String degree;

    /**
     * 职务
     */
    private String managejob;

    /**
     * 职级
     */
    private String joblevel;

    /**
     * 备注
     */
    private String memo;

    /**
     * 任职日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date serdate;

    /**
     * 离职日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date leavedate;

    /**
     * 年份
     */
    private String yearly;

    /**
     * 填表人
     */
    private String formfillingman;

    /**
     * 填报人联系电话
     */
    private String linktel;

    private static final long serialVersionUID = 1L;
}
