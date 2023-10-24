//Scrivi un programma che contiene un metodo che che confronti due caratteri 
//e determini se sono diversi.
//Il programma dovrà stampare a video i due caratteri e il risultato 
//dell'eguaglianza.

public class MyClass {
    public static void main(String args[]) {
        char c1 = 'w';
        char c2 = 'e';
        System.out.println(c1 + " and "+ c2 + " are different? "+ compare(c1, c2));

    }
      static boolean compare(char a, char b){
        return (a != b);
      }
}