package top.codegzy.blog.service.impl;

import top.codegzy.blog.entity.ArticleTag;
import top.codegzy.blog.dao.ArticleTagDao;
import top.codegzy.blog.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章标签服务
 *
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {

}
