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
 * Time: 15:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TD0Organization implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 机构的内部编码:行政区划9位+3位流水
     */
    private String orgno;

    /**
     * 机构代码
     */
    private String orgcode;

    /**
     * 机构名称
     */
    private String orgname;

    /**
     * 行政类别1：卫生监督机构；2：行政部门；3：协作单位
     */
    private String exetype;

    /**
     * 行政区划
     */
    private String areacode;

    /**
     * 地址
     */
    private String linkadd;

    /**
     * 挂牌日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date listingdate;

    /**
     * 独立运行日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date standalonedate;

    /**
     * 行政区类别
     */
    private String areatype;

    /**
     * 编办批文日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zbbdocdate;

    /**
     * 机构行政级别
     */
    private String orglevel;

    /**
     * 机构性质
     */
    private String orgpro;

    /**
     * 邮政编码
     */
    private String zipcode;

    private static final long serialVersionUID = 1L;
}