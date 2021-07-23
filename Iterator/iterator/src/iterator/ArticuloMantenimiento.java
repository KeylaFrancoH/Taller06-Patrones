/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import interfacee.ArticuloIterator;

/**
 *
 * @author ab_al
 */
public class ArticuloMantenimiento implements interfacee.ColeccionProductos{
    private asistenteMantenimiento asitenteM;
    private Articulo articulo;
    @Override
    public ArticuloIterator crearIteradorArticulo(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
