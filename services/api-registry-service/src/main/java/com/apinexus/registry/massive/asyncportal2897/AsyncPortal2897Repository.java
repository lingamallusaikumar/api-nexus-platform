package com.apinexus.registry.massive.asyncportal2897;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsyncPortal2897Repository extends JpaRepository<AsyncPortal2897, Long> {
    AsyncPortal2897 findByName(String name);
}
