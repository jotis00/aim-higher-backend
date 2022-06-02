package com.jo.aimhigherbackend.models;

import org.hibernate.annotations.SortComparator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 20)
    private String username;

    @Size(max = 100)
    private String password;

    @Size(max = 40)
    private String email;

    private Boolean subscriptionStatus;

    public User() {}
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_user_info",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "user_info_id"))
    private UserInfo userInfo;

    @OneToMany
    private Set<BlogPost> blogPosts = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable (name = "friends",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "friend_id"))
    private Set<User> friends = new HashSet<>();

    @OneToMany
    private Set<DailyUpdate> dailyUpdates = new HashSet<>();

//    @OneToOne
//    private UserInfo userInfo;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(Boolean subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<DailyUpdate> getDailyUpdates() {
        return dailyUpdates;
    }

    public void setDailyUpdates(Set<DailyUpdate> dailyUpdates) {
        this.dailyUpdates = dailyUpdates;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
