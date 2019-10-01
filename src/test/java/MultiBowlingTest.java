/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bowling.MultiPlayerGame;
import com.mycompany.tp4.MultiBowling;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedago
 */
public class MultiBowlingTest {
    
    String[] players = { "John", "Paul", "Georges", "Ringo" };
    MultiPlayerGame game = new MultiBowling();
    
    /*public MultiBowlingTest(MultiPlayerGame g){
        this.game = g;
    }*/
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void test1(){
        System.out.println(game.startNewGame(players));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
