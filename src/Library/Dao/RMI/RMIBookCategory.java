/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao.RMI;

import Library.Service.IBookCategoryService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jean claude
 */
public class RMIBookCategory {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
            IBookCategoryService bookcategoryservice = (IBookCategoryService) registry.lookup("bookcategoryservice");
            boolean out = bookcategoryservice.save("0002", "Zoology_RMI");
            System.out.println(out ? "Saved Successfully!!" : "Error. cant't Saved!");
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(RMIBookCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
