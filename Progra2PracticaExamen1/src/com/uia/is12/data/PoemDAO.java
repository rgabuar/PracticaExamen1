

package com.uia.is12.data;

import com.uia.is12.domain.Poem;
import com.uia.is12.domain.Verse;
import java.util.ArrayList;

/**
 *
 * @author Robby
 */
public class PoemDAO {

    public PoemDAO() {
        
    }
    
    public Poem getPoem(){
        Poem poem = new Poem();
        ArrayList<Verse> verse = new ArrayList();
        
        verse.add(new Verse("When I find my code in tons of trouble,",5000));
        verse.add(new Verse("Friends and colleagues come to me,",5000));
        verse.add(new Verse("Speaking words of wisdom:",5000));
        verse.add(new Verse("Write in C.",5000));
        verse.add(new Verse("Write in C, Write in C,",5000));
        verse.add(new Verse("Write in C, oh, Write in C.",5000));
        verse.add(new Verse("BASIC's not the answer.",5000));
        verse.add(new Verse("Write in C",5000));        
        
        poem.setVerse(verse);
        return poem;
        
    }
    
}
