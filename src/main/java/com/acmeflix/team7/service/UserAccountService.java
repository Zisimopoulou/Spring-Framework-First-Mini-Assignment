package com.acmeflix.team7.service;
import com.acmeflix.team7.domain.UserAccount;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public interface UserAccountService extends BaseService<UserAccount> {
    UserAccount findUserAccountByEmail(String email);
}

