package com.apinexus.registry.features.deploymentpipeline;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/deploymentpipeline")
public class DeploymentPipelineController {
    private final DeploymentPipelineService service;
    public DeploymentPipelineController(DeploymentPipelineService service) { this.service = service; }
    @GetMapping
    public List<DeploymentPipeline> getAll() { return service.findAll(); }
    @PostMapping
    public DeploymentPipeline create(@RequestBody DeploymentPipeline entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
