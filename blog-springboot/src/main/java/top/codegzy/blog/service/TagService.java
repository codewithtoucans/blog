package top.codegzy.blog.service;

import top.codegzy.blog.dto.TagBackDTO;
import top.codegzy.blog.vo.PageResult;
import top.codegzy.blog.dto.TagDTO;
import top.codegzy.blog.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;
import top.codegzy.blog.vo.ConditionVO;
import top.codegzy.blog.vo.TagVO;

import java.util.List;

/**
 * 标签服务
 *
 */
public interface TagService extends IService<Tag> {

    /**
     * 查询标签列表
     *
     * @return 标签列表
     */
    PageResult<TagDTO> listTags();

    /**
     * 查询后台标签
     *
     * @param condition 条件
     * @return {@link PageResult<TagBackDTO>} 标签列表
     */
    PageResult<TagBackDTO> listTagBackDTO(ConditionVO condition);

    /**
     * 搜索文章标签
     *
     * @param condition 条件
     * @return {@link List<TagDTO>} 标签列表
     */
    List<TagDTO> listTagsBySearch(ConditionVO condition);

    /**
     * 删除标签
     *
     * @param tagIdList 标签id集合
     */
    void deleteTag(List<Integer> tagIdList);

    /**
     * 保存或更新标签
     *
     * @param tagVO 标签
     */
    void saveOrUpdateTag(TagVO tagVO);

}
