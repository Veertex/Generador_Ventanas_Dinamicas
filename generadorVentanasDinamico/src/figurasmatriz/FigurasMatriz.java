/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasmatriz;
import java.util.ArrayList;
import java.util.Arrays;
public class FigurasMatriz {
    public static void main(String[] args) throws InterruptedException {
        
        
       /* String[][] planitoxD=generarPlanoCartesiano(80,80);
        double xd=Math.pow(2,2);
        double formula;
        ArrayList<String> numeros = new ArrayList<String>();
        for(double x=-5;x<=5;x++){
            formula=Math.pow(x,2);
            System.out.println("X= "+(int)x+" Y= "+(int) formula);
            numeros.add((int)x+"/"+(int) formula); 
            System.out.println(formula);
       }    */ 
       
      
       /*
       //Generar circunferencia, ingresando el radio=cont
        for(int cont=0;cont<=15;cont++){
            String[][] plano=generarPlanoCartesiano(41,41);
            ArrayList<String> numeros = new ArrayList<String>();
            int r=cont;
            for(double x=-r;x<=r+1;x=x+0.1){
                double y=0;
                y=(int)Math.sqrt((int)Math.pow(r,2)-(int)Math.pow(x,2));
                numeros.add((int)x+"/"+(int)y); 
                numeros.add((int)x+"/"+-(int)y);
                System.out.print("X: "+(int)x+" Y: "+(int)y);
            }    
            for(int g=0;g<numeros.size();g++){
                String[] p=numeros.get(g).split("/");
                plano[(plano.length/2)-Integer.valueOf(p[0])][(plano.length/2)+Integer.valueOf(p[1])]="*";
            }
        System.out.println(imprimirMatrizString(plano));
        Thread.sleep(250);
        }
        */
        
        String[][] ventana0=new String[10][20];
        String[][] ventana1=new String[10][20];
        String[][] ventana2=new String[10][20];
        String[][] ventana3=new String[10][20];
        String[][] ventana4=new String[10][20];
        String[][] ventana5=new String[10][20];
        String[][] ventana6=new String[10][20];
        String[][] ventana7=new String[10][20];
        String[][] ventana8=new String[10][20];
        generarVentanas(ventana0);
        generarVentanas(ventana1);
        generarVentanas(ventana2);
        generarVentanas(ventana3);
        generarVentanas(ventana4);
        generarVentanas(ventana5);
        generarVentanas(ventana6);
        generarVentanas(ventana7);
        generarVentanas(ventana8);
        asignarNombreVentana(ventana0,"Ventana0");
        asignarNombreVentana(ventana1,"Ventana1");
        asignarNombreVentana(ventana2,"Ventana2");
        asignarNombreVentana(ventana3,"Ventana3");
        asignarNombreVentana(ventana4,"Ventana4");
        asignarNombreVentana(ventana5,"Ventana5");
        asignarNombreVentana(ventana6,"Ventana6");
        asignarNombreVentana(ventana7,"Ventana7");
        asignarNombreVentana(ventana8,"Ventana8");
        
        ArrayList<String[][]> coleccionVentanas =
                new ArrayList<String[][]>();
        
        for(int x=0;x<=15;x++){
            int random=(int) (Math.random() * 9 + 1);
            switch(random){
                case 1:
                    coleccionVentanas.add(ventana0);
                    break;
                case 2:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    break;
                case 3:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    break;
                case 4:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    coleccionVentanas.add(ventana3);
                    break;
                case 5:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    coleccionVentanas.add(ventana3);
                    coleccionVentanas.add(ventana4);
                    break;
                case 6:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    coleccionVentanas.add(ventana3);
                    coleccionVentanas.add(ventana4);
                    coleccionVentanas.add(ventana5);
                    break;
                case 7:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    coleccionVentanas.add(ventana3);
                    coleccionVentanas.add(ventana4);
                    coleccionVentanas.add(ventana5);
                    coleccionVentanas.add(ventana6);
                    break;
                case 8:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    coleccionVentanas.add(ventana3);
                    coleccionVentanas.add(ventana4);
                    coleccionVentanas.add(ventana5);
                    coleccionVentanas.add(ventana6);
                    coleccionVentanas.add(ventana7);
                    break;
                case 9:
                    coleccionVentanas.add(ventana0);
                    coleccionVentanas.add(ventana1);
                    coleccionVentanas.add(ventana2);
                    coleccionVentanas.add(ventana3);
                    coleccionVentanas.add(ventana4);
                    coleccionVentanas.add(ventana5);
                    coleccionVentanas.add(ventana6);
                    coleccionVentanas.add(ventana7);
                    coleccionVentanas.add(ventana8);
                    break;
                default:
                    break;
            }
            System.out.println(imprimirMatrizString
            (imprimirVentanasOrdenadas(coleccionVentanas)));
            coleccionVentanas.clear();
            Thread.sleep(1000);
        }
    }
    
