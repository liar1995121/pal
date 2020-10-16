package com.lzx.article.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzx.article.entity.TbArticle;
import com.lzx.article.service.TbArticleService;
import com.lzx.common.pojo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 文章 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-10-16
 */
@RestController
@RequestMapping("/article/tb-article")
public class TbArticleController {

    @Autowired
    TbArticleService tbArticleService;

    @GetMapping("text")
    public R text(){
        String id = "0";
        TbArticle service = tbArticleService.getOneByID(id);
        if (service!=null){
            return R.OK().data("service",service);
        }else {
            return R.ON();
        }

    }


}

