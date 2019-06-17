package cn.itcast.mapper;

import cn.itcast.domain.User;

import java.util.List;

public interface UserMapper {

    public User selectById(Integer id);

    public List<User> findAll();
}
