/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Abstract.solicitudChain;

/**
 *
 * @author adria
 */
public class gerenteTienda extends solicitudChain{
    
    public boolean aprobacion;

    @Override
    public void setNextSolicitudChain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean aprobacionGerente(){
        return aprobacion;
    }
    
}
