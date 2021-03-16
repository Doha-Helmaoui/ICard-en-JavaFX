package sample;

public class ECM {

    @FXML
    Label nom;
    @FXML
    Label num;
    @FXML
    Label site;
    @FXML
    Label email;
    @FXML
    Label adress;
    @FXML
    Label date;
    @FXML
    ImageView image;
    @FXML
    Button open;
    @FXML
    Button save;

    public void open() {
        this.nom.setText(Etudiant.Cart.getFN());
        this.num.setText(Etudiant.Cart.getTl());
        this.site.setText(Etudiant.Cart.getS());
        this.email.setText(Etudiant.Cart.getEA());
        this.adress.setText(Etudiant.Cart.getA());
        this.date.setText(Etudiant.Cart.getBD());
    }
}
