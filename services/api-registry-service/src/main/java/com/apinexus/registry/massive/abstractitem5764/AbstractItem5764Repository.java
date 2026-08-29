package com.apinexus.registry.massive.abstractitem5764;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractItem5764Repository extends JpaRepository<AbstractItem5764, Long> {
    AbstractItem5764 findByName(String name);
}
