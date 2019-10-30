package com.weilf.demo.service.impl;

import com.weilf.demo.entity.UserInfo;
import com.weilf.demo.mapper.UserInfoMapper;
import com.weilf.demo.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author weil-f
 * @since 2019-10-29
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
