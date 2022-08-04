package com.acmeflix.team7.domain;

import com.acmeflix.team7.domain.enums.SubscriptionPlan;

import java.util.List;

public class UserAccount extends BaseModel{
    private String username;
    private String password;
    private String email;
    private List< Profile >profiles;
    private SubscriptionPlan subscriptionPlan;

}
