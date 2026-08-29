package com.apinexus.registry.features.ldapconfig;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LdapConfigRepository extends JpaRepository<LdapConfig, Long> {
    LdapConfig findByName(String name);
}
