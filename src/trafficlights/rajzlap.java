/**
 * Code is prose. Lefty G Balogh
 */
package trafficlights;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

/**
 *
 * @author lefty
 */
public class rajzlap extends javax.swing.JPanel {

    private LightModel model;
    
    

    public rajzlap() {
        initComponents();
        model = new LightModel(true, false, false);
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("R"), "red");
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("Y"), "yellow");
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("G"), "green");
        getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "sequencer");        

        getActionMap().put("red", new RedAction());
        getActionMap().put("yellow", new YellowAction());
        getActionMap().put("green", new GreenAction());
        getActionMap().put("sequencer", new sequencer());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 170, 550);

        g.setColor(Color.red);
        if (model.isRed()) {
            g.fillOval(60, 60, 150, 150);
        } else {
            g.drawOval(60, 60, 150, 150);
        }

        g.setColor(Color.yellow);
        if (model.isYellow()) {
            g.fillOval(60, 220, 150, 150);

        } else {
            g.drawOval(60, 220, 150, 150);

        }

        g.setColor(Color.green);

        if (model.isGreen()) {
            g.fillOval(60, 390, 150, 150);

        } else {
            g.drawOval(60, 390, 150, 150);

        }

    }

    class RedAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.switchRed();
            repaint();
        }

    }

    class YellowAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.switchYellow();
            repaint();
        }

    }

    class GreenAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            model.switchGreen();
            repaint();
        }

    }

    class sequencer extends AbstractAction {
        static final boolean ON = true; 
        static final boolean OFF = false; 

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setLight(OFF, OFF, OFF);            
            repaint();
            System.out.println("darkness");
            sleep(1);
            
           
            model.setLight(ON, OFF, OFF);
             
            repaint();
            System.out.println("red");
            sleep(1);
            
            model.setLight(ON, ON, OFF);
            repaint();
            System.out.println("red yellow");
            sleep(1);
            
            model.setLight(OFF, OFF,ON);
            repaint();
            System.out.println("green");
            sleep(5);
            
            model.setLight(OFF, ON,OFF);
            repaint();
            System.out.println("yellow");
            sleep(1);
            
            model.setLight(ON, OFF, OFF);
            repaint();
            System.out.println("red again");
            sleep(2);
////            
////            
//            
            
        }
        
        
        }
    
        private void sleep(long seconds){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(rajzlap.class.getName()).log(Level.SEVERE, null, ex);
        }
            }

    }

    

