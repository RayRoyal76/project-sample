package com.rayvon.mvcapprenticeship.service;

import com.rayvon.mvcapprenticeship.model.Billionaire;
import com.rayvon.mvcapprenticeship.repo.BillionaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BillionaireService {


    @Autowired
    BillionaireRepo billionaireRepo;

    public void saveBillionaire(String firstName, String lastName, String career) {
        billionaireRepo.save(new Billionaire(firstName, lastName, career));

    }
        public List<Billionaire> getAllBillionaire(){
            return billionaireRepo.findAll();
        }


}
