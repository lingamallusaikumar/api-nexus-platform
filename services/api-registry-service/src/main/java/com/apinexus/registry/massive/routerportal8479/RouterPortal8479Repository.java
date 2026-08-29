package com.apinexus.registry.massive.routerportal8479;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterPortal8479Repository extends JpaRepository<RouterPortal8479, Long> {
    RouterPortal8479 findByName(String name);
}
