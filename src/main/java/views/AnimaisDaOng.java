/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import java.awt.BorderLayout;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Animal;
import model.Ong;
import model.Pessoa;

/**
 *
 * @author tai
 */
public class AnimaisDaOng extends javax.swing.JPanel {

    private Ong ongLogada = null;

    /**
     * Creates new form SolicitacaoAdocao
     */
    public AnimaisDaOng(Ong ong) {
        initComponents();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("petcare");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        this.ongLogada = em.find(Ong.class, ong.getId());

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        for (Animal animal : this.ongLogada.getAnimais()) {
            if (!animal.getJa_foi_adotado()) {
                model.addRow(new Object[]{animal.getId(), animal.getNome(), animal.getEspecie(), animal.getRaca()});

            }
        }

        em.close();
        emf.close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMaximumSize(new java.awt.Dimension(630, 490));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(149, 127, 239));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Animais da Ong");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 100));

        jButton1.setBackground(new java.awt.Color(149, 127, 239));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CADASTRAR PET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Especie", "Raça"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 590, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPanel parentPanel = (JPanel) this.getParent();

        parentPanel.removeAll();
        // Add new content to the mainPanel
        JPanel cadastrarVoluntario = new CadastrarPet(this.ongLogada);
        parentPanel.add(cadastrarVoluntario, BorderLayout.CENTER);

        // Repaint and revalidate the mainPanel to reflect the changes
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            Object rowData = jTable1.getValueAt(row, 0);
            Animal animalAtual = null;

            for (Animal animal : this.ongLogada.getAnimais()) {
                if (Integer.toString(animal.getId()).equals(rowData.toString())) {
                    animalAtual = animal;
                }
            }

            JPanel parentPanel = (JPanel) this.getParent();

            parentPanel.removeAll();
            // Add new content to the mainPanel
            JPanel cadastrarPet = new CadastrarPet(this.ongLogada, animalAtual);
            parentPanel.add(cadastrarPet, BorderLayout.CENTER);

            // Repaint and revalidate the mainPanel to reflect the changes
            parentPanel.repaint();
            parentPanel.revalidate();

        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
