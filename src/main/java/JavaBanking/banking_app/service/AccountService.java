package JavaBanking.banking_app.service;


import JavaBanking.banking_app.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    //define getAccountById in AccountService
    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getALlAccounts();

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
