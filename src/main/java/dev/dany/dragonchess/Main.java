package dev.dany.dragonchess;

import dev.dany.dragonchess.utils.*;
import dev.dany.dragonchess.web.*;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Dany
 */
public class Main extends javax.swing.JFrame
{
    public Main(String title)
    {
        super(title);
        initComponents();
        resetChessboard();
        resetMoves();
        
        data = new DataPackage();
        
        pUpper.setLayout(new GridLayout(8, 12));
        pMiddle.setLayout(new GridLayout(8, 12));
        pLower.setLayout(new GridLayout(8, 12));
        
        for(int z = 0; z < 3; z++)
        {
            for(int y = 0; y < 8; y++)
            {
                for(int x = 0; x < 12; x++)
                {
                    chessboard[z][y][x] = new JLabel("");
                    switch(z)
                    {
                        case 2:
                            pUpper.add(chessboard[z][y][x]);
                            break;
                            
                        case 1:
                            pMiddle.add(chessboard[z][y][x]);
                            break;
                            
                        case 0:
                            pLower.add(chessboard[z][y][x]);
                    }
                    addChessboardEvents(chessboard[z][y][x]);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fGameOver = new javax.swing.JFrame();
        pMain = new javax.swing.JPanel();
        lGame = new javax.swing.JLabel();
        bContinue = new javax.swing.JButton();
        tpMain = new javax.swing.JTabbedPane();
        pUpperTab = new javax.swing.JPanel();
        pUpper = new javax.swing.JPanel();
        pMiddleTab = new javax.swing.JPanel();
        pMiddle = new javax.swing.JPanel();
        pLowerTab = new javax.swing.JPanel();
        pLower = new javax.swing.JPanel();
        lMainTitle = new javax.swing.JLabel();
        bHostGame = new javax.swing.JButton();
        tIpAddress = new javax.swing.JTextField();
        bConnect = new javax.swing.JButton();
        lJoinGame = new javax.swing.JLabel();
        lConnected = new javax.swing.JLabel();
        bDisconnect = new javax.swing.JButton();
        bRules = new javax.swing.JButton();
        lSideColor = new javax.swing.JLabel();
        lColor = new javax.swing.JLabel();
        lHelp = new javax.swing.JLabel();

        fGameOver.setTitle("Game Over");
        fGameOver.setBackground(new java.awt.Color(102, 102, 102));
        fGameOver.setMinimumSize(new java.awt.Dimension(350, 350));

        lGame.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bContinue.setText("Continue");
        bContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMainLayout = new javax.swing.GroupLayout(pMain);
        pMain.setLayout(pMainLayout);
        pMainLayout.setHorizontalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMainLayout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(bContinue)
                .addContainerGap())
            .addComponent(lGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMainLayout.setVerticalGroup(
            pMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMainLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lGame, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(bContinue)
                .addContainerGap())
        );

        javax.swing.GroupLayout fGameOverLayout = new javax.swing.GroupLayout(fGameOver.getContentPane());
        fGameOver.getContentPane().setLayout(fGameOverLayout);
        fGameOverLayout.setHorizontalGroup(
            fGameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fGameOverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        fGameOverLayout.setVerticalGroup(
            fGameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fGameOverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        tpMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpMainStateChanged(evt);
            }
        });

        pUpper.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout pUpperLayout = new javax.swing.GroupLayout(pUpper);
        pUpper.setLayout(pUpperLayout);
        pUpperLayout.setHorizontalGroup(
            pUpperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pUpperLayout.setVerticalGroup(
            pUpperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pUpperTabLayout = new javax.swing.GroupLayout(pUpperTab);
        pUpperTab.setLayout(pUpperTabLayout);
        pUpperTabLayout.setHorizontalGroup(
            pUpperTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pUpperTabLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(pUpper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pUpperTabLayout.setVerticalGroup(
            pUpperTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pUpperTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pUpper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpMain.addTab("Upper", pUpperTab);

        pMiddle.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout pMiddleLayout = new javax.swing.GroupLayout(pMiddle);
        pMiddle.setLayout(pMiddleLayout);
        pMiddleLayout.setHorizontalGroup(
            pMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pMiddleLayout.setVerticalGroup(
            pMiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pMiddleTabLayout = new javax.swing.GroupLayout(pMiddleTab);
        pMiddleTab.setLayout(pMiddleTabLayout);
        pMiddleTabLayout.setHorizontalGroup(
            pMiddleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMiddleTabLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(pMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pMiddleTabLayout.setVerticalGroup(
            pMiddleTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMiddleTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pMiddle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpMain.addTab("Middle", pMiddleTab);

        pLower.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout pLowerLayout = new javax.swing.GroupLayout(pLower);
        pLower.setLayout(pLowerLayout);
        pLowerLayout.setHorizontalGroup(
            pLowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        pLowerLayout.setVerticalGroup(
            pLowerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pLowerTabLayout = new javax.swing.GroupLayout(pLowerTab);
        pLowerTab.setLayout(pLowerTabLayout);
        pLowerTabLayout.setHorizontalGroup(
            pLowerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLowerTabLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(pLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pLowerTabLayout.setVerticalGroup(
            pLowerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLowerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpMain.addTab("Lower", pLowerTab);

        lMainTitle.setFont(new java.awt.Font("Source Serif Pro Black", 3, 45)); // NOI18N
        lMainTitle.setForeground(new java.awt.Color(255, 0, 0));
        lMainTitle.setText("Dragonchess");

        bHostGame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bHostGame.setText("Host Game");
        bHostGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHostGameActionPerformed(evt);
            }
        });

        bConnect.setText("Connect");
        bConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConnectActionPerformed(evt);
            }
        });

        lJoinGame.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lJoinGame.setText("Join Game");

        lConnected.setForeground(new java.awt.Color(0, 255, 0));

        bDisconnect.setText("Disconnect");
        bDisconnect.setEnabled(false);
        bDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDisconnectActionPerformed(evt);
            }
        });

        bRules.setText("Rules");
        bRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRulesActionPerformed(evt);
            }
        });

        lSideColor.setText("Your Color:");

        lColor.setMaximumSize(new java.awt.Dimension(50, 50));
        lColor.setMinimumSize(new java.awt.Dimension(50, 50));
        lColor.setPreferredSize(new java.awt.Dimension(50, 50));

        lHelp.setText("Left Click => Select        Right Click => Deselect");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMainTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lJoinGame)
                                    .addComponent(bDisconnect)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tIpAddress)
                                            .addComponent(bHostGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lConnected, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lSideColor)
                                    .addComponent(lColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(tpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bRules)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lHelp)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMainTitle)
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bHostGame)
                            .addComponent(lConnected, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(lJoinGame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bConnect))
                        .addGap(40, 40, 40)
                        .addComponent(bDisconnect)
                        .addGap(82, 82, 82)
                        .addComponent(lSideColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRules)
                    .addComponent(lHelp))
                .addContainerGap())
        );

        tpMain.getAccessibleContext().setAccessibleName("Upper");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeTurn()
    {
        if(!updateChessboard())//To upgrade
        {
            boolean found = false;
            for(int z = 0; z < 3; z++)
            {
                for(int y = 0; y < 8; y++)
                {
                    for(int x = 0; x < 12; x++)
                    {
                       if(tokens[z][y][x] == 'K')
                       {
                           found = true;
                           break;
                       }
                    }
                }
            }
            if(!(found ^ isServer))
            {
                lGame.setText("You Won!");
            }
            else
            {
                lGame.setText("You Lost!");
            }
            fGameOver.setVisible(true);
        }
        if(isServer) //Server Side
        {
            data = (DataPackage)(server.receive(0));
            if(data == null)
            {
                bDisconnectActionPerformed(null);
                return;
            }
            if(tokens[data.aZ][data.aY][data.aX] == data.dataA && data.dataB == tokens[data.bZ][data.bY][data.bX])
                System.out.println("OK!");
            moveTile(data.aX, data.aY, data.aZ, data.bX, data.bY, data.bZ);
            serverTurn = true;
        }
        else //Client Side
        {
            data = (DataPackage)(client.receive());
            if(data == null)
            {
                bDisconnectActionPerformed(null);
                return;
            }
            if(tokens[data.aZ][data.aY][data.aX] == data.dataA && data.dataB == tokens[data.bZ][data.bY][data.bX])
                System.out.println("OK!");
            moveTile(data.aX, data.aY, data.aZ, data.bX, data.bY, data.bZ);
            serverTurn = false;
        }
        if(!updateChessboard())//To upgrade
        {
            boolean found = false;
            for(int z = 0; z < 3; z++)
            {
                for(int y = 0; y < 8; y++)
                {
                    for(int x = 0; x < 12; x++)
                    {
                       if(tokens[z][y][x] == 'K')
                       {
                           found = true;
                           break;
                       }
                    }
                }
            }
            if(!(found ^ isServer))
            {
                lGame.setText("You Won!");
            }
            else
            {
                lGame.setText("You Lost!");
            }
            fGameOver.setVisible(true);
        }
    }
    
    private void bHostGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHostGameActionPerformed
        tIpAddress.setEnabled(false);
        bConnect.setEnabled(false);
        server = new Server(2003, 1);
        lConnected.setText("Connected!");
        bHostGame.setEnabled(false);
        bDisconnect.setEnabled(true);
        isServer = true;
        lColor.setIcon(IconUtils.getImageIcon(pathToTextures + "/Black.png"));
        server.send(data, 0);
        updateChessboard();
        changeTurn();
    }//GEN-LAST:event_bHostGameActionPerformed

    private void bConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConnectActionPerformed
        bHostGame.setEnabled(false);
        client = new Client(tIpAddress.getText(), 2003);
        if(!client.isConnected())
        {
            lConnected.setForeground(new java.awt.Color(255, 0, 0));
            lConnected.setText("NOT CONNECTED!");
        }
        lConnected.setForeground(new java.awt.Color(0, 255, 0));
        lConnected.setText("Connected!");
        tIpAddress.setEnabled(false);
        bConnect.setEnabled(false);
        bDisconnect.setEnabled(true);
        isServer = false;
        lColor.setIcon(IconUtils.getImageIcon(pathToTextures + "/White.png"));
        updateChessboard();
        changeTurn();
    }//GEN-LAST:event_bConnectActionPerformed

    private void bDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDisconnectActionPerformed
        if(isServer)
            server.close();
        else
            client.close();
        bHostGame.setEnabled(true);
        tIpAddress.setEnabled(true);
        bConnect.setEnabled(true);
        bDisconnect.setEnabled(false);
        lConnected.setText("");
        lColor.setIcon(null);
        data = new DataPackage();
        isServer = serverTurn = selectionOn = false;
        resetChessboard();
        resetMoves();
        updateChessboard();
    }//GEN-LAST:event_bDisconnectActionPerformed

    private void tpMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpMainStateChanged
        switch(tpMain.getSelectedIndex())
        {
            case 0:
                currentZ = 2;
                break;
                
            case 1:
                currentZ = 1;
                break;
                
            case 2:
                currentZ = 0;
                break;
        }
    }//GEN-LAST:event_tpMainStateChanged

    private void bContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bContinueActionPerformed
        fGameOver.setVisible(false);
        if(isServer)
            server.close();
        else
            client.close();
        bHostGame.setEnabled(true);
        tIpAddress.setEnabled(true);
        bConnect.setEnabled(true);
        bDisconnect.setEnabled(false);
        lConnected.setText("");
        lColor.setIcon(null);
        resetChessboard();
        updateChessboard();
    }//GEN-LAST:event_bContinueActionPerformed

    private void bRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRulesActionPerformed
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
            try {
                Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Dragonchess"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bRulesActionPerformed

    private void addChessboardEvents(JLabel image)
    {
        image.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                if(!(isServer ^ serverTurn))
                {
                    if(SwingUtilities.isRightMouseButton(evt))
                    {
                        if(selectionOn)
                        {
                            resetMoves();
                            updateChessboard();
                            selectionOn = false;
                        }
                    }
                    else
                    {
                        if(!selectionOn)
                        {
                            char selectedToken = tokens[currentZ][image.getY() / 50][image.getX() / 50];
                            if(selectedToken != '#')
                            {
                                if(!(java.lang.Character.isUpperCase(selectedToken) ^ isServer))
                                {
                                    if(selectedZ == 1 && java.lang.Character.toLowerCase(
                                            tokens[0][image.getY() / 50][image.getX() / 50]) == 'b')
                                    {
                                        if(java.lang.Character.isUpperCase(selectedToken) ^
                                                java.lang.Character.isUpperCase(
                                                        tokens[0][image.getY() / 50][image.getX() / 50]))
                                                return;
                                    }
                                    selectedX = image.getX() / 50;
                                    selectedY = image.getY() / 50;
                                    selectedZ = currentZ;
                                    selectionOn = true;
                                    image.setIcon(IconUtils.overlayImages(IconUtils.iconToBufferedImage(image.getIcon()),
                                        pathToTextures + "/Selected.png"));
                                    setMoves(selectedToken, selectedX, selectedY, selectedZ);
                                }
                            }
                        }
                        else
                        {
                            //Checks if clicked tile is the selected one and prevents "friendly fire"
                            if(!((selectedX == image.getX() / 50) && (selectedY == image.getY() / 50) && (selectedZ == currentZ)))
                            {
                                if(moves[currentZ][image.getY() / 50][image.getX() / 50])
                                {
                                    moveTile(selectedX, selectedY, selectedZ, image.getX() / 50, image.getY() / 50, currentZ);
                                    selectionOn = false;
                                    serverTurn = !serverTurn;

                                    if(isServer)
                                        server.send(data, 0);
                                    else
                                        client.send(data);
                                    changeTurn();
                                }
                            }
                        }
                    }
                } 
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                if(!((chessboard[selectedZ][selectedY][selectedX].equals(image) && selectionOn) ||
                        moves[currentZ][image.getY() / 50][image.getX() / 50]))
                {
                    image.setIcon(IconUtils.overlayImages(IconUtils.iconToBufferedImage(image.getIcon()),
                            pathToTextures + "/CursorOn.png"));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                if(!((chessboard[selectedZ][selectedY][selectedX].equals(image) && selectionOn) ||
                        moves[currentZ][image.getY() / 50][image.getX() / 50]))
                    updateTile(image.getX() / 50, image.getY() / 50, currentZ);
            }
        });
    }
    
    private boolean updateTile(int x, int y, int z)
    {
        String bgPath = pathToTextures;
        if((x + y) % 2 == 0)
            switch(z)
            {
                case 2:
                    bgPath += "/Light_Gray.png";
                    break;
                    
                case 1:
                    bgPath += "/Light_Brown.png";
                    break;
                    
                case 0:
                    bgPath += "/Brown.png";
                    break;
            }
        else
            switch(z)
            {
                case 2:
                    bgPath += "/Blue.png";
                    break;
                    
                case 1:
                    bgPath += "/Green.png";
                    break;
                    
                case 0:
                    bgPath += "/Red.png";
                    break;
            }
        
        switch(tokens[z][y][x])
            {
                case 'S':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Sylph.png"));
                    break;

                case 's':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Sylph.png"));
                    break;

                case 'G':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Griffon.png"));
                    break;

                case 'g':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Griffon.png"));
                    break;

                case 'R':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Dragon.png"));
                    break;

                case 'r':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Dragon.png"));
                    break;

                case 'D':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Dwarf.png"));
                    break;

                case 'd':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Dwarf.png"));
                    break;

                case 'B':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Basilisk.png"));
                    break;

                case 'b':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Basilisk.png"));
                    break;

                case 'E':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Elemental.png"));
                    break;

                case 'e':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Elemental.png"));
                    break;
                
                case 'W':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Warrior.png"));
                    break;
                    
                case 'w':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Warrior.png"));
                    break;
                    
                case 'O':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Oliphant.png"));
                    break;
                    
                case 'o':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Oliphant.png"));
                    break;
                    
                case 'U':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Unicorn.png"));
                    break;
                    
                case 'u':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Unicorn.png"));
                    break;
                    
                case 'H':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Hero.png"));
                    break;
                    
                case 'h':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Hero.png"));
                    break;
                    
                case 'T':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Thief.png"));
                    break;
                    
                case 't':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Thief.png"));
                    break;
                        
                case 'C':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Cleric.png"));
                    break;
                            
                case 'c':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Cleric.png"));
                    break;
                            
                case 'M':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Mage.png"));
                    break;
                            
                case 'm':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Mage.png"));
                    break;
                            
                case 'K':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_King.png"));
                    return true;
                            
                case 'k':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_King.png"));
                    return true;
                            
                case 'P':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/B_Paladin.png"));
                    break;
                            
                case 'p':
                    chessboard[z][y][x].setIcon(IconUtils.overlayImages(bgPath, pathToTextures + "/W_Paladin.png"));
                    break;

                default:
                    chessboard[z][y][x].setIcon(IconUtils.getImageIcon(bgPath));
        }
        return false;
    }
    
    private void moveTile(int aX, int aY, int aZ, int bX, int bY, int bZ)
    {
        if((aX == bX) && (aY == bY) && (aZ == bZ)) return;
        if(tokens[aZ][aY][aX] == '#') return;
        
        data.aX = aX; data.aY = aY; data.aZ = aZ;
        data.bX = bX; data.bY = bY; data.bZ = bZ;
        data.dataA = tokens[aZ][aY][aX];
        data.dataB = tokens[bZ][bY][bX];
        
        if((tokens[aZ][aY][aX] == 'r' || tokens[aZ][aY][aX] == 'R') && bZ == 1)
        {
            tokens[bZ][bY][bX] = '#';
            resetMoves();
            updateChessboard();
            return;
        }
        if(tokens[aZ][aY][aX] == 'w' && bY == 0)
            tokens[aZ][aY][aX] = 'h';
        if(tokens[aZ][aY][aX] == 'W' && bY == 7)
            tokens[aZ][aY][aX] = 'H';
        
        tokens[bZ][bY][bX] = tokens[aZ][aY][aX];
        tokens[aZ][aY][aX] = '#';
        resetMoves();
        updateChessboard();
    }
    
    private boolean updateChessboard()
    {
        boolean kingsAlive = true;
        for(int z = 0; z < 3; z++)
        {
            for(int y = 0; y < 8; y++)
            {
                for(int x = 0; x < 12; x++)
                {
                    if(updateTile(x, y, z))
                        kingsAlive = !kingsAlive;
                }
            }
        }
        return kingsAlive;
    }
    
    private void resetChessboard()
    {
        tokens = new char[][][]
        {
            {//Lower - 0
                {'#', '#', 'B', '#', '#', '#', 'E', '#', '#', '#', 'B', '#'},
                {'#', 'D', '#', 'D', '#', 'D', '#', 'D', '#', 'D', '#', 'D'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', 'd', '#', 'd', '#', 'd', '#', 'd', '#', 'd', '#', 'd'},
                {'#', '#', 'b', '#', '#', '#', 'e', '#', '#', '#', 'b', '#'}
            },

            {//Middle - 1
                {'O', 'U', 'H', 'T', 'C', 'M', 'K', 'P', 'T', 'H', 'U', 'O'},
                {'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W', 'W'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w', 'w'},
                {'o', 'u', 'h', 't', 'c', 'm', 'k', 'p', 't', 'h', 'u', 'o'}
            },

            {//Upper - 2
                {'#', '#', 'G', '#', '#', '#', 'R', '#', '#', '#', 'G', '#'},
                {'S', '#', 'S', '#', 'S', '#', 'S', '#', 'S', '#', 'S', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                {'s', '#', 's', '#', 's', '#', 's', '#', 's', '#', 's', '#'},
                {'#', '#', 'g', '#', '#', '#', 'r', '#', '#', '#', 'g', '#'}
            }
        };
    }
    
    private void resetMoves()
    {
        moves = new boolean[3][8][12];
        
        for(int z = 0; z < 3; z++)
        {
            for(int y = 0; y < 8; y++)
            {
                for(int x = 0; x < 12; x++)
                {
                    moves[z][y][x] = false;
                }
            }
        }
    }
    
    private void setMoves(char token, int x, int y, int z)
    {
        switch(token)
        {
            case 's':
                if(z == 2)
                {
                    if(y - 1 >= 0)
                    {
                        if(tokens[2][y-1][x] != '#')
                            moves[2][y-1][x] = true;
                        if(x - 1 >= 0)
                            if(tokens[2][y-1][x-1] == '#')
                                moves[2][y-1][x-1] = true;
                        if(x + 1 < 12)
                            if(tokens[2][y-1][x+1] == '#')
                                moves[2][y-1][x+1] = true;
                    }
                    if(tokens[1][y][x] != '#')
                        moves[1][y][x] = true;
                }
                else if(z == 1)
                {
                    if(tokens[2][y][x] == '#')
                        moves[2][y][x] = true;
                    if(tokens[2][6][0] == '#')
                        moves[2][6][0] = true;
                    if(tokens[2][6][2] == '#')
                        moves[2][6][2] = true;
                    if(tokens[2][6][4] == '#')
                        moves[2][6][4] = true;
                    if(tokens[2][6][6] == '#')
                        moves[2][6][6] = true;
                    if(tokens[2][6][8] == '#')
                        moves[2][6][8] = true;
                    if(tokens[2][6][10] == '#')
                        moves[2][6][10] = true;
                }
                break;
                
            case 'S':
                if(z == 2)
                {
                    if(y + 1 < 8)
                    {
                        if(tokens[2][y+1][x] != '#')
                            moves[2][y+1][x] = true;
                        if(x - 1 >= 0)
                            if(tokens[2][y+1][x-1] == '#')
                                moves[2][y+1][x-1] = true;
                        if(x + 1 < 12)
                            if(tokens[2][y+1][x+1] == '#')
                                moves[2][y+1][x+1] = true;
                    }
                    
                    moves[1][y][x] = true;
                }
                else if(z == 1)
                {
                    if(tokens[2][y][x] == '#')
                        moves[2][y][x] = true;
                    if(tokens[2][1][0] == '#')
                        moves[2][1][0] = true;
                    if(tokens[2][1][2] == '#')
                        moves[2][1][2] = true;
                    if(tokens[2][1][4] == '#')
                        moves[2][1][4] = true;
                    if(tokens[2][1][6] == '#')
                        moves[2][1][6] = true;
                    if(tokens[2][1][8] == '#')
                        moves[2][1][8] = true;
                    if(tokens[2][1][10] == '#')
                        moves[2][1][10] = true;
                }
                break;
                
            case 'g':
            case 'G':
                if(z == 2)
                {
                    if(y - 3 >= 0)
                    {
                        if(x - 2 >= 0)
                            moves[2][y-3][x-2] = true;
                        if(x + 2 < 12)
                            moves[2][y-3][x+2] = true;
                    }
                    if(x + 3 < 12)
                    {
                        if(y - 2 >= 0)
                            moves[2][y-2][x+3] = true;
                        if(y + 2 < 8)
                            moves[2][y+2][x+3] = true;
                    }
                    if(y + 3 < 8)
                    {
                        if(x - 2 >= 0)
                            moves[2][y+3][x-2] = true;
                        if(x + 2 < 12)
                            moves[2][y+3][x+2] = true;
                    }
                    if(x - 3 >= 0)
                    {
                        if(y - 2 >= 0)
                            moves[2][y-2][x-3] = true;
                        if(y + 2 < 8)
                            moves[2][y+2][x-3] = true;
                    }
                    
                    if(x - 1 >= 0)
                    {
                        if(y - 1 >= 0)
                            moves[1][y-1][x-1] = true;
                        if(y + 1 < 8)
                            moves[1][y+1][x-1] = true;
                    }
                    if(x + 1 < 12)
                    {
                        if(y - 1 >= 0)
                            moves[1][y-1][x+1] = true;
                        if(y + 1 < 8)
                            moves[1][y+1][x+1] = true;
                    }
                }
                else if(z == 1)
                {
                    if(x - 1 >= 0)
                    {
                        if(y - 1 >= 0)
                        {
                            moves[1][y-1][x-1] = true;
                            moves[2][y-1][x-1] = true;
                        }
                        if(y + 1 < 8)
                        {
                            moves[1][y+1][x-1] = true;
                            moves[2][y+1][x-1] = true;
                        }
                    }
                    if(x + 1 < 12)
                    {
                        if(y - 1 >= 0)
                        {
                            moves[1][y-1][x+1] = true;
                            moves[2][y-1][x+1] = true;
                        }
                        if(y + 1 < 8)
                        {
                            moves[1][y+1][x+1] = true;
                            moves[2][y+1][x+1] = true;
                        }
                    }
                }
                break;
                
            case 'r':
            case 'R':
                if(z == 2)
                {
                    if(x - 1 >= 0)
                        moves[2][y][x-1] = true;
                    if(x + 1 < 12)
                        moves[2][y][x+1] = true;
                    if(y - 1 >= 0)
                        moves[2][y-1][x] = true;
                    if(y + 1 < 8)
                        moves[2][y+1][x] = true;

                    for(int i = 1; i < 8; i++)
                    {
                        if(x - i >= 0 && y - i >= 0)
                        {
                            if(tokens[2][y-i][x-i] == '#')
                                moves[2][y-i][x-i] = true;
                            else
                            {
                                moves[2][y-i][x-i] = true;
                                break;
                            }
                        }       
                    }
                    for(int i = 1; i < 8; i++)
                    {
                        if(x - i >= 0 && y + i < 8)
                        {
                            if(tokens[2][y+i][x-i] == '#')
                                moves[2][y+i][x-i] = true;
                            else
                            {
                                moves[2][y+i][x-i] = true;
                                break;
                            }
                        }       
                    }
                    for(int i = 1; i < 8; i++)
                    {
                        if(x + i < 12 && y - i >= 0)
                        {
                            if(tokens[2][y-i][x+i] == '#')
                                moves[2][y-i][x+i] = true;
                            else
                            {
                                moves[2][y-i][x+i] = true;
                                break;
                            }
                        }       
                    }
                    for(int i = 1; i < 8; i++)
                    {
                         if(x + i < 12 && y + i < 8)
                        {
                            if(tokens[2][y+i][x+i] == '#')
                                moves[2][y+i][x+i] = true;
                            else
                            {
                                moves[2][y+i][x+i] = true;
                                break;
                            }
                        }       
                    }
                    
                    if(x - 1 >= 0 && tokens[1][y][x-1] != '#')
                        moves[1][y][x-1] = true;
                    if(x + 1 < 12 && tokens[1][y][x+1] != '#')
                        moves[1][y][x+1] = true;
                    if(y - 1 >= 0 && tokens[1][y-1][x] != '#')
                        moves[1][y-1][x] = true;
                    if(y + 1 < 8 && tokens[1][y+1][x] != '#')
                        moves[1][y+1][x] = true;
                    if(tokens[1][y][x] != '#')
                        moves[1][y][x] = true;
                }
                break;
                
            case 'w':
                if(y - 1 >= 0)
                {
                    if(tokens[1][y-1][x] == '#')
                        moves[1][y-1][x] = true;
                    if(x - 1 >= 0)
                        if(tokens[1][y-1][x-1] != '#')
                            moves[1][y-1][x-1] = true;
                    if(x + 1 < 12)
                        if(tokens[1][y-1][x+1] != '#')
                            moves[1][y-1][x+1] = true;
                }
                break;
                
            case 'W':
                if(y + 1 >= 0)
                {
                    if(tokens[1][y+1][x] == '#')
                        moves[1][y+1][x] = true;
                    if(x - 1 >= 0)
                        if(tokens[1][y+1][x-1] != '#')
                            moves[1][y+1][x-1] = true;
                    if(x + 1 < 12)
                        if(tokens[1][y+1][x+1] != '#')
                            moves[1][y+1][x+1] = true;
                }
                break;
                
            case 'o':
            case 'O':
                for(int i = 1; i < 8; i++)
                {
                    if(y - i >= 0)
                    {
                        if(tokens[1][y-i][x] == '#')
                            moves[1][y-i][x] = true;
                        else
                        {
                            moves[1][y-i][x] = true;
                            break;
                        }
                    }
                }
                for(int i = 1; i < 8; i++)
                {
                    if(y + i < 8)
                    {
                        if(tokens[1][y+i][x] == '#')
                            moves[1][y+i][x] = true;
                        else
                        {
                            moves[1][y+i][x] = true;
                            break;
                        }
                    }
                }
                for(int i = 1; i < 12; i++)
                {
                    if(x - i >= 0)
                    {
                        if(tokens[1][y][x-i] == '#')
                            moves[1][y][x-i] = true;
                        else
                        {
                            moves[1][y][x-i] = true;
                            break;
                        }
                    }
                }
                for(int i = 1; i < 12; i++)
                {
                    if(x + i < 12)
                    {
                        if(tokens[1][y][x+i] == '#')
                            moves[1][y][x+i] = true;
                        else
                        {
                            moves[1][y][x+i] = true;
                            break;
                        }
                    }   
                }
                break;
                
            case 'u':
            case 'U':
                if(y - 2 >= 0)
                {
                    if(x - 1 >= 0)
                        moves[1][y-2][x-1] = true;
                    if(x + 1 < 12)
                        moves[1][y-2][x+1] = true;
                }
                if(y + 2 < 8)
                {
                    if(x - 1 >= 0)
                        moves[1][y+2][x-1] = true;
                    if(x + 1 < 12)
                        moves[1][y+2][x+1] = true;
                }
                if(x - 2 >= 0)
                {
                    if(y - 1 >= 0)
                        moves[1][y-1][x-2] = true;
                    if(y + 1 < 8)
                        moves[1][y+1][x-2] = true;
                }
                if(x + 2 < 12)
                {
                    if(y - 1 >= 0)
                        moves[1][y-1][x+2] = true;
                    if(y + 1 < 8)
                        moves[1][y+1][x+2] = true;
                }
                break;
                
            case 'h':
            case 'H':
                if(z == 1)
                {
                    if(x - 2 >= 0 && y - 2 >= 0)
                        moves[1][y-2][x-2] = true;
                    if(x + 2 < 12 && y - 2 >= 0)
                        moves[1][y-2][x+2] = true;
                    if(x - 2 >= 0 && y + 2 < 8)
                        moves[1][y+2][x-2] = true;
                    if(x + 2 < 12 && y + 2 < 8)
                        moves[1][y+2][x+2] = true;
                    if(x - 1 >= 0 && y - 1 >= 0)
                        moves[1][y-1][x-1] = true;
                    if(x + 1 < 12 && y - 1 >= 0)
                        moves[1][y-1][x+1] = true;
                    if(x - 1 >= 0 && y + 1 < 8)
                        moves[1][y+1][x-1] = true;
                    if(x + 1 < 12 && y + 1 < 8)
                        moves[1][y+1][x+1] = true;
                    
                    if(x - 1 >= 0)
                    {
                        if(y - 1 >= 0)
                        {
                            moves[0][y-1][x-1] = true;
                            moves[2][y-1][x-1] = true;
                        }   
                        if(y + 1 < 8)
                        {
                            moves[0][y+1][x-1] = true;
                            moves[2][y+1][x-1] = true;
                        }
                    }
                    if(x + 1 < 12)
                    {
                        if(y - 1 >= 0)
                        {
                            moves[0][y-1][x+1] = true;
                            moves[2][y-1][x+1] = true;
                        }
                        if(y + 1 < 8)
                        {
                            moves[0][y+1][x+1] = true;
                            moves[2][y+1][x+1] = true;
                        }
                    }
                }
                else
                {
                    //Temporary, until i find out how to make the game "remember" last position of the hero on level 2
                    if(x - 1 >= 0)
                    {
                        if(y - 1 >= 0)
                            moves[1][y-1][x-1] = true;
                        if(y + 1 < 8)
                            moves[1][y+1][x-1] = true;
                    }
                    if(x + 1 < 12)
                    {
                        if(y - 1 >= 0)
                            moves[1][y-1][x+1] = true;
                        if(y + 1 < 8)
                            moves[1][y+1][x+1] = true;
                    }
                }
                break;
                
            case 't':
            case 'T':
                for(int i = 1; i < 8; i++)
                {
                    if(x - i >= 0 && y - i >= 0)
                    {
                        if(tokens[1][y-i][x-i] == '#')
                            moves[1][y-i][x-i] = true;
                        else
                        {
                            moves[1][y-i][x-i] = true;
                            break;
                        }
                    }       
                }
                for(int i = 1; i < 8; i++)
                {
                    if(x - i >= 0 && y + i < 8)
                    {
                        if(tokens[1][y+i][x-i] == '#')
                            moves[1][y+i][x-i] = true;
                        else
                        {
                            moves[1][y+i][x-i] = true;
                            break;
                        }
                    }       
                }
                for(int i = 1; i < 8; i++)
                {
                    if(x + i < 12 && y - i >= 0)
                    {
                        if(tokens[1][y-i][x+i] == '#')
                            moves[1][y-i][x+i] = true;
                        else
                        {
                            moves[1][y-i][x+i] = true;
                            break;
                        }
                    }       
                }
                for(int i = 1; i < 8; i++)
                {
                     if(x + i < 12 && y + i < 8)
                    {
                        if(tokens[1][y+i][x+i] == '#')
                            moves[1][y+i][x+i] = true;
                        else
                        {
                            moves[1][y+i][x+i] = true;
                            break;
                        }
                    }       
                }
                break;
                
            case 'c':
            case 'C':
                if(x - 1 >= 0)
                    moves[z][y][x-1] = true;
                if(x + 1 < 12)
                    moves[z][y][x+1] = true;
                if(y - 1 >= 0)
                    moves[z][y-1][x] = true;
                if(y + 1 < 8)
                    moves[z][y+1][x] = true;
                if(x - 1 >= 0 && y - 1 >= 0)
                    moves[z][y-1][x-1] = true;
                if(x + 1 < 12 && y - 1 >= 0)
                    moves[z][y-1][x+1] = true;
                if(x - 1 >= 0 && y + 1 < 8)
                    moves[z][y+1][x-1] = true;
                if(x + 1 < 12 && y + 1 < 8)
                    moves[z][y+1][x+1] = true;
                if(z - 1 >= 0)
                    moves[z-1][y][x] = true;
                if(z + 1 < 3)
                    moves[z+1][y][x] = true;
                break;
                
            case 'm':
            case 'M':
                if(z == 1)
                {
                    for(int i = 1; i < 8; i++)
                    {
                        if(y - i >= 0)
                        {
                            if(tokens[1][y-i][x] == '#')
                                moves[1][y-i][x] = true;
                            else
                            {
                                moves[1][y-i][x] = true;
                                break;
                            }
                        }
                    }
                    for(int i = 1; i < 8; i++)
                    {
                        if(y + i < 8)
                        {
                            if(tokens[1][y+i][x] == '#')
                                moves[1][y+i][x] = true;
                            else
                            {
                                moves[1][y+i][x] = true;
                                break;
                            }
                        }
                    }
                    for(int i = 1; i < 12; i++)
                    {
                        if(x - i >= 0)
                        {
                            if(tokens[1][y][x-i] == '#')
                                moves[1][y][x-i] = true;
                            else
                            {
                                moves[1][y][x-i] = true;
                                break;
                            }
                        }
                    }
                    for(int i = 1; i < 12; i++)
                    {
                        if(x + i < 12)
                        {
                            if(tokens[1][y][x+i] == '#')
                                moves[1][y][x+i] = true;
                            else
                            {
                                moves[1][y][x+i] = true;
                                break;
                            }
                        }   
                    }
                    
                    for(int i = 1; i < 8; i++)
                    {
                        if(x - i >= 0 && y - i >= 0)
                        {
                            if(tokens[1][y-i][x-i] == '#')
                                moves[1][y-i][x-i] = true;
                            else
                            {
                                moves[1][y-i][x-i] = true;
                                break;
                            }
                        }       
                    }
                    for(int i = 1; i < 8; i++)
                    {
                        if(x - i >= 0 && y + i < 8)
                        {
                            if(tokens[1][y+i][x-i] == '#')
                                moves[1][y+i][x-i] = true;
                            else
                            {
                                moves[1][y+i][x-i] = true;
                                break;
                            }
                        }       
                    }
                    for(int i = 1; i < 8; i++)
                    {
                        if(x + i < 12 && y - i >= 0)
                        {
                            if(tokens[1][y-i][x+i] == '#')
                                moves[1][y-i][x+i] = true;
                            else
                            {
                                moves[1][y-i][x+i] = true;
                                break;
                            }
                        }       
                    }
                    for(int i = 1; i < 8; i++)
                    {
                         if(x + i < 12 && y + i < 8)
                        {
                            if(tokens[1][y+i][x+i] == '#')
                                moves[1][y+i][x+i] = true;
                            else
                            {
                                moves[1][y+i][x+i] = true;
                                break;
                            }
                        }       
                    }
                }
                else
                {
                    if(x - 1 >= 0 && tokens[z][y][x-1] == '#')
                        moves[z][y][x-1] = true;
                    if(x + 1 < 12 && tokens[z][y][x+1] == '#')
                        moves[z][y][x+1] = true;
                    if(y - 1 >= 0 && tokens[z][y-1][x] == '#')
                        moves[z][y-1][x] = true;
                    if(y + 1 < 8 && tokens[z][y+1][x] == '#')
                        moves[z][y+1][x] = true;
                }
                for(int i = 1; i < 3; i++)
                {
                    if(z - i >= 0)
                    {
                        if(tokens[z-i][y][x] == '#')
                            moves[z-i][y][x] = true;
                        else
                        {
                            moves[z-i][y][x] = true;
                            break;
                        }
                    }
                }
                for(int i = 1; i < 3; i++)
                {
                    if(z + i < 3)
                    {
                        if(tokens[z+i][y][x] == '#')
                            moves[z+i][y][x] = true;
                        else
                        {
                            moves[z+i][y][x] = true;
                            break;
                        }
                    }
                }
                break;
                
            case 'k':
            case 'K':
                if(z == 1)
                {
                    if(x - 1 >= 0)
                        moves[1][y][x-1] = true;
                    if(x + 1 < 12)
                        moves[1][y][x+1] = true;
                    if(y - 1 >= 0)
                        moves[1][y-1][x] = true;
                    if(y + 1 < 8)
                        moves[1][y+1][x] = true;
                    if(x - 1 >= 0 && y - 1 >= 0)
                        moves[1][y-1][x-1] = true;
                    if(x + 1 < 12 && y - 1 >= 0)
                        moves[1][y-1][x+1] = true;
                    if(x - 1 >= 0 && y + 1 < 8)
                        moves[1][y+1][x-1] = true;
                    if(x + 1 < 12 && y + 1 < 8)
                        moves[1][y+1][x+1] = true;
                    if(z - 1 >= 0)
                        moves[z-1][y][x] = true;
                    if(z + 1 < 3)
                        moves[z+1][y][x] = true;
                }
                else
                {
                    if(z - 1 >= 0 && tokens[z-1][y][x] == '#')
                        moves[z-1][y][x] = true;
                    if(z + 1 < 3 && tokens[z+1][y][x] == '#')
                        moves[z+1][y][x] = true;
                }
                break;
                
            case 'p':
            case 'P':
                if(z == 1)
                {
                    if(y - 2 >= 0)
                    {
                        if(x - 1 >= 0)
                            moves[1][y-2][x-1] = true;
                        if(x + 1 < 12)
                            moves[1][y-2][x+1] = true;
                    }
                    if(y + 2 < 8)
                    {
                        if(x - 1 >= 0)
                            moves[1][y+2][x-1] = true;
                        if(x + 1 < 12)
                            moves[1][y+2][x+1] = true;
                    }
                    if(x - 2 >= 0)
                    {
                        if(y - 1 >= 0)
                            moves[1][y-1][x-2] = true;
                        if(y + 1 < 8)
                            moves[1][y+1][x-2] = true;
                    }
                    if(x + 2 < 12)
                    {
                        if(y - 1 >= 0)
                            moves[1][y-1][x+2] = true;
                        if(y + 1 < 8)
                            moves[1][y+1][x+2] = true;
                    }
                }
                
                if(x - 1 >= 0)
                    moves[z][y][x-1] = true;
                if(x + 1 < 12)
                    moves[z][y][x+1] = true;
                if(y - 1 >= 0)
                    moves[z][y-1][x] = true;
                if(y + 1 < 8)
                    moves[z][y+1][x] = true;
                if(x - 1 >= 0 && y - 1 >= 0)
                    moves[z][y-1][x-1] = true;
                if(x + 1 < 12 && y - 1 >= 0)
                    moves[z][y-1][x+1] = true;
                if(x - 1 >= 0 && y + 1 < 8)
                    moves[z][y+1][x-1] = true;
                if(x + 1 < 12 && y + 1 < 8)
                    moves[z][y+1][x+1] = true;
                
                if(z - 1 >= 0)
                {
                    if(y - 1 >= 0)
                        if(tokens[z-1][y-1][x] == '#')
                            moves[z-1][y-1][x] = true;
                    if(y - 2 >= 0)
                        if(tokens[z-1][y-2][x] == '#')
                            moves[z-1][y-2][x] = true;
                    if(y + 1 < 8)
                        if(tokens[z-1][y+1][x] == '#')
                            moves[z-1][y+1][x] = true;
                    if(y + 2 < 8)
                        if(tokens[z-1][y+2][x] == '#')
                            moves[z-1][y+2][x] = true;
                    if(x - 1 >= 0)
                        if(tokens[z-1][y][x-1] == '#')
                            moves[z-1][y][x-1] = true;
                    if(x - 2 >= 0)
                        if(tokens[z-1][y][x-2] == '#')
                            moves[z-1][y][x-2] = true;
                    if(x + 1 < 12)
                        if(tokens[z-1][y][x+1] == '#')
                            moves[z-1][y][x+1] = true;
                    if(x + 2 < 12)
                        if(tokens[z-1][y][x+2] == '#')
                            moves[z-1][y][x+2] = true;
                }
                if(z + 1 < 3)
                {
                    if(y - 1 >= 0)
                        if(tokens[z+1][y-1][x] == '#')
                            moves[z+1][y-1][x] = true;
                    if(y - 2 >= 0)
                        if(tokens[z+1][y-2][x] == '#')
                            moves[z+1][y-2][x] = true;
                    if(y + 1 < 8)
                        if(tokens[z+1][y+1][x] == '#')
                            moves[z+1][y+1][x] = true;
                    if(y + 2 < 8)
                        if(tokens[z+1][y+2][x] == '#')
                            moves[z+1][y+2][x] = true;
                    if(x - 1 >= 0)
                        if(tokens[z+1][y][x-1] == '#')
                            moves[z+1][y][x-1] = true;
                    if(x - 2 >= 0)
                        if(tokens[z+1][y][x-2] == '#')
                            moves[z+1][y][x-2] = true;
                    if(x + 1 < 12)
                        if(tokens[z+1][y][x+1] == '#')
                            moves[z+1][y][x+1] = true;
                    if(x + 2 < 12)
                        if(tokens[z+1][y][x+2] == '#')
                            moves[z+1][y][x+2] = true;
                }
                
                if(z - 2 >= 0)
                {
                    if(y - 1 >= 0)
                        if(tokens[z-2][y-1][x] == '#')
                            moves[z-2][y-1][x] = true;
                    if(y + 1 < 8)
                        if(tokens[z-2][y+1][x] == '#')
                            moves[z-2][y+1][x] = true;
                    if(x - 1 >= 0)
                        if(tokens[z-2][y][x-1] == '#')
                            moves[z-2][y][x-1] = true;
                    if(x + 1 < 12)
                        if(tokens[z-2][y][x+1] == '#')
                            moves[z-2][y][x+1] = true;
                }
                if(z + 2 < 3)
                {
                    if(y - 1 >= 0)
                        if(tokens[z+2][y-1][x] == '#')
                            moves[z+2][y-1][x] = true;
                    if(y + 1 < 8)
                        if(tokens[z+2][y+1][x] == '#')
                            moves[z+2][y+1][x] = true;
                    if(x - 1 >= 0)
                        if(tokens[z+2][y][x-1] == '#')
                            moves[z+2][y][x-1] = true;
                    if(x + 1 < 12)
                        if(tokens[z+2][y][x+1] == '#')
                            moves[z+2][y][x+1] = true;
                }
                break;
                
            case 'd':
                if(y - 1 >= 0 && tokens[0][y-1][x] == '#')
                    moves[z][y-1][x] = true;
                if(x - 1 >= 0 && tokens[0][y][x-1] == '#')
                    moves[z][y][x-1] = true;
                if(x + 1 < 12 && tokens[0][y][x+1] == '#')
                    moves[z][y][x+1] = true;
                if(y - 1 >= 0 && x - 1 >= 0 && tokens[0][y-1][x-1] != '#')
                    moves[z][y-1][x-1] = true;
                if(y - 1 >= 0 && x + 1 < 12 && tokens[0][y-1][x+1] != '#')
                    moves[z][y-1][x+1] = true;
                if(z == 0)
                {
                    if(tokens[1][y][x] != '#')
                        moves[1][y][x] = true;
                }
                else
                {
                    if(tokens[0][y][x] == '#')
                        moves[0][y][x] = true;
                }
                break;
                
            case 'D':
                if(y + 1 < 8 && tokens[0][y+1][x] == '#')
                    moves[z][y+1][x] = true;
                if(x - 1 >= 0 && tokens[0][y][x-1] == '#')
                    moves[z][y][x-1] = true;
                if(x + 1 < 12 && tokens[0][y][x+1] == '#')
                    moves[z][y][x+1] = true;
                if(y + 1 < 8 && x - 1 >= 0 && tokens[0][y+1][x-1] != '#')
                    moves[z][y-1][x-1] = true;
                if(y + 1 < 8 && x + 1 < 12 && tokens[0][y+1][x+1] != '#')
                    moves[z][y+1][x+1] = true;
                if(z == 0)
                {
                    if(tokens[1][y][x] != '#')
                        moves[1][y][x] = true;
                }
                else
                {
                    if(tokens[0][y][x] == '#')
                        moves[0][y][x] = true;
                }
                break;
                
            case 'b':
                if(y - 1 >= 0)
                {
                    moves[0][y-1][x] = true;
                    if(x - 1 >= 0)
                        moves[0][y-1][x-1] = true;
                    if(x + 1 < 12)
                        moves[0][y-1][x+1] = true;
                }
                if(y + 1 < 8)
                    if(tokens[0][y+1][x] == '#')
                        moves[0][y+1][x] = true;
                break;
                
            case 'B':
                if(y + 1 < 8)
                {
                    moves[0][y+1][x] = true;
                    if(x - 1 >= 0)
                        moves[0][y+1][x-1] = true;
                    if(x + 1 < 12)
                        moves[0][y+1][x+1] = true;
                }
                if(y - 1 >= 0)
                    if(tokens[0][y-1][x] == '#')
                        moves[0][y-1][x] = true;
                break;
                
            case 'e':
            case 'E':
                if(z == 0)
                {
                    if(y - 1 >= 0)
                    {
                        moves[z][y-1][x] = true;
                        if(tokens[1][y-1][x] != '#')
                            moves[1][y-1][x] = true;
                    }
                    if(y - 2 >= 0)
                        moves[z][y-2][x] = true;
                    if(y + 1 < 8)
                    {
                        moves[z][y+1][x] = true;
                        if(tokens[1][y+1][x] != '#')
                            moves[1][y+1][x] = true;
                    }
                    if(y + 2 < 8)
                        moves[z][y+2][x] = true;
                    if(x - 1 >= 0)
                    {
                        moves[z][y][x-1] = true;
                        if(tokens[1][y][x-1] != '#')
                            moves[1][y][x-1] = true;
                    }
                    if(x - 2 >= 0)
                        moves[z][y][x-2] = true;
                    if(x + 1 < 12)
                    {
                        moves[z][y][x+1] = true;
                        if(tokens[1][y][x+1] != '#')
                            moves[1][y][x+1] = true;
                    }
                    if(x + 2 < 12)
                        moves[z][y][x+2] = true;
                    
                    if(x - 1 >= 0 && y - 1 >= 0)
                        if(tokens[z][y-1][x-1] == '#')
                            moves[z][y-1][x-1] = true;
                    if(x - 1 >= 0 && y + 1 < 8)
                        if(tokens[z][y+1][x-1] == '#')
                            moves[z][y+1][x-1] = true;
                    if(x + 1 < 12 && y - 1 >= 0)
                        if(tokens[z][y-1][x+1] == '#')
                            moves[z][y-1][x+1] = true;
                    if(x + 1 < 12 && y + 1 < 8)
                        if(tokens[z][y+1][x+1] == '#')
                            moves[z][y+1][x+1] = true;
                }
                else
                {
                    if(y - 1 >= 0)
                        moves[0][y-1][x] = true;
                    
                    if(y + 1 < 8)
                        moves[0][y+1][x] = true;
                    
                    if(x - 1 >= 0)
                        moves[0][y][x-1] = true;
                    
                    if(x + 1 < 12)
                        moves[0][y][x+1] = true;
                }
                break;
                
            default:
                
        }
        
        for(int ij = 0; ij < 3; ij++)
        {
            for(int j = 0; j < 8; j++)
            {
                for(int i = 0; i < 12; i++)
                {
                    if(java.lang.Character.isLetter(tokens[ij][j][i]))
                        if(!(java.lang.Character.isUpperCase(token) ^ java.lang.Character.isUpperCase(tokens[ij][j][i])))
                            moves[ij][j][i] = false;
                    if(moves[ij][j][i])
                        chessboard[ij][j][i].setIcon(IconUtils.overlayImages(IconUtils.iconToBufferedImage(
                            chessboard[ij][j][i].getIcon()), pathToTextures + "/Move.png"));
                }
            }
        }
    }
    
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main("Dragonchess").setVisible(true);
            }
        });
    }
    
    public Server server;
    public Client client;
    private boolean isServer = false, serverTurn = false, selectionOn = false;
    private int selectedX, selectedY, selectedZ;
    private int currentZ = 2;
    private JLabel[][][] chessboard = new JLabel[3][8][12];
    private String pathToTextures = "/textures";
    private char[][][] tokens;
    private boolean[][][] moves;
    private DataPackage data;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConnect;
    private javax.swing.JButton bContinue;
    private javax.swing.JButton bDisconnect;
    private javax.swing.JButton bHostGame;
    private javax.swing.JButton bRules;
    private javax.swing.JFrame fGameOver;
    private javax.swing.JLabel lColor;
    private javax.swing.JLabel lConnected;
    private javax.swing.JLabel lGame;
    private javax.swing.JLabel lHelp;
    private javax.swing.JLabel lJoinGame;
    private javax.swing.JLabel lMainTitle;
    private javax.swing.JLabel lSideColor;
    private javax.swing.JPanel pLower;
    private javax.swing.JPanel pLowerTab;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pMiddle;
    private javax.swing.JPanel pMiddleTab;
    private javax.swing.JPanel pUpper;
    private javax.swing.JPanel pUpperTab;
    private javax.swing.JTextField tIpAddress;
    private javax.swing.JTabbedPane tpMain;
    // End of variables declaration//GEN-END:variables
}
