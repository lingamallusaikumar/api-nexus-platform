package com.apinexus.registry.massive.streamrecord957;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRecord957Repository extends JpaRepository<StreamRecord957, Long> {
    StreamRecord957 findByName(String name);
}
