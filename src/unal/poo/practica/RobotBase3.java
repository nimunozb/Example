package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase3
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        public static  boolean matriz [][] = new boolean[5][5];
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field3.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,6, 1, Direction.NORTH,0);
           
            
           comienzo();
           normativa();
           regreso();
           batalla();
           comienzo();
          eln();
           
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        public static void comienzo(){
            estudiante.move();
             estudiante.move();
              estudiante.move();
               estudiante.move();
                estudiante.move();
              estudiante.turnLeft();
               estudiante.turnLeft();
                estudiante.turnLeft();
             
        }
        public static void cambio(boolean a){
           if (a==false){
           estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
           estudiante.move();
           estudiante.turnLeft();
            estudiante.turnLeft();
             estudiante.turnLeft();
            
            }
           if(a==true){
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();}
           }
        public static void cambio2(){
      
            estudiante.turnLeft(); 
        estudiante.move();
        estudiante.turnLeft();
        }
        
        
        public static void regreso(){
              estudiante.turnLeft();  estudiante.turnLeft();
        for (int m=0;m<4;m++){estudiante.move();}
        estudiante.turnLeft();
        estudiante.move();
        estudiante.turnLeft();
        }
        public static void batalla(){
        for(int l=0;l<6;l++){
        estudiante.move();}
         estudiante.turnLeft();
        }
        public static void tdveces(int g){
          if(g%2==0) { for(int a=0;a<5;a++){ boolean z=estudiante.canPickThing();
          if(z==false&&a==4){matriz[g][a]=false;} else{ 
          if(z==true&&a==4){matriz[g][a]=true;estudiante.pickThing();}
            else {if (z==true){matriz[g][a]=true;estudiante.pickThing();estudiante.move();}
            else {estudiante.move();}}}}}
          else{
          for(int b=4;b>=0;b--){ boolean z=estudiante.canPickThing();
          if(z==false&&b==0){matriz[g][b]=false;cambio2();}else{
                   if(z==true&&b==0){matriz[g][b]=true;estudiante.pickThing();cambio2();}
                   else{ if (z==true){matriz[g][b]=true;estudiante.pickThing();estudiante.move();}
                  else {estudiante.move();}}}}}
          
          
          }
          
        
        public static void normativa(){
            
             boolean d;
           for(int a=0;a<5;a++){
               for(int b=0;b<5;b++){
                   matriz[a][b]=false;}}
           tdveces(0);
           boolean c=estudiante.canPickThing();
           cambio(c);
           tdveces(1);
           
           tdveces(2);
            c=estudiante.canPickThing();
           cambio(c);
           tdveces(3);
          tdveces(4);
           
           }
        public static void farc(int g){
            
            if(g%2==0) { for(int a=0;a<5;a++){ 
          if(matriz[g][a]==true&&a==4){estudiante.putThing();} else{ 
          if(matriz[g][a]==true){estudiante.putThing();estudiante.move();}
            else {if (matriz[g][a]==false&&!(a==4)){estudiante.move();}
            }}}}
          else{
          for(int b=4;b>=0;b--){ 
          if(matriz[g][b]==true&&b==0){estudiante.putThing();}else{
           if(matriz[g][b]==true){estudiante.putThing();estudiante.move();}
                   else{ if (matriz[g][b]==false&&!(b==0)){estudiante.move();}
                  }}}}
            }
        public static void eln(){
            farc(0);
            cambio(false);
            farc(1);
            cambio2();
            
            farc(2);
            cambio(false);
             farc(3);
              cambio2();
              
              farc(4);
              regreso();
        }



}
            
        


