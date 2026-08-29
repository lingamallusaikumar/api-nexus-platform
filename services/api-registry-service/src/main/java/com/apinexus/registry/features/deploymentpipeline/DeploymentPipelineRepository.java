package com.apinexus.registry.features.deploymentpipeline;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeploymentPipelineRepository extends JpaRepository<DeploymentPipeline, Long> {
    DeploymentPipeline findByName(String name);
}
