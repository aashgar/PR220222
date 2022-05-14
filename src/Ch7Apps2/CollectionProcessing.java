/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch7Apps2;

import java.util.Collection;

/**
 *
 * @author aashgar
 */
public class CollectionProcessing<T> {
    public void show(Collection<T> collection){
        for(T t: collection)
            System.out.print(t+ " ");
        System.out.println("");
    }
}
