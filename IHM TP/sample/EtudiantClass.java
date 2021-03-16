package sample;


public class Etudiant {

    @FXML
    TextField nom;
    @FXML
    TextField num;
    @FXML
    TextField site;
    @FXML
    TextField email;
    @FXML
    TextField adress;
    @FXML
    ImageView image;
    @FXML
    DatePicker date;

    static SMN Cart = new SMN();


    @FXML
    private void Create(ActionEvent actionEvent) throws IOException {
        Cart = new SMN(this.nom.getText(), this.email.getText(), String.valueOf(this.date.getValue()), this.num.getText(), this.site.getText(), this.adress.getText(), "photo1");
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("F2.fxml"));
        Stage secondStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        secondStage.setScene(new Scene(root));
        secondStage.centerOnScreen();
        secondStage.show();
    }

}
