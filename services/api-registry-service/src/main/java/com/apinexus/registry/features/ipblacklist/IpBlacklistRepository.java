package com.apinexus.registry.features.ipblacklist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpBlacklistRepository extends JpaRepository<IpBlacklist, Long> {
    IpBlacklist findByName(String name);
}
