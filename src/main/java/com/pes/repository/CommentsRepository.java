package com.pes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pes.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long>{
	
    @Query(value = 
    		  "SELECT count(*) " 
            + "FROM Comments " 
            + "WHERE result_id = :result_id"
            , nativeQuery = true)
    int findCommentCount(@Param("result_id") Long resultId);

    @Query(value = 
  		  "SELECT * " 
          + "FROM Comments " 
          + "WHERE result_id = :result_id"
          , nativeQuery = true)
   List<Comments> findByResultId(@Param("result_id") Long resultId);
}
