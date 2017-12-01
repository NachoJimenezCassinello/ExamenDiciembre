package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class ControladorScene implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane Pane1;

    @FXML
    private ImageView Imagen;

    @FXML
    private Pane Pane2;

    int slideActual=1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		rotateAnimation();
		translateAnimation(0.1,Pane2,600);

	}

	public void rotateAnimation(){
		RotateTransition rotacion = new RotateTransition(Duration.seconds(60),Imagen);
		rotacion.setByAngle(360*11);
		rotacion.play();
	}

	public void translateAnimation(double duracion,Node node, int distancia){
		TranslateTransition translate = new TranslateTransition(Duration.seconds(duracion),node);
		translate.setByY(distancia);
		translate.play();
	}
	@FXML
	public void nextAction(){
		translateAnimation(0.5,Pane2,-600);

	}

	@FXML
	void backAction(){
		translateAnimation(0.5,Pane2,+600);
	}








}
