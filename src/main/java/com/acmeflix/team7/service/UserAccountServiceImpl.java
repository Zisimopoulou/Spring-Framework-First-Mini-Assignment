package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.UserAccount;
import com.acmeflix.team7.domain.enums.SubscriptionPlan;
import com.acmeflix.team7.repository.UserAccountRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl extends BaseServiceImpl <UserAccount>implements UserAccountService {

    private  UserAccountRepository userAccountRepository;

   // public UserAccountServiceImpl(userAccountRepository userAccountServiceRepository) {
   //     this.userAccountRepository = userAccountRepository;
  //  }

    @Override
    public JpaRepository<UserAccount, Long> getRepository() {
        return userAccountRepository;
    }

    @Override
    public UserAccount findUserAccountByEmail(String email) {
        return userAccountRepository.findUserAccountByEmail(email);
    }
}

