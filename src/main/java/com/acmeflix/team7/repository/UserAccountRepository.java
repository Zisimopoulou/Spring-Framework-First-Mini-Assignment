package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.UserAccount;

import java.util.List;

public interface UserAccountRepository extends BaseRepository<UserAccount, Long> {
    List<UserAccount> findUserAccountByEmail(final String email);
}


