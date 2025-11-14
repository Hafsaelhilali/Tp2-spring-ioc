package com.example.metier;

import com.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("com/example/metier")
public class MetierImpl implements IMetier {

    @Qualifier("com/example/dao")
    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}