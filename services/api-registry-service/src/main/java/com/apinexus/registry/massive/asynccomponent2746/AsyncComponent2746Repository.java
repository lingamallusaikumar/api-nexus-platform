package com.apinexus.registry.massive.asynccomponent2746;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncComponent2746Repository extends JpaRepository<AsyncComponent2746, Long> {
    AsyncComponent2746 findByName(String name);
}
