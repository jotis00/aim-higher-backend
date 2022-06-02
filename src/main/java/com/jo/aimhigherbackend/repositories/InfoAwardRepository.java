package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.InfoAward;
import com.jo.aimhigherbackend.models.InfoDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoAwardRepository extends JpaRepository<InfoAward, Long> {
    List<InfoDegree> findByUserInfoId(Long userInfoID);
}
