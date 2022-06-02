package com.jo.aimhigherbackend.models;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table( name = "daily_update")
public class DailyUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Size (max = 10)
    private String meals;

    @Size (max = 10)
    private String water;

    private boolean meditation;

    private float sleep;

    private float workHours;

    private float workRevenue;

    private float friendInteraction;

    private float familyInteraction;

    private Boolean intimacy;

    @Size(max = 280)
    private String notes;

//    public DailyUpdate() {}
//    public DailyUpdate()


    public DailyUpdate() {
    }

    public DailyUpdate(Long id, User user, String meals, String water, boolean meditation, float sleep, float workHours, float workRevenue, float friendInteraction, float familyInteraction, Boolean intimacy, String notes) {
        this.id = id;
        this.user = user;
        this.meals = meals;
        this.water = water;
        this.meditation = meditation;
        this.sleep = sleep;
        this.workHours = workHours;
        this.workRevenue = workRevenue;
        this.friendInteraction = friendInteraction;
        this.familyInteraction = familyInteraction;
        this.intimacy = intimacy;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public boolean isMeditation() {
        return meditation;
    }

    public void setMeditation(boolean meditation) {
        this.meditation = meditation;
    }

    public float getSleep() {
        return sleep;
    }

    public void setSleep(float sleep) {
        this.sleep = sleep;
    }

    public float getWorkHours() {
        return workHours;
    }

    public void setWorkHours(float workHours) {
        this.workHours = workHours;
    }

    public float getWorkRevenue() {
        return workRevenue;
    }

    public void setWorkRevenue(float workRevenue) {
        this.workRevenue = workRevenue;
    }

    public float getFriendInteraction() {
        return friendInteraction;
    }

    public void setFriendInteraction(float friendInteraction) {
        this.friendInteraction = friendInteraction;
    }

    public float getFamilyInteraction() {
        return familyInteraction;
    }

    public void setFamilyInteraction(float familyInteraction) {
        this.familyInteraction = familyInteraction;
    }

    public Boolean getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(Boolean intimacy) {
        this.intimacy = intimacy;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
