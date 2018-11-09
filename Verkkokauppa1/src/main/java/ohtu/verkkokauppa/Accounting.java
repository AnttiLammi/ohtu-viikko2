
package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Accounting {

    public void lisaaTapahtuma(String tapahtuma);
    public ArrayList<String> getTapahtumat();
    
}
