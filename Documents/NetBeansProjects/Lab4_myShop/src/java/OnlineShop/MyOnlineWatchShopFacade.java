/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnlineShop;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Joseph
 */
@Stateless
public class MyOnlineWatchShopFacade extends AbstractFacade<MyOnlineWatchShop> {

    @PersistenceContext(unitName = "Lab4_myShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MyOnlineWatchShopFacade() {
        super(MyOnlineWatchShop.class);
    }
    
}
