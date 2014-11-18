
import java.awt.Color;
import java.io.IOException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.HyperlinkEvent;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Stack urlStack = new Stack();
    private Stack urlStack1 = new Stack();
    
    
    public NewJFrame() {
        initComponents();
        setTitle("Ittisit Tongkham s4051033@kmitl.ac.th - Java Web Browser (Network Programming Class Assignment)");
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldURL = new javax.swing.JTextField();
        jButtonGO = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();
        jTextFieldURL1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonGO.setText("GET PAGE");
        jButtonGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGOActionPerformed(evt);
            }
        });

        jEditorPane2.setEditable(false);
        jEditorPane2.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPane2HyperlinkUpdate(evt);
            }
        });
        jScrollPane3.setViewportView(jEditorPane2);

        jLabel1.setText("URL 1:");

        jLabel2.setText("URL 2:");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel3.setText("Thread");

        jLabel4.setText("Header");

        jScrollPane4.setViewportView(jTextPane2);

        jEditorPane1.setEditable(false);
        jEditorPane1.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPane1HyperlinkUpdate(evt);
            }
        });
        jScrollPane5.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonGO)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldURL1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(369, 369, 369))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldURL1)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButtonGO))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButtonGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGOActionPerformed
   
      Threadinit T1 = new Threadinit( "Thread1");
      T1.start();
      
      Threadinit T2 = new Threadinit( "Thread2");
      T2.start();
   
// TODO add your handling code here:
    }//GEN-LAST:event_jButtonGOActionPerformed

    private void jEditorPane2HyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_jEditorPane2HyperlinkUpdate
             if(evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED)
		{
			try
			{
				urlStack1.push(evt.getURL().toString());
				jTextFieldURL1.setText(evt.getURL().toString());
 
				jEditorPane2.setPage(evt.getURL());
			}
			catch(IOException e)
			{
				jEditorPane2.setText("Error: " + e);
			}
		}
// TODO add your handling code here:
    }//GEN-LAST:event_jEditorPane2HyperlinkUpdate

    private void jEditorPane1HyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_jEditorPane1HyperlinkUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_jEditorPane1HyperlinkUpdate

    

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGO;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextFieldURL;
    private javax.swing.JTextField jTextFieldURL1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables

     public  void getHeader(int a) {
         
         StyledDocument doc = jTextPane2.getStyledDocument();
       
           
           
           SimpleAttributeSet keyWord = new SimpleAttributeSet();
           StyleConstants.setForeground(keyWord, Color.RED);
           StyleConstants.setBackground(keyWord, Color.YELLOW);
           StyleConstants.setBold(keyWord, true);
           
         URL obj ;
    try {
        if(a == 1)
        {
            obj = new URL(jTextFieldURL.getText());
        }
        else
        {
            obj = new URL(jTextFieldURL1.getText());
        }
	URLConnection conn = obj.openConnection();
	Map<String, List<String>> map = conn.getHeaderFields();
 
        doc.insertString(0, "Printing Response Header...\n", null );
	//System.out.println("Printing Response Header...\n");
 
	for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            doc.insertString(0, "Key : " + entry.getKey() 
                           + " ,Value : " + entry.getValue()+"\n", null );
		//System.out.println("Key : " + entry.getKey() 
                 //          + " ,Value : " + entry.getValue());
	}
        
        doc.insertString(0, "\nGet Response Header By Key ...\n", null );
	//System.out.println("\nGet Response Header By Key ...\n");
	String server = conn.getHeaderField("Server");
 
	if (server == null) {
                doc.insertString(0, "Key 'Server' is not found!", null );
		//System.out.println("Key 'Server' is not found!");
	} else {
                doc.insertString(0, "Server - " + server, null );
		//System.out.println("Server - " + server);
	}
        doc.insertString(0,"\n Done", null );
	//System.out.println("\n Done");
 
    } catch (Exception e) {
	e.printStackTrace();
    }
 
  }

    
    
   class Threadinit extends Thread {
   private Thread t;
  
   String threadName;
   StyledDocument doc = jTextPane1.getStyledDocument();
   
   Threadinit(String name){
       try {
           threadName = name;
           
           SimpleAttributeSet keyWord = new SimpleAttributeSet();
           StyleConstants.setForeground(keyWord, Color.RED);
           StyleConstants.setBackground(keyWord, Color.YELLOW);
           StyleConstants.setBold(keyWord, true);
           doc.insertString(0, "Creating " +  threadName+"\n", null );
           
           
           
        
       } catch (BadLocationException ex) {
           Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   public void run() {
       try {
           doc.insertString(0,  threadName +" : GET URL\n", null );
       } catch (BadLocationException ex) {
           Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
       }
     
      try {
        
            if(threadName.equals("Thread1"))
            {
                urlStack.push(jTextFieldURL.getText());
                jEditorPane1.setPage(jTextFieldURL.getText());
                getHeader(1);
            }
            else
            {
                urlStack1.push(jTextFieldURL1.getText());
                jEditorPane2.setPage(jTextFieldURL1.getText());
                getHeader(2);
            }
    doc.insertString(0,  threadName + " : Finish\n", null );
     
     } catch (IOException ex) {
           Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
       } catch (BadLocationException ex) {
           Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    
   }
   
   public void start ()
   {
       try {
           doc.insertString(0, threadName+" : Start\n", null );
       } catch (BadLocationException ex) {
           Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      if (t == null)
      {
         t = new Thread (this, threadName);
         t.start ();
      }
   }

      
  }
}
