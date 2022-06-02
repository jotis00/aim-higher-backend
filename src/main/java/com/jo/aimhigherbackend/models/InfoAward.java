package com.jo.aimhigherbackend.models;

import javax.persistence.*;

@Entity
@Table(name = "info_award")
public class InfoAward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

    private String name;

    public InfoAward() {
    }

    public InfoAward(Long id, UserInfo userInfo, String name) {
        this.id = id;
        this.userInfo = userInfo;
        this.name = name;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
