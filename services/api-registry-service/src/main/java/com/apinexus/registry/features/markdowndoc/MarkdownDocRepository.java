package com.apinexus.registry.features.markdowndoc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkdownDocRepository extends JpaRepository<MarkdownDoc, Long> {
    MarkdownDoc findByName(String name);
}
