package com.twg.springboot.mydiary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.twg.springboot.mydiary.entity.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	
@Query(value="select * from users where username=:username LIMIT 1",nativeQuery=true)
public User findByUsername(String username);

//public User findByPassword(String password);


}
