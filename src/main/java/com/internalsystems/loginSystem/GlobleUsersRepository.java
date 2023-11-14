package com.internalsystems.loginSystem;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internalsystems.entities.GlobleUsers;


public interface GlobleUsersRepository extends JpaRepository<GlobleUsers, Long> {

}
