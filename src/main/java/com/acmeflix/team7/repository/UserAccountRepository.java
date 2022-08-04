package com.acmeflix.team7.repository;
import com.acmeflix.team7.domain.UserAccount;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
        UserAccount findUserAccountByEmail (final String email);
}


