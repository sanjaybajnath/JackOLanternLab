public class JackOLantern {
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        this.faceFeatures[row][column]=replace;
    }

    public void fill(String str){
        
    }

    public String toString(){

    }
}
