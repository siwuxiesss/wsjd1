package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TD0Orgattached implements Serializable {
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
     * 在职人数
     */
    private Integer onworkernum;

    /**
     * 卫生监督员数
     */
    private Integer supervisornum;

    /**
     * 编制人数
     */
    private Integer zbbnum;

    /**
     * 是否参公管理
     */
    private String ifpublicmanage;

    /**
     * 离退休人数
     */
    private Integer retirenum;

    /**
     * 办公用房建筑面积
     */
    private Integer officebuildarea;

    /**
     * 房屋所有权
     */
    private String buildingownership;

    /**
     * 办公用房在建面积
     */
    private Integer officebuildingarea;

    /**
     * 业务科室数
     */
    private Integer businessdivcount;

    /**
     * 职能科室数
     */
    private Integer fundivcount;

    /**
     * 派出机构数
     */
    private Integer orgcount;

    /**
     * 1万元～10万元监测仪器设备台数
     */
    private Integer equ3count;

    /**
     * ≥10万元监测仪器设备台数
     */
    private Integer equ2count;

    /**
     * ＜1万元监测仪器设备台数
     */
    private Integer equ1count;

    /**
     * 汽车数
     */
    private Integer buscount;

    /**
     * 快速检测车数
     */
    private Integer rapidtestvehiclecount;

    /**
     * 摩托车数
     */
    private Integer motorcount;

    /**
     * 照相机数
     */
    private Integer cameracount;

    /**
     * 摄像机数
     */
    private Integer videocount;

    /**
     * 复印机数
     */
    private Integer copycatnum;

    /**
     * 台式电脑数
     */
    private Integer computernum;

    /**
     * 笔记本电脑数
     */
    private Integer notepadnum;

    /**
     * 服务器数
     */
    private Integer servercount;

    /**
     * 交换机数
     */
    private Integer pbxcount;

    /**
     * 传真机数
     */
    private Integer faxcount;

    /**
     * 投影仪数
     */
    private Integer ohpcount;

    /**
     * 年份
     */
    private String yearly;

    /**
     * 录音笔数
     */
    private Integer vrcount;

    private static final long serialVersionUID = 1L;
}