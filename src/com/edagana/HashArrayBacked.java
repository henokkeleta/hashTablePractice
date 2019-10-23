package com.edagana;

import com.edagana.Employee;

public class HashArrayBacked {
    private Employee[] hashTable;

    public HashArrayBacked() {
        this.hashTable = new Employee[10];
    }
  //the put(add in the hash table) method is called to put stuff in the table using both the key and the value.
    public void put(String key,Employee employee){
        //the first thing we gonna do is hashing the provided key
        //we are mapping the key with an integer!
        int hashedKey = hashFunction(key);//this will give us the index in the array of hashtable; this hash table doesn't handle collusions
        if(hashTable[hashedKey]!=null) {
            System.out.println("sorry, there is already an employee in the provided index. The position is occupied!"+hashedKey);
        }

       else {

            hashTable[hashedKey] = employee;
        }

    }
    //this method is for retreval purpose


    public Employee get(String key){
        int hashedKey=hashFunction(key);
        return hashTable[hashedKey];//this will retreave it with constant time! O(1)

    }
    public int hashFunction(String key){
        return key.length()%hashTable.length;
    }
    public void printHashTable()
    {
        for(int i=0;i<hashTable.length;i++){
            System.out.println(hashTable[i]);
        }
    }

}
