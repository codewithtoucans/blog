package top.codegzy.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.codegzy.blog.dto.OperationLogDTO;
import top.codegzy.blog.vo.PageResult;
import top.codegzy.blog.entity.OperationLog;
import top.codegzy.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
