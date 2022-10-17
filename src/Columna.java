public class Columna {
    private char[] filas;
    private int posicion;

    public Columna(){
        filas=new char[6];
        posicion=0;
    }

    public boolean puedeInsertarFicha(){
        return posicion < 6;
    }

    public boolean insertarFicha(char color){
        if(puedeInsertarFicha()) {
            filas[posicion] = color;
            posicion++;
            return true;
        }
        else {
            System.out.println("COLUMNA LLENA SELECCIONE OTRA");
            return false;
        }
    }

    public void mostrar(){
        System.out.println(filas);
    }
}
