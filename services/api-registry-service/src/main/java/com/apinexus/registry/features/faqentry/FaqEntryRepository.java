package com.apinexus.registry.features.faqentry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqEntryRepository extends JpaRepository<FaqEntry, Long> {
    FaqEntry findByName(String name);
}
