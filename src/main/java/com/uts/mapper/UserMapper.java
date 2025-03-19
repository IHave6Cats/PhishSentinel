package com.uts.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uts.pojo.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
