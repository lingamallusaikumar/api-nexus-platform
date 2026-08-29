package com.apinexus.registry.massive.abstractarray4747;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractArray4747Repository extends JpaRepository<AbstractArray4747, Long> {
    AbstractArray4747 findByName(String name);
}
