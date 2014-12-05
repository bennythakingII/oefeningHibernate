/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.Interface;

import BO.Module;
import java.util.List;

/**
 *
 * @author Benjamin
 */
public interface IDaModule {
    void opslaan(Module s);
    void verwijderen (int ID );
    List<Module> allesOphalen();
    Module ophalen(int Id);
}
