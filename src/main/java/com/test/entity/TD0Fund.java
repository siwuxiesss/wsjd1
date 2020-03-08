package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TD0Fund implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 机构id
     */
    private Integer orgid;

    /**
     * 机构名称
     */
    private String orgname;

    /**
     * 机构的内部编码:行政区划9位+3位流水
     */
    private String orgno;

    /**
     * 机构代码
     */
    private String orgcode;

    /**
     * 年度
     */
    private String yearly;

    /**
     * 人员经费
     */
    private BigDecimal prefund;

    /**
     * 业务经费
     */
    private BigDecimal businessfund;

    /**
     * 公务费
     */
    private BigDecimal dutyfund;

    /**
     * 基本建设资金
     */
    private BigDecimal buildfund;
}
