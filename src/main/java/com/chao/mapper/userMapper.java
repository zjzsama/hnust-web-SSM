package com.chao.mapper;

import com.chao.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface userMapper {

    @Select("select * from users where username = #{username} and password = #{password}")
    User getByusernameAndPassword(User user);

    @Insert("insert into web_course.users (username, password) " +
            "VALUES(#{username},#{password})")
    void insert(User user);
}
