/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.AlbumSQL;
import Controller.Conexao;
import Controller.FaixaSQL;
import Controller.PlaylistSQL;
import Model.Album;
import Model.Faixa;
import Model.Playlist;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tibet Teixeira
 */
public class MostrarAlbum extends javax.swing.JFrame {

    /**
     * Creates new form MostrarAlbum
     */
    public MostrarAlbum() {
        initComponents();
        atualizaTabelaAlbum();
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
        tabelaAlbuns = new javax.swing.JTable();
        menuMusica = new javax.swing.JLabel();
        menuArtista = new javax.swing.JLabel();
        menuAlbum = new javax.swing.JLabel();
        menuPlaylist = new javax.swing.JLabel();
        labelNovaPlaylist = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        jPanel2.setBackground(new java.awt.Color(24, 24, 24));
        jPanel2.setPreferredSize(new java.awt.Dimension(832, 37));

        labelTitulo.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(240, 240, 240));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Álbuns");

        tabelaAlbuns.setBackground(new java.awt.Color(24, 24, 24));
        tabelaAlbuns.setForeground(new java.awt.Color(240, 240, 240));
        tabelaAlbuns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Data de Gravação", "Gravadora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        tabelaAlbuns.setGridColor(new java.awt.Color(240, 240, 240));
        tabelaAlbuns.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaAlbuns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlbunsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabelaAlbunsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlbuns);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        menuMusica.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuMusica.setForeground(new java.awt.Color(155, 155, 155));
        menuMusica.setText("Músicas");
        menuMusica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMusicaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuMusicaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuMusicaMouseExited(evt);
            }
        });

        menuArtista.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuArtista.setForeground(new java.awt.Color(155, 155, 155));
        menuArtista.setText("Artistas");
        menuArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuArtistaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuArtistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuArtistaMouseExited(evt);
            }
        });

        menuAlbum.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuAlbum.setForeground(new java.awt.Color(155, 155, 155));
        menuAlbum.setText("Álbuns");
        menuAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAlbumMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuAlbumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuAlbumMouseExited(evt);
            }
        });

        menuPlaylist.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        menuPlaylist.setForeground(new java.awt.Color(155, 155, 155));
        menuPlaylist.setText("Playlists");
        menuPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPlaylistMouseExited(evt);
            }
        });

        labelNovaPlaylist.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        labelNovaPlaylist.setForeground(new java.awt.Color(155, 155, 155));
        labelNovaPlaylist.setText("+ Nova Playlist");
        labelNovaPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelNovaPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNovaPlaylistMouseExited(evt);
            }
        });

        jTextBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jTextBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jTextBuscar.setText("Buscar...");
        jTextBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menuMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jTextBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(menuMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(labelNovaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
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

    private void tabelaAlbunsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlbunsMouseClicked
        int row = tabelaAlbuns.getSelectedRow();
        int codigoAlbum = (int) tabelaAlbuns.getValueAt(row, 0);
        JFrame aqui = this;

        JPopupMenu jPopupMenu = new JPopupMenu();

        JMenuItem menuItemTocar = new JMenuItem("Tocar");
        JMenuItem menuItemEditar = new JMenuItem("Editar");
        JMenu menuItemPlaylist = new JMenu("Adicionar à Playlist");
        JMenuItem menuCriarPlaylist = new JMenuItem("Nova Playlist");

        jPopupMenu.add(menuItemTocar);
        jPopupMenu.add(menuItemEditar);
        jPopupMenu.add(menuItemPlaylist);
        menuItemPlaylist.add(menuCriarPlaylist);

        List<Playlist> listaPlaylist = listarPlaylists();

        for (Playlist playlist : listaPlaylist) {
            JMenuItem playlistSelected = new JMenuItem(playlist.getNome());
            menuItemPlaylist.add(playlistSelected);
            playlistSelected.addActionListener(
                    new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {        
                    Album album = selecionaAlbum(codigoAlbum);
                    adicionarAlbumPlaylist(playlist, album);
                }
            });
        }

        menuItemEditar.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Album album = selecionaAlbum(codigoAlbum);
                new EditarAlbum(album).setVisible(true);
                dispose();
            }
        });

        menuCriarPlaylist.addActionListener(
                new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CriarPlaylist(aqui).setVisible(true);
                dispose();
            }
        });

        tabelaAlbuns.addMouseListener(
                new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    jPopupMenu.show(tabelaAlbuns, e.getX(), e.getY());
                }
            }
        });

    }//GEN-LAST:event_tabelaAlbunsMouseClicked

    private void tabelaAlbunsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlbunsMousePressed
        Point point = evt.getPoint();
        if (evt.getClickCount() == 2 && tabelaAlbuns.getSelectedRow() != -1) {
            int row = tabelaAlbuns.getSelectedRow();
            int idAlbum = (int) tabelaAlbuns.getValueAt(row, 0);
            String descricao = (String) tabelaAlbuns.getValueAt(row, 1);

            new MostrarFaixasAlbum(idAlbum, descricao).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_tabelaAlbunsMousePressed

    private void menuMusicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMusicaMouseClicked
        new MostrarFaixas().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuMusicaMouseClicked

    private void menuMusicaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMusicaMouseEntered
        menuMusica.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuMusicaMouseEntered

    private void menuMusicaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMusicaMouseExited
        Color gray = new Color(155,155,155);
        menuMusica.setForeground(gray);
    }//GEN-LAST:event_menuMusicaMouseExited

    private void menuArtistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArtistaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuArtistaMouseClicked

    private void menuArtistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArtistaMouseEntered
        menuArtista.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuArtistaMouseEntered

    private void menuArtistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuArtistaMouseExited
        Color gray = new Color(155,155,155);
        menuArtista.setForeground(gray);
    }//GEN-LAST:event_menuArtistaMouseExited

    private void menuAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseClicked
        new MostrarAlbum().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuAlbumMouseClicked

    private void menuAlbumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseEntered
        menuAlbum.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuAlbumMouseEntered

    private void menuAlbumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAlbumMouseExited
        Color gray = new Color(155,155,155);
        menuAlbum.setForeground(gray);
    }//GEN-LAST:event_menuAlbumMouseExited

    private void menuPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseClicked
        new MostrarPlaylist().setVisible(true);
        dispose();
    }//GEN-LAST:event_menuPlaylistMouseClicked

    private void menuPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseEntered
        menuPlaylist.setForeground(Color.WHITE);
    }//GEN-LAST:event_menuPlaylistMouseEntered

    private void menuPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPlaylistMouseExited
        Color gray = new Color(155,155,155);
        menuPlaylist.setForeground(gray);
    }//GEN-LAST:event_menuPlaylistMouseExited

    private void labelNovaPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseClicked
        new CriarPlaylist(this).setVisible(true);
        dispose();
    }//GEN-LAST:event_labelNovaPlaylistMouseClicked

    private void labelNovaPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseEntered
        labelNovaPlaylist.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelNovaPlaylistMouseEntered

    private void labelNovaPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNovaPlaylistMouseExited
        Color gray = new Color(155,155,155);
        labelNovaPlaylist.setForeground(gray);
    }//GEN-LAST:event_labelNovaPlaylistMouseExited

    private void jTextBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextBuscarKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String strTexto = jTextBuscar.getText();
            new MostrarResultado(strTexto).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTextBuscarKeyPressed

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
            java.util.logging.Logger.getLogger(MostrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarAlbum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarAlbum().setVisible(true);
            }
        });
    }

    private void atualizaTabelaAlbum() {
        Connection conn = Conexao.abrirConexao();
        AlbumSQL albumSQL = new AlbumSQL(conn);
        List<Album> lista = new ArrayList();
        lista = albumSQL.listarAlbuns();
        DefaultTableModel tbm = (DefaultTableModel) tabelaAlbuns.getModel();
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        int i = 0;
        for (Album tab : lista) {
            tbm.addRow(new String[i]);
            tabelaAlbuns.setValueAt(tab.getIdAlbum(), i, 0);
            tabelaAlbuns.setValueAt(tab.getDescricao(), i, 1);
            tabelaAlbuns.setValueAt(tab.getDataGravacao(), i, 2);
            tabelaAlbuns.setValueAt(tab.getNomeGravadora(), i, 3);
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

    private void adicionarAlbumPlaylist(Playlist p, Album a) {
        Connection conn = Conexao.abrirConexao();
        PlaylistSQL playlistSQL = new PlaylistSQL(conn);
        playlistSQL.adicionaAlbumPlaylist(p, a);
        Conexao.fecharConexao(conn);
    }

    private Album selecionaAlbum(int idAlbum) {
        Connection conn = Conexao.abrirConexao();
        AlbumSQL albumSQL = new AlbumSQL(conn);
        Album album = albumSQL.listaAlbum(idAlbum);
        Conexao.fecharConexao(conn);

        return album;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JLabel labelNovaPlaylist;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel menuAlbum;
    private javax.swing.JLabel menuArtista;
    private javax.swing.JLabel menuMusica;
    private javax.swing.JLabel menuPlaylist;
    private javax.swing.JTable tabelaAlbuns;
    // End of variables declaration//GEN-END:variables
}
