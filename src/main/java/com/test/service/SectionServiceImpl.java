package com.test.service;

import com.test.dao.TD0SectionDao;
import com.test.entity.TD0Section;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 21:20
 */
@Service
public class SectionServiceImpl implements SectionService {
    @Resource
    private TD0SectionDao td0SectionDao;

    /**
     * 查询所有科室信息
     *
     * @return
     */
    @Override
    public List<TD0Section> selectAllSection() {
        return td0SectionDao.selectAllSection();
    }
}
