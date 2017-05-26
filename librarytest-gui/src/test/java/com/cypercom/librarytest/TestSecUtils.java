/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cypercom.librarytest;

import com.cybercom.librarytest.model.User;
import com.cybercom.librarytest.ui.SecUtils;
import com.cybercom.librarytest.ui.ViewUtils;
import org.junit.Test;

/**
 *
 * @author testautom-nack
 */
public class TestSecUtils extends TestBase{
    
    @Test
    public void testCurrentUserCan(){
        	/**
	 * Returns true if the current user is allowed to perform all
	 * specified actions, otherwise false.
	 */
                //create user
                //logg in as the user
                // get the user role
                //
                
         User user = new User();  
         user.setDisplayName("hasan");
         user.setRole(User.Role.LOANER);  
         
         user.getDisplayName();
         user.getRole();          
        
        SecUtils.currentUserCan(User.Role.LOANER.toString());
        
    }
    
}
