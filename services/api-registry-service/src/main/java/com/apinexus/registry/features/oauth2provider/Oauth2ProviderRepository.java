package com.apinexus.registry.features.oauth2provider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Oauth2ProviderRepository extends JpaRepository<Oauth2Provider, Long> {
    Oauth2Provider findByName(String name);
}
