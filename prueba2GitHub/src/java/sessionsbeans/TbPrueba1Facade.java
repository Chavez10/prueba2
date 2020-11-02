/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionsbeans;

import entidades.TbPrueba1;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author HP
 */
@Stateless
public class TbPrueba1Facade extends AbstractFacade<TbPrueba1> {

    @PersistenceContext(unitName = "prueba2GitHubPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbPrueba1Facade() {
        super(TbPrueba1.class);
    }
    
}
