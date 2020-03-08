package com.test.controller;

import com.test.service.SectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * author: 王少卿
 * Date: 2020/3/8
 * Time: 21:22
 */
@Controller
public class SectionController {
    @Resource
    private SectionService sectionService;

    /**
     * 查询所有科室信息
     *
     * @param model
     * @return
     */
    @GetMapping(value = "/office")
    public String queryAllSection(Model model) {
        model.addAttribute("sectionlist", sectionService.selectAllSection());
        return "office-list";
    }
}
