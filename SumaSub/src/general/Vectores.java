package general;

/**
 *
 * @author Kevin
 */
public class Vectores
{
    int arr[];

    public Vectores(int n)
    {
        this.arr = new int[n];
    }
    
    public void Inserta(int numero, int indice)
    {
        arr[indice]=numero;
    }
    
    public void Desp()
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
