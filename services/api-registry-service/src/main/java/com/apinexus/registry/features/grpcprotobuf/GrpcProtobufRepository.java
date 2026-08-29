package com.apinexus.registry.features.grpcprotobuf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrpcProtobufRepository extends JpaRepository<GrpcProtobuf, Long> {
    GrpcProtobuf findByName(String name);
}
