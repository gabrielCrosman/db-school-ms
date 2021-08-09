package account.account.controller;

import account.account.domain.Account;
import account.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/all")
    public ResponseEntity findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(accountService.findAll());
    }

    @PostMapping("/account")
    public ResponseEntity save(@RequestBody Account account) {
        return ResponseEntity.status(HttpStatus.CREATED).body(account);
    }
}
