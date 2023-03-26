package mix;
import java.util.*;
public class Mix {

    String wrd;
    int len;
    
    Mix(){
        wrd = "";
        len = 0;
        }
    
    void feedword(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A WORD: ");
        wrd = sc.nextLine();
    }
    
    void mix_wrd(Mix P, Mix Q){
         len = P.wrd.length();
        String newwrd = "";
        for(int i = 0; i < len; i++){
            newwrd = newwrd + P.wrd.charAt(i) + Q.wrd.charAt(i);
        }
        
        
        newwrd = newwrd + Q.wrd.substring(len,Q.wrd.length());
        wrd = newwrd;
    }
    
    void display(){
        System.out.println("MIXED WORD: " + wrd);
    }
    
    public static void main(String[] args) {
    
        Mix a = new Mix();
        Mix b = new Mix();
        Mix c = new Mix();
        
        a.feedword();
        b.feedword();
        
        c.mix_wrd(a,b);
        
        c.display();
        
    
    
    }
    
}
