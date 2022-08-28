package com.servidor.servidor.security.services;

import com.servidor.servidor.security.enums.RoleName;
import com.servidor.servidor.security.models.Role;
import com.servidor.servidor.security.repository.RoleRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {

    @Autowired
    RoleRepository rolRepository;

    public Optional<Role> getByRoleName(RoleName roleName) {
        return rolRepository.findByRoleName(roleName);
    }

    public void save(Role role) {
        rolRepository.save(role);
    }
}
