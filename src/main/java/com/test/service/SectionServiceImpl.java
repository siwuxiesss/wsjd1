package com.test.service;

import com.test.entity.TD0Section;
import com.test.dao.TD0SectionDao;
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

    /**
     * 插入科室
     *
     * @param record
     * @return
     */
    @Override
    public int insert(TD0Section record) {
        return td0SectionDao.insert(record);
    }

    /**
     * 通过id查找科室
     *
     * @param id
     * @return
     */
    @Override
    public TD0Section selectByPrimaryKey(Integer id) {
        return td0SectionDao.selectByPrimaryKey(id);
    }

    /**
     * 通过id删除科室
     *
     * @param id
     * @return
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return td0SectionDao.deleteByPrimaryKey(id);
    }

    /**
     * 更新数据
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(TD0Section record) {
        return td0SectionDao.updateByPrimaryKey(record);
    }
}
