package com.crud.ecom.service;

import com.crud.ecom.Entity.User;
import com.crud.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    @Autowired
    private UserRepository repository;

    public List<User> getallUser()
    {
        return repository.findAll();
    }

    public User creatUsers(User user)
    {
        return repository.save(user);
    }
    public User getuserByid(Long id)
    {
        return repository.findById(id).orElseThrow(()->new RuntimeException("ID NOT FOUND!"));
    }

    public User addUsers(User user)
    {
        return repository.save(user);
    }

    public User updateUser(Long id ,User user)
    {
        User update  = repository.findById(id).orElseThrow(()->new RuntimeException("ID NOT FOUND!"));
        update.setUserName(user.getUserName());
        update.setUserEmail(user.getUserEmail());
        update.setUserNumber(user.getUserNumber());
        return repository.save(update);
    }

    public void deleleteUserbyId(Long id)
    {
        repository.deleteById(id);
    }

}
