/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPerformClasses;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author Hitendra
 */
public class UserTestClass {

    String[] newBasicTestData, oldBasicTestData;
    boolean updateToken = false;
    UserNotesClass uc1;

    public UserTestClass() {
        newBasicTestData = new String[4];
    }

    public void setUpdateToken(boolean token) {
        updateToken = token;
    }

    public boolean isUpdate() {
        return updateToken;
    }

    public void setBasicTestData(String[] basicTestData) {
        if (updateToken && !basicTestData[0].equals(oldBasicTestData[0])) {
            try {
                File f1 = new File("C:\\ProgramData\\DataStructure\\Data\\Test" + (oldBasicTestData[0].endsWith(".txt") ? oldBasicTestData[0] : oldBasicTestData[0].concat(".txt")));
                File f2 = new File("C:\\ProgramData\\DataStructure\\Data\\Test" + ((basicTestData[0].endsWith(".txt")) ? basicTestData[0] : basicTestData[0].concat(".txt")));

                f1.renameTo(f2);
            } catch (Exception ex) {
            }
        }
        this.newBasicTestData = basicTestData;
    }

    public String[] getBasicTestData() {
        return newBasicTestData;
    }

    public void setOldBasicTestData(String testname) {
        oldBasicTestData = getBasicTestData(testname);
    }

    public String[] getOldBasicTestData() {
        return oldBasicTestData;
    }

    public String[][] getTestData(String testname, boolean predefine, UserNotesClass userClass) {
        userClass.createDir();
        String[][] question = null;
        BufferedReader bfr;
        String temp = "";
        int i = 0;
        int end = 0;
        try {
            if (predefine) {
                question = new String[30][6];
                bfr = new BufferedReader(new FileReader("C:\\ProgramData\\DataStructure\\resource\\Data\\Test\\" + testname + ".txt"));
                temp = bfr.readLine();
                end = 30;
            } else {
                bfr = new BufferedReader(new FileReader("C:\\ProgramData\\DataStructure\\Data\\Test\\" + testname + ".txt"));
                bfr.readLine();
                end = Integer.parseInt(bfr.readLine().trim());
                bfr.readLine();
                bfr.readLine();
                bfr.readLine();
                bfr.readLine();
                question = new String[end++][6];
                temp = bfr.readLine();
            }
            while (temp != null) {
                if (i <= end) {
                    question[i][0] = temp;
                    temp = bfr.readLine();
                    question[i][1] = temp;
                    temp = bfr.readLine();
                    question[i][2] = temp;
                    temp = bfr.readLine();
                    question[i][3] = temp;
                    temp = bfr.readLine();
                    question[i][4] = temp;
                    temp = bfr.readLine();
                    question[i][5] = temp;
                    bfr.readLine();
                    bfr.readLine();
                    temp = bfr.readLine();
                }
                i++;
            }
            bfr.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
        return question;
    }

    public String[] getBasicTestData(String testname) {
        String[] data = null;
        try {
            BufferedReader bfr = new BufferedReader(new FileReader("C:\\ProgramData\\DataStructure\\Data\\Test\\" + testname + ".txt"));
            data = new String[4];
            data[0] = bfr.readLine();
            data[1] = bfr.readLine().trim();
            data[2] = bfr.readLine();
            data[3] = bfr.readLine();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", 0);
        }
        return data;
    }

    public void saveTest(String[] data, String[][] question, UserNotesClass userClass) {
        try {
            userClass.createDir();
            while (true) {
                if (!userClass.isFileExist("Test", data[0] + ".txt") || updateToken) {
                    BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\ProgramData\\DataStructure\\Data\\Test\\" + data[0] + ".txt"));
                    for (String temp : data) {
                        bfw.write(temp);
                        bfw.newLine();
                    }
                    bfw.newLine();
                    bfw.newLine();
                    for (int i = 0; i < Integer.parseInt(data[1]); i++) {
                        bfw.write(question[i][0]);
                        bfw.newLine();
                        bfw.write(question[i][1]);
                        bfw.newLine();
                        bfw.write(question[i][2]);
                        bfw.newLine();
                        bfw.write(question[i][3]);
                        bfw.newLine();
                        bfw.write(question[i][4]);
                        bfw.newLine();
                        bfw.write(question[i][5]);
                        bfw.newLine();
                        bfw.newLine();
                        bfw.newLine();
                    }
                    bfw.close();
                    JOptionPane.showMessageDialog(null, "Test has Saved !!!");
                    break;
                } else {
                    data[0] = JOptionPane.showInputDialog(null, "Enter new Test Name");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }

    public String[][] increaseSizeOfTestData(String[][] questionData, int newSize) {
        String[][] questionDataTemp = new String[newSize][6];

        for (int i = 0; i < questionData.length; i++) {
            questionDataTemp[i] = questionData[i];

        }
        return questionDataTemp;
    }

    public void delete(String testname) {
        try {
            File fi = null;
            int x = JOptionPane.showConfirmDialog(null, "Are you sure ?");
            if (x == 0) {
                fi = new File("C:\\ProgramData\\DataStructure\\Data\\Test\\" + (testname.endsWith(".txt") ? testname : testname.concat(".txt")));
                fi.delete();
            }
        } catch (Exception ex) {
        }
    }

    public void setTestList(JComboBox jcb) {
        uc1 = new UserNotesClass();
        String[] data = uc1.getFileList("Test");
        for (String string : data) {
            jcb.removeAllItems();
            jcb.addItem(string.split(".txt")[0]);
        }
    }

    public String[][] removeQuestion(String s[][], int index) {
        String[][] data = new String[s.length][6];

        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (j < s.length - 1) {
                if (i >= index) {
                    data[j] = s[i + 1];
                } else {
                    data[j] = s[i];
                }
            }
            j++;
        }
        return data;
    }
}
