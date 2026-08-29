package com.apinexus.registry.massive.remotepath9011;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemotePath9011Repository extends JpaRepository<RemotePath9011, Long> {
    RemotePath9011 findByName(String name);
}
