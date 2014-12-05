/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Interface;

import BO.Cursist;
import java.util.List;

/**
 *
 * @author Benjamin
 */
public interface IDaCursist {
    void opslaan(Cursist s);
    void verwijderen (int ID );
    List<Cursist> allesOphalen();
    Cursist ophalen(int Id);
}
