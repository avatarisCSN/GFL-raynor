package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import java.io.*;
import java.util.*;
import javafx.scene.control.ContentDisplay;
import javafx.scene.paint.Color;

import javax.swing.JLabel;

import javafx.scene.control.Button;

import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	int clicks = 0;




	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Label label7 = new Label("������� ���� � ��������� ���������");
		
		 Label label1 = new Label("�����1");
	        Label label2 = new Label("�����2");
	        Label label3 = new Label("�����3");
	        Label label4 = new Label("�����4");
	        Label label5 = new Label("�����5");
	        Label label6 = new Label("�����6");
	        
	        Button grBrn0 = new Button("0");
	        Button grBrn1 = new Button("1");
	        Button grBrn2 = new Button("2");
	        Button grBrn3 = new Button("3");
	        Button grBrn4 = new Button("4");
	        Button grBrn5 = new Button("5");
	        Button grBrn6 = new Button("6");
	        Button grBrn7 = new Button("7");
	        Button grBrn8 = new Button("8");
	        Button grBrn9 = new Button("9");
	        Button grBrn10 = new Button("10");
	        Button grBrn11 = new Button("11");
	        Button grBrn12 = new Button("12");
	        Button grBrn13 = new Button("13");
	        Button grBrn14 = new Button("14");
	        Button grBrn15 = new Button("15");
	        Button grBrn16 = new Button("16");
	        
	        
	        
	        TextField text1 = new TextField("����1");
	        TextField text2 = new TextField("����2");
	        TextField text3 = new TextField("����3");
	        
	        TextField text10 = new TextField(" ");
	        text10.setEditable(false);
	        TextField text11 = new TextField(" ");
	        text11.setEditable(false);	        
	        TextField text12 = new TextField(" ");
	        text12.setEditable(false);	        
	        TextField text13 = new TextField(" ");
	        text13.setEditable(false);	      
	        TextField text14 = new TextField(" ");
	        text14.setEditable(false);	        
	        TextField text15 = new TextField(" ");
	        text15.setEditable(false);	       
	        TextField text16 = new TextField(" ");
	        text16.setEditable(false);	      
	        TextField text17 = new TextField(" ");
	        text17.setEditable(false);	        
	        TextField text18 = new TextField(" ");
	        text18.setEditable(false);	   
	        TextField text19 = new TextField(" ");
	        text19.setEditable(false);
	        TextField text110 = new TextField(" ");
	        text110.setEditable(false);
	        TextField text111 = new TextField(" ");
	        text111.setEditable(false);
	        TextField text112 = new TextField(" ");
	        text112.setEditable(false);
	        TextField text24 = new TextField(" ");
	        text24.setEditable(false);
	        TextField text25 = new TextField(" ");
	        text25.setEditable(false);
	        TextField text26 = new TextField(" ");
	        text26.setEditable(false);
	        TextField text27 = new TextField(" ");
	        text27.setEditable(false);
	        
	        
	        
	        
	        Button btn = new Button("�����");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	              
	            @Override
	            public void handle(ActionEvent event) {
	              
	              int chislo2[] = new  int[6];
	             
	                btn.setText("working");
	               
	               
	                
	                chislo2=processing.Main(text1.getText(), text2.getText(), text3.getText());
	                String i2[] = new String[17];
	                int[][] i3 = new int[2][17];
	                i3=processing.numbers12(text1.getText(), text2.getText(), text3.getText(), chislo2);
	                 i2=processing.matrToString(i3);
	                 text10.setText(i2[0]);
	                  String temp = processing.digit03(i3[0][0]);           
	                  text10.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text11.setText(i2[1]);
	                 temp = processing.digit12(i3[0][1]);           
	                 text11.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text12.setText(i2[2]);
	                 temp = processing.digit12(i3[0][2]);           
	                 text12.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text13.setText(i2[3]);
	                  temp = processing.digit03(i3[0][3]);
	                 text13.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text14.setText(i2[4]);
	                 temp = processing.digit4_more(i3[0][4]);
	                 text14.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text15.setText(i2[5]);
	                 temp = processing.digit4_more(i3[0][5]);
	                 text15.setStyle("-fx-background-color:"+ temp +";");
	                 	
	                 text16.setText(i2[6]);
	                 temp = processing.digit4_more(i3[0][6]);
	                 text16.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text17.setText(i2[7]);
	                 temp = processing.digit4_more(i3[0][7]);
	                 text17.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text18.setText(i2[8]);
	                 temp = processing.digit4_more(i3[0][8]);
	                 text18.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text19.setText(i2[9]);
	                 temp = processing.digit4_more(i3[0][9]);
	                 text19.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text110.setText(i2[10]);
	                 temp = processing.digit4_more(i3[0][10]);
	                 text110.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text111.setText(i2[11]);
	                 temp = processing.digit4_more(i3[0][11]);
	                 text111.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text112.setText(i2[12]);
	                 temp = processing.digit4_more(i3[0][12]);
	                 text112.setStyle("-fx-background-color:"+ temp +";");
	                 
	                 text24.setText(i2[13]);
	                 
	                 text25.setText(i2[14]);
	                
	                 text26.setText(i2[15]);
	                
	                 text27.setText(i2[16]);
	              
	               
	                 
	               
	               
					
					
	                label1.setText(Integer.toString(chislo2[0]));
	                label1.setStyle("-fx-background-color: red ;");
	                label2.setText(Integer.toString(chislo2[1]));
	                label3.setText(Integer.toString(chislo2[2]));
	                label4.setText(Integer.toString(chislo2[3]));
	                label5.setText(Integer.toString(chislo2[4]));
	                label6.setText(Integer.toString(chislo2[5]));
	            }
	        });
	     
	        
	        
	    GridPane grid = new GridPane( );
	    
	   
         
        grid.setGridLinesVisible(true); // ������ ������� ����� ����� � ��������
       
        
	    
	    grid.add(text10, 2 , 0);
        grid.add(text11, 0 , 1);
        grid.add(text12, 1 , 1);
        grid.add(text13, 2 , 1);
        grid.add(text24, 3 , 1);
        grid.add(text14, 0 , 2);
        grid.add(text15, 1 , 2);
        grid.add(text16, 2 , 2);
        grid.add(text25, 3 , 2);
        grid.add(text17, 0 , 3);
        grid.add(text18, 1 , 3);
        grid.add(text19, 2 , 3);
        grid.add(text26, 3 , 3);
        grid.add(text110, 0 , 4);
        grid.add(text111, 1 , 4);
        grid.add(text112, 2 , 4);
        grid.add(text27, 3 , 4);
        
        
		
		
		
		GridPane grid0 = new GridPane();
		grid0.add(label7, 1 , 0);
	    grid0.add(text1, 1 , 1);
	    grid0.add(text2, 2 , 1);
	    grid0.add(text3, 3 , 1);
	    grid0.add(btn, 2 , 2);
	    
	    //grid2 na 3 stranice
	    
	    GridPane grid2 = new GridPane( );
	    grid.getColumnConstraints().add(new ColumnConstraints(60));
        grid.getColumnConstraints().add(new ColumnConstraints(60));
        grid.getColumnConstraints().add(new ColumnConstraints(60));
        grid.getColumnConstraints().add(new ColumnConstraints(60));
         
        grid.setGridLinesVisible(true); // ������ ������� ����� ����� � ��������
       
        
	    
	    grid2.add(grBrn0, 2 , 0);
        grid2.add(grBrn1, 0 , 1);
        grid2.add(grBrn2, 1 , 1);
        grid2.add(grBrn3, 2 , 1);
        grid2.add(grBrn4, 3 , 1);
        grid2.add(grBrn5, 0 , 2);
        grid2.add(grBrn6, 1 , 2);
        grid2.add(grBrn7, 2 , 2);
        grid2.add(grBrn8, 3 , 2);
        grid2.add(grBrn9, 0 , 3);
        grid2.add(grBrn10, 1 , 3);
        grid2.add(grBrn11, 2 , 3);
        grid2.add(grBrn12, 3 , 3);
        grid2.add(grBrn13, 0 , 4);
        grid2.add(grBrn14, 1 , 4);
        grid2.add(grBrn15, 2 , 4);
        grid2.add(grBrn16, 3 , 4);
        grid2.setGridLinesVisible(true); // ������ ������� ����� ����� � ��������
	    
	    
	    
	    Button btn11= new Button("������ �������");
		Button btn12= new Button("������ ����������");
		Button btn13= new Button("������� �� ���������");
		
		    HBox menu = new HBox(btn11, btn12, btn13);
		    
 
		    VBox vbox = new VBox(10, label1, label2, label3, label4, label5, label6);
		
	        VBox vbox2 = new VBox(grid0, grid);
	   
	        HBox Main2 = new HBox(5, vbox2, vbox );
	        
		    VBox Main = new VBox(5, menu, Main2 );
		    
		    Scene MainScene = new Scene(Main,800,500);
		    ScrollPane scroll = new ScrollPane(Scenes.txt);
		  
		        HBox menu2 = new HBox(Scenes.btn21, Scenes.btn22, Scenes.btn23);
		       
		        
		       
		        

			     Label lbl5_1 = new Label("������� ����� � ���");
			        TextField text5_1 = new TextField("�����");
			        TextField text5_2 = new TextField("���");
			        
			        Button btn5_1_1 = new Button("start");
			        
			       
			        
			        
			        
				     
				   
				     
				     ToggleButton btn5_1 = new ToggleButton("1");
				     ToggleButton btn5_2 = new ToggleButton("2");
				     ToggleButton btn5_3 = new ToggleButton("3");
				     ToggleButton btn5_4 = new ToggleButton("4");
				     ToggleButton btn5_5 = new ToggleButton("5");
				     ToggleButton btn5_6 = new ToggleButton("6");
				     ToggleButton btn5_7 = new ToggleButton("7");
				     ToggleButton btn5_8 = new ToggleButton("8");
				     ToggleButton btn5_9 = new ToggleButton("9");
				     ToggleButton btn5_10 = new ToggleButton("10");
				     ToggleButton btn5_11 = new ToggleButton("11");
				     ToggleButton btn5_12 = new ToggleButton("12");
				     
				     NumberAxis x = new NumberAxis(1, 31, 1);
				     NumberAxis y = new NumberAxis(0, 6, 1);
				     y.setLabel("No.of schools");
				     LineChart<Number, Number> numberLineChart = new LineChart<Number, Number>(x,y);
				     numberLineChart.setTitle("������");
				     
				     GridPane grid3 = new GridPane();
				        
				        for (int i =0; i<32; i++)
					    {
					    	grid3.getColumnConstraints().add(new ColumnConstraints(20));
					    	grid3.add(new Label(Integer.toString(i)), i, 0);
					    }
				        for (int j =0; j<13; j++)
					    {
				    		grid3.getRowConstraints().add(new RowConstraints(15));	
					    	grid3.add(new Label(Integer.toString(j)), 0, j);
					    }
				       
				        grid3.setGridLinesVisible(true); // ������ ������� ����� ����� � ��������
				        
				        
				        
				     
				     EventHandler<ActionEvent> ToggleButton5Handler1 = new EventHandler<ActionEvent>() { 
							@Override 
					  		   public void handle(ActionEvent e) { 
								
							int	month = Integer.parseInt(text5_1.getText());
							int	  year  = Integer.parseInt(text5_2.getText());	
							 int day =graph_diagram.day(month); 
							
						    int i4[][] = new int[2][17];
						    i4=graph_diagram.Main(month, year);
						     
						    
						     XYChart.Series series1 = new XYChart.Series();
						     series1.setName("1");
						     XYChart.Series series2 = new XYChart.Series();
						     series2.setName("2");
						     XYChart.Series series3 = new XYChart.Series();
						     series3.setName("3");
						     XYChart.Series series4 = new XYChart.Series();
						     series4.setName("4");
						     
						     XYChart.Series series5 = new XYChart.Series();
						     series5.setName("5");
						     XYChart.Series series6 = new XYChart.Series();
						     series6.setName("6");
						     XYChart.Series series7 = new XYChart.Series();
						     series7.setName("7");
						     XYChart.Series series8 = new XYChart.Series();
						     series8.setName("8");
						     XYChart.Series series9 = new XYChart.Series();
						     series9.setName("9");
						     XYChart.Series series10 = new XYChart.Series();
						     series10.setName("10");
						     XYChart.Series series11 = new XYChart.Series();
						     series11.setName("11");
						     XYChart.Series series12 = new XYChart.Series();
						     series12.setName("12");
						     for (int i=0; i<day; i++)
						     {
						    	 series1.getData().add(new XYChart.Data( i+1, i4[i][0]));
						    	 series2.getData().add(new XYChart.Data( i+1, i4[i][1]));
						    	 series3.getData().add(new XYChart.Data( i+1, i4[i][2]));
						    	 series4.getData().add(new XYChart.Data( i+1, i4[i][3]));
						    	 series5.getData().add(new XYChart.Data( i+1, i4[i][4]));
						    	 series6.getData().add(new XYChart.Data( i+1, i4[i][5]));
						    	 series7.getData().add(new XYChart.Data( i+1, i4[i][6]));
						    	 series8.getData().add(new XYChart.Data( i+1, i4[i][7]));
						    	 series9.getData().add(new XYChart.Data( i+1, i4[i][8]));
						    	 series10.getData().add(new XYChart.Data( i+1, i4[i][9]));
						    	 series11.getData().add(new XYChart.Data( i+1, i4[i][10]));
						    	 series12.getData().add(new XYChart.Data( i+1, i4[i][11]));
						    	 


						     }
								 
										 numberLineChart.getData().clear();

						            
								if(btn5_1.isSelected()){
									 numberLineChart.getData().add(series1);
					            }
								if(btn5_2.isSelected()){
									 numberLineChart.getData().add(series2);
					            }
								if(btn5_3.isSelected()){
									 numberLineChart.getData().add(series3);
					            }
								if(btn5_4.isSelected()){
									 numberLineChart.getData().add(series4);
					            }
								if(btn5_5.isSelected()){
									 numberLineChart.getData().add(series5);
					            }
								if(btn5_6.isSelected()){
									 numberLineChart.getData().add(series6);
					            }
								if(btn5_7.isSelected()){
									 numberLineChart.getData().add(series7);
					            }
								if(btn5_8.isSelected()){
									 numberLineChart.getData().add(series8);
					            }
								if(btn5_9.isSelected()){
									 numberLineChart.getData().add(series9);
					            }
								if(btn5_10.isSelected()){
									 numberLineChart.getData().add(series10);
					            }
								if(btn5_11.isSelected()){
									 numberLineChart.getData().add(series11);
					            }
								if(btn5_12.isSelected()){
									 numberLineChart.getData().add(series12);	 		 
					            }
								
								 for (int i =0; i<31; i++)
								    {
								    	
								    	for (int j =0; j<12; j++)
									    {
								    			
									    	grid3.add(new Label(Integer.toString(i4[i][j])), i+1, j+1);
									    }
								    }
							        
					            
					          
					  		   } 
						};
				     btn5_1.setOnAction(ToggleButton5Handler1);
				     btn5_2.setOnAction(ToggleButton5Handler1);
				     btn5_3.setOnAction(ToggleButton5Handler1);
				     btn5_4.setOnAction(ToggleButton5Handler1);
				     btn5_5.setOnAction(ToggleButton5Handler1);
				     btn5_6.setOnAction(ToggleButton5Handler1);
				     btn5_7.setOnAction(ToggleButton5Handler1);
				     btn5_8.setOnAction(ToggleButton5Handler1);
				     btn5_9.setOnAction(ToggleButton5Handler1);
				     btn5_10.setOnAction(ToggleButton5Handler1);
				     btn5_11.setOnAction(ToggleButton5Handler1);
				     btn5_12.setOnAction(ToggleButton5Handler1);
			        
				     HBox hbox5_1 = new HBox(text5_1, text5_2);
				        VBox vbox5 = new VBox(lbl5_1, hbox5_1, btn5_1_1);
				        HBox hbox5_2 = new HBox(btn5_1, btn5_2, btn5_3, btn5_4, btn5_5, btn5_6, btn5_7, btn5_8, btn5_9, btn5_10, btn5_11, btn5_12);
			        
			        VBox vbox5_1 =new VBox(hbox5_2, numberLineChart);
			        HBox hbox4 = new HBox(vbox5, vbox5_1 );
			        
			     VBox vbox4 = new VBox(menu2, hbox4, grid3);
			     
			   Scene MainScene2 = new Scene(vbox4,800,700); 
		    
		    
		    HBox hbox3= new HBox(grid2, scroll );
		   
		    
		    
		    
		    VBox vbox3 = new VBox(Scenes.menu3, hbox3);
		    
		     Scene MainScene3 = new Scene(vbox3,800,500);
		     

		    EventHandler<ActionEvent> switchScreenHandler1 = new EventHandler<ActionEvent>() { 
				@Override 
		  		   public void handle(ActionEvent e) { 
					
					 
						
						
						    
					
					
					primaryStage.setScene(MainScene);
					primaryStage.show();
		  		   } 
			};
			
		    
		    
			
			
			
			
			EventHandler<ActionEvent> switchScreenHandler2 = new EventHandler<ActionEvent>() { 
				@Override 
		  		   public void handle(ActionEvent e) { 
		         		
					
						    
					
					
					
					primaryStage.setScene(MainScene2);
					primaryStage.setTitle("hello");
					primaryStage.show();
					
		  		   } 
			};
			
			
			
			EventHandler<ActionEvent> switchScreenHandler3 = new EventHandler<ActionEvent>() { 
				@Override 
		  		   public void handle(ActionEvent e) { 
					
					 
					
					
				    
					primaryStage.setScene(MainScene3);
					primaryStage.setTitle("hello");
					primaryStage.show();
		  		   } 
			};
			
			
			
			EventHandler<MouseEvent> OpenerHelp = new EventHandler<MouseEvent>() { 
	         	@Override 
	  		   public void handle(MouseEvent me) { 
					if  (grBrn0.isHover())
					{
						String s =  grBrn0.getText();
						System.out.println(s);
					}
					if  (grBrn1.isHover())
					{
						String s =  grBrn1.getText();
						System.out.println(s);
					}
					if  (grBrn2.isHover())
					{
						String s =  grBrn2.getText();
						System.out.println(s);
					}
					if  (grBrn3.isHover())
					{
						String s =  grBrn3.getText();
						System.out.println(s);
					}
					if  (grBrn4.isHover())
					{
						String s =  grBrn4.getText();
						System.out.println(s);
					}
					if  (grBrn5.isHover())
					{
						String s =  grBrn5.getText();
						System.out.println(s);
					}
					if  (grBrn6.isHover())
					{
						String s =  grBrn6.getText();
						System.out.println(s);
					}
					if  (grBrn7.isHover())
					{
						String s =  grBrn7.getText();
						System.out.println(s);
					}
					if  (grBrn8.isHover())
					{
						String s =  grBrn8.getText();
						System.out.println(s);
					}
					if  (grBrn9.isHover())
					{
						String s =  grBrn9.getText();
						System.out.println(s);
					}
					if  (grBrn10.isHover())
					{
						String s =  grBrn10.getText();
						System.out.println(s);
					}
					if  (grBrn11.isHover())
					{
						String s =  grBrn11.getText();
						System.out.println(s);
					}
					if  (grBrn12.isHover())
					{
						String s =  grBrn12.getText();
						System.out.println(s);
					}
					if  (grBrn13.isHover())
					{
						String s =  grBrn13.getText();
						System.out.println(s);
					}
					if  (grBrn14.isHover())
					{
						String s =  grBrn14.getText();
						System.out.println(s);
					}
					if  (grBrn15.isHover())
					{
						String s =  grBrn15.getText();
						System.out.println(s);
					}
					if  (grBrn16.isHover())
					{
						String s =  grBrn16.getText();
						System.out.println(s);
					}
					
					
					
					
					// scrollPane.setVvalue(0.5);
					//  �������� � ������ �������
					 
					
					
				    
					
		  		   } 
			};
			grBrn0.setOnMouseClicked(OpenerHelp);
			grBrn1.setOnMouseClicked(OpenerHelp);
			grBrn2.setOnMouseClicked(OpenerHelp);
			grBrn3.setOnMouseClicked(OpenerHelp);
			grBrn4.setOnMouseClicked(OpenerHelp);
			grBrn5.setOnMouseClicked(OpenerHelp);
			grBrn6.setOnMouseClicked(OpenerHelp);
			grBrn7.setOnMouseClicked(OpenerHelp);
			grBrn8.setOnMouseClicked(OpenerHelp);
			grBrn9.setOnMouseClicked(OpenerHelp);
			grBrn10.setOnMouseClicked(OpenerHelp);
			grBrn11.setOnMouseClicked(OpenerHelp);
			grBrn12.setOnMouseClicked(OpenerHelp);
			grBrn13.setOnMouseClicked(OpenerHelp);
			grBrn14.setOnMouseClicked(OpenerHelp);
			grBrn15.setOnMouseClicked(OpenerHelp);
			grBrn16.setOnMouseClicked(OpenerHelp);
			
			btn12.setOnAction(switchScreenHandler2);
			btn13.setOnAction(switchScreenHandler3);
			
			Scenes.btn21.setOnAction(switchScreenHandler1);
			Scenes.btn23.setOnAction(switchScreenHandler3);
			
			Scenes.btn31.setOnAction(switchScreenHandler1);
			Scenes.btn32.setOnAction(switchScreenHandler2);
			
			
			
			


			primaryStage.setScene(MainScene);
			primaryStage.setTitle("hello");
			primaryStage.show();

	}
	public static void main(String[] args) {


		launch(args);

	}
}
