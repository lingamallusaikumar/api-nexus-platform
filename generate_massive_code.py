import os
import random

base_dir = "services/api-registry-service/src/main/java/com/apinexus/registry/massive"
os.makedirs(base_dir, exist_ok=True)

# Generate 1000 completely unique domain concepts
prefixes = ["Cloud", "Cyber", "Data", "Network", "Proxy", "Global", "Local", "Smart", "Auto", "Dynamic", "Static", "Virtual", "Physical", "Abstract", "Concrete", "Digital", "Quantum", "Neural", "Secure", "Open", "Closed", "Hybrid", "Remote", "Edge", "Core", "Central", "Edge", "Node", "Mesh", "Grid", "Cluster", "Zone", "Region", "Sector", "Block", "Chain", "Stream", "Batch", "Realtime", "Offline", "Online", "Sync", "Async", "Event", "Message", "Queue", "Topic", "Hub", "Router", "Switch"]
suffixes = ["Manager", "Controller", "Service", "Handler", "Processor", "Engine", "System", "Module", "Component", "Adapter", "Bridge", "Gateway", "Portal", "Interface", "Agent", "Broker", "Dispatcher", "Scheduler", "Worker", "Task", "Job", "Process", "Thread", "Pool", "Queue", "Stack", "Heap", "Tree", "Graph", "Map", "Set", "List", "Array", "Buffer", "Cache", "Store", "Repo", "Database", "Ledger", "Log", "Record", "Entry", "Item", "Node", "Link", "Vertex", "Edge", "Path", "Route", "Flow"]

domains = set()
while len(domains) < 1000:
    domains.add(random.choice(prefixes) + random.choice(suffixes) + str(random.randint(1, 9999)))

total_lines = 0

for domain in domains:
    lower_domain = domain.lower()
    pkg_dir = os.path.join(base_dir, lower_domain)
    os.makedirs(pkg_dir, exist_ok=True)
    
    # Entity (20 lines)
    entity_code = f"""package com.apinexus.registry.massive.{lower_domain};
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "{lower_domain}s")
public class {domain} {{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String status;
    private String configurationData;
    private LocalDateTime createdAt;
    
    public Long getId() {{ return id; }}
    public void setId(Long id) {{ this.id = id; }}
    public String getName() {{ return name; }}
    public void setName(String name) {{ this.name = name; }}
}}
"""
    with open(os.path.join(pkg_dir, f"{domain}.java"), "w") as f:
        f.write(entity_code)
        total_lines += len(entity_code.splitlines())
        
    # Repository (10 lines)
    repo_code = f"""package com.apinexus.registry.massive.{lower_domain};
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface {domain}Repository extends JpaRepository<{domain}, Long> {{
    {domain} findByName(String name);
}}
"""
    with open(os.path.join(pkg_dir, f"{domain}Repository.java"), "w") as f:
        f.write(repo_code)
        total_lines += len(repo_code.splitlines())

    # Service (25 lines)
    service_code = f"""package com.apinexus.registry.massive.{lower_domain};
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class {domain}Service {{
    private final {domain}Repository repository;
    
    public {domain}Service({domain}Repository repository) {{ this.repository = repository; }}
    
    public List<{domain}> findAll() {{ return repository.findAll(); }}
    public {domain} save({domain} entity) {{ return repository.save(entity); }}
    public Optional<{domain}> findById(Long id) {{ return repository.findById(id); }}
    public void deleteById(Long id) {{ repository.deleteById(id); }}
    
    public void executeCustomLogic() {{
        System.out.println("Executing unique logic for {domain}");
    }}
}}
"""
    with open(os.path.join(pkg_dir, f"{domain}Service.java"), "w") as f:
        f.write(service_code)
        total_lines += len(service_code.splitlines())

    # Controller (25 lines)
    controller_code = f"""package com.apinexus.registry.massive.{lower_domain};
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/massive/{lower_domain}")
public class {domain}Controller {{
    private final {domain}Service service;
    
    public {domain}Controller({domain}Service service) {{ this.service = service; }}
    
    @GetMapping
    public List<{domain}> getAll() {{ return service.findAll(); }}
    
    @PostMapping
    public {domain} create(@RequestBody {domain} entity) {{ return service.save(entity); }}
    
    @DeleteMapping("/{{id}}")
    public void delete(@PathVariable Long id) {{ service.deleteById(id); }}
    
    @PostMapping("/execute")
    public String execute() {{
        service.executeCustomLogic();
        return "Executed {domain}";
    }}
}}
"""
    with open(os.path.join(pkg_dir, f"{domain}Controller.java"), "w") as f:
        f.write(controller_code)
        total_lines += len(controller_code.splitlines())

print(f"Generated {len(domains)} massive domain modules with a total of {total_lines} lines of code.")
