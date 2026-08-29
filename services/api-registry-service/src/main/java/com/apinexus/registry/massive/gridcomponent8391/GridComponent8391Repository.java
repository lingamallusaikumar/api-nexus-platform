package com.apinexus.registry.massive.gridcomponent8391;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GridComponent8391Repository extends JpaRepository<GridComponent8391, Long> {
    GridComponent8391 findByName(String name);
}
