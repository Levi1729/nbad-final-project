package com.nbad.finalprojectbackend.repositories;

import com.nbad.finalprojectbackend.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
} 