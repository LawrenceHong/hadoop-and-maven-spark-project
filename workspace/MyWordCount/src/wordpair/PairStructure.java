package wordpair;
import java.io.*;

import org.apache.hadoop.io.*;
/**
 * Created by hongleyou on 2017/4/18.
 */
public class PairStructure implements WritableComparable<PairStructure>{
    public String key1;
    public String key2;

    public PairStructure() {
    }

    public PairStructure(String key1, String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public int compareTo(PairStructure o) {
        int v =  this.key1.compareTo(o.key1);
        if(v == 0) {
            return this.key2.compareTo(o.key2);
        }
        else
            return v;
    }

    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(key1);
        dataOutput.writeUTF(key2);
    }

    public void readFields(DataInput dataInput) throws IOException {
        key1=dataInput.readUTF();
        key2=dataInput.readUTF();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PairStructure that = (PairStructure) o;

        if (key1 != null ? !key1.equals(that.key1) : that.key1 != null) return false;
        return key2 != null ? key2.equals(that.key2) : that.key2 == null;
    }

    @Override
    public int hashCode() {
        int result = key1 != null ? key1.hashCode() : 0;
        result = 31 * result + (key2 != null ? key2.hashCode() : 0);
        return result;
    }
}

