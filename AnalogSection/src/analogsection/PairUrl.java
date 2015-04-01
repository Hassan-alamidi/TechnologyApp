/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Stephen
 */

/*

* Plain Old Java Object class

*

*

*/
public class PairUrl {
    private String key,key2;
    private Integer value;

    public PairUrl(String key, Integer value, String key2) {
        this.key = key;
        this.value = value;
        this.key2 = key2;
    }

    PairUrl(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKey() {
        return key;
    }

    public Integer getValue() {
        return value;
    }

    public String getKey2() {
         return key2;
    }
    

}
