package com.spring.restapi.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restapi.springrest.entities.Tasks;

public interface TaskDao extends JpaRepository<Tasks,Long> {

}
