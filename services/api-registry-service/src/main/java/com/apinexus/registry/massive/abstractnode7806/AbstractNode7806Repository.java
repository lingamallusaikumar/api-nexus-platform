package com.apinexus.registry.massive.abstractnode7806;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractNode7806Repository extends JpaRepository<AbstractNode7806, Long> {
    AbstractNode7806 findByName(String name);
}
