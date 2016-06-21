/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins.jautomate.GUI;

import jautomate.ScriptLoggerTest;
import jautomate.ScriptRunner;
import org.junit.Test;

/**
 *
 * @author fachrulpbm
 */
public class FrmMainTest {
    
    @Test
    public void testScenario() {   
        ScriptRunner scriptRunner = new ScriptRunner(new ScriptLoggerTest());                
        scriptRunner.setParameter("scenario.jautomate", "scenario.jautomate");
        scriptRunner.runScript("scenario.jautomate/scenario.txt");
    }
    
}
