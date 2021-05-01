package challenges.hashtable;

import jdk.nashorn.internal.runtime.StoredScript;

import java.util.LinkedList;

public class Hashtable<value, next> {

    String key;
    String value;
    Object next;
    private Object head;
    private Object buckets;

    public void hashTable(){
    this.buckets = new LinkedList<>();
    }

    public void add(String key, String value){
    String indexToInsertAt = this.hash(key);
    String linkedListAtThatIndex = this.buckets[indexToInsertAt];
    String storageObject = new StoredScript(key,value);
    linkedListAtThatIndex.add(storageObject);

    }

    public String get(String key){
        String indexToFind = this.hash(key);
        String linkedListAtThatIndex = this.buckets[indexToFind];
        String current = linkedListAtThatIndex.head;
        while(current){
            if (current.value.key == key){
                return current.value.value;
            }
            current = current.next;
        }
        return null;
    }

    public boolean contains(){
    String thingsInThere = this.get(key);
    if(thingsInThere != null) return true;
    return false;
    }

    public String hash(String anything){
        String stringAnything = "" + anything;
        int hash = 0;
        for (int i = 0; i < stringAnything.length(); i++) {
            int number = stringAnything.charAt(i);
            hash += number;
            hash = hash * 10;
            hash = hash % 25;
        }
        hash = hash % this.buckets.length;
        return hash;
    }
    
    public String toString(){
        String out = "";
        for( char i = 0; i < this.buckets.length; i++){
            String line = "";
            String current = this.buckets[i].head;
            while(current){
                line += current.value.key + ":" + current.value.value + ",";
                current = current.next;
            }
            if(line == "") line = "empty";
            out += line + "\n";
        }
        return out;
    }

    public void StorageObject(String keyPotato, String value){
        this.key = keyPotato;
        this.value = value;
    }

    public void linkedlist(){
        this.head = null;
    }

    public void addLinkedList(){
        Object current = this.head;
        while(current == head){
            if (current.value.key == key){
                current.value.value = value;
                return;
            }
            current = current.next;
        }
    }

    public void Node(value, next){
        this.value = value;
        this.next = next;
    }

}

