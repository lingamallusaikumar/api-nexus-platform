package com.apinexus.registry.massive.corebuffer1019;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreBuffer1019Repository extends JpaRepository<CoreBuffer1019, Long> {
    CoreBuffer1019 findByName(String name);
}
