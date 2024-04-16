package com.github.simple_mocks.session.local.repository;

import com.github.simple_mocks.session.local.entity.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface PermissionEntityRepository extends JpaRepository<PermissionEntity, Long> {

    /**
     * Looking for permission by code ignore case
     *
     * @param code permission code
     * @return permission entity or empty
     */
    Optional<PermissionEntity> findByCodeIgnoreCase(String code);
}
