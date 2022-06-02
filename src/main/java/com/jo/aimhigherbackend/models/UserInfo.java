package com.jo.aimhigherbackend.models;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "user_info")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;

    private String height;

    private float weight;

    private float hsGpa;

    private Integer act;

    private Integer sat;

    private float cgGPA;

    @OneToMany
    private Set<InfoDegree> userDegrees = new HashSet<>();

    @OneToMany
    private Set<InfoJob> userJobs = new HashSet<>();

    @OneToMany
    private Set<InfoService> userServices = new HashSet<>();

    @OneToMany
    private Set<InfoAward> userAwards = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHsGpa() {
        return hsGpa;
    }

    public void setHsGpa(float hsGpa) {
        this.hsGpa = hsGpa;
    }

    public Integer getAct() {
        return act;
    }

    public void setAct(Integer act) {
        this.act = act;
    }

    public Integer getSat() {
        return sat;
    }

    public void setSat(Integer sat) {
        this.sat = sat;
    }

    public float getCgGPA() {
        return cgGPA;
    }

    public void setCgGPA(float cgGPA) {
        this.cgGPA = cgGPA;
    }

    public Set<InfoDegree> getUserDegrees() {
        return userDegrees;
    }

    public void setUserDegrees(Set<InfoDegree> userDegrees) {
        this.userDegrees = userDegrees;
    }

    public Set<InfoJob> getUserJobs() {
        return userJobs;
    }

    public void setUserJobs(Set<InfoJob> userJobs) {
        this.userJobs = userJobs;
    }

    public Set<InfoService> getUserServices() {
        return userServices;
    }

    public void setUserServices(Set<InfoService> userServices) {
        this.userServices = userServices;
    }

    public Set<InfoAward> getUserAwards() {
        return userAwards;
    }

    public void setUserAwards(Set<InfoAward> userAwards) {
        this.userAwards = userAwards;
    }
}
