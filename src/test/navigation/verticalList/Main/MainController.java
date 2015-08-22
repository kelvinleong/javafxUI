package test.navigation.verticalList.Main;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import test.navigation.verticalList.module.Module;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable{
	
	@FXML private TitledPane naviTPane;
	@FXML private TitledPane sysInfoTPane;
	@FXML private ListView<Module> moduleListView;
	@FXML private BorderPane moduleViewBP;
	
	private static List<Module> moduleList = new ArrayList<Module>();
	
	static {
		moduleList.add(new Module("CMSS", new ImageView(MainClass.class.getResource("/resources/icon/icon1.png").toString())));
		moduleList.add(new Module("Setting", new ImageView(MainClass.class.getResource("/resources/icon/icon2.png").toString())));
		moduleList.add(new Module("Logout", new ImageView(MainClass.class.getResource("/resources/icon/icon3.png").toString())));
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeListView();
	}
	
   public void initializeListView(){
	   moduleListView.getItems().addAll(FXCollections.observableArrayList(moduleList));
   }
	
	
}