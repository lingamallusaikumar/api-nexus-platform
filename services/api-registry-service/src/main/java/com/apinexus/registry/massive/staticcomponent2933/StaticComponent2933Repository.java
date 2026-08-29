package com.apinexus.registry.massive.staticcomponent2933;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticComponent2933Repository extends JpaRepository<StaticComponent2933, Long> {
    StaticComponent2933 findByName(String name);
}
