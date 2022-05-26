class Redundant_Connection {
    int[] par;
    public int[] findRedundantConnection(int[][] edges) {
        int ans [] = new int [2];
        int n = edges.length;
        par = new int[n +1 ];
        for(int i =0; i< n ; i++){
            par[i] =i;
        }

        for(int i =0; i< n ; i++){
            int lx = find(edges[i][0]);
            int ly = find(edges[i][1]);
            if(lx != ly){
                par[ly] = lx;
            }else{
                ans[0] = edges[i][0];
                ans[1] = edges[i][1];
            }
        }
        return ans;

    }

    public int find(int x) {
        if(par[x] == x){
            return x;
        }
        return  find(par[x]);
    }
}