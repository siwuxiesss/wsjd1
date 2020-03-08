package com.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 15:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TSysUsers implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private String del;

    private static final long serialVersionUID = 1L;
}