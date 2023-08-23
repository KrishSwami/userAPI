package com.zeetron.userapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeetron.userapi.model.User;

public interface UserRespository extends JpaRepository<User , Integer> {

}
