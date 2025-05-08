package com.peacock.OneGate_CRM.repository;

import com.peacock.OneGate_CRM.domain.Lead;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeadRepository extends MongoRepository<Lead, String> {
}
