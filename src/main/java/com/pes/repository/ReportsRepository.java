package com.pes.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pes.entity.Reports;

public interface ReportsRepository extends JpaRepository<Reports, Long>{
	
    @Query(value = 
    		  "SELECT * " 
            + "FROM reports " 
            + "WHERE result_id = :result_id"
            , nativeQuery = true)
    Stream<Reports> findByResultId(@Param("result_id") Long resultId);
	
}
