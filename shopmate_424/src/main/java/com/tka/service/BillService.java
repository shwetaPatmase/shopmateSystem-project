package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.BillDao;
import com.tka.model.Bill;

@Service
public class BillService {

    @Autowired
    BillDao billDao;

    public void saveBill(Bill bill){
        billDao.save(bill);
    }

}