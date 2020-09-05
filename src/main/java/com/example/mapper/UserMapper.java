package com.example.mapper;

import org.springframework.stereotype.Repository;
import com.example.pojo.User;
@Repository
public interface UserMapper {
    User Sel(int id);
}
