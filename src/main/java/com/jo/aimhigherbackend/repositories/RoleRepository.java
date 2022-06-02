package com.jo.aimhigherbackend.repositories;

import com.jo.aimhigherbackend.models.ERole;
import com.jo.aimhigherbackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

