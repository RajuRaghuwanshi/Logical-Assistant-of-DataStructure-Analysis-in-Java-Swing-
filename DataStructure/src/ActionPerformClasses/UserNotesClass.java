package ActionPerformClasses;

import java.io.*;
import javax.swing.*;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Hitendra
 */
public class UserNotesClass {

    public UserNotesClass() {
    }

    public String[] getFileList(String foldername) {
        String filedata[] = null;

        File fi = new File("C:\\ProgramData\\DataStructure\\Data\\" + foldername);
        createDir();
        filedata = fi.list();
        for (int i = 0; i < filedata.length; i++) {
            filedata[i] = filedata[i].split(".txt")[0];
        }
        return filedata;
    }

    public String readFile(String foldername, String filename) {
        String tempmain = "";
        try {
            FileInputStream fi = new FileInputStream("C:\\ProgramData\\DataStructure\\Data\\" + foldername + "\\" + filename);
            int x = fi.read();
            tempmain = "";
            while (x >= 0) {
                tempmain = tempmain + (char) x;
                x = fi.read();
            }
            fi.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
        return tempmain;
    }

    public String[] getListdata(JList jl) {
        ListModel<String> lm = jl.getModel();
        String[] temp = new String[lm.getSize()];
        for (int i = 0; i < lm.getSize(); i++) {
            temp[i] = lm.getElementAt(i).toString();
        }
        return temp;
    }

    public String[] removeElement(String[] ss, String s) {
        String[] temp = new String[ss.length - 1];
        int j = 0;
        for (String s1 : ss) {
            if (!s1.equals(s)) {
                temp[j] = s1;
                j++;
            }
        }
        return temp;
    }

    public String[] addElement(String[] ss, String s) {
        String[] temp = new String[ss.length + 1];
        for (int a = 0; a < ss.length; a++) {
            temp[a] = ss[a];
        }
        temp[ss.length] = s.split(".txt")[0];
        return temp;
    }

    public void saveFile(String foldername, String filename, String data) {
        try {
            FileOutputStream fi = new FileOutputStream("C:\\ProgramData\\DataStructure\\Data\\" + foldername + "\\" + filename);
            fi.write(data.getBytes());
            fi.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }

    public boolean isFileExist(String foldername, String filename) {
        boolean bool = true;

        File fi = new File("C:\\ProgramData\\DataStructure\\Data\\" + foldername + "\\" + filename);
        if (!fi.exists()) {
            bool = false;
        }
        return bool;
    }

    public String getFileName(String foldername) {
        String temp = null;
        int toci = 0;
        while (true) {
            if (toci == 0) {
                temp = JOptionPane.showInputDialog("Enter file name");
            } else {
                temp = JOptionPane.showInputDialog("File is alredy exist\n\nEnter another file name");
            }

            if (temp != null) {
                if (!temp.endsWith(".txt")) {
                    temp = temp + ".txt";
                }
                if (isFileExist(foldername, temp)) {
                    toci = 1;
                } else {
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "File is not saved !!!");
                temp = null;
                break;
            }
        }
        return temp;
    }

    public void createDir() {
        File f1 = new File("C:\\ProgramData\\DataStructure\\Data");
        if (!f1.exists()) {
            f1.mkdir();
        }
        File f2 = new File("C:\\ProgramData\\DataStructure\\Data\\Theory");
        if (!f2.exists()) {
            f2.mkdir();
        }
        File f3 = new File("C:\\ProgramData\\DataStructure\\Data\\Algorithm");
        if (!f3.exists()) {
            f3.mkdir();
        }
        File f4 = new File("C:\\ProgramData\\DataStructure\\Data\\Program");
        if (!f4.exists()) {
            f4.mkdir();
        }
        File f5 = new File("C:\\ProgramData\\DataStructure\\Data\\Test");
        if (!f5.exists()) {
            f5.mkdir();
        }
        File f6 = new File("C:\\ProgramData\\DataStructure\\User");
        if (!f6.exists()) {
            f6.mkdir();
        }
        File f7 = new File("C:\\ProgramData\\DataStructure\\resource");
        if (!f7.exists()) {
            f7.mkdir();
        }
        File f8 = new File("C:\\output");
        if (!f8.exists()) {
            f8.mkdir();
        }
    }
}
