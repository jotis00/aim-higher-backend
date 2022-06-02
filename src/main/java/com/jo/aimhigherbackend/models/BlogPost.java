package com.jo.aimhigherbackend.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "blog_post")
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    @Size(max = 10)
    private String flair;

    @NotBlank
    @Size (max = 280)
    private String content;

    @NotBlank
    @Size
    private String date;

    @NotBlank
    private Boolean userExplorePost;

    @NotBlank
    private Boolean explorePost;

    @OneToMany
    private Set<BlogComment> blogPostComments = new HashSet<>();

    private Long likes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFlair() {
        return flair;
    }

    public void setFlair(String flair) {
        this.flair = flair;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getLikes() {
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Set<BlogComment> getBlogPostComments() {
        return blogPostComments;
    }

    public void setBlogPostComments(Set<BlogComment> blogPostComments) {
        this.blogPostComments = blogPostComments;
    }

    public Boolean getUserExplorePost() {
        return userExplorePost;
    }

    public void setUserExplorePost(Boolean userExplorePost) {
        this.userExplorePost = userExplorePost;
    }

    public Boolean getExplorePost() {
        return explorePost;
    }

    public void setExplorePost(Boolean explorePost) {
        this.explorePost = explorePost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
