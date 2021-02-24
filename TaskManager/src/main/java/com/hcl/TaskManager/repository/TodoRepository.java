package com.hcl.TaskManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.TaskManager.model.*;

public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}