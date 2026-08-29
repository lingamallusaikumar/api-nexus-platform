package com.apinexus.registry.massive.blockcache5322;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockCache5322Repository extends JpaRepository<BlockCache5322, Long> {
    BlockCache5322 findByName(String name);
}
