package com.apinexus.registry.features.pluginconfig;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PluginConfigRepository extends JpaRepository<PluginConfig, Long> {
    PluginConfig findByName(String name);
}
