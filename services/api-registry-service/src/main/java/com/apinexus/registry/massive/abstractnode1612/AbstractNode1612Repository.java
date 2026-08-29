package com.apinexus.registry.massive.abstractnode1612;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractNode1612Repository extends JpaRepository<AbstractNode1612, Long> {
    AbstractNode1612 findByName(String name);
}
