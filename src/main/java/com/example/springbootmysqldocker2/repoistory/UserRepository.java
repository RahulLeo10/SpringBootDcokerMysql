package com.example.springbootmysqldocker2.repoistory;


import com.example.springbootmysqldocker2.Dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {






}
