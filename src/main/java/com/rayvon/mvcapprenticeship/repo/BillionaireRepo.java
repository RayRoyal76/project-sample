package com.rayvon.mvcapprenticeship.repo;

import com.rayvon.mvcapprenticeship.model.Billionaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionaireRepo extends JpaRepository<Billionaire, Integer> {
}
