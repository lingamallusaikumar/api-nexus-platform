package com.apinexus.registry.features.grpcprotobuf;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/grpcprotobuf")
public class GrpcProtobufController {
    private final GrpcProtobufService service;
    public GrpcProtobufController(GrpcProtobufService service) { this.service = service; }
    @GetMapping
    public List<GrpcProtobuf> getAll() { return service.findAll(); }
    @PostMapping
    public GrpcProtobuf create(@RequestBody GrpcProtobuf entity) { return service.save(entity); }
    @PostMapping("/1")
    public String customRoute1() { return "OK"; }
    @PostMapping("/2")
    public String customRoute2() { return "OK"; }
    @PostMapping("/3")
    public String customRoute3() { return "OK"; }
    @PostMapping("/4")
    public String customRoute4() { return "OK"; }
}
