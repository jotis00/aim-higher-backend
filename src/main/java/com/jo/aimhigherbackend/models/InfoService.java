package com.jo.aimhigherbackend.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "info_service")
public class InfoService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_info_id")
    private UserInfo userInfo;

    @NotBlank
    @Size(max = 20)
    private String name;

    @NotBlank
    private float duration;

    public InfoService() {
    }

    public InfoService(Long id, UserInfo userInfo, String name, float duration) {
        this.id = id;
        this.userInfo = userInfo;
        this.name = name;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
