package com.rayvon.mvcapprenticeship;

import com.rayvon.mvcapprenticeship.model.Billionaire;
import com.rayvon.mvcapprenticeship.repo.BillionaireRepo;
import com.rayvon.mvcapprenticeship.service.BillionaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Runner implements CommandLineRunner {

    @Autowired
    BillionaireRepo billionaireRepo;

    @Autowired
    BillionaireService billionaireService;

    @Override
    public void run(String... args) throws Exception {

        billionaireService.saveBillionaire("Bruce","Wayne","CEO");
        System.out.println("entities added");

    }
}
