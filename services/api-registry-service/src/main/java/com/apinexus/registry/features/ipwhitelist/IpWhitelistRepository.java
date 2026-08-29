package com.apinexus.registry.features.ipwhitelist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpWhitelistRepository extends JpaRepository<IpWhitelist, Long> {
    IpWhitelist findByName(String name);
}
