package com.peacock.OneGate_CRM.repository;

import com.peacock.OneGate_CRM.domain.Opportunity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OpportunityRepository extends MongoRepository<Opportunity, String> {
}
