package com.apinexus.registry.massive.routerprocess4608;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterProcess4608Repository extends JpaRepository<RouterProcess4608, Long> {
    RouterProcess4608 findByName(String name);
}
