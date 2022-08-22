package top.codegzy.blog.dao;

import top.codegzy.blog.dto.ArticleSearchDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;


/**
 * elasticsearch
 *
 */
@Repository
public interface ElasticsearchDao extends ElasticsearchRepository<ArticleSearchDTO,Integer> {
}
