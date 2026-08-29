package com.apinexus.registry.massive.asyncpath1215;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncPath1215Repository extends JpaRepository<AsyncPath1215, Long> {
    AsyncPath1215 findByName(String name);
}
