package com.example.metier;

import com.example.dao.IDao;
import junit.framework.TestCase;
import org.junit.Assert;

public class MetierImplTest extends TestCase {

    public void testCalcul() {

        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 10.0;
            }
        };


        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Vérification que le calcul donne le résultat attendu
        double result = metier.calcul();
        Assert.assertEquals(20.0, result, 0.001);  // 10.0 * 2 = 20.0
    }
}