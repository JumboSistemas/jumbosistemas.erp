/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 T2Ti.COM
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 * The author may be contacted at: t2ti.com@gmail.com
 *
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package adm.com.jumbo.cadastros.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

public class ContaCaixaGrid extends InternalFrame {

    public ContaCaixaGrid(ContaCaixaGridController controller) {
        initComponents();
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);
    }

    public GridControl getGrid1() {
        return gridControl1;
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

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn7 = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumn9 = new org.openswing.swing.table.columns.client.ComboColumn();

        setTitle("JUMBO - Cadastros");
        setPreferredSize(new java.awt.Dimension(900, 450));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta Caixa"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFunctionId("contaCaixa");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("adm.com.jumbo.cadastros.java.ContaCaixaVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn2.setColumnName("contabilConta.descricao");
        textColumn2.setHeaderColumnName("Contabil Conta");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn2.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn2);

        textColumn4.setColumnName("agenciaBanco.nome");
        textColumn4.setHeaderColumnName("Agencia Banco");
        textColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn4.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn4);

        textColumn5.setColumnName("codigo");
        textColumn5.setHeaderColumnName("Codigo");
        textColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(textColumn5);

        textColumn7.setColumnName("nome");
        textColumn7.setHeaderColumnName("Nome");
        textColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn7.setPreferredWidth(250);
        gridControl1.getColumnContainer().add(textColumn7);

        comboColumn9.setColumnName("tipo");
        comboColumn9.setDomainId("tipoContaCaixa");
        comboColumn9.setHeaderColumnName("Tipo");
        comboColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(comboColumn9);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn9;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    private org.openswing.swing.table.columns.client.TextColumn textColumn7;
    // End of variables declaration//GEN-END:variables
}
