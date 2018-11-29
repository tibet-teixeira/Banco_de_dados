/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Conexao;
import Controller.FaixaController;
import Controller.FaixaSQL;
import Controller.PlaylistSQL;
import Model.Faixa;
import Model.Playlist;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tibet Teixeira
 */
public class MostrarFaixasAlbum extends javax.swing.JFrame {

    private int idAlbum;
    private Clip clip;

    public MostrarFaixasAlbum(int idAlbum, String descricao) {
        initComponents();
        this.idAlbum = idAlbum;
        this.clip = null;
        labelTitulo.setText(descricao);
        atualizaTabelaFaixas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFaixas = new javax.swing.JTable();
        menuMusica = new javax.swing.JLabel();
        menuArtista = new javax.swing.JLabel();
        menuAlbum = new javax.swing.JLabel();
        menuPlaylist = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(832, 37));

        labelTitulo.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        labelTitulo.setText("Spotper");

        tabelaFaixas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Descrição", "Duração", "Tipo", "Gênero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFaixas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFaixasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFaixas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(labelTitulo)
                .addContainerGap(347, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        menuMusica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuMusica.setForeground(new java.awt.Color(204, 204, 204));
        menuMusica.setText("Músicas");

        menuArtista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuArtista.setForeground(new java.awt.Color(204, 204, 204));
        menuArtista.setText("Artistas");

        menuAlbum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuAlbum.setForeground(new java.awt.Color(204, 204, 204));
        menuAlbum.setText("Álbuns");

        menuPlaylist.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuPlaylist.setForeground(new java.awt.Color(204, 204, 204));
        menuPlaylist.setText("Playlists");

        jTextBuscar.setText("Buscar...");
        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });
        jTextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextBuscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuMusica)
                    .addComponent(menuArtista)
                    .addComponent(menuAlbum)
                    .addComponent(menuPlaylist)
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(menuMusica)
                .addGap(18, 18, 18)
                .addComponent(menuArtista)
                .addGap(18, 18, 18)
                .addComponent(menuAlbum)
                .addGap(18, 18, 18)
                .addComponent(menuPlaylist)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String strTexto = jTextBuscar.getText();
            JOptionPane.showMessageDialog(null, strTexto);
        }
    }//GEN-LAST:event_jTextBuscarKeyPressed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void tabelaFaixasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFaixasMouseClicked
        int row = tabelaFaixas.getSelectedRow();
        int numFaixa = (int) tabelaFaixas.getValueAt(row, 0);
        JFrame aqui = this;
        
        JPopupMenu jPopupMenu = new JPopupMenu();

        JMenuItem menuItemTocar = new JMenuItem("Tocar");
        JMenuItem menuItemArtista = new JMenuItem("Ir para artista");
        JMenu menuItemPlaylist = new JMenu("Adicionar à Playlist");
        JMenuItem menuCriarPlaylist = new JMenuItem("Nova Playlist");

        jPopupMenu.add(menuItemTocar);
        jPopupMenu.add(menuItemArtista);
        jPopupMenu.add(menuItemPlaylist);
        menuItemPlaylist.add(menuCriarPlaylist);

        List<Playlist> listaPlaylist = listarPlaylists();

        for (Playlist playlist : listaPlaylist) {
            JMenuItem playlistSelected = new JMenuItem(playlist.getNome());
            menuItemPlaylist.add(playlistSelected);
            playlistSelected.addActionListener(
                    new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int row = tabelaFaixas.getSelectedRow();
                    int numFaixa = (int) tabelaFaixas.getValueAt(row, 0);

                    Faixa faixa = selecionaFaixa(numFaixa);
                    adicionarFaixaPlaylist(playlist, faixa);
                }
            });
        }

        menuItemTocar.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = tabelaFaixas.getSelectedRow();
                int numFaixa = (int) tabelaFaixas.getValueAt(row, 0);
                Faixa faixa = selecionaFaixa(numFaixa);
                if (clip != null) clip.stop();
                clip = new FaixaController().tocarFaixa(faixa);
            }
        });

        menuItemArtista.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = tabelaFaixas.getSelectedRow();
                int numFaixa = (int) tabelaFaixas.getValueAt(row, 0);
                System.out.println("Número da faixa 1 - " + numFaixa);
            }
        });

        menuCriarPlaylist.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CriarPlaylist(aqui).setVisible(true);
            }
        });

        tabelaFaixas.addMouseListener(
                new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    jPopupMenu.show(tabelaFaixas, e.getX(), e.getY());
                }
            }
        });
    }//GEN-LAST:event_tabelaFaixasMouseClicked

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
            java.util.logging.Logger.getLogger(MostrarFaixasAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarFaixasAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarFaixasAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarFaixasAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarFaixasAlbum(111, "Album 1").setVisible(true);
            }
        });
    }

    private void atualizaTabelaFaixas() {
        Connection conn = Conexao.abrirConexao();
        FaixaSQL faixaSQL = new FaixaSQL(conn);
        List<Faixa> lista;
        lista = faixaSQL.listarFaixasAlbum(this.idAlbum);
        DefaultTableModel tbm = (DefaultTableModel) tabelaFaixas.getModel();
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        int i = 0;
        for (Faixa tab : lista) {
            tbm.addRow(new String[i]);
            tabelaFaixas.setValueAt(tab.getNumFaixa(), i, 0);
            tabelaFaixas.setValueAt(tab.getDescricao(), i, 1);
            tabelaFaixas.setValueAt(tab.getTempoDuracao(), i, 2);
            tabelaFaixas.setValueAt(tab.getTipoGravacao(), i, 3);
            tabelaFaixas.setValueAt(tab.getDescricaoComposicao(), i, 4);
            i++;
        }
        Conexao.fecharConexao(conn);
    }

    private List<Playlist> listarPlaylists() {
        Connection conn = Conexao.abrirConexao();
        PlaylistSQL playlistSQL = new PlaylistSQL(conn);
        List<Playlist> lista = playlistSQL.listarPlaylist();
        Conexao.fecharConexao(conn);

        return lista;
    }

    private void adicionarFaixaPlaylist(Playlist p, Faixa f) {
        Connection conn = Conexao.abrirConexao();
        PlaylistSQL playlistSQL = new PlaylistSQL(conn);
        playlistSQL.adicionaFaixaPlaylist(p, f);
        Conexao.fecharConexao(conn);
    }

    private Faixa selecionaFaixa(int numFaixa) {
        Connection conn = Conexao.abrirConexao();
        FaixaSQL faixaSQL = new FaixaSQL(conn);
        Faixa faixa = faixaSQL.listaFaixa(this.idAlbum, numFaixa);
        Conexao.fecharConexao(conn);

        return faixa;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel menuAlbum;
    private javax.swing.JLabel menuArtista;
    private javax.swing.JLabel menuMusica;
    private javax.swing.JLabel menuPlaylist;
    private javax.swing.JTable tabelaFaixas;
    // End of variables declaration//GEN-END:variables
}
