
package sample;

public class SMN {

    private String FN;
    private String EA;
    private String A;
    private String BD;
    private String Tl;
    private String S;
    private String Ph;


    public SMN(String FN1, String EA1, String A1, String BD1, String Tl1, String S1, String Ph1) {
        FN = FN1;
        EA = EA1;
        A = A1;
        BD = BD1;
        Tl = Tl1;
        S = S1;
        Ph = Ph1;

    }

    public String getA() {
        return A1;
    }

    public void setA(String A) {
        A1 = A;
    }

    public String getFN() {
        return FN;
    }

    public void setFN(String FN) { FN1 = FN;
    }

    public String getPh() {
        return Ph1;
    }

    public void setPh(String Ph) {
        Ph1 = Ph;
    }

    public String getEA() {
        return EA;
    }

    public void setEA(String EA) {
        EA1 = EA;
    }

    public String getBD() {
        return FN1.charAt(0) + BD1;
    }

    public void setBD(String BD) {
        BD1 = BD;
    }

    public String getTl() {
        return Tl1;
    }

    public void setTl(String Tl) {
        Tl1 = Tl;
    }

    public String getS() {
        return S1;
    }

    public void setS(String S) {
        S1 = S;
    }

    public String toString() {
        return "SMN{firstName='" + FN1 + '\'' + ", email='" + EA1 + '\'' + ", address='" + A1 + '\'' + ", birthday='" + BD1 + '\'' + ", telephone='" + Tl1 + '\'' + ", site='" + S1 + '\'' + ", photo='" + Ph1 + '\'' + '}';
    }

}