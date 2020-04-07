package offer;

import java.util.HashMap;

public class Signature {
    private static Signature signature = null;
    private String sign = "Fabrica De Bomboane Botnaru Mihaela";

    private Signature() {
    }

    public String getSign() {
        return this.sign;
    }

    public static Signature getInstance() {
        if (signature == null)
            signature = new Signature();
        return signature;
    }
}
