package com.acmeflix.team7.repository;

import com.acmeflix.team7.domain.TvShow;
import com.acmeflix.team7.domain.UserAccount;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Component
public class UserAccountRepositoryImpl extends BaseRepositoryImpl<UserAccount> implements UserAccountRepository {
    private final AtomicLong sequence = new AtomicLong(1);
    private final Map<Long, UserAccount> storage = new LinkedHashMap<>();
    @Override
    public Map<Long, UserAccount> getStorage() {
        return storage;
    }
    @Override
    public AtomicLong getSequence() {
        return sequence;
    }

    @Override
    public List<UserAccount> findUserAccountByEmail(final String email) {
        return storage.values().stream().filter(e -> e.getEmail().equalsIgnoreCase(email)).collect(Collectors.toList());
    }
}
