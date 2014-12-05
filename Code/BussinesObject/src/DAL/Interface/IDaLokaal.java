/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Interface;

import BO.Lokaal;
import java.util.List;

/**
 *
 * @author Benjamin
 */
public interface IDaLokaal {
    void opslaan(Lokaal s);
    void verwijderen (int ID );
    List<Lokaal> allesOphalen();
    Lokaal ophalen(int Id);
}
