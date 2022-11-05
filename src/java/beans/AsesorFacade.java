/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelos.Asesor;

/**
 *
 * @author 57312
 */
@Stateless
public class AsesorFacade extends AbstractFacade<Asesor> {

    @PersistenceContext(unitName = "SysTCWebAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsesorFacade() {
        super(Asesor.class);
    }
    
}
