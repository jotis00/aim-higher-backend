package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.DailyUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DailyUpdateRepository extends JpaRepository<DailyUpdate, Long> {
    List<DailyUpdate> findByUserId(Long userId);
}
