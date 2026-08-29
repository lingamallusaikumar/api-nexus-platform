package com.apinexus.registry.massive.routerpath5164;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterPath5164Repository extends JpaRepository<RouterPath5164, Long> {
    RouterPath5164 findByName(String name);
}
