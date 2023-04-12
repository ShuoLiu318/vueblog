package com.shuo.service.impl;

import com.shuo.entity.User;
import com.shuo.mapper.UserMapper;
import com.shuo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shuo
 * @since 2023-04-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
