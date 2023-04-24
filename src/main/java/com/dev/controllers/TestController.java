package com.dev.controllers;

import com.dev.BasicResponse;
import com.dev.User;
import com.dev.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.dev.Errors.*;


@RestController
public class TestController {

    private List<Client> potentsialClients = new ArrayList<>();

    @Autowired
    public Utils utils;

    @PostConstruct
    public void init () {
        Client test1=new Client("arie levy","0585381648");
        potentsialClients.add(test1);
    }

    @RequestMapping(value = "send", method = {RequestMethod.POST})
    public void addToList (String name,String phoneNumber) {
        Client newClient= new Client(name,phoneNumber);
        this.potentsialClients.add(newClient);
    }

    @RequestMapping(value = "admin/show-list", method = {RequestMethod.GET})
    public List<Client> showList () {
    return this.potentsialClients;
    }

   /*   הוספת שם משתמש וסיסמא + עמוד דפדפן שדרכו אגש לשרת ואבקש לראות את הרשימה
   @RequestMapping (value = "login-admin-count", method = {RequestMethod.GET, RequestMethod.POST})
    public Object login (String username, String password) {
        boolean success = false;
        Integer errorCode = null;
        if (username != null && username.length() > 0) {
            if (password != null && password.length() > 0) {
                User user = this.getUser(username, password);
                if (user != null) {
                    success = true;
                } else {
                    errorCode = ERROR_LOGIN_WRONG_CREDS;
                }
            } else {
                errorCode = ERROR_SIGN_UP_NO_PASSWORD;
            }
        } else {
            errorCode = ERROR_SIGN_UP_NO_USERNAME;
        }
        return new BasicResponse(success, errorCode);
    }


    private User getUser (String username, String password) {
        User user = null;
        for (User currentUser : this.users) {
            if (currentUser.isSameCreds(username, password)) {
                user = currentUser;
                break;
            }
        }
        return user;
    }
 */


}
