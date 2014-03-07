
package com.uia.is12.domain;

/**
 *
 * @author Robby
 */
public class Verse {
    
    private String paragraph;
    private int readingTime;

    public Verse() {
        
    }

    public Verse(String paragraph, int readingTime) {
        this.paragraph = paragraph;
        this.readingTime = readingTime;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public int getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(int readingTime) {
        this.readingTime = readingTime;
    }
    
    
    
}