    public static String[][] imprimirVentanasOrdenadas
        (ArrayList<String[][]> coleccionVentanas){
        
        int cantidadVentanasEnColeccion = coleccionVentanas.size();
        int sumaLargoVentanas=0;
        int sumaAnchoVentanas=0;

        for(int x=0;x<coleccionVentanas.size();x++){
            sumaLargoVentanas=
                    sumaLargoVentanas+
                    coleccionVentanas.get(x).length;
            sumaAnchoVentanas=
                    sumaAnchoVentanas+
                    coleccionVentanas.get(x)[0].length;
        }
        
        int cantidadVentanasEnSeccion=3;

        int cantidadSecciones=
                cantidadVentanasEnColeccion/
                cantidadVentanasEnSeccion;
                
        if(cantidadVentanasEnSeccion*
                cantidadSecciones!=cantidadVentanasEnColeccion){
            cantidadSecciones++;
        }
        
        int tamañoLargoVentanasEnSeccion=
                sumaLargoVentanas/cantidadVentanasEnColeccion;
        int tamañoAnchoVentanasEnSeccion=
                sumaAnchoVentanas/cantidadVentanasEnColeccion;
        
        String[][]ventanaContenedora = 
                new String[tamañoLargoVentanasEnSeccion*
                cantidadSecciones]
                        [tamañoAnchoVentanasEnSeccion*
                cantidadVentanasEnSeccion];

        for(int x=0;x<ventanaContenedora.length;x++){
            for(int y=0;y<ventanaContenedora[x].length;y++){
                ventanaContenedora[x][y]=" ";
            }
        }
        
        int numeroSeccion=1;
        int cantidadVentanasEnSeccionActualmente=0;
        int posicionYNuevaSeccion=0; 
    
        for(int ventanaActual=0;
                ventanaActual<coleccionVentanas.size();
                ventanaActual++){
            
            String[][] ventanaEnRender =
                    coleccionVentanas.get(ventanaActual);
            
            int posicionXNuevaSeccion=
                    tamañoAnchoVentanasEnSeccion*
                    cantidadVentanasEnSeccionActualmente;

            if(cantidadVentanasEnSeccionActualmente==
                    cantidadVentanasEnSeccion){
                posicionXNuevaSeccion=0;
                cantidadVentanasEnSeccionActualmente=0;
                posicionYNuevaSeccion=
                        tamañoLargoVentanasEnSeccion*
                        numeroSeccion;
                numeroSeccion++;
            }
            
            for(int y=0;y<ventanaEnRender.length;y++){
                for(int x=0;x<ventanaEnRender[y].length;x++){
                    ventanaContenedora[posicionYNuevaSeccion+y]
                            [posicionXNuevaSeccion+x]=
                            ventanaEnRender[y][x];
                } 
            }
            cantidadVentanasEnSeccionActualmente++;
        }

        return ventanaContenedora;
    }
    
    public static String[][] asignarNombreVentana
        (String[][] ventana,String nombreVentanaString){
            
        String nombreVentanaArray[] = nombreVentanaString.split("");
        if(nombreVentanaArray.length<=ventana.length-2){
            for(int x=0;x<nombreVentanaArray.length;x++){
                ventana[1][x+1]=nombreVentanaArray[x];
            }
        }
        return ventana;
    }
    
    
    public static String[][] generarVentanas(String[][] ventana){
        for(int y=0;y<ventana.length;y++){
            for(int x=0;x<ventana[y].length;x++){
                if(x==0||x==ventana[y].length-1){
                    ventana[y][x]="|";
                }else if(y==0||y==ventana.length-1||
                        y==ventana.length-ventana.length+2){
                    ventana[y][x]="-";
                }else if(y>ventana.length+1||y<ventana.length-1){
                    ventana[y][x]=" ";
                }
            }
        }
        return ventana;
    }
    
    
    public static String[][] generarPlanoCartesiano(int filas,int columnas){
        String[][] planoCartesiano = new String[filas][columnas];
        //Generar el plano cartesiano
        for(int y=0;y<planoCartesiano.length;y++){
            for(int x=0;x<planoCartesiano[y].length;x++){
                if(x==planoCartesiano[y].length/2){
                    if(y==(y/2)*2){
                        planoCartesiano[x][y]="-";
                    }else{
                        planoCartesiano[x][y]=" ";
                    }
                }else if(y==planoCartesiano.length/2){
                    planoCartesiano[x][y]="|";
                }else{
                    planoCartesiano[x][y]=" ";
                }
            }
        } 
        planoCartesiano[planoCartesiano.length/2]
                [planoCartesiano[0].length/2]="+";
    return planoCartesiano;
    }
    
