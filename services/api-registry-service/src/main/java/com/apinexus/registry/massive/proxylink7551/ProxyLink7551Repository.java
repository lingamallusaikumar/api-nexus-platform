package com.apinexus.registry.massive.proxylink7551;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyLink7551Repository extends JpaRepository<ProxyLink7551, Long> {
    ProxyLink7551 findByName(String name);
}
