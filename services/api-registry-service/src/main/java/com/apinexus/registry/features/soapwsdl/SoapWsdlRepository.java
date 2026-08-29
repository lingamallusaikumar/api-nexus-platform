package com.apinexus.registry.features.soapwsdl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoapWsdlRepository extends JpaRepository<SoapWsdl, Long> {
    SoapWsdl findByName(String name);
}
