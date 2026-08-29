package com.apinexus.registry.massive.remotepath7953;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemotePath7953Repository extends JpaRepository<RemotePath7953, Long> {
    RemotePath7953 findByName(String name);
}
