package offer;
//Singleton Pattern
public class Signature {
    private static Signature signature = null;
    private String sign;

    private Signature() {
    }

    public String getSign() {
        return this.sign;
    }

    public static Signature getInstance() {
        if (signature == null) {
            signature = new Signature();
            signature.sign = "Fabrica De Bomboane Botnaru Mihaela";
        }
        return signature;
    }
}
