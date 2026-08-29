package com.apinexus.registry.massive.globallist4863;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalList4863Repository extends JpaRepository<GlobalList4863, Long> {
    GlobalList4863 findByName(String name);
}
