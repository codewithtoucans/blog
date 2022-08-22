package top.codegzy.blog.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.codegzy.blog.dao.PageDao;
import top.codegzy.blog.entity.Page;
import top.codegzy.blog.service.PageService;
import top.codegzy.blog.service.RedisService;
import top.codegzy.blog.util.BeanCopyUtils;
import top.codegzy.blog.vo.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.codegzy.blog.constant.RedisPrefixConst;


import java.util.List;
import java.util.Objects;

/**
 * 页面服务
 */
@Service
public class PageServiceImpl extends ServiceImpl<PageDao, Page> implements PageService {
    @Autowired
    private RedisService redisService;
    @Autowired
    private PageDao pageDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveOrUpdatePage(PageVO pageVO) {
        Page page = BeanCopyUtils.copyObject(pageVO, Page.class);
        this.saveOrUpdate(page);
        // 删除缓存
        redisService.del(RedisPrefixConst.PAGE_COVER);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deletePage(Integer pageId) {
        pageDao.deleteById(pageId);
        // 删除缓存
        redisService.del(RedisPrefixConst.PAGE_COVER);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<PageVO> listPages() {
        List<PageVO> pageVOList;
        // 查找缓存信息，不存在则从mysql读取，更新缓存
        Object pageList = redisService.get(RedisPrefixConst.PAGE_COVER);
        if (Objects.nonNull(pageList)) {
            pageVOList = JSON.parseObject(pageList.toString(), List.class);
        } else {
            pageVOList = BeanCopyUtils.copyList(pageDao.selectList(null), PageVO.class);
            redisService.set(RedisPrefixConst.PAGE_COVER, JSON.toJSONString(pageVOList));
        }
        return pageVOList;
    }

}




