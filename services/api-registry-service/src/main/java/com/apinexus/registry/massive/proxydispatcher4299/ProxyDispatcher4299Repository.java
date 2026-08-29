package com.apinexus.registry.massive.proxydispatcher4299;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyDispatcher4299Repository extends JpaRepository<ProxyDispatcher4299, Long> {
    ProxyDispatcher4299 findByName(String name);
}
