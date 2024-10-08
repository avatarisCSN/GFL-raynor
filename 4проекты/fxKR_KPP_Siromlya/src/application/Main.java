package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.io.*;
import java.util.*;


import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {

	//Label response;

	static TextField textField1;
	static TextField textField2;
	static TextField textField3;
	static TextField textField4;
	static TextField textField5;
	static TextField textField6;
	static TextField textField7;
	static ListView<String> ObjUsListView;

	static AppUsObj AppUsObj1[];
	static AppUsController AppUsController;


	@Override
	public void start(Stage primaryStage) {
		try {

			AppUsController AppUsController = new AppUsController();
			AppUsObj1  = new AppUsObj[10];

			AppUsObj1[0] = new AppUsObj();
			AppUsObj1[1] = new AppUsObj();
			AppUsObj1[2] = new AppUsObj();
			AppUsObj1[3] = new AppUsObj();
			AppUsObj1[4] = new AppUsObj();
			AppUsObj1[5] = new AppUsObj();
			AppUsObj1[6] = new AppUsObj();
			AppUsObj1[7] = new AppUsObj();
			AppUsObj1[8] = new AppUsObj();
			AppUsObj1[9] = new AppUsObj();

			primaryStage.setTitle("�������� ������ �� ��� �������");
			primaryStage.setWidth(800);
		    primaryStage.setHeight(600);


		      Text text1 = new Text("����� �����");
		      Text text2 = new Text("������������ �����");
		      Text text3 = new Text("��� �����");
		      Text text4 = new Text("������� �����");
		      Text text5 = new Text("������� ��������");
		      Text text6 = new Text("���������� �������");
		      Text text7 = new Text("        ");

		  //  TextField textField1 = new TextField();
		  //    TextField textField2 = new TextField();
		  //    TextField textField3 = new TextField();
		  //    TextField textField4 = new TextField();
		  //   TextField textField5 = new TextField();


		      textField1 = new TextField();
		      textField2 = new TextField();
		      textField3 = new TextField();
		      textField4 = new TextField();
		      textField5 = new TextField();


		      Button button1 = new Button("���������� � �����");
		      Button button2 = new Button("������ � ����");

		      GridPane gridPane = new GridPane();

		      gridPane.setMinSize(400, 200);

		      gridPane.setPadding(new Insets(10, 10, 10, 10));

		      gridPane.setVgap(5);
		      gridPane.setHgap(5);

		      gridPane.setAlignment(Pos.CENTER);

		      gridPane.add(text1, 0, 0);
		      gridPane.add(textField1, 0, 1);
		      gridPane.add(text2, 1, 0);
		      gridPane.add(textField2, 1, 1);
		      gridPane.add(text3, 2, 0);
		      gridPane.add(textField3, 2, 1);
		      gridPane.add(text4, 3, 0);
		      gridPane.add(textField4, 3, 1);
		      gridPane.add(text5, 4, 0);
		      gridPane.add(textField5, 4, 1);
		      gridPane.add(button1, 0, 3);
		      gridPane.add(button2, 4, 3);
		      gridPane.add(text6, 2, 3);
		      gridPane.add(text7, 3, 3);

		      //Styling nodes
		      button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		      button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

		      text1.setStyle("-fx-font: normal bold 20px 'serif' ");
		      text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		      text3.setStyle("-fx-font: normal bold 20px 'serif' ");
		      text4.setStyle("-fx-font: normal bold 20px 'serif' ");
		      text5.setStyle("-fx-font: normal bold 20px 'serif' ");
		      gridPane.setStyle("-fx-background-color: BEIGE;");



		      VBox vbox = new VBox();

			    vbox.setSpacing(10);
			    Button btn3 = new Button("������ �����");
			    Button btn4 = new Button("�������");
			    Button btn5 = new Button("�����");
			    Button btn6 = new Button("�����");
			    ChoiceBox locationchoiceBox = new ChoiceBox();
			      locationchoiceBox.getItems().addAll
			         ("����� �����", "������������ �����", "��� �����", "������� �����", "������� ��������");
			    Button btn8 = new Button("������");
			    TextField textField6 = new TextField();
			    TextField textField7 = new TextField();

			  //  "�������� ���������"
			   vbox.getChildren().addAll(btn3, btn4, btn5, textField6,locationchoiceBox );
			    vbox.setPadding(new Insets(10, 10, 10, 10));
			  //  vbox.setX(250);
			  //  vbox.setY(150);

		      //Scene scene2 = new Scene(gridPane);

		     // stage.setScene(scene);

		      //Displaying the contents of the stage
		     // stage.show();


		    //  Group root = new Group();
		    //  ObservableList list = root.getChildren();
		    //  list.add(gridPane);
		    //  list.add(vbox);

			    ObservableList<String> names = FXCollections.observableArrayList(
			            "1", "2");
			        // ListView<String>
			         ObjUsListView = new ListView<String>(names);


			     //    new Text("����1"),
			         VBox vbox2 = new VBox();

					    vbox2.setSpacing(10);
					    Text text10 = new Text("�����");


					        	 
					                  button1.setOnAction(e -> {
					        		  AppUsController.PutBuff();
					          });


					        	  button2.setOnAction(e -> {
					        		  try {
					        		  AppUsController.PutUsFile();
					        		  } catch (IOException e1) {
					        		  e1.printStackTrace();
					        		  }
					        		  });

					        	  
					       	  btn3.setOnAction(e -> {
					        		  try {
					        			 AppUsController.ReadFile();
					        			  } catch (IOException e1) {
					        			  e1.printStackTrace();
					        			  }
					          });

/*					        	  btn3.setOnAction(e -> {
					        		  
					        			 AppUsController.ReadFile();

					          });
*/					        	  
					        	  
					        	  btn5.setOnAction(e -> {
					        		  try {
					        			 AppUsController.FindFile(textField6.getText());
					        			  } catch (IOException e1) {
					        			  e1.printStackTrace();
					        			  }
					          });

					        	  btn6.setOnAction(e -> {
					        		  try {
					        			 AppUsController.FindFile2(locationchoiceBox.getValue().toString() );
					        			  } catch (IOException e1) {
					        			  e1.printStackTrace();
					        			  }
					          });
							       	 
	


	//				          button2.setOnAction( new EventHandler<ActionEvent>( )
	//				        		  public void handle(ActionEvent �� ) {
					        		//  response.setText ( "Beta was pressed. " ) ;
					       //   });

							    vbox2.getChildren().addAll(text10, ObjUsListView );



		    BorderPane root2 = new BorderPane();
			root2.setTop(gridPane);
			root2.setRight(vbox);
			root2.setCenter( vbox2);
			Scene scene = new Scene(root2,800,500);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();




		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {


		launch(args);

	}
}
