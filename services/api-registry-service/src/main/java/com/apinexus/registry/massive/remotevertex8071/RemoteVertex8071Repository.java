package com.apinexus.registry.massive.remotevertex8071;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteVertex8071Repository extends JpaRepository<RemoteVertex8071, Long> {
    RemoteVertex8071 findByName(String name);
}
