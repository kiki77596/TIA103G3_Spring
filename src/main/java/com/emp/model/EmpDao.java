package com.emp.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpDao extends JpaRepository<EmpVo, Integer>{

}
