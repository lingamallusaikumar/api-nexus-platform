package com.apinexus.registry.massive.abstractlog4319;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractLog4319Repository extends JpaRepository<AbstractLog4319, Long> {
    AbstractLog4319 findByName(String name);
}
