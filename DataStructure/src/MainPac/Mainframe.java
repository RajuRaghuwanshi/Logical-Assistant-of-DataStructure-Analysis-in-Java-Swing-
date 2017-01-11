package MainPac;

import ActionPerformClasses.*;
import ImgPanel.MainImg;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import org.omg.SendingContext.RunTime;

public class Mainframe extends javax.swing.JFrame {

    String username, filename, compilerpath, compilername, programdata;
    String[][] questionData;
    UserNotesClass usernotesclass;
    UserTestClass usertestclass;
    PreDefineClass predefineclass;
    AdminProcessClass adminprocessclass;
    boolean filechange = true, savetoken = false;
    String[] basicTestData;
    JTree treedata1, treedata2, treedata3;
    JComboBox jcb;
    int questionIndexNo = 0, qnolb = 1, size;
    String maindatapath = "C:\\ProgramData\\DataStructure\\resource";
    DefaultMutableTreeNode root;

    public Mainframe() {
        initComponents();
    }

    public Mainframe(String name, int size, String compilerpath, String compilername) {
        initComponents();

        this.size = size;
        this.compilerpath = compilerpath;
        this.compilername = compilername;
        compiler.setText(compilername);
        notestextarea.setFont(new java.awt.Font("Times New Roman", 0, size));
        username = name;
        usernamelb.setText(name);
        // jTabbedPane4.setTitleAt(1, name + "'s Notes");
        try {
            forProf1.setImg("C:\\ProgramData\\DataStructure\\User\\prof.jpg", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Error", 0);
        }
        setup.setImg(maindatapath + "\\setup.jpg");
        notes.setImg(maindatapath + "\\main.jpg");
        test.setImg(maindatapath + "\\main.jpg");
        testseries.setImg(maindatapath + "\\main.jpg");
        imageforadmin1.setImg(maindatapath + "\\main.jpg");
        mainImg1.setImg(maindatapath + "\\main.jpg");
        usernotesclass = new UserNotesClass();
        usernotesclass.createDir();
        usertestclass = new UserTestClass();
        predefineclass = new PreDefineClass();

        jTabbedPane4.removeAll();
        jTabbedPane4.add("Setup", setup);
        jTabbedPane4.setIconAt(0, predefineclass.getIcon(maindatapath + "\\home.png"));
        changephoto.setVisible(false);
        testnamecombo.setEnabled(false);
        userCreatedTest1.setVisible(false);
        userCreatedTest1.setRef(this);
        questionData = new String[10][6];
        notestextarea.setEnabled(false);
        String[] s = new String[18];
        int i = 12;
        for (int j = 0; j < 18; j++) {
            s[j] = "" + i++;
        }
        jcb = new JComboBox(s);
        fontpopup.add(jcb);
        jcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontpopup.setVisible(false);
                changeFontActionPerformed(evt);
            }
        });
        jcb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fontpopup.setVisible(false);
            }
        });
        Image im = null;
        try {
            FileInputStream fi = new FileInputStream(maindatapath + "\\jar.jpg");
            im = ImageIO.read(fi);
            this.setIconImage(im);
        } catch (Exception ex) {
        }

        learnds.setIcon(predefineclass.getIcon(maindatapath + "\\learn.jpg"));
        createnotes.setIcon(predefineclass.getIcon(maindatapath + "\\createnotes.jpg"));
        createtest.setIcon(predefineclass.getIcon(maindatapath + "\\test.jpg"));
        taketest.setIcon(predefineclass.getIcon(maindatapath + "\\test.jpg"));
        help.setIcon(predefineclass.getIcon(maindatapath + "\\help.jpg"));
        exit.setIcon(predefineclass.getIcon(maindatapath + "\\exit.png"));
        deletepopup.setIcon(predefineclass.getIcon(maindatapath + "\\delete.png"));
        newpopup.setIcon(predefineclass.getIcon(maindatapath + "\\new.png"));
        openpopup.setIcon(predefineclass.getIcon(maindatapath + "\\open.png"));
        savepopup.setIcon(predefineclass.getIcon(maindatapath + "\\save.png"));
        saveaspopup.setIcon(predefineclass.getIcon(maindatapath + "\\saveas.png"));
    }

    public Mainframe getRef() {
        return this;
    }

    public MainImg getRefBasicTestPanel() {
        return basictestpanel;
    }

    public MainImg getRefChoiceTestPanel() {
        return choicetestpanel;
    }

    public UserCreatedTest getRefQuestionTestPanel() {
        return userCreatedTest1;
    }

    public UserTestClass getRefUserTestClass() {
        return usertestclass;
    }

    public void setBasicTestPanelVisible() {
        choicetestpanel.setVisible(true);
        basictestpanel.setVisible(true);
        createnewtest.setSelected(true);
        createnewtestActionPerformed(evt1);
        jTabbedPane4.setSelectedIndex(1);
        jTabbedPane4.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        listpopup = new javax.swing.JPopupMenu();
        newpopup = new javax.swing.JMenuItem();
        openpopup = new javax.swing.JMenuItem();
        updatepopup = new javax.swing.JMenuItem();
        savepopup = new javax.swing.JMenuItem();
        saveaspopup = new javax.swing.JMenuItem();
        deletepopup = new javax.swing.JMenuItem();
        fontpopup = new javax.swing.JPopupMenu();
        compilerpopup = new javax.swing.JPopupMenu();
        Open = new javax.swing.JMenuItem();
        remove = new javax.swing.JMenuItem();
        jSplitPane1 = new javax.swing.JSplitPane();
        imageforadmin1 = new ImgPanel.MainImg();
        jLabel3 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        mainImg1 = new ImgPanel.MainImg();
        forProf1 = new ImgPanel.ForProf();
        changephoto = new javax.swing.JLabel();
        usernamelb = new javax.swing.JLabel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        setup = new ImgPanel.MainImg();
        createnotes = new javax.swing.JButton();
        createtest = new javax.swing.JButton();
        learnds = new javax.swing.JButton();
        taketest = new javax.swing.JButton();
        help = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        createnotes_test = new javax.swing.JTabbedPane();
        notes = new ImgPanel.MainImg();
        listofnotes = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        noteslist = new javax.swing.JList();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        notestextarea = new javax.swing.JTextArea();
        jToolBar2 = new javax.swing.JToolBar();
        file = new javax.swing.JButton();
        view = new javax.swing.JButton();
        notescombo = new javax.swing.JComboBox();
        turbo3 = new javax.swing.JButton();
        compiler = new javax.swing.JButton();
        test = new ImgPanel.MainImg();
        basictestpanel = new ImgPanel.MainImg();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        testname = new javax.swing.JTextField();
        maximammarks = new javax.swing.JTextField();
        noofquestioncombo = new javax.swing.JComboBox();
        timeformate = new javax.swing.JFormattedTextField();
        start = new javax.swing.JButton();
        choicetestpanel = new ImgPanel.MainImg();
        testnamecombo = new javax.swing.JComboBox();
        updatetest = new javax.swing.JRadioButton();
        createnewtest = new javax.swing.JRadioButton();
        userCreatedTest1 = new MainPac.UserCreatedTest();
        predefine = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        treetheory = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        algorithmtree = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        programtree = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        predefinetextarea = new javax.swing.JTextArea();
        runindev = new javax.swing.JButton();
        testseries = new ImgPanel.MainImg();
        testimg1 = new ImgPanel.testimg();
        jScrollPane4 = new javax.swing.JScrollPane();
        testlist = new javax.swing.JList();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        testcategory = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        newpopup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newpopup.setText("   New");
        newpopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpopupActionPerformed(evt);
            }
        });
        listpopup.add(newpopup);

        openpopup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openpopup.setText("   Open");
        openpopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openpopupActionPerformed(evt);
            }
        });
        listpopup.add(openpopup);

        updatepopup.setText("Update");
        updatepopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepopupActionPerformed(evt);
            }
        });
        listpopup.add(updatepopup);

        savepopup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        savepopup.setText("   Save");
        savepopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savepopupActionPerformed(evt);
            }
        });
        listpopup.add(savepopup);

        saveaspopup.setText("   Save As...");
        saveaspopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveaspopupActionPerformed(evt);
            }
        });
        listpopup.add(saveaspopup);

        deletepopup.setText("   Delete");
        deletepopup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletepopupActionPerformed(evt);
            }
        });
        listpopup.add(deletepopup);

        Open.setText("    Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        compilerpopup.add(Open);

        remove.setText("   Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        compilerpopup.add(remove);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logical Assistance of Data Structures !");
        setBounds(new java.awt.Rectangle(5, 5, 0, 0));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setResizable(false);

        jSplitPane1.setDividerLocation(90);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1350, 710));

        imageforadmin1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome in Logical Assistance of Data Structures & Analysis");

        javax.swing.GroupLayout imageforadmin1Layout = new javax.swing.GroupLayout(imageforadmin1);
        imageforadmin1.setLayout(imageforadmin1Layout);
        imageforadmin1Layout.setHorizontalGroup(
            imageforadmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageforadmin1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        imageforadmin1Layout.setVerticalGroup(
            imageforadmin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imageforadmin1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(20, 20, 20))
        );

        jSplitPane1.setTopComponent(imageforadmin1);

        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setDividerSize(10);
        jSplitPane2.setAutoscrolls(true);
        jSplitPane2.setEnabled(false);
        jSplitPane2.setName(""); // NOI18N
        jSplitPane2.setPreferredSize(new java.awt.Dimension(1270, 743));

        mainImg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        forProf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        forProf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forProf1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forProf1MouseExited(evt);
            }
        });

        changephoto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        changephoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changephoto.setText("Change Photo");
        changephoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        changephoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changephotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changephotoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout forProf1Layout = new javax.swing.GroupLayout(forProf1);
        forProf1.setLayout(forProf1Layout);
        forProf1Layout.setHorizontalGroup(
            forProf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forProf1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(changephoto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        forProf1Layout.setVerticalGroup(
            forProf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forProf1Layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(changephoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        usernamelb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernamelb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamelb.setText("User Name");
        usernamelb.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));

        javax.swing.GroupLayout mainImg1Layout = new javax.swing.GroupLayout(mainImg1);
        mainImg1.setLayout(mainImg1Layout);
        mainImg1Layout.setHorizontalGroup(
            mainImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImg1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forProf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernamelb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainImg1Layout.setVerticalGroup(
            mainImg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImg1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(forProf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernamelb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(mainImg1);

        jTabbedPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPane4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        setup.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        createnotes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        createnotes.setText("Create Notes");
        createnotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createnotesActionPerformed(evt);
            }
        });

        createtest.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        createtest.setText("Create Test");
        createtest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createtestActionPerformed(evt);
            }
        });

        learnds.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        learnds.setText("Data Structure");
        learnds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learndsActionPerformed(evt);
            }
        });

        taketest.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        taketest.setText("Take Test");
        taketest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taketestActionPerformed(evt);
            }
        });

        help.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setupLayout = new javax.swing.GroupLayout(setup);
        setup.setLayout(setupLayout);
        setupLayout.setHorizontalGroup(
            setupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setupLayout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addGroup(setupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(taketest, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(createtest, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(createnotes, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(learnds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(398, 398, 398))
        );
        setupLayout.setVerticalGroup(
            setupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setupLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(learnds)
                .addGap(42, 42, 42)
                .addComponent(createnotes)
                .addGap(46, 46, 46)
                .addComponent(createtest)
                .addGap(56, 56, 56)
                .addComponent(taketest)
                .addGap(46, 46, 46)
                .addComponent(help)
                .addGap(47, 47, 47)
                .addComponent(exit)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Setup", setup);

        createnotes_test.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        createnotes_test.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        createnotes_test.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        notes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        listofnotes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        listofnotes.setText("List Of Theory :-");

        noteslist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        noteslist.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        noteslist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noteslistMouseClicked(evt);
            }
        });
        jScrollPane16.setViewportView(noteslist);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Start Writing :-");

        notestextarea.setColumns(20);
        notestextarea.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        notestextarea.setRows(5);
        notestextarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        notestextarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notestextareaMouseClicked(evt);
            }
        });
        notestextarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                notestextareaKeyPressed(evt);
            }
        });
        jScrollPane17.setViewportView(notestextarea);

        jToolBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar2.setRollover(true);

        file.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        file.setText("  File  ");
        file.setFocusable(false);
        file.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        file.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });
        jToolBar2.add(file);

        view.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        view.setText("Change font size");
        view.setFocusable(false);
        view.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        view.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jToolBar2.add(view);

        notescombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        notescombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Theory", "Algorithm", "Program" }));
        notescombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notescomboActionPerformed(evt);
            }
        });
        jToolBar2.add(notescombo);

        turbo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        turbo3.setText("  Develop In Turbo 3  ");
        turbo3.setFocusable(false);
        turbo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        turbo3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        turbo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turbo3ActionPerformed(evt);
            }
        });
        jToolBar2.add(turbo3);

        compiler.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        compiler.setText("Add Compiler");
        compiler.setFocusable(false);
        compiler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compiler.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compilerActionPerformed(evt);
            }
        });
        jToolBar2.add(compiler);

        javax.swing.GroupLayout notesLayout = new javax.swing.GroupLayout(notes);
        notes.setLayout(notesLayout);
        notesLayout.setHorizontalGroup(
            notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(notesLayout.createSequentialGroup()
                        .addGroup(notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listofnotes))
                        .addGap(37, 37, 37)
                        .addGroup(notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        notesLayout.setVerticalGroup(
            notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listofnotes)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(notesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addComponent(jScrollPane17))
                .addGap(35, 35, 35))
        );

        createnotes_test.addTab("Notes", notes);

        test.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        basictestpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Test Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("No Of Question");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Maximam Marks");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Total Time");

        testname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        testname.setText("DataStructure1");

        maximammarks.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        maximammarks.setText("20");

        noofquestioncombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        noofquestioncombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        timeformate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("mm:ss"))));
        timeformate.setText("15:00");
        timeformate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        start.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basictestpanelLayout = new javax.swing.GroupLayout(basictestpanel);
        basictestpanel.setLayout(basictestpanelLayout);
        basictestpanelLayout.setHorizontalGroup(
            basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basictestpanelLayout.createSequentialGroup()
                .addGap(33, 88, Short.MAX_VALUE)
                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basictestpanelLayout.createSequentialGroup()
                        .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(basictestpanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timeformate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basictestpanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(50, 50, 50)
                                .addComponent(maximammarks, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(basictestpanelLayout.createSequentialGroup()
                                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noofquestioncombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(testname, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basictestpanelLayout.createSequentialGroup()
                        .addComponent(start)
                        .addGap(73, 73, 73))))
        );
        basictestpanelLayout.setVerticalGroup(
            basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basictestpanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(testname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(noofquestioncombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(maximammarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(basictestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeformate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addComponent(start)
                .addGap(21, 21, 21))
        );

        choicetestpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        testnamecombo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        testnamecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testnamecomboActionPerformed(evt);
            }
        });

        buttonGroup2.add(updatetest);
        updatetest.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updatetest.setText("Update Test");
        updatetest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetestActionPerformed(evt);
            }
        });

        buttonGroup2.add(createnewtest);
        createnewtest.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        createnewtest.setSelected(true);
        createnewtest.setText("Create New Test");
        createnewtest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createnewtestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout choicetestpanelLayout = new javax.swing.GroupLayout(choicetestpanel);
        choicetestpanel.setLayout(choicetestpanelLayout);
        choicetestpanelLayout.setHorizontalGroup(
            choicetestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choicetestpanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(createnewtest)
                .addGap(34, 34, 34)
                .addComponent(updatetest)
                .addGap(35, 35, 35)
                .addComponent(testnamecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        choicetestpanelLayout.setVerticalGroup(
            choicetestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choicetestpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(choicetestpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createnewtest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatetest)
                    .addComponent(testnamecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        userCreatedTest1.setPreferredSize(new java.awt.Dimension(750, 450));

        javax.swing.GroupLayout testLayout = new javax.swing.GroupLayout(test);
        test.setLayout(testLayout);
        testLayout.setHorizontalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(choicetestpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basictestpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
                    .addContainerGap(177, Short.MAX_VALUE)
                    .addComponent(userCreatedTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(142, Short.MAX_VALUE)))
        );
        testLayout.setVerticalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(choicetestpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(basictestpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(userCreatedTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        createnotes_test.addTab("Test", test);

        jTabbedPane4.addTab("Create Notes & Test", createnotes_test);

        predefine.setDividerLocation(300);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        treetheory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        treetheory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Data Structure");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("What is Data Structure ?");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Type Data Structure");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Linear Data Structuer");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Array");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Stack");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Queue");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Link List");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Non Linear Data Structure");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Tree");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Graph");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treetheory.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treetheory.setAlignmentX(1.0F);
        treetheory.setAlignmentY(1.0F);
        treetheory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                treetheoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(treetheory);

        jTabbedPane1.addTab("Theory", jScrollPane1);

        algorithmtree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        algorithmtree.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        algorithmtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                algorithmtreeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(algorithmtree);

        jTabbedPane1.addTab("Algorithm & Analysis", jScrollPane2);

        programtree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        programtree.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        programtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programtreeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                programtreeMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(programtree);

        jTabbedPane1.addTab("Program", jScrollPane3);

        predefine.setLeftComponent(jTabbedPane1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        predefinetextarea.setEditable(false);
        predefinetextarea.setColumns(20);
        predefinetextarea.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        predefinetextarea.setRows(5);
        predefinetextarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane6.setViewportView(predefinetextarea);

        runindev.setText("Open in Dev");
        runindev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runindevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(runindev)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(runindev)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        predefine.setRightComponent(jPanel1);

        jTabbedPane4.addTab("Pre Define", predefine);

        testseries.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        testimg1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        testlist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        testlist.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        testlist.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Array_1", "Array_2", "Array_3", "Queue", "Stack", "Tree" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        testlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testlistMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(testlist);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("Chose a Test Name :-");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Next >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        testcategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        testcategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PreDefine", "My Test" }));
        testcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testcategoryActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Chose Test Category :-");

        javax.swing.GroupLayout testimg1Layout = new javax.swing.GroupLayout(testimg1);
        testimg1.setLayout(testimg1Layout);
        testimg1Layout.setHorizontalGroup(
            testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testimg1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(testimg1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(42, 42, 42)
                        .addComponent(testcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136)
                .addComponent(jButton1)
                .addGap(63, 63, 63))
        );
        testimg1Layout.setVerticalGroup(
            testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testimg1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGroup(testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(testimg1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testimg1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, testimg1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))
                    .addGroup(testimg1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(testcategory, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout testseriesLayout = new javax.swing.GroupLayout(testseries);
        testseries.setLayout(testseriesLayout);
        testseriesLayout.setHorizontalGroup(
            testseriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testseriesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(testimg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        testseriesLayout.setVerticalGroup(
            testseriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testseriesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(testimg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Test Series", testseries);

        jSplitPane2.setRightComponent(jTabbedPane4);

        jSplitPane1.setRightComponent(jSplitPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1340, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treetheoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_treetheoryMouseClicked
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null, treedata1.getLastSelectedPathComponent());
        String filename, foldername = "Theory";
        if (treedata1.getSelectionPath().toString().indexOf("User Data") == -1) {
            /*String data = treedata1.getSelectionPath().toString();
             data = data.split(",")[1];
             filename = (data.endsWith("]") ? data.split("]")[0] : data).trim() + "\\" + treedata1.getLastSelectedPathComponent().toString();*/
            filename = treedata1.getLastSelectedPathComponent().toString();
            showData(foldername, filename, 0);
        } else {
            filename = treedata1.getLastSelectedPathComponent().toString();
            showData(foldername, filename.endsWith(".txt") ? filename : filename.concat(".txt"), 1);
        }
    }//GEN-LAST:event_treetheoryMouseClicked

    private void showData(String foldername, String filename, int key) {
        if (key == 0) {
            if (!filename.endsWith(".pdf")) {
                filename = filename.concat(".pdf");
            }
            try {
                Desktop.getDesktop().open(new File(maindatapath + "\\Data\\" + foldername + "\\" + filename));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "" + ex.getMessage());
            }
        } else {
            if (!filename.equals("User Data")) {
                predefinetextarea.setText(usernotesclass.readFile(foldername, filename));
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (testcategory.getSelectedIndex() == 1) {
            new TakeTest(testlist.getSelectedValue().toString(), this.username).setVisible(true);
        } else {
            new TakeTest(testlist.getSelectedValue().toString(), this.username, 1).setVisible(true);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void testnamecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testnamecomboActionPerformed
        // TODO add your handling code here:
        if (updatetest.isSelected()) {
            usertestclass.setOldBasicTestData(testnamecombo.getSelectedItem().toString());
            basicTestData = usertestclass.getOldBasicTestData();
            testname.setText(basicTestData[0]);
            noofquestioncombo.setSelectedItem(basicTestData[1]);
            maximammarks.setText(basicTestData[2]);
            timeformate.setText(basicTestData[3]);
        }
    }//GEN-LAST:event_testnamecomboActionPerformed

    private void updatetestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetestActionPerformed
        // TODO add your handling code here:
        if (!testnamecombo.getSelectedItem().equals("--No File Exist--")) {
            usertestclass.setUpdateToken(true);
            testnamecombo.setEnabled(true);
            testname.setText(null);
            noofquestioncombo.setSelectedIndex(0);
            maximammarks.setText(null);
            timeformate.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "No test exist !!!", "Error", 0);
            createnewtest.setSelected(true);
        }
    }//GEN-LAST:event_updatetestActionPerformed

    private void noteslistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noteslistMouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == 4) {
            listPopUpMenu();
        }
    }//GEN-LAST:event_noteslistMouseClicked

    private void notestextareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notestextareaMouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == 4) {
            textAreaPopUpMenu();
        }
    }//GEN-LAST:event_notestextareaMouseClicked

    private void testlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testlistMouseClicked
        // TODO add your handling code here:
        if (testcategory.getSelectedIndex() == 1) {
            updatepopup.setVisible(true);
            openpopup.setVisible(false);
            savepopup.setVisible(false);
            saveaspopup.setVisible(false);
            deletepopup.setVisible(true);
            newpopup.setVisible(false);
            if (evt.getModifiers() == 4) {
                Point pt = getMousePosition();
                listpopup.show(this, (int) pt.getX(), (int) pt.getY());
            }
        }
    }//GEN-LAST:event_testlistMouseClicked

    private void forProf1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forProf1MouseEntered
        // TODO add your handling code here:
        changephoto.setVisible(true);
    }//GEN-LAST:event_forProf1MouseEntered

    private void forProf1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forProf1MouseExited
        // TODO add your handling code here:
        changephoto.setVisible(false);
    }//GEN-LAST:event_forProf1MouseExited
    byte[] b;
    private void changephotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changephotoMouseClicked
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Image", "jpg"));
        fc.showOpenDialog(null);
        forProf1.setImg(fc.getSelectedFile().toString(), 1);
        try {
            FileInputStream fi = new FileInputStream(fc.getSelectedFile().toString());
            b = new byte[fi.available() + 1];
            fi.read(b);
            fi.close();
            FileOutputStream fo = new FileOutputStream("C:\\ProgramData\\DataStructure\\User\\prof.jpg");
            fo.write(b);
            fo.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_changephotoMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().open(new File(maindatapath + "\\help.docx"));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_helpActionPerformed

    private void changephotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changephotoMouseEntered
        // TODO add your handling code here:
        changephoto.setVisible(true);
    }//GEN-LAST:event_changephotoMouseEntered

    private void testcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testcategoryActionPerformed
        // TODO add your handling code here:
        if (testcategory.getSelectedIndex() == 1) {
            try {
                testlist.removeAll();
                testlist.setListData(usernotesclass.getFileList("Test"));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No Test Is Exist !!!");
                testcategory.setSelectedIndex(0);
            }
        } else {
            testlist.removeAll();
            String[] s = {"Array_1", "Array_2", "Array_3", "Queue", "Stack", "Tree"};
            testlist.setListData(s);
        }
    }//GEN-LAST:event_testcategoryActionPerformed

    private void openpopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openpopupActionPerformed
        // TODO add your handling code here:
        String data = "";
        if (filechange) {
            filename = noteslist.getSelectedValue().toString();
            data = usernotesclass.readFile(notescombo.getSelectedItem().toString(), filename.endsWith(".txt") ? filename : filename.concat(".txt"));
            notestextarea.setText(data);
            notestextarea.setEnabled(true);
        } else {
            int x = JOptionPane.showConfirmDialog(null, "Do you want to save file ?");
            if (x == 0) {
                savepopupActionPerformed(evt);
                notestextarea.setEnabled(true);
            }
        }
    }//GEN-LAST:event_openpopupActionPerformed

    java.awt.event.ActionEvent evt1;
    private void updatepopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepopupActionPerformed
        // TODO add your handling code here:
        jTabbedPane4.setSelectedIndex(0);
        createnotes_test.setSelectedIndex(1);
        testnamecombo.setSelectedIndex(testlist.getSelectedIndex());
        updatetest.setSelected(true);
        testnamecombo.setEnabled(true);
        testnamecomboActionPerformed(evt1);
    }//GEN-LAST:event_updatepopupActionPerformed

    private void savepopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savepopupActionPerformed
        // TODO add your handling code here:
        if (!filechange) {
            usernotesclass.saveFile(notescombo.getSelectedItem().toString(), filename.endsWith(".txt") ? filename : filename.concat(".txt"), notestextarea.getText());
            filechange = true;
            savetoken = true;
        }
    }//GEN-LAST:event_savepopupActionPerformed

    private void deletepopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletepopupActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane4.getSelectedIndex() == 0) {
            usertestclass.delete(noteslist.getSelectedValue().toString());
            noteslist.setListData(usernotesclass.removeElement(usernotesclass.getListdata(noteslist), noteslist.getSelectedValue().toString()));
        } else if (jTabbedPane4.getSelectedIndex() == 1) {
            usertestclass.delete(testlist.getSelectedValue().toString());
            testlist.setListData(usernotesclass.removeElement(usernotesclass.getListdata(testlist), testlist.getSelectedValue().toString()));
        }
        usertestclass.setTestList(testnamecombo);
    }//GEN-LAST:event_deletepopupActionPerformed

    private void saveaspopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveaspopupActionPerformed
        // TODO add your handling code here:
        String filename = usernotesclass.getFileName(notescombo.getSelectedItem().toString());
        usernotesclass.saveFile(notescombo.getSelectedItem().toString(), filename.endsWith(".txt") ? filename : filename.concat(".txt"), notestextarea.getText());
        noteslist.setListData(usernotesclass.addElement(usernotesclass.getListdata(noteslist), filename));
        savetoken = false;
        filechange = true;
    }//GEN-LAST:event_saveaspopupActionPerformed

    private void notestextareaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notestextareaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || (int) evt.getKeyChar() == 8 || ((int) evt.getKeyChar() > 31 && (int) evt.getKeyChar() < 127) || ((int) evt.getKeyChar() > 160 && (int) evt.getKeyChar() < 256)) {
            filechange = false;
            savetoken = true;
        }
    }//GEN-LAST:event_notestextareaKeyPressed

    private void notescomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notescomboActionPerformed
        // TODO add your handling code here:
        listofnotes.setText("List of " + notescombo.getSelectedItem().toString() + ":-");
        noteslist.setListData(usernotesclass.getFileList(notescombo.getSelectedItem().toString()));
        notestextarea.setText(null);
    }//GEN-LAST:event_notescomboActionPerformed

    private void newpopupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpopupActionPerformed
        // TODO add your handling code here:
        int x = 0;
        if (!filechange) {
            x = JOptionPane.showConfirmDialog(null, "Do you want to save file");
            if (x == 1) {
                savepopupActionPerformed(evt1);
                x = 0;
            }
            if (x == 0) {
                openNewFile();
                notestextarea.setText(null);
            }
        } else {
            openNewFile();
            notestextarea.setText(null);
        }
        notestextarea.setEnabled(true);
    }//GEN-LAST:event_newpopupActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        if (updatetest.isSelected() || !usernotesclass.isFileExist("Test", testname.getText().endsWith(".txt") ? testname.getText() : testname.getText().concat(".txt"))) {
            initializeBasicTestData();
            if (updatetest.isSelected()) {
                usertestclass.setUpdateToken(true);
                usertestclass.setOldBasicTestData(testnamecombo.getSelectedItem().toString());
            }
            usertestclass.setBasicTestData(basicTestData);
            basictestpanel.setVisible(false);
            choicetestpanel.setVisible(false);
            userCreatedTest1.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Test name alredy exist !!!", "Error", 0);
            testname.setText(null);
        }
    }//GEN-LAST:event_startActionPerformed

    private void createnewtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createnewtestActionPerformed
        // TODO add your handling code here:
        usertestclass.setUpdateToken(false);
        testname.setText(null);
        testname.setEditable(true);
        testnamecombo.setEnabled(false);
        noofquestioncombo.setSelectedIndex(0);
        maximammarks.setText(null);
        timeformate.setText(null);
    }//GEN-LAST:event_createnewtestActionPerformed

    private void turbo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turbo3ActionPerformed
        // TODO add your handling code here:
        try {
            String filepath = maindatapath + "\\TC\\BIN\\TC.EXE";
            Process p = Runtime.getRuntime().exec("cmd /c start " + filepath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_turbo3ActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
        updatepopup.setVisible(false);
        openpopup.setVisible(true);
        deletepopup.setVisible(true);
        savepopup.setVisible(true);
        saveaspopup.setVisible(true);
        newpopup.setVisible(true);
        Point pt = file.getLocationOnScreen();
        listpopup.show(this, (int) pt.getX() - 6, (int) pt.getY() + 18);
    }//GEN-LAST:event_fileActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void compilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compilerActionPerformed
        // TODO add your handling code here:
        if (compiler.getText().equals("Add Compiler")) {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileFilter(new FileNameExtensionFilter("Compiler", "exe"));
            jfc.showOpenDialog(this);
            //JOptionPane.showMessageDialog(null, jfc.getSelectedFile());
            String temp = jfc.getSelectedFile().toString().toLowerCase();
            if (temp.endsWith(".exe")) {
                try {
                    compilername = JOptionPane.showInputDialog(this, "Enter compiler name");
                    if (!compilername.equals(null)) {
                        compilerpath = jfc.getSelectedFile().toString();
                        adminprocessclass = new AdminProcessClass();
                        adminprocessclass.changeData(username, size, compilerpath, compilername);
                        compiler.setText(compilername);
                    } else {
                        compilername = "Add Compiler";
                    }
                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(this, "File format is not accepted", "Error", 0);
            }
        } else {
            Point pt = compiler.getLocationOnScreen();
            compilerpopup.show(this, (int) pt.getX() - 6, (int) pt.getY() + 18);
        }
    }//GEN-LAST:event_compilerActionPerformed

    private void learndsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learndsActionPerformed
        // TODO add your handling code here:
        root = predefineclass.getTreeData(0);
        if (root != null) {
            treedata1 = new JTree(root);
            treedata1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    treetheoryMouseClicked(evt);
                }
            });
            treedata1.setFont(new Font("Times New Roman", 0, 18));
            treedata1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
            jScrollPane1.setViewportView(treedata1);
        }
        root = predefineclass.getTreeData(1);
        if (root != null) {
            treedata2 = new JTree(root);
            treedata2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    algorithmtreeMouseClicked(evt);
                }
            });
            treedata2.setFont(new Font("Times New Roman", 0, 18));
            treedata2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
            jScrollPane2.setViewportView(treedata2);
        }
        root = predefineclass.getTreeData(2);
        if (root != null) {
            treedata3 = new JTree(root);
            treedata3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent evt) {
                    programtreeMouseClicked(evt);
                }
            });
            treedata3.setFont(new Font("Times New Roman", 0, 18));
            treedata3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
            jScrollPane3.setViewportView(treedata3);
        }
        jTabbedPane4.removeAll();
        jTabbedPane4.add("Setup", setup);
        jTabbedPane4.add(username + "'s Notes", predefine);
        jTabbedPane4.setIconAt(0, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\home.png"));
        jTabbedPane4.setIconAt(1, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\pre.jpg"));
        jTabbedPane4.setSelectedIndex(1);
    }//GEN-LAST:event_learndsActionPerformed

    private void createnotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createnotesActionPerformed
        // TODO add your handling code here:
        File fiTestName = new File("C:\\ProgramData\\DataStructure\\Data\\Test");
        try {
            String files[] = fiTestName.list();
            String s = fiTestName.list()[0];
            for (String files1 : files) {
                testnamecombo.addItem(files1.split(".txt")[0]);

            }
        } catch (Exception ex) {
            testname.removeAll();
            testnamecombo.addItem("--No File Exist--");
        }
        noteslist.setListData(usernotesclass.getFileList("Theory"));
        jTabbedPane4.removeAll();
        jTabbedPane4.add("Setup", setup);
        jTabbedPane4.add("Create Notes & Test", createnotes_test);
        jTabbedPane4.setIconAt(0, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\home.png"));
        jTabbedPane4.setIconAt(1, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\user.jpg"));
        jTabbedPane4.setSelectedIndex(1);
    }//GEN-LAST:event_createnotesActionPerformed

    private void createtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createtestActionPerformed
        // TODO add your handling code here:
        File fiTestName = new File("C:\\ProgramData\\DataStructure\\Data\\Test");
        try {
            String files[] = fiTestName.list();
            String s = fiTestName.list()[0];
            for (String files1 : files) {
                testnamecombo.addItem(files1.split(".txt")[0]);

            }
        } catch (Exception ex) {
            testname.removeAll();
            testnamecombo.addItem("--No File Exist--");
        }
        noteslist.setListData(usernotesclass.getFileList("Theory"));
        jTabbedPane4.removeAll();
        jTabbedPane4.add("Setup", setup);
        jTabbedPane4.add("Create Notes & Test", createnotes_test);
        jTabbedPane4.setIconAt(0, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\home.png"));
        jTabbedPane4.setIconAt(1, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\user.jpg"));
        jTabbedPane4.setSelectedIndex(1);
        createnotes_test.setSelectedIndex(1);
    }//GEN-LAST:event_createtestActionPerformed

    private void taketestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taketestActionPerformed
        // TODO add your handling code here:
        jTabbedPane4.removeAll();
        jTabbedPane4.add("Setup", setup);
        jTabbedPane4.add("Test Series", testseries);
        jTabbedPane4.setIconAt(0, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\home.png"));
        jTabbedPane4.setIconAt(1, predefineclass.getIcon("C:\\ProgramData\\DataStructure\\resource\\test.jpg"));
        jTabbedPane4.setSelectedIndex(1);
    }//GEN-LAST:event_taketestActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        Point pt = view.getLocationOnScreen();
        fontpopup.setLocation((int) pt.getX(), (int) pt.getY() + 23);
        fontpopup.setVisible(true);
    }//GEN-LAST:event_viewActionPerformed

    private void algorithmtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_algorithmtreeMouseClicked
        // TODO add your handling code here:
        String filename, foldername = "Algorithm";
        if (treedata2.getSelectionPath().toString().indexOf("User Data") == -1) {
            String data = treedata2.getSelectionPath().toString();
            data = data.split(",")[1];
            filename = (data.endsWith("]") ? data.split("]")[0] : data).trim() + "\\" + treedata2.getLastSelectedPathComponent().toString();
            showData(foldername, filename, 0);
        } else {
            filename = treedata2.getLastSelectedPathComponent().toString();
            showData(foldername, filename.endsWith(".txt") ? filename : filename.concat(".txt"), 1);
        }
    }//GEN-LAST:event_algorithmtreeMouseClicked

    private void programtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programtreeMouseClicked
        // TODO add your handling code here:
        String filename, foldername = "Program";
        String data = treedata3.getSelectionPath().toString();
        data = data.split(",")[1];
        filename = (data.endsWith("]") ? data.split("]")[0] : data).trim() + "\\" + treedata3.getLastSelectedPathComponent().toString();
        String tempmain = "";
        programdata = maindatapath + "\\Data\\" + foldername + "\\" + filename;
        try {
            FileInputStream fi = new FileInputStream(maindatapath + "\\Data\\" + foldername + "\\" + filename);
            int x = fi.read();
            tempmain = "";
            while (x >= 0) {
                tempmain = tempmain + (char) x;
                x = fi.read();
            }
            fi.close();
        } catch (IOException ex) {
        }
        //programdata = tempmain;
        predefinetextarea.setText(tempmain);
    }//GEN-LAST:event_programtreeMouseClicked

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        try {
            Process p = Runtime.getRuntime().exec("cmd /c start " + compilerpath);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        try {
            int p = JOptionPane.showConfirmDialog(this, "Are you sure?");
            if (p == 0) {
                adminprocessclass = new AdminProcessClass();
                adminprocessclass.changeData(username, size, "No path", "Add Compiler");
                compilername = "Add Compiler";
                compiler.setText(compilername);
            }
        } catch (Exception ex) {

        }

    }//GEN-LAST:event_removeActionPerformed

    private void programtreeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programtreeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_programtreeMouseEntered

    private void runindevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runindevActionPerformed
        // TODO add your handling code here:
        String[] data = new String[4];
        data[0] = "cmd";
        data[1] = "/c";
        data[2] = compilerpath;
        data[3] = programdata.split(".txt")[0].concat(".c");
        try {
            Process p = Runtime.getRuntime().exec(data);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_runindevActionPerformed

    private void changeFontActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        size = jcb.getSelectedIndex() + 12;
        try {
            adminprocessclass = new AdminProcessClass();
            adminprocessclass.changeData(username, size, compilerpath, compilername);
            notestextarea.setFont(new java.awt.Font("Times New Roman", 0, size));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }

    }

    public void initializeBasicTestData() {
        basicTestData = new String[4];

        basicTestData[0] = testname.getText();
        basicTestData[1] = noofquestioncombo.getSelectedItem().toString();
        basicTestData[2] = maximammarks.getText().trim();
        basicTestData[3] = "";
    }

    public String[] getBasicTestData() {
        return basicTestData;
    }

    public void openNewFile() {
        filename = usernotesclass.getFileName(notescombo.getSelectedItem().toString());
        usernotesclass.saveFile(notescombo.getSelectedItem().toString(), filename.endsWith(".txt") ? filename : filename.concat(".txt"), "");
        noteslist.setListData(usernotesclass.addElement(usernotesclass.getListdata(noteslist), filename));
        savetoken = true;
        filechange = true;
    }

    public void listPopUpMenu() {
        updatepopup.setVisible(false);
        openpopup.setVisible(true);
        deletepopup.setVisible(true);
        savepopup.setVisible(false);
        saveaspopup.setVisible(false);
        newpopup.setVisible(false);
        Point pt = getMousePosition();
        listpopup.show(this, (int) pt.getX(), (int) pt.getY());
    }

    public void textAreaPopUpMenu() {
        updatepopup.setVisible(false);
        openpopup.setVisible(false);
        deletepopup.setVisible(false);
        savepopup.setVisible(true);
        saveaspopup.setVisible(true);
        newpopup.setVisible(true);
        Point pt = getMousePosition();
        listpopup.show(this, (int) pt.getX(), (int) pt.getY());
    }

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
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mainframe f = new Mainframe();
                f.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Open;
    private javax.swing.JTree algorithmtree;
    private ImgPanel.MainImg basictestpanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel changephoto;
    private ImgPanel.MainImg choicetestpanel;
    private javax.swing.JButton compiler;
    private javax.swing.JPopupMenu compilerpopup;
    private javax.swing.JRadioButton createnewtest;
    private javax.swing.JButton createnotes;
    private javax.swing.JTabbedPane createnotes_test;
    private javax.swing.JButton createtest;
    private javax.swing.JMenuItem deletepopup;
    private javax.swing.JButton exit;
    private javax.swing.JButton file;
    private javax.swing.JPopupMenu fontpopup;
    private ImgPanel.ForProf forProf1;
    private javax.swing.JButton help;
    private ImgPanel.MainImg imageforadmin1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton learnds;
    private javax.swing.JLabel listofnotes;
    private javax.swing.JPopupMenu listpopup;
    private ImgPanel.MainImg mainImg1;
    private javax.swing.JTextField maximammarks;
    private javax.swing.JMenuItem newpopup;
    private javax.swing.JComboBox noofquestioncombo;
    private ImgPanel.MainImg notes;
    private javax.swing.JComboBox notescombo;
    private javax.swing.JList noteslist;
    private javax.swing.JTextArea notestextarea;
    private javax.swing.JMenuItem openpopup;
    private javax.swing.JSplitPane predefine;
    private javax.swing.JTextArea predefinetextarea;
    private javax.swing.JTree programtree;
    private javax.swing.JMenuItem remove;
    private javax.swing.JButton runindev;
    private javax.swing.JMenuItem saveaspopup;
    private javax.swing.JMenuItem savepopup;
    private ImgPanel.MainImg setup;
    private javax.swing.JButton start;
    private javax.swing.JButton taketest;
    private ImgPanel.MainImg test;
    private javax.swing.JComboBox testcategory;
    private ImgPanel.testimg testimg1;
    private javax.swing.JList testlist;
    private javax.swing.JTextField testname;
    private javax.swing.JComboBox testnamecombo;
    private ImgPanel.MainImg testseries;
    private javax.swing.JFormattedTextField timeformate;
    private javax.swing.JTree treetheory;
    private javax.swing.JButton turbo3;
    private javax.swing.JMenuItem updatepopup;
    private javax.swing.JRadioButton updatetest;
    private MainPac.UserCreatedTest userCreatedTest1;
    private javax.swing.JLabel usernamelb;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
