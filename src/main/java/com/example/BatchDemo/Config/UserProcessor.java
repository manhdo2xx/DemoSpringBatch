package com.example.BatchDemo.Config;

import com.example.BatchDemo.Entity.User;
import org.springframework.batch.item.ItemProcessor;

public class UserProcessor implements ItemProcessor<User, User> {

    @Override
    public User process(User item) throws Exception {
        item.setId(null);
        return item;
    }
}
