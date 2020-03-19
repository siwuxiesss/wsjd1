package com.test.dao;

import com.test.entity.TD0Section;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 21:15
 */
@Mapper
public interface TD0SectionDao {
    /**
     * 查询所有科室信息
     *
     * @return
     */
    List<TD0Section> selectAllSection();
}
