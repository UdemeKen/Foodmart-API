package com.example.food.controllers;

import com.example.food.pojos.WalletTransactionResponse;
import com.example.food.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class WalletTransactionController {
    private final WalletTransactionService walletTransactionService;
    @GetMapping("/viweWalletTransactions")
    public WalletTransactionResponse viewWalletTransactions(){
        return walletTransactionService.viewWalletTransaction();
    }
}
