package com.lzx.article.service.impl;

import com.lzx.article.entity.TbArticle;
import com.lzx.article.mapper.TbArticleMapper;
import com.lzx.article.service.TbArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-10-16
 */
@Service
public class TbArticleServiceImpl extends ServiceImpl<TbArticleMapper, TbArticle> implements TbArticleService {

    @Override
    public TbArticle getOneByID(String id) {
        TbArticle tbArticle = baseMapper.selectById(id);
        return tbArticle;
    }
}
