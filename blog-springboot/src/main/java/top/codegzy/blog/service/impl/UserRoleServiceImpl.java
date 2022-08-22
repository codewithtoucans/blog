package top.codegzy.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.codegzy.blog.dao.UserRoleDao;
import top.codegzy.blog.entity.UserRole;
import top.codegzy.blog.service.UserRoleService;
import org.springframework.stereotype.Service;


/**
 * 用户角色服务
 *
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {


}
