import java.util.*;
class DetectCycleDirectedGraph{
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

        //graph - 1  -->TRue
        // graph[0].add(new Edge(0,2));
        // graph[1].add(new Edge(1,0));
        // graph[2].add(new Edge(2,3));
        // graph[3].add(new Edge(3,0));

        //Graph 2 -->False
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,3));
        
        
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){ //cycle exist
                return true;
            }else if(!vis[e.dest] && detectCycleUtil(graph,e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
       
    
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        creatGraph(graph,V);

        System.out.println(detectCycle(graph));
    }
}