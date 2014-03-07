

package com.uia.is12.bussines;

import com.uia.is12.data.PoemDAO;
import com.uia.is12.domain.Poem;


/**
 *
 * @author Robby
 */
public class PoemBussines {
    
    private PoemDAO poemDAO;

    public PoemBussines(){
        this.poemDAO = new PoemDAO();
    }
    
    public Poem getPoem(){
        return poemDAO.getPoem();
    }
    
}
