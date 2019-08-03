package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pes.entity.Comments;

public interface CommentsRepository extends JpaRepository<Comments, Long>{
	
    @Query(value = 
    		  "SELECT count(*) " 
            + "FROM Comments " 
            + "WHERE result_id = :member_result_id"
            , nativeQuery = true)
    int findCommentCount(@Param("member_result_id") Long memberResultId);
}
