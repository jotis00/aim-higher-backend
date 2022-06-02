package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.InfoDegree;
import com.jo.aimhigherbackend.models.InfoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoServiceRepository extends JpaRepository<InfoService, Long> {
    List<InfoDegree> findByUserInfoId(Long userInfoID);
}
