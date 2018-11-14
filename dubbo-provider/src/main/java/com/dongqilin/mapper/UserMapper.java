package com.dongqilin.mapper;


import com.dongqilin.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @description:
 * @author: dongql
 * @date: 2017/10/12 9:32
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("SELECT * FROM user WHERE user_name = #{username}")
    User findByName(
            @Param("username")
                    String username);
}
