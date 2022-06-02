package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.InfoJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoJobRepository extends JpaRepository<InfoJob, Long> {
    List<InfoJob> findByUserInfoId(Long userInfoId);

}
