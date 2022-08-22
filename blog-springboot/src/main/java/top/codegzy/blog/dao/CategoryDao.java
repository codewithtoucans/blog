package top.codegzy.blog.dao;

import top.codegzy.blog.dto.CategoryBackDTO;
import top.codegzy.blog.dto.CategoryDTO;
import top.codegzy.blog.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.codegzy.blog.vo.ConditionVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 分类
 */
@Repository
public interface CategoryDao extends BaseMapper<Category> {

    /**
     * 查询分类和对应文章数量
     *
     * @return 分类列表
     */
    List<CategoryDTO> listCategoryDTO();

    /**
     * 查询后台分类列表
     *
     * @param current   页码
     * @param size      大小
     * @param condition 条件
     * @return {@link List< CategoryBackDTO >} 分类列表
     */
    List<CategoryBackDTO> listCategoryBackDTO(@Param("current") Long current, @Param("size") Long size, @Param("condition") ConditionVO condition);

}
