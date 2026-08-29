package com.apinexus.registry.massive.coreprocess7087;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreProcess7087Repository extends JpaRepository<CoreProcess7087, Long> {
    CoreProcess7087 findByName(String name);
}
