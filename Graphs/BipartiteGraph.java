import java.util.*;
class BipartiteGraph{
    static class Edge{
        int src;
        int dest;
        

        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
            
        }
    }
    public static void creatGraph(ArrayList<Edge>[] graph,int V){

        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        // 1-vertex
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        // 2-vertex
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        // 3-vertex
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        // graph[3].add(new Edge(3,5));

        // 4-vertex
        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        // graph[4].add(new Edge(4,5));

        // 5-vertex
        // graph[5].add(new Edge(5,3,1));
        // graph[5].add(new Edge(5,4,1));
        // graph[5].add(new Edge(5,6,1));

        // 6-vertex
        // graph[6].add(new Edge(6,5,1));
    }
    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i] = -1;//No color..
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(col[i] == -1){
                q.add(i);
            col[i] = 0; //yellow  and 1 - bluee and -1 is no color
            while(!q.isEmpty()){
                int curr = q.remove();
                for(int j=0;i<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);//e.dest - neighbour
                    if(col[e.dest] == -1){
                        int nextCol = col[curr] == 0 ? 1:0;
                        col[e.dest] = nextCol;
                        q.add(e.dest);
                    }else if(col[e.dest] == curr){
                        return false; //Not bipartite...
                    }
                }
            }
        }
       }
       return true;
    }
    
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        creatGraph(graph,V);

        System.out.println(isBipartite(graph));
    }
}