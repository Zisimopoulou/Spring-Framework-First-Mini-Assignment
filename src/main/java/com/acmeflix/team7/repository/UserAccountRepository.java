package com.acmeflix.team7.repository;
import com.acmeflix.team7.domain.UserAccount;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
@RequiredArgsConstructor
public interface UserAccountRepository  extends JpaRepository<UserAccount, Long> {
        private UserAccountRepository userAccountRepository;

        @Override
        JpaRepository<UserAccount, Long> getRepository() {
                return userAccountRepository;
        }

      @Override
      public UserAccount findUserAccountByEmail (final String email) {
        return userAccountRepository.findUserAccountByEmail(email);
      }
}


