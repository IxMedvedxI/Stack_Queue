/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stqe0;

import stqe0.List;

/**
 *
 * @author Netbeans
 */
public class Stack implements TypeList{
    
    @Override
    public void push(int i,List list){
        list.addBegin(i);
    }
    @Override
    public void pop(List list){
        if(list.head != null){
            list.head = list.head.next;
        }
    }
}
