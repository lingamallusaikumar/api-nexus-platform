package com.apinexus.registry.massive.staticstore7652;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticStore7652Repository extends JpaRepository<StaticStore7652, Long> {
    StaticStore7652 findByName(String name);
}
