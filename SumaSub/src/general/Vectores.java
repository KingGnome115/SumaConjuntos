package general;

/**
 *
 * @author Kevin
 */
public class Vectores
{

    int arr[];
    int tope = -1;

    public Vectores(int n)
    {
        this.arr = new int[n];
    }

    public void Inserta(int numero, int indice)
    {
        arr[indice] = numero;
        tope++;
    }

    public String Desp()
    {
        String s = "{";
        for (int i = 0; i <= tope; i++)
        {
            s += " " + arr[i] + " ";
        }
        s += "}";
        return s;
    }
}
