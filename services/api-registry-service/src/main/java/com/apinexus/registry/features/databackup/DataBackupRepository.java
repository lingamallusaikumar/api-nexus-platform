package com.apinexus.registry.features.databackup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBackupRepository extends JpaRepository<DataBackup, Long> {
    DataBackup findByName(String name);
}
