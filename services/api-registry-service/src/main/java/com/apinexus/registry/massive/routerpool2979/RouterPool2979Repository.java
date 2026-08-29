package com.apinexus.registry.massive.routerpool2979;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterPool2979Repository extends JpaRepository<RouterPool2979, Long> {
    RouterPool2979 findByName(String name);
}
