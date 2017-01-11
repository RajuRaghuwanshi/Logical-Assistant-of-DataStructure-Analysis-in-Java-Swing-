package ActionPerformClasses;

import java.io.*;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeModel;
import org.apache.commons.io.FileUtils;
import org.eclipse.persistence.internal.libraries.antlr.runtime.tree.TreeAdaptor;

/**
 *
 * @author Hitendra
 */
public class PreDefineClass {

    DefaultMutableTreeNode root, sub1;
    String[] rootsource = {"Theory", "Algorithm", "Program"};
    String[] rootname = {"Data Structure", "Algorithm & Analysis", "Program"};

    public PreDefineClass() {
    }

    public Icon getIcon(String path) {
        ImageIcon ic1 = new ImageIcon(path);
        return ic1;
    }

    public void installApplication() {
        try {
            FileUtils.copyDirectory(new File(System.getProperty("user.dir") + "\\resource"), new File("C:\\ProgramData\\DataStructure\\resource"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }

    public DefaultMutableTreeNode getTreeData(int index) {
        String basicpath1 = "C:\\ProgramData\\DataStructure\\resource\\Data\\";
        String basicpath2 = "C:\\ProgramData\\DataStructure\\Data\\";
        root = new DefaultMutableTreeNode(rootname[index]);
        File fi = new File(basicpath1 + rootsource[index]);
        if (fi.exists() && fi.list() != null) {
            File[] foldername = fi.listFiles();
            String[] filename = fi.list();
            for (int i = 0; i < foldername.length; i++) {
                sub1 = new DefaultMutableTreeNode(filename[i]);
                String[] files = new File(foldername[i].getAbsolutePath().toString()).list();
                if (files != null) {
                    for (int j = 0; j < files.length; j++) {
                        sub1.add(new DefaultMutableTreeNode(files[j]));
                    }
                }
                root.add(sub1);
            }
        }
        fi = new File(basicpath2 + rootsource[index]);
        if (fi.exists() && fi.list() != null) {
            String[] filename = fi.list();
           if (filename.length!=0) {
                sub1 = new DefaultMutableTreeNode("User Data");
                for (int i = 0; i < filename.length; i++) {
                    sub1.add(new DefaultMutableTreeNode(filename[i]));
                }
                root.add(sub1);
            }
        }

        return root;
    }
}
