
package Matriz;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Tresenraya {
    private int matriz[][];
    private int jugador;//jugador 1 false jugador 2 true
    private int ganador;
    private int cantidad_jugadas=0;
    private boolean bandera_centro_primerMov;
    public Tresenraya() {
        this.matriz = new int[3][3];
        
        for(int i=0;i<3;i++)
            {for(int j=0;j<3;j++){
                this.matriz[i][j]=0;
            }}
        this.jugador = 0;
        this.ganador = 0;
        cantidad_jugadas=0;
        bandera_centro_primerMov=false;
    }

    public Tresenraya(int[][] matriz, int jugador, int ganador) {
        this.matriz = matriz;
        this.jugador = jugador;
        this.ganador = ganador;
    }
    
  
    public void NuevoJuego() {
        for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                     this.matriz[i][j]=0;
            }
        }
        this.ganador = 0;
        this.cantidad_jugadas=0;
        this.bandera_centro_primerMov=false;
    }

    public int getCantidad_jugadas() {
        return cantidad_jugadas;
    }
    
    public boolean GanadorDiagonalP(int x) {
        boolean aux=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                aux=aux&&(this.matriz[i][j]==x);
                }
            }
        }
        return aux;
    }   
    
        public boolean GanadorDiagonalS(int x) {
        boolean aux=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i+j==2){
                aux=aux&&(this.matriz[i][j]==x);
                }
            }
        }
        return aux;
    } 
        public boolean GanadorHorizontal(int x) {
        boolean aux,auxfinal=false;
        for(int i=0; i<3;i++){
            aux=true;
            for(int j=0;j<3;j++){
                    aux=aux&&(this.matriz[i][j]==x);
                }
            auxfinal=auxfinal||aux;
            }
        return auxfinal;
        }        

        public boolean GanadorVertical(int x) {
        boolean aux,auxfinal=false;
        for(int i=0; i<3;i++){
            aux=true;
            for(int j=0;j<3;j++){
                    aux=aux&&(this.matriz[j][i]==x);
                }
            auxfinal=auxfinal||aux;
            }
        return auxfinal;
        }
        
        public boolean Ganador(int x){
            return this.GanadorVertical(x)||this.GanadorDiagonalP(x)||this.GanadorDiagonalS(x)||this.GanadorHorizontal(x);
        }
        
        public boolean FinJuego(){
            if(this.Ganador(1)||this.Ganador(2)){
                if(this.Ganador(1)){
                    ganador=1;
                }
                if(this.Ganador(2)){
                    ganador=2;
                }
                if(this.esEmpate()){
                    ganador=0;
                }
            }
            return this.Ganador(1)||this.Ganador(2)||esEmpate();
        }      
        
    public void cambioTurno() {
        if(jugador==1){
            jugador=2;
        }else if(jugador==2){
                jugador=1;
            }       
    }
    
    public boolean esEmpate() {
        boolean aux=true;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    aux=aux&&(this.matriz[i][j]!=0);
            }
        }
        return aux&&!this.Ganador(1)&&!this.Ganador(2);

        }

     public boolean noquedanMovimientos() {
        boolean aux=true;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                    aux=aux&&(this.matriz[i][j]!=0);
            }
        }
        return aux;
        }
    
    public int[] setMovimientoFacil() {
        this.cambioTurno();
        Random rand = new Random();
        int x[]=new int[2];
        int i=0;
        do{
            x[0]=rand.nextInt(3);
            x[1]=rand.nextInt(3);
            i++;
        }while(matriz[x[0]][x[1]]!=0);
        matriz[x[0]][x[1]]=jugador;
        return x;
    }
    
        
        public int[] contadorPosicionesRestantesFilas() {
        int xfila[]= new int[3]; 
        int casillasvacias=0;
        int importancia=0;
        int  filaAux=0;
        int i;
        for(i=0; i<3;i++){
            importancia=0;
            casillasvacias=0;
             for(int j=0;j<3;j++){
                if(this.matriz[i][j]==0){
                    casillasvacias++;
                } 
                if(this.matriz[i][j]!=jugador&&this.matriz[i][j]!=0){
                    importancia++;
                }
            }
            if(importancia==2&&casillasvacias!=0){
            filaAux=i;
            break;
            }
        }
        if(importancia==2&&casillasvacias!=0){
        for(int j=0; j<3;j++){ 
            if(this.matriz[filaAux][j]==0){
            xfila[0]=i;
            xfila[1]=j;
            xfila[2]=1;
        }
        }}else{
            xfila[2]=0;
        }    
       return xfila;
    }
        
        
        public int[] contadorPosicionesRestantesColumnas() {
        int[] xcolumna= new int[3]; 
        int casillasvacias=0;
        int importancia=0;
        int  columnaAux=0;
        int i;
        for(i=0; i<3;i++){
            importancia=0;
            casillasvacias=0;
            for(int j=0;j<3;j++){
                if(this.matriz[j][i]==0){
                    casillasvacias++;
                } 
                if(this.matriz[j][i]!=jugador&&this.matriz[j][i]!=0){
                    importancia++;
                }
            }
            if(importancia==2&&casillasvacias!=0){
            columnaAux=i;
            break;
            }
        }
        if(importancia==2&&casillasvacias!=0){
        for(int j=0; j<3;j++){ 
            if(this.matriz[j][columnaAux]==0){
            xcolumna[0]=j;
            xcolumna[1]=columnaAux; 
            xcolumna[2]=1;
        }
        }}else{
            xcolumna[2]=0;
        }    

        return xcolumna;
    }
       
        public int[] contadorPosicionesRestantesDiagonalP(){
        int[] xdiagonal= new int[3]; 
        int casillasvacias=0;
        int importancia=0;
        int i;
        for(i=0; i<3;i++){
            if(this.matriz[i][i]==0){
                casillasvacias++;
                } 
            if(this.matriz[i][i]!=jugador&&this.matriz[i][i]!=0){
                importancia++;
                }
        }
        
        
        if(importancia==2&&casillasvacias!=0){
        for(i=0; i<3;i++){ 
            if(this.matriz[i][i]==0){
                xdiagonal[0]=i;
                xdiagonal[1]=i;    
                xdiagonal[2]=1; 
        }
        }}else{
            xdiagonal[2]=0;
        }    

       return xdiagonal;
    }
        public int[] contadorPosicionesRestantesDiagonalS() {
        int[] xdiagonal= new int[3]; 
        int casillasvacias=0;
        int importancia=0;
        int i;
        for(i=0; i<3;i++){
            if(this.matriz[i][2-i]==0){
                casillasvacias++;
                } 
            if(this.matriz[i][2-i]!=jugador&&this.matriz[i][2-i]!=0){
                importancia++;
                }
        }
        
        
        if(importancia==2&&casillasvacias!=0){
        for(i=0; i<3;i++){ 
            if(this.matriz[i][2-i]==0){
                xdiagonal[0]=i;
                xdiagonal[1]=2-i; 
                xdiagonal[2]=1;
        }
        }}else{
            xdiagonal[2]=0;
            
        }    

       return xdiagonal;
    } 
    
    public int[] setMovimientoMedio(){
        int[] movimientoDefinitivo=new int[2];
        int bandera=0;
        
        if(contadorPosicionesRestantesColumnas()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesColumnas()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesColumnas()[1];
            bandera++;
        }else if(contadorPosicionesRestantesDiagonalP()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesDiagonalP()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesDiagonalP()[1];
            bandera++;
        }else if(contadorPosicionesRestantesDiagonalS()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesDiagonalS()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesDiagonalS()[1];
            bandera++;
        }else if(contadorPosicionesRestantesFilas()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesFilas()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesFilas()[1];
            bandera++;
        }else{
            movimientoDefinitivo[0]=llenarCasillaLibre()[0];
            movimientoDefinitivo[1]=llenarCasillaLibre()[1];
        }
        this.cambioTurno();
        if(bandera==0){

        if(contadorPosicionesRestantesColumnas()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesColumnas()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesColumnas()[1];
        }else if(contadorPosicionesRestantesDiagonalP()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesDiagonalP()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesDiagonalP()[1];
        }else if(contadorPosicionesRestantesDiagonalS()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesDiagonalS()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesDiagonalS()[1];
        }else if(contadorPosicionesRestantesFilas()[2]==1){
            movimientoDefinitivo[0]=contadorPosicionesRestantesFilas()[0];
            movimientoDefinitivo[1]=contadorPosicionesRestantesFilas()[1];
        }
    }    
        matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;   
        
        return movimientoDefinitivo;
     }

    public int[] setMovimientoDificil(){
        int[] movimientoDefinitivo=new int[2];
       
    if(cantidad_jugadas==1){
        cambioTurno();
        if(esCentro()){
            movimientoDefinitivo[0]=0;
            movimientoDefinitivo[1]=0;
            bandera_centro_primerMov=true;
        }
        if(esEsquina()){
            movimientoDefinitivo[0]=1;
            movimientoDefinitivo[1]=1; 
        }
        if(esLateral()){
            movimientoDefinitivo[0]=1;
            movimientoDefinitivo[1]=1;
        } 
        matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
        
    }else if(cantidad_jugadas==3&&esCentro()&matriz[2][2]==jugador&&bandera_centro_primerMov){
         cambioTurno();
         movimientoDefinitivo[0]=0;
         movimientoDefinitivo[1]=2;
         matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
    }else if(cantidad_jugadas==3&&matriz[2][0]==jugador&&matriz[0][2]==jugador&&!bandera_centro_primerMov){
         cambioTurno();
         movimientoDefinitivo[0]=0;
         movimientoDefinitivo[1]=1;
         matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
    }else if(cantidad_jugadas==3&&matriz[1][2]==jugador&&matriz[2][1]==jugador&&!bandera_centro_primerMov){
         cambioTurno();
         movimientoDefinitivo[0]=2;
         movimientoDefinitivo[1]=2;
         matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
     }else if(cantidad_jugadas==3&&(matriz[0][0]==jugador&&matriz[2][1]==jugador)){
        cambioTurno();
        movimientoDefinitivo[0]=2;
        movimientoDefinitivo[1]=0;
        matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
    }else if(cantidad_jugadas==3&&((matriz[0][2]==jugador&&matriz[2][1]==jugador)||(matriz[2][2]==jugador&&matriz[0][1]==jugador))){
        cambioTurno();
        movimientoDefinitivo[0]=2;
        movimientoDefinitivo[1]=2;
        matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
    }else if(cantidad_jugadas==3&&((matriz[2][0]==jugador&&matriz[1][2]==jugador)||(matriz[2][2]==jugador&&matriz[2][1]==jugador))){
        cambioTurno();
        movimientoDefinitivo[0]=2;
        movimientoDefinitivo[1]=2;
        matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
    }else if(cantidad_jugadas==3&&(matriz[2][2]==jugador&&matriz[0][1]==jugador)){
        cambioTurno();
        movimientoDefinitivo[0]=0;
        movimientoDefinitivo[1]=2;
        matriz[movimientoDefinitivo[0]][movimientoDefinitivo[1]]=jugador;
    }else{
        movimientoDefinitivo=setMovimientoMedio();
    }
    cantidad_jugadas++;
    return movimientoDefinitivo;
    }
    
    public boolean esEsquina(){
        return matriz[0][0]!=0||matriz[2][0]!=0||matriz[0][2]!=0||matriz[2][2]!=0;
    }
    
    public boolean esLateral(){
    return matriz[1][0]!=0||matriz[0][1]!=0||matriz[1][2]!=0||matriz[2][1]!=0;
    }

    public boolean esCentro(){
    return matriz[1][1]!=0;
    }    
    
     public int[] llenarCasillaLibre(){
         int[] posicion=new int[3];
         int j=0, contador=0;
         for(int i=0; i<3;i++){
            for(j=0;j<3;j++){
                if(this.matriz[i][j]==0&&contador==0){
                    posicion[0]=i;
                    posicion[1]=j;
                    contador++;
                    break;
                }
            }  
        }
         posicion[2]=0;
        return posicion;
     }
    
    public void setMatrizElemento(int fila, int columna, int elemento) {
        this.matriz[fila][columna] = elemento;
        cantidad_jugadas++;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public void setGanador(int ganador) {
        this.ganador = ganador;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public int getJugador() {
        return jugador;
    }

    public int getGanador() {
        return ganador;
    }

    @Override
    public String toString() {
        return "Tresenraya{" + "matriz=" + matriz + ", jugador=" + jugador + ", ganador=" + ganador + ", cantidad_jugadas=" + cantidad_jugadas + ", bandera_centro_primerMov=" + bandera_centro_primerMov + '}';
    }
  
}

