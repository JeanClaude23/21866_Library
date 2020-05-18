/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library.Dao.RMI;

import Library.Service.IBookService;
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
public class BookRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2000);
            IBookService bookservice = (IBookService) registry.lookup("bookservice");
            boolean out = bookservice.save("0001", "loi_d'Afrique","France_lib", "1978-01-30", "Claude", 12345, "Francais");
            System.err.println(out ? "Saved Successfully!!" : "Error Ocurred. Can't Saved ");
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(BookRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}