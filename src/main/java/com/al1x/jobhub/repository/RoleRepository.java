package com.al1x.jobhub.repository;

import com.al1x.jobhub.domain.entity.Role;
import com.al1x.jobhub.domain.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
