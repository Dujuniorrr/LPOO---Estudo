package Questao3e4;

import java.lang.Math;
import java.util.Scanner;

public class Equacoes {
    static Scanner scan = new Scanner(System.in);
    private float a, b, c; 
    private double delta, x1, x2, resul1, resul2;

    public void bhaskara(){
        System.out.println("====== Formula de Bhaskara ========");
        System.out.print("Digite a: ");
        setA(scan.nextFloat());
        System.out.print("Digite b: ");
        setB(scan.nextFloat());
        System.out.print("Digite c: ");
        setC(scan.nextFloat());
        setDelta(); 
        setX1();
        setX2();
        System.out.println("\nDelta: " + getDelta());
        System.out.println("x1: " + getX1());
        System.out.println("x2: " + getX2());
    }

    public void equacaoQuestao4(){  
        System.out.println("\n====== Formula Questão 4 ========");  
        setResul1(Math.sqrt((getX1()*getX1()) - (3 * getX1()) + 2));
        setResul2(Math.sqrt((getX2()*getX2()) - (3 * getX2()) + 2));
        System.out.println("\nResultado x1: " + getResul1());
        System.out.println("\nResultado x2: " + getResul2());
    }

    public void setA(float a){
        if(a == 0){
            this.a = 1;
        }
        else{
            this.a = a;
        }
    }

    public float getA(){
        return this.a;
    }

    public void setB(float b){
        this.b = b;
    }

    public float getB(){
        return this.b;
    }

    public void setC(float c){
        this.c = c;
    }

    public float getC(){
        return this.c;
    }

    public void setDelta(){
        this.delta = ((b*b) - (4 * (a) * (c)));
    }

    public double getDelta(){
        return this.delta;
    }

    public void setX1(){
        this.x1 = (float) ((b - (b*2)) + Math.sqrt(delta)) / (2 * a);
    }

    public void setX2(){
        this.x2 = ((b - (b*2)) - Math.sqrt(delta)) / (2 * a);
    }

    public double getX1(){
        return this.x1;
    }

    public double getX2(){
        return this.x2;
    }

    public double getResul1() {
        return resul1;
    }

    public void setResul1(double resul1) {
        this.resul1 = resul1;
    }

    public double getResul2() {
        return resul2;
    }

    public void setResul2(double resul2) {
        this.resul2 = resul2;
    }
        
}


