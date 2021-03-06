package com.test.controller;

import com.test.entity.TD0Section;
import com.test.service.SectionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 21:22
 */
@Controller
public class SectionController {
    @Resource
    private SectionService sectionService;

    @RequestMapping("/showSection")
    public String showSection() {
        return "section";
    }

    /**
     * 查询所有科室信息
     *
     * @return
     */
    @GetMapping(value = "/sectionList")
    @ResponseBody
    public List<TD0Section> sectionList() {
        List<TD0Section> sectionList = sectionService.selectAllSection();
        return sectionList;
    }

    /**
     * 通过id查询单个科室信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/section/{id}")
    @ResponseBody
    public TD0Section getSectionByPrimaryKey(@PathVariable("id") Integer id) {
        TD0Section td0Section = sectionService.selectByPrimaryKey(id);
        return td0Section;
    }

}
