package com.apinexus.registry.massive.proxyadapter6873;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyAdapter6873Repository extends JpaRepository<ProxyAdapter6873, Long> {
    ProxyAdapter6873 findByName(String name);
}
