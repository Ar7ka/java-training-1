/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplechat;

import gui.Frame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Soubhik Mondal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable(){
	    @Override
	    public void run() {
		Frame obj = new Frame();
	    }
	});
    }
    
}
