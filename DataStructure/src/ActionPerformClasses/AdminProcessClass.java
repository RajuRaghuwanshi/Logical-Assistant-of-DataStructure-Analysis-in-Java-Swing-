package ActionPerformClasses;

import java.io.*;
import javax.swing.*;

public class AdminProcessClass {

    String data[];
    Member m = null;
    UserNotesClass uc1;

    public AdminProcessClass() throws Exception {
        uc1 = new UserNotesClass();
    }

    public String[] getLogin() throws Exception {
        String[] data;
        uc1 = new UserNotesClass();
        try {
            File fi = new File("C:\\ProgramData\\DataStructure\\User");
            if (fi.exists()) {
                String filename;
                int i = 0;
                while (true) {
                    filename = fi.list()[i];
                    if (filename.endsWith("data.dat")) {
                        break;
                    }
                    i++;
                }
                FileInputStream fis = new FileInputStream("C:\\ProgramData\\DataStructure\\User\\" + filename);
                ObjectInputStream ois = new ObjectInputStream(fis);
                m = (Member) ois.readObject();
                data = m.getData(filename.split("data.dat")[0]);
                ois.close();
            } else {
                return null;
            }
        } catch (Exception ex) {
            return null;
        }
        return data;
    }

    public void createAccount(String uname, byte[] b) throws Exception {

        uc1.createDir();
        FileOutputStream fo = new FileOutputStream("C:\\ProgramData\\DataStructure\\User\\" + uname + "data.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fo);

        int size = 12;
        Member m = new Member(uname, size, "No path", "Add Compiler");
        oos.writeObject(m);

        oos.close();

        FileOutputStream fo1 = new FileOutputStream("C:\\ProgramData\\DataStructure\\User\\prof.jpg");
        fo1.write(b);
        fo1.close();

        JOptionPane.showMessageDialog(null, "Successful !!!");

    }

    public void changeData(String uname, int size, String compilerpath, String compilername) {
        try {
            FileOutputStream fo = new FileOutputStream("C:\\ProgramData\\DataStructure\\User\\" + uname + "data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            Member m = new Member(uname, size, compilerpath, compilername);
            oos.writeObject(m);
            oos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage(), "Error", 0);
        }
    }
}

class Member implements Serializable {

    String uname, compilerpath, compilername;
    int size;

    public Member() {

    }

    public Member(String uname, int size, String compilerpath, String compilername) {
        this.uname = uname;
        this.size = size;
        this.compilerpath = compilerpath;
        this.compilername = compilername;
    }

    public void setUsername(String uname) {
        this.uname = uname;
    }

    public String[] getData(String uname) throws Exception {
        String[] data1 = new String[4];
        data1[0] = uname;
        data1[1] = size + "";
        data1[2] = compilerpath;
        data1[3] = compilername;
        return data1;
    }
}
