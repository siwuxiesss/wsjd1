package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TSysResources implements Serializable {
    private Integer id;

    private String resourcesname;

    private String url;

    private String type;

    private Integer sort;

    private Integer pid;

    private String del;

    private static final long serialVersionUID = 1L;
}
