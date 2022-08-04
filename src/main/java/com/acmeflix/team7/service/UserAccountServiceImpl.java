package com.acmeflix.team7.service;

import com.acmeflix.team7.domain.UserAccount;
import com.acmeflix.team7.domain.enums.SubscriptionPlan;
import com.acmeflix.team7.repository.ContentCatalogRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

@Getter
@Setter

public class UserAccountServiceImpl extends BaseServiceImpl <UserAccount>implements UserAccountService {

    private final ContentCatalogRepository userAccountServiceRepository;

    public UserAccountServiceImpl(ContentCatalogRepository userAccountServiceRepository) {
        this.userAccountServiceRepository = userAccountServiceRepository;
    }

    @Override
    public JpaRepository<UserAccount, Long> getRepository() {
        return null;
    }
}

