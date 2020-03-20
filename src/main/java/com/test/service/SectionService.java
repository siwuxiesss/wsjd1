package com.test.service;

import com.test.entity.TD0Section;

import java.util.List;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 21:20
 */
public interface SectionService {
    /**
     * 查询所有科室信息
     *
     * @return
     */
    List<TD0Section> selectAllSection();

    /**
     * 插入科室
     *
     * @param record
     * @return
     */
    int insert(TD0Section record);

    /**
     * 通过id查找科室
     *
     * @param id
     * @return
     */
    TD0Section selectByPrimaryKey(Integer id);

    /**
     * 通过id删除科室
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(TD0Section record);
}
