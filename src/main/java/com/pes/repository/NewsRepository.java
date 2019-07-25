package com.pes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pes.entity.News;

public interface NewsRepository extends JpaRepository<News, Long>{}