    public static int numRandom(){
        int numRandom=(int) (Math.random()*10+1) ;
        return numRandom;
    }
    
    public static String sumaVectores(){
        int cantidadNumeros=numRandom();
        int[] vector1 = new int[cantidadNumeros];
        int[] vector2 = new int[cantidadNumeros];
        int[] vector3 = new int[cantidadNumeros];
        
        for(int i=0;i<cantidadNumeros;i++){
            vector1[i]=numRandom();
            vector2[i]=numRandom();
            vector3[i]=vector1[i]+vector2[i];
        }
        
        return "Vector 1: "+Arrays.toString(vector1)+
                "\nVector 2: "
                +Arrays.toString(vector2)+
                "\nVector 3: "+Arrays.toString(vector3);
    }
    
    
    public static void sumaMatrices(){
        int cantidadNumeros=numRandom();
        int[][] matriz1 = new int[cantidadNumeros][cantidadNumeros];
        int[][] matriz2 = new int[cantidadNumeros][cantidadNumeros];
        int[][] matriz3 = new int[cantidadNumeros][cantidadNumeros];
        
        for(int x=0;x<cantidadNumeros;x++){
            for(int y=0;y<cantidadNumeros;y++){
                matriz1[x][y]=numRandom();
                matriz2[x][y]=numRandom();
                matriz3[x][y]=matriz1[x][y]+matriz2[x][y];    
            }
        }
        System.out.println("Matriz 1: \n"+imprimirMatriz(matriz1));
        System.out.println("Matriz 2: \n"+imprimirMatriz(matriz2));
        System.out.println("Matriz 3: \n"+imprimirMatriz(matriz3));
    }
    
    public static int [][] sumaMatricesM(){
        int cantidadNumeros=numRandom();
        int[][] matriz1 = new int[cantidadNumeros][cantidadNumeros];
        int[][] matriz2 = new int[cantidadNumeros][cantidadNumeros];
        int[][] matriz3 = new int[cantidadNumeros][cantidadNumeros];
        
        for(int x=0;x<cantidadNumeros;x++){
            for(int y=0;y<cantidadNumeros;y++){
                matriz1[x][y]=numRandom();
                matriz2[x][y]=numRandom();
                matriz3[x][y]=matriz1[x][y]+matriz2[x][y]; 
            }
        }
       return matriz3;
    }
    
    public static String imprimirMatriz(int[][] matriz){
        int limiteX=matriz.length;
        int limiteY=matriz[0].length;
        String resultadoImpresion="";
        
        for(int x=0;x<limiteX;x++){
            for(int y=0;y<limiteY;y++){
                if(y==limiteY-1){
                    if(matriz[x][y]<10){
                        resultadoImpresion=
                                resultadoImpresion+"-"+matriz[x][y];
                    }else{
                        resultadoImpresion=
                                resultadoImpresion+matriz[x][y];
                    }        
                }else{
                    if(matriz[x][y]<10){
                        resultadoImpresion=
                                resultadoImpresion+"-"+matriz[x][y]+"-";
                    }else{
                        resultadoImpresion=
                                resultadoImpresion+matriz[x][y]+"-";
                    }
                }
            }
            resultadoImpresion=resultadoImpresion+"\n";
        }
        return resultadoImpresion;
    }
    
    public static String palabraMasGrande(String cadena){
        String [] palabras=cadena.split("\\s|\n");
        String palabraMasLarga=palabras[0];
        
        for (String palabra : palabras) {
            if (palabra.length() >= palabraMasLarga.length()) {
              palabraMasLarga = palabra;
            }
        }
     return palabraMasLarga;   
    }
    
    public static String invertirTexto(String texto){
        String textoInvertido=String.valueOf(texto.charAt(texto.length()-1));
        for(int x=texto.length()-2;x>=0;x--){
            textoInvertido=textoInvertido+texto.charAt(x);
        } 
        return textoInvertido;
    }
    
    
        public static String imprimirMatrizString(String[][] matriz){
        int limiteX=matriz.length;
        int limiteY=matriz[0].length;
        String resultadoImpresion="";
        
        for(int x=0;x<limiteX;x++){
            for(int y=0;y<limiteY;y++){
                resultadoImpresion=resultadoImpresion+matriz[x][y];
            }
            resultadoImpresion=resultadoImpresion+"\n";
        }
        return resultadoImpresion;
    }
}
