/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * selectDataDialog.java
 *
 * Created on May 18, 2010, 3:44:50 PM
 */
package org.glotaran.core.main.common;

import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import org.glotaran.core.messages.CoreErrorMessages;

/**
 *
 * @author jsg210
 */
public class DimensionPanel extends javax.swing.JPanel {

    private double fromOld = 0;
    private double fromNew = 0;
    private double toOld = 0;
    private double toNew = 0;

    /**
     * Creates new form selectDataDialog
     */
    public DimensionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jTFDimTo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFDimFrom = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DimensionPanel.class, "DimensionPanel.border.title"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(110, 70));
        setPreferredSize(new java.awt.Dimension(150, 70));
        setLayout(new java.awt.GridBagLayout());

        jLabel2.setText(org.openide.util.NbBundle.getMessage(DimensionPanel.class, "DimensionPanel.jLabel2.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jLabel2, gridBagConstraints);

        jTFDimTo.setText(org.openide.util.NbBundle.getMessage(DimensionPanel.class, "DimensionPanel.jTFDimTo.text")); // NOI18N
        jTFDimTo.setPreferredSize(new java.awt.Dimension(20, 19));
        jTFDimTo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFDimToFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDimToFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 10, 0, 0);
        add(jTFDimTo, gridBagConstraints);

        jLabel1.setText(org.openide.util.NbBundle.getMessage(DimensionPanel.class, "DimensionPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(jLabel1, gridBagConstraints);

        jTFDimFrom.setText(org.openide.util.NbBundle.getMessage(DimensionPanel.class, "DimensionPanel.jTFDimFrom.text")); // NOI18N
        jTFDimFrom.setPreferredSize(new java.awt.Dimension(20, 19));
        jTFDimFrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFDimFromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDimFromFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 1, 0);
        add(jTFDimFrom, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDimFromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDimFromFocusLost
        if (checkDouble(jTFDimFrom.getText())) {
            fromNew = Double.parseDouble(jTFDimFrom.getText());
            firePropertyChange("from", fromOld, fromNew);
        }

    }//GEN-LAST:event_jTFDimFromFocusLost

    private void jTFDimToFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDimToFocusLost
        if (checkDouble(jTFDimTo.getText())) {
            toNew = Double.parseDouble(jTFDimTo.getText());
            firePropertyChange("to", toOld, toNew);
        }

    }//GEN-LAST:event_jTFDimToFocusLost

    private void jTFDimFromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDimFromFocusGained
        if (checkDouble(jTFDimFrom.getText())) {
            fromOld = Double.parseDouble(jTFDimFrom.getText());
        } else {
            fromOld = -1;
        }
    }//GEN-LAST:event_jTFDimFromFocusGained

    private void jTFDimToFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDimToFocusGained
        if (checkDouble(jTFDimTo.getText())) {
            toOld = Double.parseDouble(jTFDimTo.getText());
        } else {
            toOld = -1;
        }
    }//GEN-LAST:event_jTFDimToFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTFDimFrom;
    private javax.swing.JTextField jTFDimTo;
    // End of variables declaration//GEN-END:variables

    public double getDimFrom() {
        return fromNew;
    }

    public double getDimTo() {
        return toNew;
    }

    public void setFromText(Double value) {
        if (value != null) {
            jTFDimFrom.setText(String.format("%g", value));
            fromOld=fromNew=value;
        } else {
            jTFDimFrom.setText("0.0");
            fromOld=fromNew=0.0;
        }
    }

    public void setToText(Double value) {
        if (value != null) {
            jTFDimTo.setText(String.format("%g", value));
            toOld=toNew=value;
        } else {
            jTFDimTo.setText("0.0");
            toOld=toNew=0.0;
        }
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        for (int i = 0; i < getComponentCount(); i++) {
            getComponent(i).setEnabled(enabled);
        }
    }

    public void setPanName(String name) {
        ((TitledBorder) getBorder()).setTitle(name);
    }

    private boolean checkDouble(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (Exception e) {
            CoreErrorMessages.numberFormatException();
            return false;
        }
    }
}
