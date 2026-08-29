package com.apinexus.registry.massive.griddispatcher721;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridDispatcher721Repository extends JpaRepository<GridDispatcher721, Long> {
    GridDispatcher721 findByName(String name);
}
