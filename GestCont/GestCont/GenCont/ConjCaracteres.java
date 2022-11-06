package GenCont;
import java.util.ArrayList;
import java.util.Random;

public class ConjCaracteres
{
    private ArrayList<Integer[]> conj;
    
    
    public ConjCaracteres(ArrayList<Integer[]> conj){
        this.conj = conj;
    }
    
    public char getRandChar(){
        Random rand;
        Integer[] sub;
        int subconj;
        int caracter;
        
        rand = new Random();
        
        subconj = rand.nextInt(conj.size());
        sub = conj.get(subconj);
        
        caracter = rand.nextInt(sub[1] - sub[0]) + sub[0]; 
        
        
        
        return (char) caracter;
    }
}
