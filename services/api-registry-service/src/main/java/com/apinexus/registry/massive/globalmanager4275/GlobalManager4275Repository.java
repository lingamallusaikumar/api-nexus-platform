package com.apinexus.registry.massive.globalmanager4275;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalManager4275Repository extends JpaRepository<GlobalManager4275, Long> {
    GlobalManager4275 findByName(String name);
}
