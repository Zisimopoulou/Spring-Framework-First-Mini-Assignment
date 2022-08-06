package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.UserAccount;
import com.acmeflix.team7.repository.BaseRepository;
import com.acmeflix.team7.repository.UserAccountRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl extends BaseServiceImpl <UserAccount>implements UserAccountService {

    private UserAccountRepository userAccountRepository;

    @Override
    public BaseRepository<UserAccount, Long> getRepository() {
        return userAccountRepository;
    }

    @Override
    public UserAccount findUserAccountByEmail(final String email) {
        return userAccountRepository.findUserAccountByEmail(email).get(0);
    }
}

