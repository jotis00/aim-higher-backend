package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.BlogComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogCommentRepository extends JpaRepository<BlogComment, Long> {
    List<BlogComment> findByBlogPostId(Long blogPostId);

}
