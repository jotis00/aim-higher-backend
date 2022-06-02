package com.jo.aimhigherbackend.controllers;

import com.jo.aimhigherbackend.models.BlogComment;
import com.jo.aimhigherbackend.models.BlogPost;
import com.jo.aimhigherbackend.models.User;
import com.jo.aimhigherbackend.repositories.BlogCommentRepository;
import com.jo.aimhigherbackend.repositories.BlogPostRepository;
import com.jo.aimhigherbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private BlogPostRepository blogPostRepo;

    @Autowired
    private BlogCommentRepository blogCommentRepo;

    @GetMapping("/user")
    public Collection<BlogComment> returnUsers() {
        System.out.println("user hit");
        User user = userRepo.findByUsername("jaxsono")
                .orElseThrow(()-> new RuntimeException("User not found"));

//        BlogPost blogPost = new BlogPost(user, "jaxsono", "flair", "content", "date", true, true);

        Long userId = user.getId();

        List<BlogPost> blogPostList = blogPostRepo.findByUserId(userId);
//        BlogComment blogComment = new BlogComment(blogPostList.get(0), "jaxsono", "comment content");
//        blogCommentRepo.save(blogComment);


        return blogCommentRepo.findByBlogPostId(blogPostList.get(0).getId());
    }

}
