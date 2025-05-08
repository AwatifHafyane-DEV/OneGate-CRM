package com.peacock.OneGate_CRM.repository;

import com.peacock.OneGate_CRM.domain.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
