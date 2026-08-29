package com.apinexus.registry.massive.routercomponent6710;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterComponent6710Repository extends JpaRepository<RouterComponent6710, Long> {
    RouterComponent6710 findByName(String name);
}
