import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class SudokuUI extends javax.swing.JFrame {

    private JButton[][] buttons;
    private ActionListener[][] actionListener;
    private JPanel[][] blocks;
    private Sudoku sudoku;
    private int gameMode;
    private int grid;
    private boolean paused;
    private final StopWatch stopWatch;

    /** Creates new form UI */
    public SudokuUI() {
        sudoku = new Sudoku();
        grid = Sudoku.GRID_9X9;
        stopWatch = new StopWatch();
        paused = false;
        initComponents();
        initialize();
        startTimer();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new JPanel();
        options = new JPanel();
        newGameBut = new JButton();
        resetGameBut = new JButton();
        pause = new JButton();
        timeLabel = new JLabel();
        resume = new JButton();
        submit = new JButton();
        holder = new JPanel();
        board = new JPanel();
        menue = new JMenuBar();
        game = new JMenu();
        newGame = new JMenuItem();
        resetGame = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        exit = new JMenuItem();
        jMenu2 = new JMenu();
        beginner = new JRadioButtonMenuItem();
        intermediator = new JRadioButtonMenuItem();
        expart = new JRadioButtonMenuItem();
        help = new JMenu();
        about = new JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(500, 500));

        base.setBackground(new java.awt.Color(204, 204, 204));
        base.setAlignmentX(0.0F);
        base.setAlignmentY(0.0F);

        options.setBackground(new java.awt.Color(255, 255, 255));

        newGameBut.setBackground(new java.awt.Color(255, 255, 255));
        newGameBut.setFont(new java.awt.Font("Tahoma", 0, 12));
        newGameBut.setText("New Game");
        newGameBut.setMargin(new java.awt.Insets(0, 0, 0, 0));
        newGameBut.setMaximumSize(new java.awt.Dimension(63, 19));
        newGameBut.setMinimumSize(new java.awt.Dimension(63, 19));
        newGameBut.setPreferredSize(new java.awt.Dimension(63, 19));
        newGameBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButActionPerformed(evt);
            }
        });

        resetGameBut.setBackground(new java.awt.Color(255, 255, 255));
        resetGameBut.setFont(new java.awt.Font("Tahoma", 0, 12));
        resetGameBut.setText("Reset Game");
        resetGameBut.setMargin(new java.awt.Insets(0, 0, 0, 0));
        resetGameBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGameButActionPerformed(evt);
            }
        });

        pause.setBackground(new java.awt.Color(255, 255, 255));
        pause.setFont(new java.awt.Font("Tahoma", 0, 12));
        pause.setText("Pause");
        pause.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 24));
        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("00:00:000");
        timeLabel.setIconTextGap(0);

        resume.setBackground(new java.awt.Color(255, 255, 255));
        resume.setFont(new java.awt.Font("Tahoma", 0, 12));
        resume.setText("Resume");
        resume.setMargin(new java.awt.Insets(0, 0, 0, 0));
        resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Tahoma", 0, 12));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addComponent(newGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resume, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeLabel)
                .addContainerGap())
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(newGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(resetGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(pause, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(resume, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE)
        );

        holder.setBackground(new java.awt.Color(255, 255, 255));
        holder.setAlignmentX(0.0F);
        holder.setAlignmentY(0.0F);
        holder.setLayout(new java.awt.GridLayout(1, 1));

        board.setBackground(new java.awt.Color(255, 255, 255));
        board.setAlignmentX(0.0F);
        board.setAlignmentY(0.0F);
        board.setMinimumSize(new java.awt.Dimension(100, 100));
        board.setPreferredSize(new java.awt.Dimension(100, 100));
        board.setLayout(new java.awt.GridLayout(9, 9));
        holder.add(board);

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(holder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                    .addComponent(options, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(holder, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );

        game.setText("Game");

        newGame.setText("New Game 9 X 9");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        resetGame.setText("Reset Game");
        resetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGameActionPerformed(evt);
            }
        });
        game.add(resetGame);
        game.add(newGame);
        game.add(jSeparator1);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        game.add(exit);

        menue.add(game);

        jMenu2.setText("Level");

        beginner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        beginner.setText("Easy");
        beginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginnerActionPerformed(evt);
            }
        });
        jMenu2.add(beginner);

        intermediator.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        intermediator.setSelected(true);
        intermediator.setText("Medium");
        intermediator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intermediatorActionPerformed(evt);
            }
        });
        jMenu2.add(intermediator);

        expart.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        expart.setText("Hard");
        expart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expartActionPerformed(evt);
            }
        });
        jMenu2.add(expart);

        menue.add(jMenu2);

        help.setText("Help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        menue.add(help);

        setJMenuBar(menue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        grid = Sudoku.GRID_9X9;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_newGameActionPerformed

    private void resetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGameActionPerformed
        int[][] puzzle = sudoku.resetPuzzle();
        createBoard(puzzle);
    }//GEN-LAST:event_resetGameActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void beginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginnerActionPerformed
        gameMode = Sudoku.GAME_MODE_EASY;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_beginnerActionPerformed

    private void intermediatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intermediatorActionPerformed
        gameMode = Sudoku.GAME_MODE_MEDIUM;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_intermediatorActionPerformed

    private void expartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expartActionPerformed
        gameMode = Sudoku.GAME_MODE_HARD;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_expartActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        stopWatch.pause();
        paused = true;
        showMessage("Paused");
    }//GEN-LAST:event_pauseActionPerformed

    private void resumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeActionPerformed
        stopWatch.resume();
        paused = false;
        holder.removeAll();
        holder.add(board);
        holder.repaint();
        this.setVisible(true);
    }//GEN-LAST:event_resumeActionPerformed

    private void resetGameButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGameButActionPerformed
        int[][] puzzle = sudoku.resetPuzzle();
        createBoard(puzzle);
    }//GEN-LAST:event_resetGameButActionPerformed

    private void newGameButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButActionPerformed
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_newGameButActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (!isAnsComplete()) {
            JOptionPane.showMessageDialog(this, "Please complete your answer.");
        } else {
            stopWatch.stop();
            boolean isAnsCorrect = sudoku.check(getAns());
            String messageStr = "";
            if (isAnsCorrect) {
                messageStr = "Congratulation You have won the Game in " + timeLabel.getText();
            } else {
                messageStr = "Sorry You have failed. ";
            }
            showMessage(messageStr);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        JOptionPane.showMessageDialog(this, "Versi : 1.0.0\nDibuat Oleh :\n- Nadine A. Heartman [140810190004]\n- M. Faiq Al-Murtadha A.R.A [140810190012]\n- Elshandi Septiawan [140810190050]\nKelas B\nTeknik Informatika\nUniversitas Padjadjaran");
    }//GEN-LAST:event_aboutActionPerformed

    private void createBoard(int[][] puzzle) {
        board.removeAll();
        grid = puzzle.length;
        blocks = new JPanel[grid][grid];
        buttons = new JButton[grid][grid];
        actionListener = new ActionListener[grid][grid];
        board.setLayout(new GridLayout(grid, grid, 3, 3));

        int rowsInGrid = grid == 9 ? 3 : 2;

        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                blocks[i][j] = new JPanel();
                buttons[i][j] = new JButton();
                String text = "";
                if (0 < puzzle[i][j] && puzzle[i][j] <= grid) {
                    text += puzzle[i][j];
                } else {
                    final JButton tempbutton = buttons[i][j];
                    final JPanel tempBlock = blocks[i][j];
                    actionListener[i][j] = new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            viewInputs(tempBlock, tempbutton, grid);
                        }
                    };
                    buttons[i][j].addActionListener(actionListener[i][j]);
                }
                buttons[i][j].setText(text);
                buttons[i][j].setFont(new java.awt.Font("Tahoma", 0, 24));

                if (((0 <= i && i < rowsInGrid) || (rowsInGrid * 2 <= i && i < grid)) && (3 <= j && j < 6)) {
                    buttons[i][j].setBackground(new java.awt.Color(204, 204, 204));
                } else if ((rowsInGrid <= i && i < rowsInGrid * 2) && ((0 <= j && j < 3) || (6 <= j && j < 9))) {
                    buttons[i][j].setBackground(new java.awt.Color(204, 204, 204));
                } else {
                    buttons[i][j].setBackground(new java.awt.Color(255, 255, 255));
                }
                blocks[i][j].setLayout(new GridLayout(1, 1));
                blocks[i][j].add(buttons[i][j]);
                board.add(blocks[i][j]);
            }
        }

        holder.removeAll();
        holder.add(board);
        board.repaint();
        holder.repaint();
        this.setVisible(true);
        stopWatch.start();
    }

    private void initialize() {
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }

    private void viewInputs(JPanel block, JButton inputButtton, int numOfInput) {
        JPanel inputs = new Inputs(this, block, inputButtton, numOfInput);
        block.remove(inputButtton);
        block.add(inputs);
        this.setVisible(true);
    }

    public void setInput(String ans, JPanel block, JButton inputButtton) {
        block.removeAll();
        inputButtton.setText(ans);
        inputButtton.setFont(new java.awt.Font("Tahoma", 1, 24));
        block.add(inputButtton);
        this.repaint();
    }

    private int[][] getAns() {
        int ans[][] = new int[grid][grid];

        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                try {
                    ans[i][j] = Integer.parseInt(buttons[i][j].getText());
                } catch (NumberFormatException e) {
                    ans[i][j] = 0;
                }
            }
        }

        return ans;
    }

    private boolean isAnsComplete() {
        boolean isAnsComplete = true;
        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                try {
                    Integer.parseInt(buttons[i][j].getText());
                } catch (NumberFormatException e) {
                    isAnsComplete = false;
                    break;
                }
            }
        }
        return isAnsComplete;
    }

    private void showMessage(String message) {
        JLabel messageLabel = new JLabel();
        messageLabel.setFont(new java.awt.Font("Tahoma", 1, 20));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText(message);
        holder.removeAll();
        holder.add(messageLabel);
        holder.repaint();
        this.setVisible(true);
    }

    private void startTimer() {
        Thread thread = new Thread(new Runnable() {

            public void run() {
                stopWatch.start();
                while (true) {
                    if (!paused) {
                        final String timeString = new SimpleDateFormat("mm:ss:SSS").format(stopWatch.getElapsedTime());
                        timeLabel.setText("" + timeString);
                    }
                }
            }
        });
        thread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenuItem about;
    private JPanel base;
    private JRadioButtonMenuItem beginner;
    private JPanel board;
    private JMenuItem exit;
    private JRadioButtonMenuItem expart;
    private JMenu game;
    private JMenu help;
    private JPanel holder;
    private JRadioButtonMenuItem intermediator;
    private JMenu jMenu2;
    private JPopupMenu.Separator jSeparator1;
    private JMenuBar menue;
    private JMenuItem newGame;
    private JButton newGameBut;
    private JPanel options;
    private JButton pause;
    private JMenuItem resetGame;
    private JButton resetGameBut;
    private JButton resume;
    private JButton submit;
    private JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
