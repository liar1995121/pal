package com.lzx.article.service;

import com.lzx.article.entity.TbArticle;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 文章 服务类
 * </p>
 *
 * @author testjava
 * @since 2020-10-16
 */
public interface TbArticleService extends IService<TbArticle> {
    /**
     * 根据id返回信息
     * */
    TbArticle getOneByID(String id);
}
