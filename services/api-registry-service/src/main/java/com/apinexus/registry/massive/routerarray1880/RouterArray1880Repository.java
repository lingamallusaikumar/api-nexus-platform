package com.apinexus.registry.massive.routerarray1880;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouterArray1880Repository extends JpaRepository<RouterArray1880, Long> {
    RouterArray1880 findByName(String name);
}
