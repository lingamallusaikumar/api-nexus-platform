package com.apinexus.registry.massive.coreengine2734;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreEngine2734Repository extends JpaRepository<CoreEngine2734, Long> {
    CoreEngine2734 findByName(String name);
}
