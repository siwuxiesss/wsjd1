package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TD0Stuff implements Serializable {
    private Integer id;

    /**
     * 科室id
     */
    private Integer sectionid;

    /**
     * 人员编码
     */
    private String percode;

    /**
     * 姓名
     */
    private String repmanname;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生年月
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;

    /**
     * 民族
     */
    private String folk;

    /**
     * 政治面貌
     */
    private String pol;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String worktel;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 学历
     */
    private String edu;

    /**
     * 毕业学校
     */
    private String gracollege;

    /**
     * 所选专业
     */
    private String choicespe;

    /**
     * 所学专业类型
     */
    private String spe;

    /**
     * 建所前从事专业
     */
    private String beforespe;

    /**
     * 何时参加工作
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginworkdate;

    /**
     * 职务
     */
    private String managejob;

    /**
     * 职级
     */
    private String joblevel;

    /**
     * 职称
     */
    private String title;

    /**
     * 何时进卫生监督所
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date getindate;

    /**
     * 人员性质
     */
    private String perpro;

    /**
     * 类型
     */
    private String pertype;

    /**
     * 行政执法证号
     */
    private String enfcardno;

    /**
     * 何时取得行政执法证
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date getcarddate;

    /**
     * 卫生监督胸牌号
     */
    private String healthperno;

    /**
     * 何时取得卫生监督员资格
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date getquadate;

    /**
     * 目前持有有效的监督员证号
     */
    private String healthcardno;

    /**
     * 目前所持有效监督员证的有效时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cardday;

    /**
     * 是否为在编人员
     */
    private String ifstaffper;

    private static final long serialVersionUID = 1L;
}
