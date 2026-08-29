package com.apinexus.registry.massive.staticmodule1981;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticModule1981Repository extends JpaRepository<StaticModule1981, Long> {
    StaticModule1981 findByName(String name);
}
