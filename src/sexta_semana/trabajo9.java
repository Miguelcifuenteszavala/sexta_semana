
package sexta_semana;

public class trabajo9 {
    //by aulaenlanube.com
public static void main(String[] args)
{ 
    cuad(5,10);
}

static void cuad(int altura, int base)
{
    if(altura>0)
    {
        cuad2(base);//método recursivo que crea los elementos de cada línea
        cuad(altura-1, base);//llamada recursiva
    }
}//crea los elementos de cada línea
static void cuad2(int n)
{
    if(n>0)
    {
        System.out.print("* ");
        cuad2(n-1);
    }
    else
        System.out.println();
}   }