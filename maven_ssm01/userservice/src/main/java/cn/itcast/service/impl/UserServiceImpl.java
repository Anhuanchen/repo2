package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectById(Integer id) {
        User user = userMapper.selectById(1);
        return user;
    }

    public List<User> findAll() {
        List<User> all = userMapper.findAll();
        return all;
    }
}
