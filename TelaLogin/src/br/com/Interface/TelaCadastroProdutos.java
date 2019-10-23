/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Interface;
import br.com.Classes.Controller.Controle;
import java.util.ArrayList;
import br.com.Classes.Produto;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class TelaCadastroProdutos extends javax.swing.JFrame  {

    /**
     * Creates new form TelaCadastroProdutos
     */
    public TelaCadastroProdutos() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        DecimalFormat decimal = new DecimalFormat("#,###,###.00");
        NumberFormatter numFormatter = new NumberFormatter(decimal);
        numFormatter.setFormat(decimal);
        DefaultFormatterFactory dfFactory = new DefaultFormatterFactory(numFormatter);
        txtValor.setFormatterFactory(dfFactory);
        
        
    }
        ArrayList <Produto> armazenar= Controle.load();
        private Produto s= new Produto();
        
        
    
        
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboSabor = new javax.swing.JComboBox<>();
        ComboTamanho = new javax.swing.JComboBox<>();
        ComboProduto = new javax.swing.JComboBox<>();
        ButtonSave = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        TxtBuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        radioProd = new javax.swing.JRadioButton();
        radioSabor = new javax.swing.JRadioButton();
        radioID = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jDesktopPane2.setEnabled(false);
        jDesktopPane2.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("TELA DE CADASTRO");

        jLabel3.setText("Produto");

        jLabel4.setText("Sabor");

        jLabel6.setText("Tamanho");

        jComboSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escolha...","========Pizza/Esfiha/Pastel=======", "Mussarela", "Calabresa\t", "Portuguesa", "Napolitano", "Chocolate","======Refrigerante/Àgua======","Coca-Cola","Pepsi","Guaraná","Fanta Laranja","Com/Gás","Natural", }));
        jComboSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSaborActionPerformed(evt);
            }
        });

        ComboTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...","====Pizza/Esfiha/Pastel===", "Pequeno", "Médio", "Grande","====Refrigerante/Àgua====","500ml","1L","2L","2,5L"}));
        ComboTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTamanhoActionPerformed(evt);
            }
        });

        ComboProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...", "Pizza", "Esfiha", "Pastel", "Refrigerante", "Água", "", "" }));
        ComboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProdutoActionPerformed(evt);
            }
        });

        ButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensColor/icons8_save_30px.png"))); // NOI18N
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensColor/icons8_restart_30px.png"))); // NOI18N
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensColor/icons8_left_4_30px.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Sabor", "Tamanho", "Valor", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelaProdutos.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(TabelaProdutos);
        TabelaProdutos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensColor/icons8_trash_30px.png"))); // NOI18N
        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        TxtBuscar.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagensColor/icons8_search_18px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        radioProd.setText("Produto");

        radioSabor.setText("Sabor");

        radioID.setText("ID");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("R$");

        txtID.setText("ID");

        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jComboSabor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ComboTamanho, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ComboProduto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(ButtonSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButtonCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(TxtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioProd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioSabor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(radioID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtid, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtValor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(131, 131, 131)
                        .addComponent(radioID)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(0, 30, Short.MAX_VALUE)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                                .addComponent(jComboSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(txtID))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(radioSabor)
                        .addGap(33, 33, 33)
                        .addComponent(radioProd)
                        .addGap(26, 26, 26))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(288, 288, 288))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioProd)
                                    .addComponent(radioSabor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtBuscar)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(radioID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ComboTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Este é o Botão de Pesquisa. Quando Precionado o i percorre as Linhas e o j percorre as colunas Pelo Nome Colocado no Campo de Texto.
        for(int i=0;i<TabelaProdutos.getRowCount();i++){
            for(int j=0;j<TabelaProdutos.getColumnCount();j++){
                //Está condição verifica se o Botão Radio está Marcado e se Estiver ele recebe Permissão para procurar na Tabela por Produtos Com o Nome do Campo de Texto.
                if(radioProd.isSelected() == true){
                
                if(TabelaProdutos.getModel().getValueAt(i, j).equals(TxtBuscar.getText())){
                    TabelaProdutos.setColumnSelectionAllowed(false);
                    TabelaProdutos.setRowSelectionInterval(i, j);
                    TabelaProdutos.changeSelection(i, j, false, false);
                    TabelaProdutos.requestFocus();

                }
               
                
            }else if(radioSabor.isSelected() == true){
                
                if(TabelaProdutos.getModel().getValueAt(i, j).equals(TxtBuscar.getText())){
                    TabelaProdutos.setColumnSelectionAllowed(false);
                    TabelaProdutos.setRowSelectionInterval(i, j);
                    TabelaProdutos.changeSelection(i, j, false, false);
                    TabelaProdutos.requestFocus();

                }
                
                
            }
                else if(radioID.isSelected() == true){
                
                if(TabelaProdutos.getModel().getValueAt(i, j).equals(TxtBuscar.getText())){
                    TabelaProdutos.setColumnSelectionAllowed(false);
                    TabelaProdutos.setRowSelectionInterval(i, j);
                    TabelaProdutos.changeSelection(i, j, false, false);
                    TabelaProdutos.requestFocus();

                }
                
                
            }
               
            }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel arm= (DefaultTableModel)TabelaProdutos.getModel();

        arm.removeRow(TabelaProdutos.getSelectedRow());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaPrincipal voltar = new TelaPrincipal();
        voltar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        //Botão de Reset Para todos os ComboBox Voltarem ao Estado Normal
        ComboProduto.setSelectedIndex(0);
        jComboSabor.setSelectedIndex(0);
        ComboTamanho.setSelectedIndex(0);

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        
           //Botão Save Para Salvar Dados em Uma Array do Tipo Produto e Todas Informações irem direto para um Arraylist
        if(ComboProduto.getSelectedItem()=="Escolha..."){
            JOptionPane.showMessageDialog(null, "Selecione um item");
        }
        else if(jComboSabor.getSelectedItem()=="Escolha..."||jComboSabor.getSelectedItem()=="========Pizza/Esfiha/Pastel======="||jComboSabor.getSelectedItem()=="======Refrigerante/Àgua======"){
            JOptionPane.showMessageDialog(null, "Selecione Sabor");
        }  
        else if(ComboTamanho.getSelectedItem()=="====Pizza/Esfiha/Pastel==="||ComboTamanho.getSelectedItem()=="====Refrigerante/Àgua===="){
            JOptionPane.showMessageDialog(null, "Selecione o Tamanho");
                
        }
        else if("".equals(txtValor.getText())){
          JOptionPane.showMessageDialog(null, "Coloque a Precificação do Produto");
          
        }
        else if("".equals(txtid.getText())){
          JOptionPane.showMessageDialog(null, "Coloque o ID do Produto");  
        }
        else{
            //Os dados estão sendo salvos para um ArrayList da Classe Produtos .
        s.setTipo((String) ComboProduto.getSelectedItem());
        s.setSabor((String) jComboSabor.getSelectedItem());
        s.setTamanho((String) ComboTamanho.getSelectedItem());
        
        //Este System.out.Println,é um teste para Printar e Dizer que está Sendo Salvo no ArrayList da Classe Produtos.
        System.out.println(armazenar.toString());
        //Chamamos um Objeto  da Nossa Jtable= TabelaProdutos.
        DefaultTableModel arm= (DefaultTableModel)TabelaProdutos.getModel();
        Object[] armazenar= {ComboProduto.getSelectedItem(),jComboSabor.getSelectedItem(),ComboTamanho.getSelectedItem(),txtValor.getText(), txtid.getText()};
        
        arm.addRow(armazenar);
        
        ComboProduto.setSelectedIndex(0);
        jComboSabor.setSelectedIndex(0);
        ComboTamanho.setSelectedIndex(0);
        txtid.setText("");
        txtValor.setText("");
    }     
        

    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ComboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProdutoActionPerformed
        //este metodo é para que quando a combobox de Produtos for pressionada ele irá transferir os valores da comboBoxSabor e ComboBoxTamanho Para seus Respectivos Index== endereço da String
        switch (ComboProduto.getSelectedIndex()) {
            case 2:
            case 1:
            case 3:
                jComboSabor.setSelectedIndex(1);
                ComboTamanho.setSelectedIndex(1);
                break;
            case 4:
            case 5:
                jComboSabor.setSelectedIndex(7);
                ComboTamanho.setSelectedIndex(5);
                break;
            default:
                ComboProduto.setSelectedIndex(0);
                jComboSabor.setSelectedIndex(0);
                ComboTamanho.setSelectedIndex(0);
                break;
        }
           
    }//GEN-LAST:event_ComboProdutoActionPerformed

    private void ComboTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTamanhoActionPerformed

    private void jComboSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSaborActionPerformed
    public void String(){
        
    }
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
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProdutos().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSave;
    private javax.swing.JComboBox<String> ComboProduto;
    private javax.swing.JComboBox<String> ComboTamanho;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboSabor;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioID;
    private javax.swing.JRadioButton radioProd;
    private javax.swing.JRadioButton radioSabor;
    private javax.swing.JLabel txtID;
    private javax.swing.JFormattedTextField txtValor;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
