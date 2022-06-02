package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    List<BlogPost> findByUserId(Long userId);
}
