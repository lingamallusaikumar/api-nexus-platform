package com.apinexus.registry.massive.globalworker6120;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalWorker6120Repository extends JpaRepository<GlobalWorker6120, Long> {
    GlobalWorker6120 findByName(String name);
}
