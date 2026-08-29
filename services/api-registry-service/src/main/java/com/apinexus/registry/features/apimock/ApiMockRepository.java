package com.apinexus.registry.features.apimock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiMockRepository extends JpaRepository<ApiMock, Long> {
    ApiMock findByName(String name);
}
