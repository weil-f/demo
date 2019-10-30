package com.weil.demo.first.service.impl;

import com.weilf.demo.entity.Task;
import com.weilf.demo.mapper.TaskMapper;
import com.weilf.demo.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weil-f
 * @since 2019-10-29
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
