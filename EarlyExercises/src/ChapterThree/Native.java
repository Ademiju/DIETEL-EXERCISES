package chapterThree;

public class Native {
    private int scvId;
    private String name;


    public Native(String name, int scvId) {
        this.name = name;
        this.scvId = scvId;
    }

    public String getScvId(){
        String myScvId = "SCV900"+scvId;
        return myScvId;

    }

        public void setScvId(int scvId){
            this.scvId = scvId;

    }

    public String getName(){
        return name;
    }
}
