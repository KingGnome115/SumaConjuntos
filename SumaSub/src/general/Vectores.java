package general;

/**
 *
 * @author Kevin
 */
public class Vectores
{
    
    private int arr[];
    private int tope = -1;
    private int pos = 0;
    private int neg = 0;
    private int zero = 0;
    
    public Vectores(int n)
    {
        this.arr = new int[n];
    }
    
    public void Inserta(int numero, int indice)
    {
        getArr()[indice] = numero;
        setTope(getTope() + 1);
        Posibilidades(numero);
    }
    
    public String Desp()
    {
        String s = "{";
        for (int i = 0; i <= getTope(); i++)
        {
            s += " " + getArr()[i] + " ";
        }
        s += "}";
        return s;
    }
    
    private void Posibilidades(int numero)
    {
        if (numero == 0)
        {
            zero++;
        } else
        {
            if (numero > 0)
            {
                pos++;
            } else
            {
                neg++;
            }
        }
    }
    
    public boolean HayResultados()
    {
        if (zero > 0 || (pos > 0 && neg > 0))
        {
            return true;
        } else
        {
            return false;
        }
    }

    /**
     * @return the arr
     */
    public int[] getArr()
    {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(int[] arr)
    {
        this.arr = arr;
    }

    /**
     * @return the tope
     */
    public int getTope()
    {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(int tope)
    {
        this.tope = tope;
    }

    /**
     * @return the pos
     */
    public int getPos()
    {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(int pos)
    {
        this.pos = pos;
    }

    /**
     * @return the neg
     */
    public int getNeg()
    {
        return neg;
    }

    /**
     * @param neg the neg to set
     */
    public void setNeg(int neg)
    {
        this.neg = neg;
    }

    /**
     * @return the zero
     */
    public int getZero()
    {
        return zero;
    }

    /**
     * @param zero the zero to set
     */
    public void setZero(int zero)
    {
        this.zero = zero;
    }
}
