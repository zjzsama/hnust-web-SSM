package com.chao.service;

import com.chao.pojo.User;

public interface userService {
    User login(User user);

    void add(User user);
}
