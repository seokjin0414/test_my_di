package me.shin;

import me.di.Inject;

public class AccountServise {

    @Inject
    AccountRepository accountRepository;

    public void join() {
        System.out.println("Service.join");
        accountRepository.save();
    }
}
