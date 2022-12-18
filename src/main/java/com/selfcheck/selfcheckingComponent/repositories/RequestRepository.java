package com.selfcheck.selfcheckingComponent.repositories;

import com.selfcheck.selfcheckingComponent.models.Request;
import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Integer> {
}
