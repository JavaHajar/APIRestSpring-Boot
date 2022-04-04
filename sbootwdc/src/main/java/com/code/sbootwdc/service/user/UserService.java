package com.code.sbootwdc.service.user;
import com.code.sbootwdc.model.Admin;
import com.code.sbootwdc.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> findAll();
    public User findById(Integer id);
    public void delete(Integer id);
    public Admin save(Admin admin);
    public User update(User user);
}
