package com.apinexus.registry.massive.databuffer6879;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBuffer6879Repository extends JpaRepository<DataBuffer6879, Long> {
    DataBuffer6879 findByName(String name);
}
