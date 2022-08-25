package com.servidor.servidor.security.repository;

import com.servidor.servidor.security.enums.RoleName;
import com.servidor.servidor.security.models.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Object> {

    Optional<Role> findByRoleName(RoleName roleName);

}
