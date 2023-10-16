class Solution {
    public void solve(char[][] newboard) {
        
        int m = newboard.length;
        int n = newboard[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0; i<n; i++){
            if(vis[0][i]!=true && newboard[0][i]=='O'){        
                dfs(newboard,0,i,vis);
            }
            
            if(vis[m-1][i]!=true && newboard[m-1][i]=='O'){    
                dfs(newboard,m-1,i,vis);
            }
        }
        for(int i=0; i<m; i++){
            if(vis[i][0]!=true && newboard[i][0]=='O'){        
                dfs(newboard,i,0,vis);
            }
            
            if(vis[i][n-1]!=true && newboard[i][n-1]=='O'){   
                dfs(newboard,i,n-1,vis);
            }
        }

        for(int i =0; i<m; i++){
            for(int j=0; j<n;j++){
                if(vis[i][j]!=true && newboard[i][j]=='O'){
                    newboard[i][j] = 'X';
                }
            }
        }
        
    }
    
    public void dfs(char[][] image, int row, int col, boolean[][] vis){
        vis[row][col]=true;
        
        int m=image.length;
        int n= image[0].length;
        
        if(row-1>=0 && image[row-1][col]=='O' && vis[row-1][col]!=true){
            dfs(image,row-1,col,vis);
        }
        if(row+1<m && image[row+1][col]=='O' && vis[row+1][col]!=true){
            dfs(image,row+1,col,vis);
        }
        if(col-1>=0 && image[row][col-1]=='O' && vis[row][col-1]!=true){
            dfs(image,row,col-1,vis);
        }
        if(col+1<n && image[row][col+1]=='O' && vis[row][col+1]!=true){
            dfs(image,row,col+1,vis);
        }
    }
}