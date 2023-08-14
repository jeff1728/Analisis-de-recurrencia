package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;

public class SampleController {
	int cantidad,precio,precioBuscar;
	private int remainingDataCount;
	Scanner leer=new Scanner(System.in);
	
	 @FXML
	    private Button btncomprar;

	    @FXML
	    private Button btningresar;

	    @FXML
	    private TextField txtcafe;

	    @FXML
	    private TextField txtcantidad;

	    @FXML
	    private TextField txtprecio;
	    
	    @FXML
	    private JFXButton fxingresar;
	    @FXML
	    private JFXTextArea txtArea;
	    
	    @FXML
	    private JFXButton fxcomprar;

	    @FXML
	    void fxingresar() {
	    	
	        cantidad=Integer.valueOf(txtcantidad.getText());
	        
	    }
	    @FXML
	    void fxcomprar() {
	    	
	    	
			int[] arr = new int[cantidad];
	   	 
		        
		        for(int i=0;i<cantidad;i++) {
		        	precio=Integer.valueOf(JOptionPane.showInputDialog("ingrese el precio de su café "));
		        	arr[i]=precio;
		        }
		        precioBuscar=Integer.valueOf(JOptionPane.showInputDialog("Ingrese el precio del cafe que desea buscar en el menú: "));
		        
		        int resultIndex = busquedaBi(arr, precioBuscar);

		        if (resultIndex != -1) {
		            JOptionPane.showMessageDialog(null,"Cafe encontrado: " + resultIndex );
		            txtArea.setText("Cafe encontrado: " + resultIndex);
		        } else {
		            JOptionPane.showMessageDialog(null, "su cafe no se encuentra. ");
		            txtArea.setText("su cafe no se encuentra");
		        }
	   
	    }
	    
	    public static int busquedaBi(int[] arr, int punto) {
	        int izquierda = 0;
	        int derecha = arr.length - 1;

	        while (izquierda <= derecha) {
	            int mitad = izquierda + (derecha - izquierda) / 2;

	            if (arr[mitad] == punto) {
	                return mitad; 
	            } else if (arr[mitad] < punto) {
	                izquierda = mitad + 1; 
	            } else {
	                derecha = mitad - 1; 
	            }
	        }

	        return -1;
	    }

	    
}
