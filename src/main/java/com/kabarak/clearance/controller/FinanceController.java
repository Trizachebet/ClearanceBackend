package com.kabarak.clearance.controller;

import com.kabarak.clearance.payload.FinanceResponse;
import com.kabarak.clearance.payload.PaymentRequest;
import com.kabarak.clearance.payload.PaymentResponse;
import com.kabarak.clearance.service.FinanceService;
import com.kabarak.clearance.payload.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/finance")
@CrossOrigin
public class FinanceController {
    @Autowired
    FinanceService financeService;



//    @PostMapping("/save")
//    public void addRecord(@RequestBody FinanceRequest request){
//        financeService.addRecord(request);
//
//    }
    @GetMapping("/list")
    public List<FinanceResponse> getAllRecords(){
        return financeService.getAllRecords();

    }
    @GetMapping("/findbyid/{id}")
    public FinanceResponse findById(@PathVariable Long id){

        return financeService.findRecordById(id);
    }
    @GetMapping("/clearance/{id}")
    public ResponseEntity<?> clearStudent(@PathVariable Long id){

        return financeService.clearStudent(id);
    }
    @PostMapping("/payment")
    public ResponseEntity<?> makePayment(@RequestBody PaymentRequest paymentRequest){
        return financeService.makePayment(paymentRequest);
    }
    @GetMapping("/payment/list")
    public List<PaymentResponse> listPayment(){

        return financeService.listPayment();
    }
    @GetMapping("/student/fee/balance/{id}")
    public ResponseEntity<?> findFeeBalanceById(@PathVariable Long id){

        return financeService.findFeeBalanceById(id);
    }

    @GetMapping("/student/payments/{id}")
    public ResponseEntity<?> findStudentPaymentsById(@PathVariable Long id){

        return financeService.findStudentPayments(id);
    }


}
