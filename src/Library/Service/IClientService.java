/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Service;

import java.rmi.Remote;

/**
 *
 * @author jean claude
 */
public interface IClientService extends Remote{
    public boolean save(String regno, String firstName, String lastName, String phoneNumber, String emailAddress, 
            String clientCategory, String image );
}
