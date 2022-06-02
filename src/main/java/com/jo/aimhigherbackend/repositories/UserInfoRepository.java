package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
   //
}
