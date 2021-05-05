package com.example.FinalAssignment;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class BankController {


    @GetMapping("/accounts/{ID}}")
    public List<String>  GetUsers(@PathVariable String ID) {
        BankClass bs = null;
        List<String> bank = new ArrayList<>();
        String balance = bs.getBalance().toString();
        bank.add(balance);
        bank.add(ID);
        String name = bs.getCustomerName().toString();
        bank.add(name);
        String createdDate = bs.getCreatedDate().toString();
        bank.add(createdDate);
        return bank;

    }

    @PostMapping("/accounts/{ID}/withdrawal")
    public String Withdrawl(@PathVariable Double balance) {
        BankClass bs = null;
        Double current = bs.getBalance();
        if(current >= balance){
            bs.setBalance(current - balance);
            return "Processed";
        }
        else{
            return "You don't have that much money";

        }

    }

    @PostMapping("Bank/accounts/{id}/deposit")
    public Double Depoist(@RequestBody
                                      @PathVariable Double ID
    ) {
        BankClass bs = null;
        List<String> bank = new ArrayList<>();
        bs.setBalance(ID);

        bs.getBalance();
        return bs.getBalance();
    }

    @PostMapping("Bank/accounts")
    public BankClass AddUser(@RequestBody
                           @PathVariable String UserName
    )
    {
        Random rand = new Random();
        long customerID = rand.nextInt(100000000);
        Long createdDate = System.currentTimeMillis();
        double balance = 0;
        String name = UserName;

        BankClass bank = new BankClass(name, createdDate, customerID, balance);

        return bank;
    }



}
