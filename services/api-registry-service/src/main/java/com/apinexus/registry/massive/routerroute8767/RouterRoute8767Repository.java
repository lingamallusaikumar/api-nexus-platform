package com.apinexus.registry.massive.routerroute8767;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterRoute8767Repository extends JpaRepository<RouterRoute8767, Long> {
    RouterRoute8767 findByName(String name);
}
