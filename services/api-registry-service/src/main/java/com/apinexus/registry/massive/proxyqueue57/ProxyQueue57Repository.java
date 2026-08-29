package com.apinexus.registry.massive.proxyqueue57;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyQueue57Repository extends JpaRepository<ProxyQueue57, Long> {
    ProxyQueue57 findByName(String name);
}
