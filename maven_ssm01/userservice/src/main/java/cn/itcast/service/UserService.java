package cn.itcast.service;


import cn.itcast.domain.User;

import java.util.List;

public interface UserService {

    public User selectById(Integer id);

    public List<User> findAll();
}
