module Cafeteria2 {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires com.jfoenix;
	
	opens application to javafx.graphics, javafx.fxml;
}
