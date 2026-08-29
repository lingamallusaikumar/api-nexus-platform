package com.apinexus.registry.massive.coreentry4286;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreEntry4286Repository extends JpaRepository<CoreEntry4286, Long> {
    CoreEntry4286 findByName(String name);
}
