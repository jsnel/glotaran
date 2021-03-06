/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImageHistPanel.java
 *
 * Created on Sep 3, 2009, 3:53:09 PM
 */
package org.glotaran.core.resultdisplayers.flim;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import org.glotaran.core.messages.CoreErrorMessages;
import org.glotaran.jfreechartcustom.GraphPanel;
import org.glotaran.jfreechartcustom.ImageUtilities;
import org.glotaran.jfreechartcustom.IntensImageDataset;
import org.glotaran.jfreechartcustom.RainbowPaintScale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYDataImageAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.PaintScale;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.title.PaintScaleLegend;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.Layer;
import org.jfree.ui.RectangleEdge;
import org.jfree.ui.RectangleInsets;

/**
 *
 * @author slk230
 */
public class ImageHistPanel extends javax.swing.JPanel {

    private int imHeight, imWidth;
    private double minValue, maxValue;
    private double[] dataValues;
    private int[] selImInd;
    private int numChHist;
    private ChartMouseListener listener;

    /** Creates new form ImageHistPanel */
    public ImageHistPanel() {
        initComponents();
    }

    public ImageHistPanel(String name, double[] data, int[] selInd, int height, int width, double minVal, double maxVal, ChartMouseListener listen) {
        initComponents();
        this.dataValues = data;
        this.selImInd = selInd;
        this.imHeight = height;
        this.imWidth = width;
        this.minValue = minVal;
        this.maxValue = maxVal;
        this.jLName.setText(name);
        this.numChHist = 20;
        this.listener = listen;

        jTFChNumHist.setText(String.valueOf(numChHist));
        jTFMaxValue.setText(String.valueOf(maxValue));
        jTFMinValue.setText(String.valueOf(minValue));

        jPHist.add(updateHistPanel(data, minValue, maxValue, numChHist));

        IntensImageDataset dataValuesDataset = new IntensImageDataset(imHeight, imWidth, new double[imWidth * imHeight]);
        for (int i = 0; i < dataValues.length; i++) {
            dataValuesDataset.SetValue(selImInd[i], dataValues[i]);
        }
        PaintScale ps = new RainbowPaintScale(0.001, maxValue);
        JFreeChart aveLifetimeChart = createScatChart(ImageUtilities.createColorCodedImage(dataValuesDataset, ps), ps, imWidth, imHeight);
        ChartPanel aveLifetimePanel = new ChartPanel(aveLifetimeChart);
        aveLifetimePanel.setFillZoomRectangle(true);
        aveLifetimePanel.setMouseWheelEnabled(true);
        aveLifetimePanel.addChartMouseListener(listener);
        jPImage.add(aveLifetimePanel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel11 = new javax.swing.JPanel();
        jPHist = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTFChNumHist = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPImage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTFMaxValue = new javax.swing.JTextField();
        jTFMinValue = new javax.swing.JTextField();
        jLName = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(416, 322));
        setLayout(new java.awt.GridBagLayout());

        jPanel11.setMinimumSize(new java.awt.Dimension(200, 290));
        jPanel11.setPreferredSize(new java.awt.Dimension(256, 290));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPHist.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 1.0;
        jPanel11.add(jPHist, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jLabel3.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jPanel11.add(jLabel3, gridBagConstraints);

        jLabel15.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jLabel15.text")); // NOI18N

        jButton5.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jButton5.text")); // NOI18N
        jButton5.setIconTextGap(2);
        jButton5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTFChNumHist.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFChNumHist.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jTFChNumHist.text")); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jTFChNumHist, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jTFChNumHist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15)
                .addComponent(jButton5))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel11.add(jPanel14, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 5, 5);
        add(jPanel11, gridBagConstraints);

        jPanel7.setMinimumSize(new java.awt.Dimension(200, 290));
        jPanel7.setPreferredSize(new java.awt.Dimension(256, 290));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPImage.setBackground(new java.awt.Color(0, 0, 0));
        jPImage.setMaximumSize(new java.awt.Dimension(450, 350));
        jPImage.setMinimumSize(new java.awt.Dimension(450, 350));
        jPImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPImageMouseClicked(evt);
            }
        });
        jPImage.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(jPImage, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jLabel1.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel7.add(jLabel1, gridBagConstraints);

        jLabel8.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jLabel8.text")); // NOI18N

        jLabel9.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jLabel9.text")); // NOI18N

        jButton2.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jButton2.text")); // NOI18N
        jButton2.setIconTextGap(2);
        jButton2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTFMaxValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMaxValue.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jTFMaxValue.text")); // NOI18N

        jTFMinValue.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFMinValue.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jTFMinValue.text")); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(jTFMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jLabel8)
                .addComponent(jTFMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2)
                .addComponent(jTFMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel7.add(jPanel10, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 3);
        add(jPanel7, gridBagConstraints);

        jLName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLName.setText(org.openide.util.NbBundle.getMessage(ImageHistPanel.class, "ImageHistPanel.jLName.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        add(jLName, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jPImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPImageMouseClicked
    }//GEN-LAST:event_jPImageMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double newMinLifetime, newMaxLifetime;
        try {
            newMinLifetime = Double.parseDouble(jTFMinValue.getText());
            newMaxLifetime = Double.parseDouble(jTFMaxValue.getText());

            IntensImageDataset dataValuesDataset = new IntensImageDataset(imHeight, imWidth, new double[imWidth * imHeight]);
            for (int i = 0; i < dataValues.length; i++) {
                dataValuesDataset.SetValue(selImInd[i], dataValues[i]);
            }
            PaintScale ps = new RainbowPaintScale(newMinLifetime, newMaxLifetime);
            JFreeChart aveLifetimeChart = createScatChart(ImageUtilities.createColorCodedImage(dataValuesDataset, ps), ps, imWidth, imHeight);
            aveLifetimeChart.getXYPlot().getRangeAxis().setInverted(true);
            ChartPanel aveLifetimePanel = new ChartPanel(aveLifetimeChart);
            aveLifetimePanel.setFillZoomRectangle(true);
            aveLifetimePanel.setMouseWheelEnabled(true);
            jPImage.removeAll();
            aveLifetimePanel.setSize(jPImage.getSize());
            aveLifetimePanel.addChartMouseListener(listener);
            jPImage.add(aveLifetimePanel);
            jPImage.repaint();
        } catch (NumberFormatException ex) {
            CoreErrorMessages.selCorrChNum();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int newNumChHish;
        try {
            newNumChHish = Integer.parseInt(jTFChNumHist.getText());
            jPHist.removeAll();
            ChartPanel chpanHist = updateHistPanel(dataValues, minValue, maxValue, newNumChHish);
            chpanHist.setSize(jPHist.getSize());
            jPHist.add(chpanHist);
            jPHist.repaint();
        } catch (NumberFormatException ex) {
            CoreErrorMessages.selCorrChNum();
        }
    }//GEN-LAST:event_jButton5ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPHist;
    private javax.swing.JPanel jPImage;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTFChNumHist;
    private javax.swing.JTextField jTFMaxValue;
    private javax.swing.JTextField jTFMinValue;
    // End of variables declaration//GEN-END:variables

    private ChartPanel updateHistPanel(double[] data, double minVal, double maxVal, int numPockets) {
        HistogramDataset datasetHist = new HistogramDataset();
        if (numPockets < 1) {
            numPockets = 20;
        }
        datasetHist.addSeries("seria1", data, numPockets, minVal, maxVal);
        JFreeChart charthist = ChartFactory.createHistogram(
                null,
                null,
                null,
                datasetHist,
                PlotOrientation.VERTICAL,
                false,
                true,
                false);
        charthist.setBackgroundPaint(JFreeChart.DEFAULT_BACKGROUND_PAINT);
        XYPlot plot = (XYPlot) charthist.getPlot();
        plot.setForegroundAlpha(0.85f);
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        return new GraphPanel(charthist);
    }

    private JFreeChart createScatChart(BufferedImage image, PaintScale ps, int plotWidth, int plotHeigh) {
        JFreeChart chart_temp = ChartFactory.createScatterPlot(null,
                null, null, new XYSeriesCollection(), PlotOrientation.VERTICAL, false, false,
                false);
        chart_temp.getXYPlot().getRangeAxis().setInverted(true);
        chart_temp.setBackgroundPaint(JFreeChart.DEFAULT_BACKGROUND_PAINT);
        XYDataImageAnnotation ann = new XYDataImageAnnotation(image, 0, 0,
                plotWidth, plotHeigh, true);
        XYPlot plot = (XYPlot) chart_temp.getPlot();
        plot.setDomainPannable(true);
        plot.setRangePannable(true);
        plot.getRenderer().addAnnotation(ann, Layer.BACKGROUND);
        NumberAxis xAxis = (NumberAxis) plot.getDomainAxis();
        xAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        xAxis.setLowerMargin(0.0);
        xAxis.setUpperMargin(0.0);
        xAxis.setVisible(false);
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        yAxis.setLowerMargin(0.0);
        yAxis.setUpperMargin(0.0);
        yAxis.setVisible(false);

        NumberAxis scaleAxis = new NumberAxis();
        scaleAxis.setAxisLinePaint(Color.black);
        scaleAxis.setTickMarkPaint(Color.black);
        scaleAxis.setRange(ps.getLowerBound(), ps.getUpperBound());
        scaleAxis.setTickLabelFont(new Font("Dialog", Font.PLAIN, 9));
        PaintScaleLegend legend = new PaintScaleLegend(ps, scaleAxis);
        legend.setAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
        legend.setMargin(new RectangleInsets(5, 5, 5, 5));
        legend.setStripWidth(10);
        legend.setPosition(RectangleEdge.RIGHT);
        legend.setBackgroundPaint(chart_temp.getBackgroundPaint());
        chart_temp.addSubtitle(legend);

        return chart_temp;
    }

    public void chartMouseClicked(ChartMouseEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void chartMouseMoved(ChartMouseEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
