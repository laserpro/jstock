/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2015 Yan Cheng Cheok <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.gui;

import java.awt.Component;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.NumberFormatter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.yccheok.jstock.engine.Country;
import org.yccheok.jstock.internationalization.GUIBundle;

/**
 *
 * @author  yccheok
 */
public class OptionsSellAdvisorJPanel extends javax.swing.JPanel implements JStockOptionsObserver {

    /** Creates new form OptionsSellAdvisorJPanel */
    public OptionsSellAdvisorJPanel() {
        initComponents();
        final Component component = this.jComboBox1.getEditor().getEditorComponent();
        if (component instanceof JTextComponent) {
            // Do not allow user to enter more than 5 characters.
            final Document document = ((JTextComponent)component).getDocument();
            if (document instanceof AbstractDocument) {
                ((AbstractDocument)document).setDocumentFilter(new DocumentSizeFilter(5));
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        org.jdesktop.swingx.JXHeader jXHeader1 = new org.jdesktop.swingx.JXHeader();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = getPercentageJFormattedTextField();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui"); // NOI18N
        jXHeader1.setDescription(bundle.getString("OptionsSellAdvisorJPanel_Description")); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32x32/money3.png"))); // NOI18N
        jXHeader1.setTitle(bundle.getString("OptionsSellAdvisorJPanel_Wealth")); // NOI18N
        add(jXHeader1, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsSellAdvisorJPanel_BestSellPriceSuggestion"))); // NOI18N

        jLabel1.setText(bundle.getString("OptionsSellAdvisorJPanel_ExpectedProfitPercentage")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsSellAdvisorJPanel_Wealth"))); // NOI18N

        jCheckBox3.setText(bundle.getString("OptionsSellAdvisorJPanel_ShowStockPriceAndValueIn4DecimalPlaces")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsSellAdvisorJPanel_Currency"))); // NOI18N

        jLabel2.setText(bundle.getString("OptionsSellAdvisorJPanel_Symbol")); // NOI18N

        jComboBox1.setEditable(true);
        jComboBox1.setModel(getComboBoxModel());

        jComboBox2.setModel(getCountryComboBoxModel());
        jComboBox2.setRenderer(new MyCellRenderer());

        jLabel3.setText(bundle.getString("OptionsSellAdvisorJPanel_Currency")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private JFormattedTextField getPercentageJFormattedTextField() {
        NumberFormat format= NumberFormat.getNumberInstance();
        NumberFormatter formatter= new NumberFormatter(format);
        formatter.setMinimum(0.0);
        formatter.setMaximum(null);
        formatter.setValueClass(Double.class);
        JFormattedTextField field= new JFormattedTextField(formatter);
        
        return field;
    }

    private ComboBoxModel getCountryComboBoxModel() {
        // Ensure thread safety for lazy initialization technique.
        synchronized(defaultCountryComboBoxModel) {
            // Lazy initialization.
            if (defaultCountryComboBoxModel.getSize() > 0) {
                return defaultCountryComboBoxModel;
            }
            
            for (Country country : Country.values()) {
                defaultCountryComboBoxModel.addElement(country);
            }
        }
        return defaultCountryComboBoxModel;
    }
    
    private static ComboBoxModel getComboBoxModel() {
        synchronized(defaultComboBoxModel) {
            if (defaultComboBoxModel.getSize() > 0) {
                return defaultComboBoxModel;
            }

            String[] countries = {
                "AU",   // Austrialia
                "AT",   // Austria
                "BE",   // Belgium
                "BR",   // Brazil
                "CA",   // Canada
                "CN",   // China
                "CZ",   // Czech
                "DK",   // Denmark
                "FR",   // France
                "DE",   // Germany
                "HK",   // HongKong
                "HU",   // Hungary
                "IN",   // India
                "ID",   // Indonesia
                "IT",   // Italy
                "KR",   // Korea
                "MY",   // Malaysia
                "NL",   // Netherlands
                "NZ",   // NewZealand
                "NO",   // Norway
                "PT",   // Portugal
                "SG",   // Singapore
                "ES",   // Spain
                "SE",   // Sweden
                "CH",   // Switzerland
                "TW",   // Taiwan
                "GB",   // Unitedkingdom
                "US",   // UnitedState
            };

            final List<String> countryList = Arrays.asList(countries);
            final Locale[] locales = Locale.getAvailableLocales();
            // Order is important.
            final Set<String> set = new LinkedHashSet<String>();
            set.add(Utils.getDefaultCurrencySymbol());
            for (Locale locale : locales) {
                if (countryList.contains(locale.getCountry()) == false) {
                    continue;
                }                
                set.add(Currency.getInstance(locale).getSymbol(locale));
            }
            for (String s : set) {
                defaultComboBoxModel.addElement(s);
            }
        }
        return defaultComboBoxModel;
    }

    private void commitEdit() {
        try {
            jFormattedTextField1.commitEdit();
        } catch (ParseException ex) {
            log.error(null, ex);
        }
    }
    
    @Override
    public void set(JStockOptions jStockOptions) {
        this.jFormattedTextField1.setValue(jStockOptions.getExpectedProfitPercentage());
        this.jComboBox1.setSelectedItem(jStockOptions.getCurrencySymbol(jStockOptions.getCountry()));
        this.jComboBox2.setSelectedItem(jStockOptions.getLocalCurrencyCountry(jStockOptions.getCountry()));
        this.jCheckBox3.setSelected(jStockOptions.isFourDecimalPlacesEnabled());
        commitEdit();
    }

    @Override
    public boolean apply(JStockOptions jStockOptions) {
        commitEdit();
        jStockOptions.setExpectedProfitPercentage((Double)jFormattedTextField1.getValue());
        final String currencySymbol = jComboBox1.getSelectedItem().toString().trim();
        if (currencySymbol.isEmpty() == false) {
            jStockOptions.setCurrencySymbol(jStockOptions.getCountry(), currencySymbol);
        }

        jStockOptions.setLocalCurrencyCountry(jStockOptions.getCountry(), (Country)jComboBox2.getSelectedItem());
        jStockOptions.setFourDecimalPlacesEnabled(this.jCheckBox3.isSelected());
        
        // Remember to refresh the GUIs as well.
        JStock.getInstance().getPortfolioManagementJPanel().refreshCurrencySymbol();
        // Update the new state of currency exchange monitor.
        JStock.getInstance().initExchangeRateMonitor();

        return true;
    }

    // Display an icon and a string for each object in the list.
    private static class MyCellRenderer extends JLabel implements ListCellRenderer {
        public MyCellRenderer()
        {
            super();
            this.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));
        }
        // This is the only method defined by ListCellRenderer.
        // We just reconfigure the JLabel each time we're called.

        @Override
        public Component getListCellRendererComponent(
                JList list,              // the list
                Object value,            // value to display
                int index,               // cell index
                boolean isSelected,      // is the cell selected
                boolean cellHasFocus)    // does the cell have focus
        {

            if (value instanceof Country) {
                Country country = (Country)value;
                setText(country.humanString);
                setIcon(country.icon);
            } else {
                String s = value.toString();
                setText(s);        
            }

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            setEnabled(list.isEnabled());
            setFont(list.getFont());
            setOpaque(true);

            return this;
        }
    }

    private static final Log log = LogFactory.getLog(OptionsSellAdvisorJPanel.class);
    private static final DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
    // Do not have this combo box model as static. As we do not want to have
    // current selected country in the combo box, different country will need
    // to have different combo box model.
    private final DefaultComboBoxModel defaultCountryComboBoxModel = new DefaultComboBoxModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
