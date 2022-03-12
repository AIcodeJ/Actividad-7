public class Sucesiones {
    //Atributos
    int numero;

    //Metodos
    public int[] numPrimos(int numero){
        int [] arr = new int[numero];
        int pos = 0;
        for(int i = 1; i <= numero * 3; i++) {
            int contador = 0;
            for(int j = 1; j <= numero * 3; j++) {
                if(i % j == 0) {
                    contador++;
                }
            }
            if(contador == 2) {
                arr[pos++] = i;
            }
        }
        return arr;
    }

    public int[] Fibonacci(int numero){
        int [] array = new int[numero];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < numero; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

}
