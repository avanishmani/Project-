package com.masai.Dao;

import com.masai.model.Account;
import java.util.*;
public interface AccountDao {
 public boolean CreateAccount(Account acc);
 boolean deleteAccount(int accNo);
 boolean UpdateAc(Account acc);
 Account findAccount(int accno);
List< Account> findByName(String name);
}
