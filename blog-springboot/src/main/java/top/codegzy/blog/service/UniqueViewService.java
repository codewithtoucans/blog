package top.codegzy.blog.service;

import top.codegzy.blog.dto.UniqueViewDTO;
import top.codegzy.blog.entity.UniqueView;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 用户量统计
 *
 */
public interface UniqueViewService extends IService<UniqueView> {

    /**
     * 获取7天用户量统计
     *
     * @return 用户量
     */
    List<UniqueViewDTO> listUniqueViews();

}
