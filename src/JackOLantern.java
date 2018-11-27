public class JackOLantern {
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        this.faceFeatures[row][column]=replace;
    }

    public void fill(String str){
        for(int i = 0; i< this.faceFeatures.length;i++){
            for(int j=0;j<this.faceFeatures[i].length;j++){
                this.faceFeatures[i][j]= str;
            }
        }
        
    }

    public String toString(){
        String image = "";
        for(int i = 0; i< this.faceFeatures.length;i++){
            for(int j=0;j<this.faceFeatures[i].length;j++){
                image += this.faceFeatures[i][j];
            }
            image = image + "\n";
        }
        return image;
    }


}
