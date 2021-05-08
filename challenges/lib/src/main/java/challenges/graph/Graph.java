package challenges.graph;


import java.util.*;

public class Graph<V, M> {

  List<V> vertexes = new ArrayList<>();
  List<List<M>> matrix = new ArrayList<>();

    public V AddNode(V value){
        if(vertexes.contains(value)){
            List<M> addVertexes = new ArrayList<>();
            addVertexes.add(null);
            for (List<M> list : matrix){
                list.add(null);
                addVertexes.add(null);
            }
            matrix.add(addVertexes);
            vertexes.add(value);
            return value;
        }

        return value;
    }

    public void AddEdge(V value1, V value2, M edge, boolean b){
        int index1 = vertexes.indexOf(value1);
        int index2 = vertexes.indexOf(value2);
        matrix.get(index1).set(index2, edge);
        if (!b) matrix.get(index2).set(index1, edge);
    }

    public List<V> GetNodes(String s){
        return vertexes;
    }

    public Set<V> GetNeighbors(V vert){
        int index = vertexes.indexOf(vert);
        Set<V> result = new HashSet<>();
        for (int i = 0; i < vertexes.size(); i++){
            if (matrix.get(index).get(i) == null) continue;
            result.add(vertexes.get(i));
        }
        return result;
    }

    public int Size(int i){
        return vertexes.size();
    }
}
