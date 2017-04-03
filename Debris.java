 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Debris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Debris extends Actor
{
    private int speed;
    
    public Debris()
    {
        int w = Greenfoot.getRandomNumber(20)+1;
        int h = Greenfoot.getRandomNumber(20)+1;
        
        setRotation( Greenfoot.getRandomNumber(361));
        
        getImage().scale(w, h);
        
        speed = Greenfoot.getRandomNumber(10)+5;
    }
    
    /**
     * Act - do whatever the Debris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(speed);
        
        if( isAtEdge() )
        {
            getWorld().removeObject(this);
        }
    }    
}
