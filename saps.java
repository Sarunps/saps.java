import java.io.*;
public class JavaSerial
    public static void main(String args[]) throws Exception{
        vulnerableobject obj = new vulnerableobject("ls");
        FileOutputStream fos = new FileOutputStream("/tmp/object.serial");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(obj);
        os.close();
    }
}

class norm implements Serializable{
    public String name;
    public norm(String name)
    this.name = name;
    }
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{
        in.defaultReadObject();
        System.out.println(this.name);
    }
}
