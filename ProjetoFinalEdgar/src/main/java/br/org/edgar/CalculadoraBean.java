package br.org.edgar;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.swing.JOptionPane;

@Named
@RequestScoped

public class CalculadoraBean implements Serializable{
	
	
	private Integer x;
	private Integer resultado1;
	private Integer x1;
	private Integer y;
	private Integer resultado2;
	private Integer a;
	private Integer b;
	private Integer c;
	private double resultado3;
	private double resultado4;
	
	public String Ecuacion(){
       resultado3 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

       resultado4 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
       
      if ((Double.isNaN(resultado3)== true)||((Double.isNaN(resultado4)== true))){
    	   JOptionPane.showMessageDialog(null, "Sin solucion");
    	   }
    	   else {
    	   JOptionPane.showMessageDialog(null, resultado3);
    	   JOptionPane.showMessageDialog(null,  resultado4);
    	   }
       return "result";

    }



public String raiz() {
resultado1 = (int) Math.sqrt(x);
return "result";
		}
	
 public String potencia() {
 resultado1 = (int) Math.pow(x1, y);
return "result";
}
 
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getResultado1() {
		return resultado1;
	}
	public void setResultado1(Integer resultado1) {
		this.resultado1 = resultado1;
	}
	public Integer getX1() {
		return x1;
	}
	public void setX1(Integer x1) {
		this.x1 = x1;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getResultado2() {
		return resultado2;
	}
	public void setResultado2(Integer resultado2) {
		this.resultado2 = resultado2;
	}
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public Integer getB() {
		return b;
	}
	public void setB(Integer b) {
		this.b = b;
	}
	public Integer getC() {
		return c;
	}
	public void setC(Integer c) {
		this.c = c;
	}
	public double getResultado3() {
		return resultado3;
	}
	public void setResultado3(Integer resultado3) {
		this.resultado3 = resultado3;
	}
	public double getResultado4() {
		return resultado4;
	}
	public void setResultado4(Integer resultado4) {
		this.resultado4 = resultado4;
	}
	
	

	    
	
	
}	