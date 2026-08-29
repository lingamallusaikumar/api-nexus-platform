package com.apinexus.registry.massive.hubjob9339;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/hubjob9339")
public class HubJob9339Controller {
    private final HubJob9339Service service;
    
    public HubJob9339Controller(HubJob9339Service service) { this.service = service; }
    
    @GetMapping
    public List<HubJob9339> getAll() { return service.findAll(); }
    
    @PostMapping
    public HubJob9339 create(@RequestBody HubJob9339 entity) { return service.save(entity); }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.deleteById(id); }
    
    @PostMapping("/execute")
    public String execute() {
        service.executeCustomLogic();
        return "Executed HubJob9339";
    }
}
